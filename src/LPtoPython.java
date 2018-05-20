/*
* Proposta de linguagem para a programação do comportamento de robôs no contexto do futebol
* Trabalho de Graduação
* Jessica Augusti Bonini
* Orientador: Giovani Librelotto
* 04 de Dezembro de 2015
*/

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LPtoPython {
    
    
    public static class tccEmitter extends tccBaseListener {
        // in
        private ArrayList<Translate.Position> token_pos_obj = new ArrayList();
        
        // var
        private StringBuffer token_var_tipo  = new StringBuffer();
        private StringBuffer token_var_nome  = new StringBuffer();
        
        // stts
        private StringBuffer token_stts  = new StringBuffer();
        int stts = 0;
        
        // init
        private StringBuffer token_init  = new StringBuffer();
        int init = 0;
        
        // condition
        private StringBuffer token_cond_obj  = new StringBuffer();
        private StringBuffer token_pos  = new StringBuffer();
        public Translate token_condition = new Translate();
        int cond = 0;
        
        //Action
        // up
        private StringBuffer token_act_up  = new StringBuffer();
        int up = 0;
        
        //if
        private int condIf = 0;
        private int lboolIf = 0;
        private int lftIf = 0;
        private StringBuffer m  = new StringBuffer();
        
        // if else
        private int condElse = 0;
        private int lboolElse = 0;
        private int lftElse = 0;
        private String Else = null;
        
        //atr
        int atr = 0;
        
        //emit
        int emit = 0;
        int walk = 0;
        int defend = 0;
        int kick = 0;
        int p = 1;
        
        private ArrayList<Translate.Action> actions = new ArrayList();
        
        private int contAction = 0; // indicates indentation
        private int contItem = 0;  // indicates which rule the instruction belongs
        private int contID = 0; 
        
        /* add mapped actions and call out method */
        public void exitExpr(tccParser.ExprContext ctx) {
            token_condition.actions = this.actions;
            try {
                System.out.println(this.token_condition.getOutput());
            } catch (IOException ex) {
                Logger.getLogger(LPtoPython.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        /* map the object type (ball, pole...)*/
        public void enterParametersIn(tccParser.ParametersInContext ctx) {
            if(cond == 1){
                token_cond_obj.append(ctx.getChild(0));
                cond = 0;
            }
            token_pos.setLength(0);
            token_pos.append(ctx.getChild(0));
        }
        
        /* add object parameters (r_ball, r_teta...) */
        public void enterPInput(tccParser.PInputContext ctx) {
            token_condition.addPos(token_pos.toString(), ctx.getChild(1).toString(), ctx.getChild(3).toString());
        }
        
        /* map the name of the defined variables by user */
        public void enterDecl(tccParser.DeclContext ctx){
            token_var_nome.setLength(0);
            token_var_nome.append(ctx.getChild(1));
            this.token_condition.addVar(token_var_nome.toString());
        }
        
        public void enterCondition(tccParser.ConditionContext ctx){
            cond = 1;
            token_cond_obj.setLength(0);
        }
        
        /* concatenate "and" to the next input object */
        public void enterAnd(tccParser.AndContext ctx){
            cond = 1;
            if(ctx.getChild(1) != null){
                token_cond_obj.append(" and ");
            }
        }
        
        public void enterInit(tccParser.InitContext ctx) {
            init = 1;
        }
        /* map states */
        public void enterParametersInit(tccParser.ParametersInitContext ctx) {
            // rule condition
            if(cond == 1){
                cond = 0;
                token_cond_obj.append(" and "+ctx.getChild(0));
            }
            // instruction up(state)
            if(up == 1){
                token_act_up.append(ctx.getChild(0));
                up = 0;
            }
            // initially
            if(init == 1){
                token_init.append(ctx.getChild(0));
                init = 0;
            }
        }
        
        /* map state list */
        public void enterParametersStts(tccParser.ParametersSttsContext ctx){
            stts = 1;
            token_stts.append(ctx.getChild(0) + "and" + ctx.getChild(2) + "and" + ctx.getChild(4));
        }
        /* map defined state by user */
        public void enterUnknown(tccParser.UnknownContext ctx) {
            if(stts == 1){
                token_stts.append("and" + ctx.getChild(0));
                stts = 0;
            }
        }
        
        public void enterUp(tccParser.UpContext ctx) { 
            up = 1;
            
        }
        /* add objects from mapped action */
        public void exitAction(tccParser.ActionContext ctx) {
            this.token_condition.addObjs(token_stts.toString(), token_init.toString(), token_cond_obj.toString(), token_act_up.toString());
            contItem++;            
            token_act_up.setLength(0);
            lftIf = 0;
        }
        
        /* map one if instruction or the if from insctruction if ...else*/ 
        public void enterCondIf(tccParser.CondIfContext ctx) {
            Translate.Action a = this.token_condition.new Action();
            a.nivel = contAction++;
            a.id = contID++;
            a.item = contItem;
            a.name = "if";
            a.value = ctx.getChild(0).toString();
            actions.add(a);
            if(condElse == 1)
                condElse = 0;
            condIf = 1;
        }
        
        /* decreases level to the next action */
        public void exitCondIf(tccParser.CondIfContext ctx) {
            if(contAction > 0)
                contAction--;
            condIf = 0;
        }
        /* map the else of one instruction if...else */
        public void enterCondElse(tccParser.CondElseContext ctx) {
            Translate.Action a = this.token_condition.new Action();
            a.nivel = contAction++;
            a.id = contID++;
            a.item = contItem;
            a.name = "else";
            a.value = ctx.getChild(0).toString();
            actions.add(a);
        }
        /* decreases level to a next instruction */
        public void exitCondElse(tccParser.CondElseContext ctx) {
            if(contAction > 0)
                contAction--;
        }
        
        /* map final tokens */
        public void enterMember(tccParser.MemberContext ctx) {
            // in one if
            if(condIf == 1 && lftIf == 1){
                actions.get(contID-1).value += " " + ctx.getChild(0);
            }
            // in one assignment
            if(atr == 1){
                actions.get(contID-1).value += " " + ctx.getChild(0);
            }
        }
        
        public void enterOprLbool(tccParser.OprLboolContext ctx) {
            lboolIf = 1;
        }
        
        /* map if instruction condition */
        public void exitOprLbool(tccParser.OprLboolContext ctx) {
            if(m.toString().equals("true")){
                actions.get(contID-1).value += " " + ctx.getChild(0);
            }
            if(m.toString().equals("false")){
                actions.get(contID-1).value += " not " + ctx.getChild(0);
            }
            m.setLength(0);
            lboolIf = 0;
        }
        
        /* map final tokens true or false */
        public void enterBool(tccParser.BoolContext ctx) {
            // in one if
            if(condIf == 1 && lboolIf == 1){
               m.append(ctx.getChild(0));
            }
            // in one assignment
            if(atr == 1){
                actions.get(contID-1).value += ctx.getChild(0);
            }
        }
        
        public void enterOprLflt(tccParser.OprLfltContext ctx) {
            if(condIf == 1)
                lftIf = 1;
        }
        
        public void exitOprLflt(tccParser.OprLfltContext ctx) {
            lftIf = 0;
            lftElse = 0;
        }
        
        /* arithmetic operation */
        public void enterOperatorA(tccParser.OperatorAContext ctx) {
            // in one if condition
            if(lftIf == 1){
                actions.get(contID-1).value += " " + ctx.getChild(0);
            }
            // in one assignment
            if(atr == 1){
                actions.get(contID-1).value += " " + ctx.getChild(0);
            }
        }
        
        /* logical operators */
        public void enterOperatorL(tccParser.OperatorLContext ctx) { 
            // in one if condition
            if(lftIf == 1){
                actions.get(contID-1).value += " " + ctx.getChild(0);
           }
        }
        
        /* map assignments */
        public void enterAtr(tccParser.AtrContext ctx) {
            atr = 1;
            Translate.Action a = this.token_condition.new Action();
            a.nivel = contAction++;
            a.id = contID++;
            a.item = contItem;
            a.name = "Atr";
            a.value = ctx.getChild(0).toString() + " = ";
            actions.add(a);
        }
        
        /* decreases level to the next instruction */
        public void exitAtr(tccParser.AtrContext ctx) {
            atr = 0;
            if(contAction > 0)
                contAction--;
        }
        
        /* map an emit instruction */
        public void enterEmit(tccParser.EmitContext ctx) {
            Translate.Action a = this.token_condition.new Action();
            a.nivel = contAction++;
            a.id = contID++;
            a.item = contItem;
            a.name = "emit";
            if(ctx.getChild(2).toString().equals("defend")){
                defend = 1;
                a.value = "robot.set" + ctx.getChild(2).toString() + ctx.getChild(3).toString()
                         + ctx.getChild(4).toString() + ctx.getChild(5).toString();;
            }
            if(ctx.getChild(2).toString().equals("kick")){
                kick = 1;
                a.value = "robot.setKick" + ctx.getChild(3).toString();
            }
            if(ctx.getChild(2).toString().equals("walk")){
                walk = 1;
                a.value = "robot.setMovementVector(Point2" + ctx.getChild(3).toString();
            }
            actions.add(a);
        }
	
        /* map an emit instruction */
	public void exitEmit(tccParser.EmitContext ctx) {
            if(ctx.getChild(2).toString().equals("walk"))
                actions.get(contID-1).value += ctx.getChild(9).toString() + ")";
            if(ctx.getChild(2).toString().equals("kick"))
                actions.get(contID-1).value += ctx.getChild(7).toString();
            p = 1;
            kick = 0;
            walk = 0;
            if(contAction > 0)
                contAction--;
        }
        
        /* emit parameters instruction */
        public void enterParameter(tccParser.ParameterContext ctx){
            if(kick == 1){
                if(p == 2) {
                    actions.get(contID-1).value += ", ";
                }
                actions.get(contID-1).value += ctx.getChild(0).toString();
                p = 2;
            }
            if(walk == 1){
                if(p == 2 || p == 3) {
                    actions.get(contID-1).value += ", ";
                }
                actions.get(contID-1).value += ctx.getChild(0).toString();
                p++;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        String inputFile = null;
        if ( args.length>0 ) inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null ) {
            is = new FileInputStream(inputFile);
        }
        ANTLRInputStream input = new ANTLRInputStream(is);
        tccLexer lexer = new tccLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tccParser parser = new tccParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.expr();

        ParseTreeWalker walker = new ParseTreeWalker();
        tccEmitter converter = new tccEmitter();
        walker.walk((ParseTreeListener) converter, tree);
    }
}
