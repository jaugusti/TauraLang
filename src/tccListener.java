// Generated from tcc.g4 by ANTLR 4.5
        
    import java.util.ArrayList;

import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tccParser}.
 */
public interface tccListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tccParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(tccParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link tccParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(tccParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link tccParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(tccParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link tccParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(tccParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link tccParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(tccParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link tccParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(tccParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link tccParser#input}.
	 * @param ctx the parse tree
	 */
	void enterInput(tccParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by {@link tccParser#input}.
	 * @param ctx the parse tree
	 */
	void exitInput(tccParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by {@link tccParser#parametersIn}.
	 * @param ctx the parse tree
	 */
	void enterParametersIn(tccParser.ParametersInContext ctx);
	/**
	 * Exit a parse tree produced by {@link tccParser#parametersIn}.
	 * @param ctx the parse tree
	 */
	void exitParametersIn(tccParser.ParametersInContext ctx);
	/**
	 * Enter a parse tree produced by {@link tccParser#pInput}.
	 * @param ctx the parse tree
	 */
	void enterPInput(tccParser.PInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link tccParser#pInput}.
	 * @param ctx the parse tree
	 */
	void exitPInput(tccParser.PInputContext ctx);
	/**
	 * Enter a parse tree produced by {@link tccParser#listIn}.
	 * @param ctx the parse tree
	 */
	void enterListIn(tccParser.ListInContext ctx);
	/**
	 * Exit a parse tree produced by {@link tccParser#listIn}.
	 * @param ctx the parse tree
	 */
	void exitListIn(tccParser.ListInContext ctx);
	/**
	 * Enter a parse tree produced by {@link tccParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(tccParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link tccParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(tccParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by {@link tccParser#parametersOut}.
	 * @param ctx the parse tree
	 */
	void enterParametersOut(tccParser.ParametersOutContext ctx);
	/**
	 * Exit a parse tree produced by {@link tccParser#parametersOut}.
	 * @param ctx the parse tree
	 */
	void exitParametersOut(tccParser.ParametersOutContext ctx);
	/**
	 * Enter a parse tree produced by {@link tccParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(tccParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link tccParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(tccParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link tccParser#listVar}.
	 * @param ctx the parse tree
	 */
	void enterListVar(tccParser.ListVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link tccParser#listVar}.
	 * @param ctx the parse tree
	 */
	void exitListVar(tccParser.ListVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link tccParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(tccParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link tccParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(tccParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link tccParser#stts}.
	 * @param ctx the parse tree
	 */
	void enterStts(tccParser.SttsContext ctx);
	/**
	 * Exit a parse tree produced by {@link tccParser#stts}.
	 * @param ctx the parse tree
	 */
	void exitStts(tccParser.SttsContext ctx);
	/**
	 * Enter a parse tree produced by {@link tccParser#parametersStts}.
	 * @param ctx the parse tree
	 */
	void enterParametersStts(tccParser.ParametersSttsContext ctx);
	/**
	 * Exit a parse tree produced by {@link tccParser#parametersStts}.
	 * @param ctx the parse tree
	 */
	void exitParametersStts(tccParser.ParametersSttsContext ctx);
	/**
	 * Enter a parse tree produced by {@link tccParser#unknown}.
	 * @param ctx the parse tree
	 */
	void enterUnknown(tccParser.UnknownContext ctx);
	/**
	 * Exit a parse tree produced by {@link tccParser#unknown}.
	 * @param ctx the parse tree
	 */
	void exitUnknown(tccParser.UnknownContext ctx);
	/**
	 * Enter a parse tree produced by {@link tccParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(tccParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link tccParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(tccParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link tccParser#parametersInit}.
	 * @param ctx the parse tree
	 */
	void enterParametersInit(tccParser.ParametersInitContext ctx);
	/**
	 * Exit a parse tree produced by {@link tccParser#parametersInit}.
	 * @param ctx the parse tree
	 */
	void exitParametersInit(tccParser.ParametersInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link tccParser#rules}.
	 * @param ctx the parse tree
	 */
	void enterRules(tccParser.RulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link tccParser#rules}.
	 * @param ctx the parse tree
	 */
	void exitRules(tccParser.RulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link tccParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(tccParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tccParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(tccParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tccParser#and}.
	 * @param ctx the parse tree
	 */
	void enterAnd(tccParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by {@link tccParser#and}.
	 * @param ctx the parse tree
	 */
	void exitAnd(tccParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link tccParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(tccParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tccParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(tccParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tccParser#condIf}.
	 * @param ctx the parse tree
	 */
	void enterCondIf(tccParser.CondIfContext ctx);
	/**
	 * Exit a parse tree produced by {@link tccParser#condIf}.
	 * @param ctx the parse tree
	 */
	void exitCondIf(tccParser.CondIfContext ctx);
	/**
	 * Enter a parse tree produced by {@link tccParser#condIfElse}.
	 * @param ctx the parse tree
	 */
	void enterCondIfElse(tccParser.CondIfElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link tccParser#condIfElse}.
	 * @param ctx the parse tree
	 */
	void exitCondIfElse(tccParser.CondIfElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link tccParser#condElse}.
	 * @param ctx the parse tree
	 */
	void enterCondElse(tccParser.CondElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link tccParser#condElse}.
	 * @param ctx the parse tree
	 */
	void exitCondElse(tccParser.CondElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link tccParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(tccParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link tccParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(tccParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link tccParser#emit}.
	 * @param ctx the parse tree
	 */
	void enterEmit(tccParser.EmitContext ctx);
	/**
	 * Exit a parse tree produced by {@link tccParser#emit}.
	 * @param ctx the parse tree
	 */
	void exitEmit(tccParser.EmitContext ctx);
	/**
	 * Enter a parse tree produced by {@link tccParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(tccParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link tccParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(tccParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link tccParser#up}.
	 * @param ctx the parse tree
	 */
	void enterUp(tccParser.UpContext ctx);
	/**
	 * Exit a parse tree produced by {@link tccParser#up}.
	 * @param ctx the parse tree
	 */
	void exitUp(tccParser.UpContext ctx);
	/**
	 * Enter a parse tree produced by {@link tccParser#atr}.
	 * @param ctx the parse tree
	 */
	void enterAtr(tccParser.AtrContext ctx);
	/**
	 * Exit a parse tree produced by {@link tccParser#atr}.
	 * @param ctx the parse tree
	 */
	void exitAtr(tccParser.AtrContext ctx);
	/**
	 * Enter a parse tree produced by {@link tccParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(tccParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link tccParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(tccParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link tccParser#oprLflt}.
	 * @param ctx the parse tree
	 */
	void enterOprLflt(tccParser.OprLfltContext ctx);
	/**
	 * Exit a parse tree produced by {@link tccParser#oprLflt}.
	 * @param ctx the parse tree
	 */
	void exitOprLflt(tccParser.OprLfltContext ctx);
	/**
	 * Enter a parse tree produced by {@link tccParser#oprA}.
	 * @param ctx the parse tree
	 */
	void enterOprA(tccParser.OprAContext ctx);
	/**
	 * Exit a parse tree produced by {@link tccParser#oprA}.
	 * @param ctx the parse tree
	 */
	void exitOprA(tccParser.OprAContext ctx);
	/**
	 * Enter a parse tree produced by {@link tccParser#listaA}.
	 * @param ctx the parse tree
	 */
	void enterListaA(tccParser.ListaAContext ctx);
	/**
	 * Exit a parse tree produced by {@link tccParser#listaA}.
	 * @param ctx the parse tree
	 */
	void exitListaA(tccParser.ListaAContext ctx);
	/**
	 * Enter a parse tree produced by {@link tccParser#member}.
	 * @param ctx the parse tree
	 */
	void enterMember(tccParser.MemberContext ctx);
	/**
	 * Exit a parse tree produced by {@link tccParser#member}.
	 * @param ctx the parse tree
	 */
	void exitMember(tccParser.MemberContext ctx);
	/**
	 * Enter a parse tree produced by {@link tccParser#operatorA}.
	 * @param ctx the parse tree
	 */
	void enterOperatorA(tccParser.OperatorAContext ctx);
	/**
	 * Exit a parse tree produced by {@link tccParser#operatorA}.
	 * @param ctx the parse tree
	 */
	void exitOperatorA(tccParser.OperatorAContext ctx);
	/**
	 * Enter a parse tree produced by {@link tccParser#operatorL}.
	 * @param ctx the parse tree
	 */
	void enterOperatorL(tccParser.OperatorLContext ctx);
	/**
	 * Exit a parse tree produced by {@link tccParser#operatorL}.
	 * @param ctx the parse tree
	 */
	void exitOperatorL(tccParser.OperatorLContext ctx);
	/**
	 * Enter a parse tree produced by {@link tccParser#oprLbool}.
	 * @param ctx the parse tree
	 */
	void enterOprLbool(tccParser.OprLboolContext ctx);
	/**
	 * Exit a parse tree produced by {@link tccParser#oprLbool}.
	 * @param ctx the parse tree
	 */
	void exitOprLbool(tccParser.OprLboolContext ctx);
}