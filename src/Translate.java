/*
* Proposta de linguagem para a programação do comportamento de robôs no contexto do futebol
* Trabalho de Graduação
* Jessica Augusti Bonini
* Orientador: Giovani Librelotto
* 04 de Dezembro de 2015
*/

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Translate {
    private ArrayList<String> objects = new ArrayList(); // ball, pole, robot ...
    private ArrayList<TranslateItem> itens = new ArrayList(); // save the instructions
    public ArrayList<Action> actions = null; // emit, if, if...else, atr
    private ArrayList<String> list_stts = new ArrayList();
    private String init = ""; // instruction initially
    
    /* rule action instructions: if, if...else, atribuicao, emit */
    public class Action{
        
        public int nivel = 0; // indicates indentation
        public int id = 0;
        public int item = 0; // indicates which rule the instruction belongs
        public String name = ""; // instruction name
        public String value = ""; // value
        
        public Action a = null;
    }
    
    /* parameters input object*/
    public class Position{
        public String name = ""; // name of the object
	//object positioning
        public String r = ""; // value
        public String theta = ""; // value
        
        public Position(String name, String r, String theta){
            this.name = name; // object
            // object positioning
            this.r =  r;//value
            this.theta = theta;//value
        }
    }
    
    public ArrayList <Position> position = new ArrayList ();
    
    public void addPos(String name, String r, String theta){
         this.position.add(new Position(name, r, theta));
        
    }
    
    /* states, initially, input objects, up */
    public class TranslateItem{
        private String instruction = ""; // rule condition
        private String up = ""; // instruction up
        
        
        public TranslateItem(String stts, String istt, String obj, String up){
            for(String k : stts.split("and")){ // break at "and"   
                if (!list_stts.contains(k)) // list of states 
                    list_stts.add(k);
            }
            init = istt;
            for(String s : obj.split(" and ")){ // break at "and"    
                if (!objects.contains(s)) // list of objects 
                    objects.add(s);
                instruction = obj; // rule condition
            }
            this.up = up; // instruction up
        }

    }
    
    public void addObjs(String stts, String init, String obj, String up){
        this.itens.add(new TranslateItem(stts, init, obj, up));
    }
    
    /* defined variables by user */
    public ArrayList <String> variaveis = new ArrayList ();
    
    public void addVar(String v){
        variaveis.add(v);
    }
    
    /* out */
    public String getOutput() throws IOException{
        String out = ""; // out string
        // header
        out = "from MindInterface import Simulation\n" + 
              "from MindInterface.config import * \n\n" +
              "import time\n" +
              "from math import pi\n\n" +
              "robot = Simulation.start()\n\n" +
              "while robot.updateSimulation():\n" +
              "   world = robot.perceiveWorld()\n" +
              "   if not world:\n" +
              "      sys.exit(\"No world received\")\n";
        // defined variables by user
        for (String v : this.variaveis){
           out += "\n   " + v + " = null";
        }
        // initially
        out += "\n   " + init + " = True";
        out += "\n";
        for (String obj : this.objects){
            if(!this.list_stts.contains(obj))
                out += "\n   " + obj + " = None"; // declaration of objects in python
        }
        // run object list that comes from world 
        out += "\n   for obj in  world.objects_list: \n"; 
        for (String o : this.objects){
            if(!this.list_stts.contains(o)){
                out += "      if obj.kind == \"" + o + "\":\n" +  // assings the object if it is on the list
                        "         " + o + " = obj\n";
                for(Position p : this.position){ // parameters of each input object
                    if(p.name.equals(o)){
                        out += "         " + p.r + " = " + p.name + ".position.r\n";
                        out += "         " + p.theta + " = " + p.name + ".position.a\n";
                    }
                }
            }
        }
        out += "\n";
        int cont = 0;
        // rules
        for (TranslateItem  i : this.itens){
            out += "   if " + i.instruction + ":\n"; // rule condition
            if(list_stts.contains(i.up.toString())){                
                if(i.up.equals("attack")){ // up attack
                    out += "      " + i.up + " = True\n";
                    for(String b : this.list_stts){
                        if(!b.equals(i.up))
                            out += "      " + b + " = False\n";
                    }
                }

                else if(i.up.equals("defense")){ // up defense
                    out += "      " + i.up + " = True\n";
                    for(String b : this.list_stts){
                        if(!b.equals(i.up))
                            out += "      " + b + " = False\n";
                    }
                }
                else if(i.up.equals("goalkeeper")){ // up goalkeeper
                    out += "      " + i.up + " = True\n";
                    for(String b : this.list_stts){
                        if(!b.equals(i.up))
                            out += "      " + b + " = False\n";
                    }
                }

                else { // up state defined by user
                    out += "      " + i.up + " = True\n";
                    for(String b : this.list_stts){
                        if(!b.equals(i.up))
                            out += "      " + b + " = False\n";
                    }
                }
                out += "\n";
            }
            
            for(Action a : this.actions){ // rule action
                if(a.item == cont){ // verify if the action belongs to the actual rule
                    for (int z = 0; z < a.nivel; z++){
                        out += "      "; // prints with the right indentation
                    }
                    if(a.name.equals("if") || a.name.equals("else"))
                        out += "      " + a.value + ":\n"; // print action
                    else
                        out += "      " + a.value + "\n"; // print action
                }
            }
            out += "\n";
            cont++;
        }
	/* save outfile */
        FileWriter arquivo = new FileWriter("/home/jessica/simulador/IA_tcc.py", true);
        PrintWriter gArquivo = new PrintWriter(arquivo);
        gArquivo.print(out);
        arquivo.close();
        return out;
    }
}
