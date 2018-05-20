/*
 * Proposta de linguagem para a programação do comportamento de robôs no contexto do futebol
 * Trabalho de Graduação
 * Jessica Augusti Bonini
 * Orientador: Giovani Librelotto
 */

grammar tcc;
@header{        
    import java.util.ArrayList;
}
@members{
         ArrayList<String> states = new ArrayList<>();
         ArrayList<String> input = new ArrayList<>();
         ArrayList<String> output = new ArrayList<>();
         ArrayList<String> var = new ArrayList<>();
         ArrayList<String> bool = new ArrayList<>();
         ArrayList<String> flt = new ArrayList<>();
	 ArrayList<String> in = new ArrayList<>();
         int cont=0;
         }

expr: name body;

/* module x: */
name: 'module' ID DP;

/* { in out var states initially rules */
body : AC input output var stts init rules* FC;

input : 'in' DP OC parametersIn pInput;
 
/* ball */
parametersIn :  'ball' | POLE | (ROBOT_O | ROBOT_P | ROBOT) | 'Xline' | 'Tline' | 'Lline' | 'line' | 'unknown'
             ;
/* (r, theta) */
pInput: AP a=ID ',' b=ID FP listIn
        {if(!var.contains($a.text)){
            var.add($a.text); in.add($a.text);}
         else if(!in.contains($a.text))
            System.out.println("[Linha "+$a.getLine()+" Coluna "+$a.pos+"] INPUT: Variável '"+$a.text+"' já declarada.");
         if(!var.contains($b.text)){
            var.add($b.text); in.add($b.text);}
         else if(!in.contains($b.text))
            System.out.println("[Linha "+$b.getLine()+" Coluna "+$b.pos+"] INPUT: Variável '"+$b.text+"' já declarada.");
         flt.add($a.text); flt.add($b.text);
         }
      ;

listIn :    ',' parametersIn pInput
       |    CC PV
       ;

/* out: [parameters] */
output : 'out' DP OC parametersOut CC PV;

/* walk(r, theta, phi) | defend(r, theta, phi) | kick(r, theta, phi) */
parametersOut : 'walk' AP a=ID COMMA b=ID COMMA c=ID FP COMMA                
                'defend' AP a=ID FP COMMA
                'kick' AP a=ID COMMA b=ID FP
	        {if(!var.contains($a.text))
		   var.add($a.text);
	        else
		   System.out.println("[Linha "+$a.getLine()+" Coluna "+$a.pos+"] OUTPUT: Variável '"+$a.text+"' já declarada.");
	        if(!var.contains($b.text))
		   var.add($b.text);
	        else
		   System.out.println("[Linha "+$b.getLine()+" Coluna "+$b.pos+"] OUTPUT: Variável '"+$b.text+"' já declarada.");
	        if(!var.contains($c.text))
		   var.add($c.text);
	        else
		   System.out.println("[Linha "+$c.getLine()+" Coluna "+$c.pos+"] OUTPUT: Variável '"+$c.text+"' já declarada.");
	        flt.add($a.text); flt.add($b.text); flt.add($c.text);};

/* var: [type id...] */
var :   'var' DP OC CC PV
    |   'var' DP OC decl listVar
    ;

listVar :   COMMA decl listVar
        |   CC PV
	;

/* float and bool */
decl: 'float' ID
      {flt.add($ID.text);
       if(!input.contains($ID.text) && !output.contains($ID.text) && !states.contains($ID.text) && !var.contains($ID.text))
            var.add($ID.text);
       else 
            System.out.println("[Linha "+$ID.getLine()+" Coluna "+$ID.pos+"] ATR: Variável '"+$ID.text+"' já declarada.");
       }
    | 'boolean' ID
    {bool.add($ID.text);
     if(!input.contains($ID.text) && !output.contains($ID.text) && !states.contains($ID.text) && !var.contains($ID.text))
        var.add($ID.text);
     else 
        System.out.println("[Linha "+$ID.getLine()+" Coluna "+$ID.pos+"] ATR: Variável '"+$ID.text+"' já declarada.");
     }
    ;

/* states: [parameters]*/
stts : 'states' DP OC parametersStts CC PV;

/* walk, defend, kick */
parametersStts : 'attack' COMMA 'defense' COMMA 'goalkeeper' COMMA unknown
               ;

/* defined state by programmer */
unknown : ID
          {if(!var.contains($ID.text))
              states.add($ID.text);
           else 
              System.out.println("[Linha "+$ID.getLine()+" Coluna "+$ID.pos+"] STATE: Já existe uma variável com mesmo nome '"+$ID.text+"'.");
          }
        ;

/* initially: [state]*/
init: 'initially' DP OC parametersInit CC PV;

/* variable in state */
parametersInit: 'attack' 
              | 'defense' 
              | 'goalkeeper'
              | ID
              {if(!states.contains($ID.text))
                    System.out.println("[Linha "+$ID.getLine()+" Coluna "+$ID.pos+"] INITIALLY: Variável '"+$ID.text+"' não declarada em 'states'.");
              }
              ;

/* rules: condition -> action */
rules:  condition action;
/* one input object*/
condition: parametersIn AP a=ID COMMA b=ID FP and HAS parametersInit RARROW 
        {if(!var.contains($a.text)){
            var.add($a.text); in.add($a.text);}
         else if(!in.contains($a.text))
            System.out.println("[Linha "+$a.getLine()+" Coluna "+$a.pos+"] INPUT: Variável '"+$a.text+"' já declarada.");
         if(!var.contains($b.text)){
            var.add($b.text); in.add($b.text);}
         else if(!in.contains($b.text))
            System.out.println("[Linha "+$b.getLine()+" Coluna "+$b.pos+"] INPUT: Variável '"+$b.text+"' já declarada.");
         flt.add($a.text); flt.add($b.text);
         }
         ;

/* more than one input object*/
and:    AND parametersIn AP a=ID COMMA b=ID FP and
	{if(!var.contains($a.text)){
            var.add($a.text); in.add($a.text);}
         else if(!in.contains($a.text))
            System.out.println("[Linha "+$a.getLine()+" Coluna "+$a.pos+"] INPUT: Variável '"+$a.text+"' já declarada.");
         if(!var.contains($b.text)){
            var.add($b.text); in.add($b.text);}
         else if(!in.contains($b.text))
            System.out.println("[Linha "+$b.getLine()+" Coluna "+$b.pos+"] INPUT: Variável '"+$b.text+"' já declarada.");
         flt.add($a.text); flt.add($b.text);
         }
   |    
   ;

/* If | If Else | Atr | Up */
action:	emit term
      | atr term
      | condIf term
      | condIfElse term
      | up term;

/* if condition { term }*/
condIf: 'if' AP (oprLflt | oprLbool) FP AC term FC;

/* if condition { term } ...*/
condIfElse: condIf condElse;

/* else {term} */
condElse: 'else' AC term FC;

/* If | If Else | Atr */
term:	emit term
    |   atr term
    |   condIf term
    |   condIfElse term
    |
    ;
    
/* emit(walk); or emit(defend); or emit(kick); */
emit:   'emit' AP 'walk' AP parameter COMMA parameter COMMA parameter FP FP PV
    |   'emit' AP 'defend' AP (NUM|DIG) FP FP PV
    |   'emit' AP 'kick' AP parameter COMMA parameter FP FP PV
    ;

parameter:  (NUM|DIG)
         |  ID
           {if(!var.contains($ID.text))
                System.out.println("[Linha "+$ID.getLine()+" Coluna "+$ID.pos+"] EMIT: Variável '"+$ID.text+"' não declarada em 'var'.");
           }
         ;
/* up(attack); or up(defend); or up(goalkeeper); or up(estado definido pelo usuario); */
up :    'up' AP parametersInit FP PV;

/* assignment */
atr:    ID DPI (oprA | member) PV
        {if(!var.contains($ID.text))
            System.out.println("[Linha "+$ID.getLine()+" Coluna "+$ID.pos+"] ATR: Variável '"+$ID.text+"' não declarada em 'var'.");
         if(!flt.contains($ID.text))
            System.out.println("[Linha "+$ID.getLine()+" Coluna "+$ID.pos+"] ATR: Erro de tipo.");
        }
   |    ID DPI bool PV
        {if(!var.contains($ID.text))
            System.out.println("[Linha "+$ID.getLine()+" Coluna "+$ID.pos+"] ATR: Variável '"+$ID.text+"' não declarada em 'var'.");
         if(!bool.contains($ID.text))
            System.out.println("[Linha "+$ID.getLine()+" Coluna "+$ID.pos+"] ATR: Erro de tipo.");
        }
   ;

/* booleano */
bool:   'true'
    |   'false'
    ;

/* condition if */
oprLflt:    (oprA | member) operatorL (oprA | member)
    ;

/* arithmetic operations */
oprA :  member operatorA listaA
     ;

listaA :    member
       |    member operatorA listaA
       ;

member: ID
        {if(!var.contains($ID.text))
            System.out.println("[Linha "+$ID.getLine()+" Coluna "+$ID.pos+"] ATR: Variável '"+$ID.text+"' não declarada em 'var'.");
         if(!flt.contains($ID.text))
            System.out.println("[Linha "+$ID.getLine()+" Coluna "+$ID.pos+"] ATR: Erro de tipo.");
        }
      | (NUM | DIG);

/* + or - or * or / */
operatorA:  ADD
	 |  SUB
	 |  MTP
	 |  DIV
	 ;

operatorL:  LT // <
         |  GT // >
         |  LEQ // <=
         |  GEQ // >=
         |  EE // ==
         |  DIF // !=
         ;

/* condition if */
oprLbool: ID EE bool
          {if(!var.contains($ID.text))
                System.out.println("[Linha "+$ID.getLine()+" Coluna "+$ID.pos+"] ATR: Variável '"+$ID.text+"' não declarada em 'var'.");
           if(!bool.contains($ID.text))
                System.out.println("[Linha "+$ID.getLine()+" Coluna "+$ID.pos+"] ATR: Erro de tipo.");
          }
        ;

POLE: 'pole'[1-4];
ROBOT_O: 'robot'[1-3]'_o';
ROBOT_P: 'robot'[1-3]'_p'; 
ROBOT: 'robot'[1-3];
ID: [_a-zA-Z][_a-zA-Z0-9]*;
DIG: [0-9]+;
COMMA: ',';
SUB: '-';
NUM:  ('-')?[0-9]+'.'[0-9]+;
DP: ':';
AC: '{';
FC: '}';
OC: '[';
CC: ']';
AP: '(';
FP: ')';
DPI: ':=';
ADD: '+';

MTP: '*';
DIV: '/';
LT: '<';
GT: '>';
LEQ: '<=';
GEQ: '>=';
EE: '==';
DIF: '!=';
HAS: '#';
RARROW: '->';
AND: '&';
PV: ';';
WSPC : [ \r\t\n]+ ->  skip;
