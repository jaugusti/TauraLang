// Generated from tcc.g4 by ANTLR 4.5
        
    import java.util.ArrayList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tccParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, POLE=27, ROBOT_O=28, ROBOT_P=29, ROBOT=30, ID=31, 
		DIG=32, COMMA=33, SUB=34, NUM=35, DP=36, AC=37, FC=38, OC=39, CC=40, AP=41, 
		FP=42, DPI=43, ADD=44, MTP=45, DIV=46, LT=47, GT=48, LEQ=49, GEQ=50, EE=51, 
		DIF=52, HAS=53, RARROW=54, AND=55, PV=56, WSPC=57;
	public static final int
		RULE_expr = 0, RULE_name = 1, RULE_body = 2, RULE_input = 3, RULE_parametersIn = 4, 
		RULE_pInput = 5, RULE_listIn = 6, RULE_output = 7, RULE_parametersOut = 8, 
		RULE_var = 9, RULE_listVar = 10, RULE_decl = 11, RULE_stts = 12, RULE_parametersStts = 13, 
		RULE_unknown = 14, RULE_init = 15, RULE_parametersInit = 16, RULE_rules = 17, 
		RULE_condition = 18, RULE_and = 19, RULE_action = 20, RULE_condIf = 21, 
		RULE_condIfElse = 22, RULE_condElse = 23, RULE_term = 24, RULE_emit = 25, 
		RULE_parameter = 26, RULE_up = 27, RULE_atr = 28, RULE_bool = 29, RULE_oprLflt = 30, 
		RULE_oprA = 31, RULE_listaA = 32, RULE_member = 33, RULE_operatorA = 34, 
		RULE_operatorL = 35, RULE_oprLbool = 36;
	public static final String[] ruleNames = {
		"expr", "name", "body", "input", "parametersIn", "pInput", "listIn", "output", 
		"parametersOut", "var", "listVar", "decl", "stts", "parametersStts", "unknown", 
		"init", "parametersInit", "rules", "condition", "and", "action", "condIf", 
		"condIfElse", "condElse", "term", "emit", "parameter", "up", "atr", "bool", 
		"oprLflt", "oprA", "listaA", "member", "operatorA", "operatorL", "oprLbool"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'module'", "'in'", "'ball'", "'Xline'", "'Tline'", "'Lline'", "'line'", 
		"'unknown'", "'out'", "'walk'", "'defend'", "'kick'", "'var'", "'float'", 
		"'boolean'", "'states'", "'attack'", "'defense'", "'goalkeeper'", "'initially'", 
		"'if'", "'else'", "'emit'", "'up'", "'true'", "'false'", null, null, null, 
		null, null, null, "','", "'-'", null, "':'", "'{'", "'}'", "'['", "']'", 
		"'('", "')'", "':='", "'+'", "'*'", "'/'", "'<'", "'>'", "'<='", "'>='", 
		"'=='", "'!='", "'#'", "'->'", "'&'", "';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "POLE", "ROBOT_O", "ROBOT_P", "ROBOT", "ID", "DIG", 
		"COMMA", "SUB", "NUM", "DP", "AC", "FC", "OC", "CC", "AP", "FP", "DPI", 
		"ADD", "MTP", "DIV", "LT", "GT", "LEQ", "GEQ", "EE", "DIF", "HAS", "RARROW", 
		"AND", "PV", "WSPC"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "tcc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	         ArrayList<String> states = new ArrayList<>();
	         ArrayList<String> input = new ArrayList<>();
	         ArrayList<String> output = new ArrayList<>();
	         ArrayList<String> var = new ArrayList<>();
	         ArrayList<String> bool = new ArrayList<>();
	         ArrayList<String> flt = new ArrayList<>();
		 ArrayList<String> in = new ArrayList<>();
	         int cont=0;
	         
	public tccParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ExprContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public BodyContext body() {
			return getRuleContext(BodyContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			name();
			setState(75);
			body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(tccParser.ID, 0); }
		public TerminalNode DP() { return getToken(tccParser.DP, 0); }
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).exitName(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(T__0);
			setState(78);
			match(ID);
			setState(79);
			match(DP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BodyContext extends ParserRuleContext {
		public TerminalNode AC() { return getToken(tccParser.AC, 0); }
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public SttsContext stts() {
			return getRuleContext(SttsContext.class,0);
		}
		public InitContext init() {
			return getRuleContext(InitContext.class,0);
		}
		public TerminalNode FC() { return getToken(tccParser.FC, 0); }
		public List<RulesContext> rules() {
			return getRuleContexts(RulesContext.class);
		}
		public RulesContext rules(int i) {
			return getRuleContext(RulesContext.class,i);
		}
		public BodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_body; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).enterBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).exitBody(this);
		}
	}

	public final BodyContext body() throws RecognitionException {
		BodyContext _localctx = new BodyContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_body);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(AC);
			setState(82);
			input();
			setState(83);
			output();
			setState(84);
			var();
			setState(85);
			stts();
			setState(86);
			init();
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << POLE) | (1L << ROBOT_O) | (1L << ROBOT_P) | (1L << ROBOT))) != 0)) {
				{
				{
				setState(87);
				rules();
				}
				}
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(93);
			match(FC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InputContext extends ParserRuleContext {
		public TerminalNode DP() { return getToken(tccParser.DP, 0); }
		public TerminalNode OC() { return getToken(tccParser.OC, 0); }
		public ParametersInContext parametersIn() {
			return getRuleContext(ParametersInContext.class,0);
		}
		public PInputContext pInput() {
			return getRuleContext(PInputContext.class,0);
		}
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__1);
			setState(96);
			match(DP);
			setState(97);
			match(OC);
			setState(98);
			parametersIn();
			setState(99);
			pInput();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersInContext extends ParserRuleContext {
		public TerminalNode POLE() { return getToken(tccParser.POLE, 0); }
		public TerminalNode ROBOT_O() { return getToken(tccParser.ROBOT_O, 0); }
		public TerminalNode ROBOT_P() { return getToken(tccParser.ROBOT_P, 0); }
		public TerminalNode ROBOT() { return getToken(tccParser.ROBOT, 0); }
		public ParametersInContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersIn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).enterParametersIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).exitParametersIn(this);
		}
	}

	public final ParametersInContext parametersIn() throws RecognitionException {
		ParametersInContext _localctx = new ParametersInContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_parametersIn);
		int _la;
		try {
			setState(109);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(101);
				match(T__2);
				}
				break;
			case POLE:
				enterOuterAlt(_localctx, 2);
				{
				setState(102);
				match(POLE);
				}
				break;
			case ROBOT_O:
			case ROBOT_P:
			case ROBOT:
				enterOuterAlt(_localctx, 3);
				{
				setState(103);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ROBOT_O) | (1L << ROBOT_P) | (1L << ROBOT))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 4);
				{
				setState(104);
				match(T__3);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 5);
				{
				setState(105);
				match(T__4);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 6);
				{
				setState(106);
				match(T__5);
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 7);
				{
				setState(107);
				match(T__6);
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 8);
				{
				setState(108);
				match(T__7);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PInputContext extends ParserRuleContext {
		public Token a;
		public Token b;
		public TerminalNode AP() { return getToken(tccParser.AP, 0); }
		public TerminalNode FP() { return getToken(tccParser.FP, 0); }
		public ListInContext listIn() {
			return getRuleContext(ListInContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(tccParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(tccParser.ID, i);
		}
		public PInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pInput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).enterPInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).exitPInput(this);
		}
	}

	public final PInputContext pInput() throws RecognitionException {
		PInputContext _localctx = new PInputContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pInput);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(AP);
			setState(112);
			((PInputContext)_localctx).a = match(ID);
			setState(113);
			match(COMMA);
			setState(114);
			((PInputContext)_localctx).b = match(ID);
			setState(115);
			match(FP);
			setState(116);
			listIn();
			if(!var.contains((((PInputContext)_localctx).a!=null?((PInputContext)_localctx).a.getText():null))){
			            var.add((((PInputContext)_localctx).a!=null?((PInputContext)_localctx).a.getText():null)); in.add((((PInputContext)_localctx).a!=null?((PInputContext)_localctx).a.getText():null));}
			         else if(!in.contains((((PInputContext)_localctx).a!=null?((PInputContext)_localctx).a.getText():null)))
			            System.out.println("[Linha "+((PInputContext)_localctx).a.getLine()+" Coluna "+(((PInputContext)_localctx).a!=null?((PInputContext)_localctx).a.getCharPositionInLine():0)+"] INPUT: Vari�vel '"+(((PInputContext)_localctx).a!=null?((PInputContext)_localctx).a.getText():null)+"' j� declarada.");
			         if(!var.contains((((PInputContext)_localctx).b!=null?((PInputContext)_localctx).b.getText():null))){
			            var.add((((PInputContext)_localctx).b!=null?((PInputContext)_localctx).b.getText():null)); in.add((((PInputContext)_localctx).b!=null?((PInputContext)_localctx).b.getText():null));}
			         else if(!in.contains((((PInputContext)_localctx).b!=null?((PInputContext)_localctx).b.getText():null)))
			            System.out.println("[Linha "+((PInputContext)_localctx).b.getLine()+" Coluna "+(((PInputContext)_localctx).b!=null?((PInputContext)_localctx).b.getCharPositionInLine():0)+"] INPUT: Vari�vel '"+(((PInputContext)_localctx).b!=null?((PInputContext)_localctx).b.getText():null)+"' j� declarada.");
			         flt.add((((PInputContext)_localctx).a!=null?((PInputContext)_localctx).a.getText():null)); flt.add((((PInputContext)_localctx).b!=null?((PInputContext)_localctx).b.getText():null));
			         
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListInContext extends ParserRuleContext {
		public ParametersInContext parametersIn() {
			return getRuleContext(ParametersInContext.class,0);
		}
		public PInputContext pInput() {
			return getRuleContext(PInputContext.class,0);
		}
		public TerminalNode CC() { return getToken(tccParser.CC, 0); }
		public TerminalNode PV() { return getToken(tccParser.PV, 0); }
		public ListInContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listIn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).enterListIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).exitListIn(this);
		}
	}

	public final ListInContext listIn() throws RecognitionException {
		ListInContext _localctx = new ListInContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_listIn);
		try {
			setState(125);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(119);
				match(COMMA);
				setState(120);
				parametersIn();
				setState(121);
				pInput();
				}
				break;
			case CC:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				match(CC);
				setState(124);
				match(PV);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OutputContext extends ParserRuleContext {
		public TerminalNode DP() { return getToken(tccParser.DP, 0); }
		public TerminalNode OC() { return getToken(tccParser.OC, 0); }
		public ParametersOutContext parametersOut() {
			return getRuleContext(ParametersOutContext.class,0);
		}
		public TerminalNode CC() { return getToken(tccParser.CC, 0); }
		public TerminalNode PV() { return getToken(tccParser.PV, 0); }
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).exitOutput(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_output);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(T__8);
			setState(128);
			match(DP);
			setState(129);
			match(OC);
			setState(130);
			parametersOut();
			setState(131);
			match(CC);
			setState(132);
			match(PV);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersOutContext extends ParserRuleContext {
		public Token a;
		public Token b;
		public Token c;
		public List<TerminalNode> AP() { return getTokens(tccParser.AP); }
		public TerminalNode AP(int i) {
			return getToken(tccParser.AP, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(tccParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tccParser.COMMA, i);
		}
		public List<TerminalNode> FP() { return getTokens(tccParser.FP); }
		public TerminalNode FP(int i) {
			return getToken(tccParser.FP, i);
		}
		public List<TerminalNode> ID() { return getTokens(tccParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(tccParser.ID, i);
		}
		public ParametersOutContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersOut; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).enterParametersOut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).exitParametersOut(this);
		}
	}

	public final ParametersOutContext parametersOut() throws RecognitionException {
		ParametersOutContext _localctx = new ParametersOutContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parametersOut);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(T__9);
			setState(135);
			match(AP);
			setState(136);
			((ParametersOutContext)_localctx).a = match(ID);
			setState(137);
			match(COMMA);
			setState(138);
			((ParametersOutContext)_localctx).b = match(ID);
			setState(139);
			match(COMMA);
			setState(140);
			((ParametersOutContext)_localctx).c = match(ID);
			setState(141);
			match(FP);
			setState(142);
			match(COMMA);
			setState(143);
			match(T__10);
			setState(144);
			match(AP);
			setState(145);
			((ParametersOutContext)_localctx).a = match(ID);
			setState(146);
			match(FP);
			setState(147);
			match(COMMA);
			setState(148);
			match(T__11);
			setState(149);
			match(AP);
			setState(150);
			((ParametersOutContext)_localctx).a = match(ID);
			setState(151);
			match(COMMA);
			setState(152);
			((ParametersOutContext)_localctx).b = match(ID);
			setState(153);
			match(FP);
			if(!var.contains((((ParametersOutContext)_localctx).a!=null?((ParametersOutContext)_localctx).a.getText():null)))
					   var.add((((ParametersOutContext)_localctx).a!=null?((ParametersOutContext)_localctx).a.getText():null));
				        else
					   System.out.println("[Linha "+((ParametersOutContext)_localctx).a.getLine()+" Coluna "+(((ParametersOutContext)_localctx).a!=null?((ParametersOutContext)_localctx).a.getCharPositionInLine():0)+"] OUTPUT: Vari�vel '"+(((ParametersOutContext)_localctx).a!=null?((ParametersOutContext)_localctx).a.getText():null)+"' j� declarada.");
				        if(!var.contains((((ParametersOutContext)_localctx).b!=null?((ParametersOutContext)_localctx).b.getText():null)))
					   var.add((((ParametersOutContext)_localctx).b!=null?((ParametersOutContext)_localctx).b.getText():null));
				        else
					   System.out.println("[Linha "+((ParametersOutContext)_localctx).b.getLine()+" Coluna "+(((ParametersOutContext)_localctx).b!=null?((ParametersOutContext)_localctx).b.getCharPositionInLine():0)+"] OUTPUT: Vari�vel '"+(((ParametersOutContext)_localctx).b!=null?((ParametersOutContext)_localctx).b.getText():null)+"' j� declarada.");
				        if(!var.contains((((ParametersOutContext)_localctx).c!=null?((ParametersOutContext)_localctx).c.getText():null)))
					   var.add((((ParametersOutContext)_localctx).c!=null?((ParametersOutContext)_localctx).c.getText():null));
				        else
					   System.out.println("[Linha "+((ParametersOutContext)_localctx).c.getLine()+" Coluna "+(((ParametersOutContext)_localctx).c!=null?((ParametersOutContext)_localctx).c.getCharPositionInLine():0)+"] OUTPUT: Vari�vel '"+(((ParametersOutContext)_localctx).c!=null?((ParametersOutContext)_localctx).c.getText():null)+"' j� declarada.");
				        flt.add((((ParametersOutContext)_localctx).a!=null?((ParametersOutContext)_localctx).a.getText():null)); flt.add((((ParametersOutContext)_localctx).b!=null?((ParametersOutContext)_localctx).b.getText():null)); flt.add((((ParametersOutContext)_localctx).c!=null?((ParametersOutContext)_localctx).c.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public TerminalNode DP() { return getToken(tccParser.DP, 0); }
		public TerminalNode OC() { return getToken(tccParser.OC, 0); }
		public TerminalNode CC() { return getToken(tccParser.CC, 0); }
		public TerminalNode PV() { return getToken(tccParser.PV, 0); }
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public ListVarContext listVar() {
			return getRuleContext(ListVarContext.class,0);
		}
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).enterVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).exitVar(this);
		}
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_var);
		try {
			setState(167);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(T__12);
				setState(157);
				match(DP);
				setState(158);
				match(OC);
				setState(159);
				match(CC);
				setState(160);
				match(PV);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				match(T__12);
				setState(162);
				match(DP);
				setState(163);
				match(OC);
				setState(164);
				decl();
				setState(165);
				listVar();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListVarContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(tccParser.COMMA, 0); }
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public ListVarContext listVar() {
			return getRuleContext(ListVarContext.class,0);
		}
		public TerminalNode CC() { return getToken(tccParser.CC, 0); }
		public TerminalNode PV() { return getToken(tccParser.PV, 0); }
		public ListVarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listVar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).enterListVar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).exitListVar(this);
		}
	}

	public final ListVarContext listVar() throws RecognitionException {
		ListVarContext _localctx = new ListVarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_listVar);
		try {
			setState(175);
			switch (_input.LA(1)) {
			case COMMA:
				enterOuterAlt(_localctx, 1);
				{
				setState(169);
				match(COMMA);
				setState(170);
				decl();
				setState(171);
				listVar();
				}
				break;
			case CC:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(CC);
				setState(174);
				match(PV);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(tccParser.ID, 0); }
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).exitDecl(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_decl);
		try {
			setState(183);
			switch (_input.LA(1)) {
			case T__13:
				enterOuterAlt(_localctx, 1);
				{
				setState(177);
				match(T__13);
				setState(178);
				((DeclContext)_localctx).ID = match(ID);
				flt.add((((DeclContext)_localctx).ID!=null?((DeclContext)_localctx).ID.getText():null));
				       if(!input.contains((((DeclContext)_localctx).ID!=null?((DeclContext)_localctx).ID.getText():null)) && !output.contains((((DeclContext)_localctx).ID!=null?((DeclContext)_localctx).ID.getText():null)) && !states.contains((((DeclContext)_localctx).ID!=null?((DeclContext)_localctx).ID.getText():null)) && !var.contains((((DeclContext)_localctx).ID!=null?((DeclContext)_localctx).ID.getText():null)))
				            var.add((((DeclContext)_localctx).ID!=null?((DeclContext)_localctx).ID.getText():null));
				       else 
				            System.out.println("[Linha "+((DeclContext)_localctx).ID.getLine()+" Coluna "+(((DeclContext)_localctx).ID!=null?((DeclContext)_localctx).ID.getCharPositionInLine():0)+"] ATR: Vari�vel '"+(((DeclContext)_localctx).ID!=null?((DeclContext)_localctx).ID.getText():null)+"' j� declarada.");
				       
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(180);
				match(T__14);
				setState(181);
				((DeclContext)_localctx).ID = match(ID);
				bool.add((((DeclContext)_localctx).ID!=null?((DeclContext)_localctx).ID.getText():null));
				     if(!input.contains((((DeclContext)_localctx).ID!=null?((DeclContext)_localctx).ID.getText():null)) && !output.contains((((DeclContext)_localctx).ID!=null?((DeclContext)_localctx).ID.getText():null)) && !states.contains((((DeclContext)_localctx).ID!=null?((DeclContext)_localctx).ID.getText():null)) && !var.contains((((DeclContext)_localctx).ID!=null?((DeclContext)_localctx).ID.getText():null)))
				        var.add((((DeclContext)_localctx).ID!=null?((DeclContext)_localctx).ID.getText():null));
				     else 
				        System.out.println("[Linha "+((DeclContext)_localctx).ID.getLine()+" Coluna "+(((DeclContext)_localctx).ID!=null?((DeclContext)_localctx).ID.getCharPositionInLine():0)+"] ATR: Vari�vel '"+(((DeclContext)_localctx).ID!=null?((DeclContext)_localctx).ID.getText():null)+"' j� declarada.");
				     
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SttsContext extends ParserRuleContext {
		public TerminalNode DP() { return getToken(tccParser.DP, 0); }
		public TerminalNode OC() { return getToken(tccParser.OC, 0); }
		public ParametersSttsContext parametersStts() {
			return getRuleContext(ParametersSttsContext.class,0);
		}
		public TerminalNode CC() { return getToken(tccParser.CC, 0); }
		public TerminalNode PV() { return getToken(tccParser.PV, 0); }
		public SttsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).enterStts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).exitStts(this);
		}
	}

	public final SttsContext stts() throws RecognitionException {
		SttsContext _localctx = new SttsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__15);
			setState(186);
			match(DP);
			setState(187);
			match(OC);
			setState(188);
			parametersStts();
			setState(189);
			match(CC);
			setState(190);
			match(PV);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersSttsContext extends ParserRuleContext {
		public List<TerminalNode> COMMA() { return getTokens(tccParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tccParser.COMMA, i);
		}
		public UnknownContext unknown() {
			return getRuleContext(UnknownContext.class,0);
		}
		public ParametersSttsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersStts; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).enterParametersStts(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).exitParametersStts(this);
		}
	}

	public final ParametersSttsContext parametersStts() throws RecognitionException {
		ParametersSttsContext _localctx = new ParametersSttsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parametersStts);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			match(T__16);
			setState(193);
			match(COMMA);
			setState(194);
			match(T__17);
			setState(195);
			match(COMMA);
			setState(196);
			match(T__18);
			setState(197);
			match(COMMA);
			setState(198);
			unknown();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnknownContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(tccParser.ID, 0); }
		public UnknownContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unknown; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).enterUnknown(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).exitUnknown(this);
		}
	}

	public final UnknownContext unknown() throws RecognitionException {
		UnknownContext _localctx = new UnknownContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_unknown);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			((UnknownContext)_localctx).ID = match(ID);
			if(!var.contains((((UnknownContext)_localctx).ID!=null?((UnknownContext)_localctx).ID.getText():null)))
			              states.add((((UnknownContext)_localctx).ID!=null?((UnknownContext)_localctx).ID.getText():null));
			           else 
			              System.out.println("[Linha "+((UnknownContext)_localctx).ID.getLine()+" Coluna "+(((UnknownContext)_localctx).ID!=null?((UnknownContext)_localctx).ID.getCharPositionInLine():0)+"] STATE: J� existe uma vari�vel com mesmo nome '"+(((UnknownContext)_localctx).ID!=null?((UnknownContext)_localctx).ID.getText():null)+"'.");
			          
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InitContext extends ParserRuleContext {
		public TerminalNode DP() { return getToken(tccParser.DP, 0); }
		public TerminalNode OC() { return getToken(tccParser.OC, 0); }
		public ParametersInitContext parametersInit() {
			return getRuleContext(ParametersInitContext.class,0);
		}
		public TerminalNode CC() { return getToken(tccParser.CC, 0); }
		public TerminalNode PV() { return getToken(tccParser.PV, 0); }
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_init);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(T__19);
			setState(204);
			match(DP);
			setState(205);
			match(OC);
			setState(206);
			parametersInit();
			setState(207);
			match(CC);
			setState(208);
			match(PV);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametersInitContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(tccParser.ID, 0); }
		public ParametersInitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametersInit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).enterParametersInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).exitParametersInit(this);
		}
	}

	public final ParametersInitContext parametersInit() throws RecognitionException {
		ParametersInitContext _localctx = new ParametersInitContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_parametersInit);
		try {
			setState(215);
			switch (_input.LA(1)) {
			case T__16:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(T__16);
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(T__17);
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				match(T__18);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				((ParametersInitContext)_localctx).ID = match(ID);
				if(!states.contains((((ParametersInitContext)_localctx).ID!=null?((ParametersInitContext)_localctx).ID.getText():null)))
				                    System.out.println("[Linha "+((ParametersInitContext)_localctx).ID.getLine()+" Coluna "+(((ParametersInitContext)_localctx).ID!=null?((ParametersInitContext)_localctx).ID.getCharPositionInLine():0)+"] INITIALLY: Vari�vel '"+(((ParametersInitContext)_localctx).ID!=null?((ParametersInitContext)_localctx).ID.getText():null)+"' n�o declarada em 'states'.");
				              
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RulesContext extends ParserRuleContext {
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public ActionContext action() {
			return getRuleContext(ActionContext.class,0);
		}
		public RulesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rules; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).enterRules(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).exitRules(this);
		}
	}

	public final RulesContext rules() throws RecognitionException {
		RulesContext _localctx = new RulesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_rules);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			condition();
			setState(218);
			action();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConditionContext extends ParserRuleContext {
		public Token a;
		public Token b;
		public ParametersInContext parametersIn() {
			return getRuleContext(ParametersInContext.class,0);
		}
		public TerminalNode AP() { return getToken(tccParser.AP, 0); }
		public TerminalNode COMMA() { return getToken(tccParser.COMMA, 0); }
		public TerminalNode FP() { return getToken(tccParser.FP, 0); }
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public TerminalNode HAS() { return getToken(tccParser.HAS, 0); }
		public ParametersInitContext parametersInit() {
			return getRuleContext(ParametersInitContext.class,0);
		}
		public TerminalNode RARROW() { return getToken(tccParser.RARROW, 0); }
		public List<TerminalNode> ID() { return getTokens(tccParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(tccParser.ID, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			parametersIn();
			setState(221);
			match(AP);
			setState(222);
			((ConditionContext)_localctx).a = match(ID);
			setState(223);
			match(COMMA);
			setState(224);
			((ConditionContext)_localctx).b = match(ID);
			setState(225);
			match(FP);
			setState(226);
			and();
			setState(227);
			match(HAS);
			setState(228);
			parametersInit();
			setState(229);
			match(RARROW);
			if(!var.contains((((ConditionContext)_localctx).a!=null?((ConditionContext)_localctx).a.getText():null))){
			            var.add((((ConditionContext)_localctx).a!=null?((ConditionContext)_localctx).a.getText():null)); in.add((((ConditionContext)_localctx).a!=null?((ConditionContext)_localctx).a.getText():null));}
			         else if(!in.contains((((ConditionContext)_localctx).a!=null?((ConditionContext)_localctx).a.getText():null)))
			            System.out.println("[Linha "+((ConditionContext)_localctx).a.getLine()+" Coluna "+(((ConditionContext)_localctx).a!=null?((ConditionContext)_localctx).a.getCharPositionInLine():0)+"] INPUT: Vari�vel '"+(((ConditionContext)_localctx).a!=null?((ConditionContext)_localctx).a.getText():null)+"' j� declarada.");
			         if(!var.contains((((ConditionContext)_localctx).b!=null?((ConditionContext)_localctx).b.getText():null))){
			            var.add((((ConditionContext)_localctx).b!=null?((ConditionContext)_localctx).b.getText():null)); in.add((((ConditionContext)_localctx).b!=null?((ConditionContext)_localctx).b.getText():null));}
			         else if(!in.contains((((ConditionContext)_localctx).b!=null?((ConditionContext)_localctx).b.getText():null)))
			            System.out.println("[Linha "+((ConditionContext)_localctx).b.getLine()+" Coluna "+(((ConditionContext)_localctx).b!=null?((ConditionContext)_localctx).b.getCharPositionInLine():0)+"] INPUT: Vari�vel '"+(((ConditionContext)_localctx).b!=null?((ConditionContext)_localctx).b.getText():null)+"' j� declarada.");
			         flt.add((((ConditionContext)_localctx).a!=null?((ConditionContext)_localctx).a.getText():null)); flt.add((((ConditionContext)_localctx).b!=null?((ConditionContext)_localctx).b.getText():null));
			         
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AndContext extends ParserRuleContext {
		public Token a;
		public Token b;
		public TerminalNode AND() { return getToken(tccParser.AND, 0); }
		public ParametersInContext parametersIn() {
			return getRuleContext(ParametersInContext.class,0);
		}
		public TerminalNode AP() { return getToken(tccParser.AP, 0); }
		public TerminalNode COMMA() { return getToken(tccParser.COMMA, 0); }
		public TerminalNode FP() { return getToken(tccParser.FP, 0); }
		public AndContext and() {
			return getRuleContext(AndContext.class,0);
		}
		public List<TerminalNode> ID() { return getTokens(tccParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(tccParser.ID, i);
		}
		public AndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_and; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).exitAnd(this);
		}
	}

	public final AndContext and() throws RecognitionException {
		AndContext _localctx = new AndContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_and);
		try {
			setState(243);
			switch (_input.LA(1)) {
			case AND:
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				match(AND);
				setState(233);
				parametersIn();
				setState(234);
				match(AP);
				setState(235);
				((AndContext)_localctx).a = match(ID);
				setState(236);
				match(COMMA);
				setState(237);
				((AndContext)_localctx).b = match(ID);
				setState(238);
				match(FP);
				setState(239);
				and();
				if(!var.contains((((AndContext)_localctx).a!=null?((AndContext)_localctx).a.getText():null))){
				            var.add((((AndContext)_localctx).a!=null?((AndContext)_localctx).a.getText():null)); in.add((((AndContext)_localctx).a!=null?((AndContext)_localctx).a.getText():null));}
				         else if(!in.contains((((AndContext)_localctx).a!=null?((AndContext)_localctx).a.getText():null)))
				            System.out.println("[Linha "+((AndContext)_localctx).a.getLine()+" Coluna "+(((AndContext)_localctx).a!=null?((AndContext)_localctx).a.getCharPositionInLine():0)+"] INPUT: Vari�vel '"+(((AndContext)_localctx).a!=null?((AndContext)_localctx).a.getText():null)+"' j� declarada.");
				         if(!var.contains((((AndContext)_localctx).b!=null?((AndContext)_localctx).b.getText():null))){
				            var.add((((AndContext)_localctx).b!=null?((AndContext)_localctx).b.getText():null)); in.add((((AndContext)_localctx).b!=null?((AndContext)_localctx).b.getText():null));}
				         else if(!in.contains((((AndContext)_localctx).b!=null?((AndContext)_localctx).b.getText():null)))
				            System.out.println("[Linha "+((AndContext)_localctx).b.getLine()+" Coluna "+(((AndContext)_localctx).b!=null?((AndContext)_localctx).b.getCharPositionInLine():0)+"] INPUT: Vari�vel '"+(((AndContext)_localctx).b!=null?((AndContext)_localctx).b.getText():null)+"' j� declarada.");
				         flt.add((((AndContext)_localctx).a!=null?((AndContext)_localctx).a.getText():null)); flt.add((((AndContext)_localctx).b!=null?((AndContext)_localctx).b.getText():null));
				         
				}
				break;
			case HAS:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ActionContext extends ParserRuleContext {
		public EmitContext emit() {
			return getRuleContext(EmitContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public AtrContext atr() {
			return getRuleContext(AtrContext.class,0);
		}
		public CondIfContext condIf() {
			return getRuleContext(CondIfContext.class,0);
		}
		public CondIfElseContext condIfElse() {
			return getRuleContext(CondIfElseContext.class,0);
		}
		public UpContext up() {
			return getRuleContext(UpContext.class,0);
		}
		public ActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_action; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).enterAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).exitAction(this);
		}
	}

	public final ActionContext action() throws RecognitionException {
		ActionContext _localctx = new ActionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_action);
		try {
			setState(260);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				emit();
				setState(246);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				atr();
				setState(249);
				term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				condIf();
				setState(252);
				term();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(254);
				condIfElse();
				setState(255);
				term();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(257);
				up();
				setState(258);
				term();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondIfContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(tccParser.AP, 0); }
		public TerminalNode FP() { return getToken(tccParser.FP, 0); }
		public TerminalNode AC() { return getToken(tccParser.AC, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode FC() { return getToken(tccParser.FC, 0); }
		public OprLfltContext oprLflt() {
			return getRuleContext(OprLfltContext.class,0);
		}
		public OprLboolContext oprLbool() {
			return getRuleContext(OprLboolContext.class,0);
		}
		public CondIfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condIf; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).enterCondIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).exitCondIf(this);
		}
	}

	public final CondIfContext condIf() throws RecognitionException {
		CondIfContext _localctx = new CondIfContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_condIf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(T__20);
			setState(263);
			match(AP);
			setState(266);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(264);
				oprLflt();
				}
				break;
			case 2:
				{
				setState(265);
				oprLbool();
				}
				break;
			}
			setState(268);
			match(FP);
			setState(269);
			match(AC);
			setState(270);
			term();
			setState(271);
			match(FC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondIfElseContext extends ParserRuleContext {
		public CondIfContext condIf() {
			return getRuleContext(CondIfContext.class,0);
		}
		public CondElseContext condElse() {
			return getRuleContext(CondElseContext.class,0);
		}
		public CondIfElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condIfElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).enterCondIfElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).exitCondIfElse(this);
		}
	}

	public final CondIfElseContext condIfElse() throws RecognitionException {
		CondIfElseContext _localctx = new CondIfElseContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_condIfElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			condIf();
			setState(274);
			condElse();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CondElseContext extends ParserRuleContext {
		public TerminalNode AC() { return getToken(tccParser.AC, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode FC() { return getToken(tccParser.FC, 0); }
		public CondElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).enterCondElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).exitCondElse(this);
		}
	}

	public final CondElseContext condElse() throws RecognitionException {
		CondElseContext _localctx = new CondElseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_condElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			match(T__21);
			setState(277);
			match(AC);
			setState(278);
			term();
			setState(279);
			match(FC);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TermContext extends ParserRuleContext {
		public EmitContext emit() {
			return getRuleContext(EmitContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public AtrContext atr() {
			return getRuleContext(AtrContext.class,0);
		}
		public CondIfContext condIf() {
			return getRuleContext(CondIfContext.class,0);
		}
		public CondIfElseContext condIfElse() {
			return getRuleContext(CondIfElseContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_term);
		try {
			setState(294);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				emit();
				setState(282);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(284);
				atr();
				setState(285);
				term();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(287);
				condIf();
				setState(288);
				term();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(290);
				condIfElse();
				setState(291);
				term();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EmitContext extends ParserRuleContext {
		public List<TerminalNode> AP() { return getTokens(tccParser.AP); }
		public TerminalNode AP(int i) {
			return getToken(tccParser.AP, i);
		}
		public List<ParameterContext> parameter() {
			return getRuleContexts(ParameterContext.class);
		}
		public ParameterContext parameter(int i) {
			return getRuleContext(ParameterContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(tccParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(tccParser.COMMA, i);
		}
		public List<TerminalNode> FP() { return getTokens(tccParser.FP); }
		public TerminalNode FP(int i) {
			return getToken(tccParser.FP, i);
		}
		public TerminalNode PV() { return getToken(tccParser.PV, 0); }
		public TerminalNode NUM() { return getToken(tccParser.NUM, 0); }
		public TerminalNode DIG() { return getToken(tccParser.DIG, 0); }
		public EmitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_emit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).enterEmit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).exitEmit(this);
		}
	}

	public final EmitContext emit() throws RecognitionException {
		EmitContext _localctx = new EmitContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_emit);
		int _la;
		try {
			setState(328);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				match(T__22);
				setState(297);
				match(AP);
				setState(298);
				match(T__9);
				setState(299);
				match(AP);
				setState(300);
				parameter();
				setState(301);
				match(COMMA);
				setState(302);
				parameter();
				setState(303);
				match(COMMA);
				setState(304);
				parameter();
				setState(305);
				match(FP);
				setState(306);
				match(FP);
				setState(307);
				match(PV);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(309);
				match(T__22);
				setState(310);
				match(AP);
				setState(311);
				match(T__10);
				setState(312);
				match(AP);
				setState(313);
				_la = _input.LA(1);
				if ( !(_la==DIG || _la==NUM) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(314);
				match(FP);
				setState(315);
				match(FP);
				setState(316);
				match(PV);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(317);
				match(T__22);
				setState(318);
				match(AP);
				setState(319);
				match(T__11);
				setState(320);
				match(AP);
				setState(321);
				parameter();
				setState(322);
				match(COMMA);
				setState(323);
				parameter();
				setState(324);
				match(FP);
				setState(325);
				match(FP);
				setState(326);
				match(PV);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParameterContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode NUM() { return getToken(tccParser.NUM, 0); }
		public TerminalNode DIG() { return getToken(tccParser.DIG, 0); }
		public TerminalNode ID() { return getToken(tccParser.ID, 0); }
		public ParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).enterParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).exitParameter(this);
		}
	}

	public final ParameterContext parameter() throws RecognitionException {
		ParameterContext _localctx = new ParameterContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_parameter);
		int _la;
		try {
			setState(333);
			switch (_input.LA(1)) {
			case DIG:
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				_la = _input.LA(1);
				if ( !(_la==DIG || _la==NUM) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				((ParameterContext)_localctx).ID = match(ID);
				if(!var.contains((((ParameterContext)_localctx).ID!=null?((ParameterContext)_localctx).ID.getText():null)))
				                System.out.println("[Linha "+((ParameterContext)_localctx).ID.getLine()+" Coluna "+(((ParameterContext)_localctx).ID!=null?((ParameterContext)_localctx).ID.getCharPositionInLine():0)+"] EMIT: Vari�vel '"+(((ParameterContext)_localctx).ID!=null?((ParameterContext)_localctx).ID.getText():null)+"' n�o declarada em 'var'.");
				           
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UpContext extends ParserRuleContext {
		public TerminalNode AP() { return getToken(tccParser.AP, 0); }
		public ParametersInitContext parametersInit() {
			return getRuleContext(ParametersInitContext.class,0);
		}
		public TerminalNode FP() { return getToken(tccParser.FP, 0); }
		public TerminalNode PV() { return getToken(tccParser.PV, 0); }
		public UpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_up; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).enterUp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).exitUp(this);
		}
	}

	public final UpContext up() throws RecognitionException {
		UpContext _localctx = new UpContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_up);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(T__23);
			setState(336);
			match(AP);
			setState(337);
			parametersInit();
			setState(338);
			match(FP);
			setState(339);
			match(PV);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtrContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(tccParser.ID, 0); }
		public TerminalNode DPI() { return getToken(tccParser.DPI, 0); }
		public TerminalNode PV() { return getToken(tccParser.PV, 0); }
		public OprAContext oprA() {
			return getRuleContext(OprAContext.class,0);
		}
		public MemberContext member() {
			return getRuleContext(MemberContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public AtrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).enterAtr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).exitAtr(this);
		}
	}

	public final AtrContext atr() throws RecognitionException {
		AtrContext _localctx = new AtrContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_atr);
		try {
			setState(356);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				((AtrContext)_localctx).ID = match(ID);
				setState(342);
				match(DPI);
				setState(345);
				switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
				case 1:
					{
					setState(343);
					oprA();
					}
					break;
				case 2:
					{
					setState(344);
					member();
					}
					break;
				}
				setState(347);
				match(PV);
				if(!var.contains((((AtrContext)_localctx).ID!=null?((AtrContext)_localctx).ID.getText():null)))
				            System.out.println("[Linha "+((AtrContext)_localctx).ID.getLine()+" Coluna "+(((AtrContext)_localctx).ID!=null?((AtrContext)_localctx).ID.getCharPositionInLine():0)+"] ATR: Vari�vel '"+(((AtrContext)_localctx).ID!=null?((AtrContext)_localctx).ID.getText():null)+"' n�o declarada em 'var'.");
				         if(!flt.contains((((AtrContext)_localctx).ID!=null?((AtrContext)_localctx).ID.getText():null)))
				            System.out.println("[Linha "+((AtrContext)_localctx).ID.getLine()+" Coluna "+(((AtrContext)_localctx).ID!=null?((AtrContext)_localctx).ID.getCharPositionInLine():0)+"] ATR: Erro de tipo.");
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(350);
				((AtrContext)_localctx).ID = match(ID);
				setState(351);
				match(DPI);
				setState(352);
				bool();
				setState(353);
				match(PV);
				if(!var.contains((((AtrContext)_localctx).ID!=null?((AtrContext)_localctx).ID.getText():null)))
				            System.out.println("[Linha "+((AtrContext)_localctx).ID.getLine()+" Coluna "+(((AtrContext)_localctx).ID!=null?((AtrContext)_localctx).ID.getCharPositionInLine():0)+"] ATR: Vari�vel '"+(((AtrContext)_localctx).ID!=null?((AtrContext)_localctx).ID.getText():null)+"' n�o declarada em 'var'.");
				         if(!bool.contains((((AtrContext)_localctx).ID!=null?((AtrContext)_localctx).ID.getText():null)))
				            System.out.println("[Linha "+((AtrContext)_localctx).ID.getLine()+" Coluna "+(((AtrContext)_localctx).ID!=null?((AtrContext)_localctx).ID.getCharPositionInLine():0)+"] ATR: Erro de tipo.");
				        
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			_la = _input.LA(1);
			if ( !(_la==T__24 || _la==T__25) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OprLfltContext extends ParserRuleContext {
		public OperatorLContext operatorL() {
			return getRuleContext(OperatorLContext.class,0);
		}
		public List<OprAContext> oprA() {
			return getRuleContexts(OprAContext.class);
		}
		public OprAContext oprA(int i) {
			return getRuleContext(OprAContext.class,i);
		}
		public List<MemberContext> member() {
			return getRuleContexts(MemberContext.class);
		}
		public MemberContext member(int i) {
			return getRuleContext(MemberContext.class,i);
		}
		public OprLfltContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oprLflt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).enterOprLflt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).exitOprLflt(this);
		}
	}

	public final OprLfltContext oprLflt() throws RecognitionException {
		OprLfltContext _localctx = new OprLfltContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_oprLflt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(362);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(360);
				oprA();
				}
				break;
			case 2:
				{
				setState(361);
				member();
				}
				break;
			}
			setState(364);
			operatorL();
			setState(367);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(365);
				oprA();
				}
				break;
			case 2:
				{
				setState(366);
				member();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OprAContext extends ParserRuleContext {
		public MemberContext member() {
			return getRuleContext(MemberContext.class,0);
		}
		public OperatorAContext operatorA() {
			return getRuleContext(OperatorAContext.class,0);
		}
		public ListaAContext listaA() {
			return getRuleContext(ListaAContext.class,0);
		}
		public OprAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oprA; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).enterOprA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).exitOprA(this);
		}
	}

	public final OprAContext oprA() throws RecognitionException {
		OprAContext _localctx = new OprAContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_oprA);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(369);
			member();
			setState(370);
			operatorA();
			setState(371);
			listaA();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListaAContext extends ParserRuleContext {
		public MemberContext member() {
			return getRuleContext(MemberContext.class,0);
		}
		public OperatorAContext operatorA() {
			return getRuleContext(OperatorAContext.class,0);
		}
		public ListaAContext listaA() {
			return getRuleContext(ListaAContext.class,0);
		}
		public ListaAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaA; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).enterListaA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).exitListaA(this);
		}
	}

	public final ListaAContext listaA() throws RecognitionException {
		ListaAContext _localctx = new ListaAContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_listaA);
		try {
			setState(378);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				member();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(374);
				member();
				setState(375);
				operatorA();
				setState(376);
				listaA();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemberContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(tccParser.ID, 0); }
		public TerminalNode NUM() { return getToken(tccParser.NUM, 0); }
		public TerminalNode DIG() { return getToken(tccParser.DIG, 0); }
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).enterMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).exitMember(this);
		}
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_member);
		int _la;
		try {
			setState(383);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(380);
				((MemberContext)_localctx).ID = match(ID);
				if(!var.contains((((MemberContext)_localctx).ID!=null?((MemberContext)_localctx).ID.getText():null)))
				            System.out.println("[Linha "+((MemberContext)_localctx).ID.getLine()+" Coluna "+(((MemberContext)_localctx).ID!=null?((MemberContext)_localctx).ID.getCharPositionInLine():0)+"] ATR: Vari�vel '"+(((MemberContext)_localctx).ID!=null?((MemberContext)_localctx).ID.getText():null)+"' n�o declarada em 'var'.");
				         if(!flt.contains((((MemberContext)_localctx).ID!=null?((MemberContext)_localctx).ID.getText():null)))
				            System.out.println("[Linha "+((MemberContext)_localctx).ID.getLine()+" Coluna "+(((MemberContext)_localctx).ID!=null?((MemberContext)_localctx).ID.getCharPositionInLine():0)+"] ATR: Erro de tipo.");
				        
				}
				break;
			case DIG:
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(382);
				_la = _input.LA(1);
				if ( !(_la==DIG || _la==NUM) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorAContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(tccParser.ADD, 0); }
		public TerminalNode SUB() { return getToken(tccParser.SUB, 0); }
		public TerminalNode MTP() { return getToken(tccParser.MTP, 0); }
		public TerminalNode DIV() { return getToken(tccParser.DIV, 0); }
		public OperatorAContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorA; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).enterOperatorA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).exitOperatorA(this);
		}
	}

	public final OperatorAContext operatorA() throws RecognitionException {
		OperatorAContext _localctx = new OperatorAContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_operatorA);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SUB) | (1L << ADD) | (1L << MTP) | (1L << DIV))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperatorLContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(tccParser.LT, 0); }
		public TerminalNode GT() { return getToken(tccParser.GT, 0); }
		public TerminalNode LEQ() { return getToken(tccParser.LEQ, 0); }
		public TerminalNode GEQ() { return getToken(tccParser.GEQ, 0); }
		public TerminalNode EE() { return getToken(tccParser.EE, 0); }
		public TerminalNode DIF() { return getToken(tccParser.DIF, 0); }
		public OperatorLContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operatorL; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).enterOperatorL(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).exitOperatorL(this);
		}
	}

	public final OperatorLContext operatorL() throws RecognitionException {
		OperatorLContext _localctx = new OperatorLContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_operatorL);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(387);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LT) | (1L << GT) | (1L << LEQ) | (1L << GEQ) | (1L << EE) | (1L << DIF))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OprLboolContext extends ParserRuleContext {
		public Token ID;
		public TerminalNode ID() { return getToken(tccParser.ID, 0); }
		public TerminalNode EE() { return getToken(tccParser.EE, 0); }
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public OprLboolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oprLbool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).enterOprLbool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof tccListener ) ((tccListener)listener).exitOprLbool(this);
		}
	}

	public final OprLboolContext oprLbool() throws RecognitionException {
		OprLboolContext _localctx = new OprLboolContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_oprLbool);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			((OprLboolContext)_localctx).ID = match(ID);
			setState(390);
			match(EE);
			setState(391);
			bool();
			if(!var.contains((((OprLboolContext)_localctx).ID!=null?((OprLboolContext)_localctx).ID.getText():null)))
			                System.out.println("[Linha "+((OprLboolContext)_localctx).ID.getLine()+" Coluna "+(((OprLboolContext)_localctx).ID!=null?((OprLboolContext)_localctx).ID.getCharPositionInLine():0)+"] ATR: Vari�vel '"+(((OprLboolContext)_localctx).ID!=null?((OprLboolContext)_localctx).ID.getText():null)+"' n�o declarada em 'var'.");
			           if(!bool.contains((((OprLboolContext)_localctx).ID!=null?((OprLboolContext)_localctx).ID.getText():null)))
			                System.out.println("[Linha "+((OprLboolContext)_localctx).ID.getLine()+" Coluna "+(((OprLboolContext)_localctx).ID!=null?((OprLboolContext)_localctx).ID.getCharPositionInLine():0)+"] ATR: Erro de tipo.");
			          
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3;\u018d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\7\4[\n\4\f\4\16\4^\13\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6p\n\6\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u0080\n\b\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\5\13\u00aa\n\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b2\n\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\5\r\u00ba\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\5\22\u00da\n\22\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00f6\n\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\5\26\u0107\n\26\3\27\3\27\3\27\3\27\5\27\u010d\n\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0129\n\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33"+
		"\3\33\3\33\5\33\u014b\n\33\3\34\3\34\3\34\5\34\u0150\n\34\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\5\36\u015c\n\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0167\n\36\3\37\3\37\3 \3 \5 \u016d"+
		"\n \3 \3 \3 \5 \u0172\n \3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\5\"\u017d\n\""+
		"\3#\3#\3#\5#\u0182\n#\3$\3$\3%\3%\3&\3&\3&\3&\3&\3&\2\2\'\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJ\2\7\3\2\36"+
		" \4\2\"\"%%\3\2\33\34\4\2$$.\60\3\2\61\66\u0189\2L\3\2\2\2\4O\3\2\2\2"+
		"\6S\3\2\2\2\ba\3\2\2\2\no\3\2\2\2\fq\3\2\2\2\16\177\3\2\2\2\20\u0081\3"+
		"\2\2\2\22\u0088\3\2\2\2\24\u00a9\3\2\2\2\26\u00b1\3\2\2\2\30\u00b9\3\2"+
		"\2\2\32\u00bb\3\2\2\2\34\u00c2\3\2\2\2\36\u00ca\3\2\2\2 \u00cd\3\2\2\2"+
		"\"\u00d9\3\2\2\2$\u00db\3\2\2\2&\u00de\3\2\2\2(\u00f5\3\2\2\2*\u0106\3"+
		"\2\2\2,\u0108\3\2\2\2.\u0113\3\2\2\2\60\u0116\3\2\2\2\62\u0128\3\2\2\2"+
		"\64\u014a\3\2\2\2\66\u014f\3\2\2\28\u0151\3\2\2\2:\u0166\3\2\2\2<\u0168"+
		"\3\2\2\2>\u016c\3\2\2\2@\u0173\3\2\2\2B\u017c\3\2\2\2D\u0181\3\2\2\2F"+
		"\u0183\3\2\2\2H\u0185\3\2\2\2J\u0187\3\2\2\2LM\5\4\3\2MN\5\6\4\2N\3\3"+
		"\2\2\2OP\7\3\2\2PQ\7!\2\2QR\7&\2\2R\5\3\2\2\2ST\7\'\2\2TU\5\b\5\2UV\5"+
		"\20\t\2VW\5\24\13\2WX\5\32\16\2X\\\5 \21\2Y[\5$\23\2ZY\3\2\2\2[^\3\2\2"+
		"\2\\Z\3\2\2\2\\]\3\2\2\2]_\3\2\2\2^\\\3\2\2\2_`\7(\2\2`\7\3\2\2\2ab\7"+
		"\4\2\2bc\7&\2\2cd\7)\2\2de\5\n\6\2ef\5\f\7\2f\t\3\2\2\2gp\7\5\2\2hp\7"+
		"\35\2\2ip\t\2\2\2jp\7\6\2\2kp\7\7\2\2lp\7\b\2\2mp\7\t\2\2np\7\n\2\2og"+
		"\3\2\2\2oh\3\2\2\2oi\3\2\2\2oj\3\2\2\2ok\3\2\2\2ol\3\2\2\2om\3\2\2\2o"+
		"n\3\2\2\2p\13\3\2\2\2qr\7+\2\2rs\7!\2\2st\7#\2\2tu\7!\2\2uv\7,\2\2vw\5"+
		"\16\b\2wx\b\7\1\2x\r\3\2\2\2yz\7#\2\2z{\5\n\6\2{|\5\f\7\2|\u0080\3\2\2"+
		"\2}~\7*\2\2~\u0080\7:\2\2\177y\3\2\2\2\177}\3\2\2\2\u0080\17\3\2\2\2\u0081"+
		"\u0082\7\13\2\2\u0082\u0083\7&\2\2\u0083\u0084\7)\2\2\u0084\u0085\5\22"+
		"\n\2\u0085\u0086\7*\2\2\u0086\u0087\7:\2\2\u0087\21\3\2\2\2\u0088\u0089"+
		"\7\f\2\2\u0089\u008a\7+\2\2\u008a\u008b\7!\2\2\u008b\u008c\7#\2\2\u008c"+
		"\u008d\7!\2\2\u008d\u008e\7#\2\2\u008e\u008f\7!\2\2\u008f\u0090\7,\2\2"+
		"\u0090\u0091\7#\2\2\u0091\u0092\7\r\2\2\u0092\u0093\7+\2\2\u0093\u0094"+
		"\7!\2\2\u0094\u0095\7,\2\2\u0095\u0096\7#\2\2\u0096\u0097\7\16\2\2\u0097"+
		"\u0098\7+\2\2\u0098\u0099\7!\2\2\u0099\u009a\7#\2\2\u009a\u009b\7!\2\2"+
		"\u009b\u009c\7,\2\2\u009c\u009d\b\n\1\2\u009d\23\3\2\2\2\u009e\u009f\7"+
		"\17\2\2\u009f\u00a0\7&\2\2\u00a0\u00a1\7)\2\2\u00a1\u00a2\7*\2\2\u00a2"+
		"\u00aa\7:\2\2\u00a3\u00a4\7\17\2\2\u00a4\u00a5\7&\2\2\u00a5\u00a6\7)\2"+
		"\2\u00a6\u00a7\5\30\r\2\u00a7\u00a8\5\26\f\2\u00a8\u00aa\3\2\2\2\u00a9"+
		"\u009e\3\2\2\2\u00a9\u00a3\3\2\2\2\u00aa\25\3\2\2\2\u00ab\u00ac\7#\2\2"+
		"\u00ac\u00ad\5\30\r\2\u00ad\u00ae\5\26\f\2\u00ae\u00b2\3\2\2\2\u00af\u00b0"+
		"\7*\2\2\u00b0\u00b2\7:\2\2\u00b1\u00ab\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2"+
		"\27\3\2\2\2\u00b3\u00b4\7\20\2\2\u00b4\u00b5\7!\2\2\u00b5\u00ba\b\r\1"+
		"\2\u00b6\u00b7\7\21\2\2\u00b7\u00b8\7!\2\2\u00b8\u00ba\b\r\1\2\u00b9\u00b3"+
		"\3\2\2\2\u00b9\u00b6\3\2\2\2\u00ba\31\3\2\2\2\u00bb\u00bc\7\22\2\2\u00bc"+
		"\u00bd\7&\2\2\u00bd\u00be\7)\2\2\u00be\u00bf\5\34\17\2\u00bf\u00c0\7*"+
		"\2\2\u00c0\u00c1\7:\2\2\u00c1\33\3\2\2\2\u00c2\u00c3\7\23\2\2\u00c3\u00c4"+
		"\7#\2\2\u00c4\u00c5\7\24\2\2\u00c5\u00c6\7#\2\2\u00c6\u00c7\7\25\2\2\u00c7"+
		"\u00c8\7#\2\2\u00c8\u00c9\5\36\20\2\u00c9\35\3\2\2\2\u00ca\u00cb\7!\2"+
		"\2\u00cb\u00cc\b\20\1\2\u00cc\37\3\2\2\2\u00cd\u00ce\7\26\2\2\u00ce\u00cf"+
		"\7&\2\2\u00cf\u00d0\7)\2\2\u00d0\u00d1\5\"\22\2\u00d1\u00d2\7*\2\2\u00d2"+
		"\u00d3\7:\2\2\u00d3!\3\2\2\2\u00d4\u00da\7\23\2\2\u00d5\u00da\7\24\2\2"+
		"\u00d6\u00da\7\25\2\2\u00d7\u00d8\7!\2\2\u00d8\u00da\b\22\1\2\u00d9\u00d4"+
		"\3\2\2\2\u00d9\u00d5\3\2\2\2\u00d9\u00d6\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da"+
		"#\3\2\2\2\u00db\u00dc\5&\24\2\u00dc\u00dd\5*\26\2\u00dd%\3\2\2\2\u00de"+
		"\u00df\5\n\6\2\u00df\u00e0\7+\2\2\u00e0\u00e1\7!\2\2\u00e1\u00e2\7#\2"+
		"\2\u00e2\u00e3\7!\2\2\u00e3\u00e4\7,\2\2\u00e4\u00e5\5(\25\2\u00e5\u00e6"+
		"\7\67\2\2\u00e6\u00e7\5\"\22\2\u00e7\u00e8\78\2\2\u00e8\u00e9\b\24\1\2"+
		"\u00e9\'\3\2\2\2\u00ea\u00eb\79\2\2\u00eb\u00ec\5\n\6\2\u00ec\u00ed\7"+
		"+\2\2\u00ed\u00ee\7!\2\2\u00ee\u00ef\7#\2\2\u00ef\u00f0\7!\2\2\u00f0\u00f1"+
		"\7,\2\2\u00f1\u00f2\5(\25\2\u00f2\u00f3\b\25\1\2\u00f3\u00f6\3\2\2\2\u00f4"+
		"\u00f6\3\2\2\2\u00f5\u00ea\3\2\2\2\u00f5\u00f4\3\2\2\2\u00f6)\3\2\2\2"+
		"\u00f7\u00f8\5\64\33\2\u00f8\u00f9\5\62\32\2\u00f9\u0107\3\2\2\2\u00fa"+
		"\u00fb\5:\36\2\u00fb\u00fc\5\62\32\2\u00fc\u0107\3\2\2\2\u00fd\u00fe\5"+
		",\27\2\u00fe\u00ff\5\62\32\2\u00ff\u0107\3\2\2\2\u0100\u0101\5.\30\2\u0101"+
		"\u0102\5\62\32\2\u0102\u0107\3\2\2\2\u0103\u0104\58\35\2\u0104\u0105\5"+
		"\62\32\2\u0105\u0107\3\2\2\2\u0106\u00f7\3\2\2\2\u0106\u00fa\3\2\2\2\u0106"+
		"\u00fd\3\2\2\2\u0106\u0100\3\2\2\2\u0106\u0103\3\2\2\2\u0107+\3\2\2\2"+
		"\u0108\u0109\7\27\2\2\u0109\u010c\7+\2\2\u010a\u010d\5> \2\u010b\u010d"+
		"\5J&\2\u010c\u010a\3\2\2\2\u010c\u010b\3\2\2\2\u010d\u010e\3\2\2\2\u010e"+
		"\u010f\7,\2\2\u010f\u0110\7\'\2\2\u0110\u0111\5\62\32\2\u0111\u0112\7"+
		"(\2\2\u0112-\3\2\2\2\u0113\u0114\5,\27\2\u0114\u0115\5\60\31\2\u0115/"+
		"\3\2\2\2\u0116\u0117\7\30\2\2\u0117\u0118\7\'\2\2\u0118\u0119\5\62\32"+
		"\2\u0119\u011a\7(\2\2\u011a\61\3\2\2\2\u011b\u011c\5\64\33\2\u011c\u011d"+
		"\5\62\32\2\u011d\u0129\3\2\2\2\u011e\u011f\5:\36\2\u011f\u0120\5\62\32"+
		"\2\u0120\u0129\3\2\2\2\u0121\u0122\5,\27\2\u0122\u0123\5\62\32\2\u0123"+
		"\u0129\3\2\2\2\u0124\u0125\5.\30\2\u0125\u0126\5\62\32\2\u0126\u0129\3"+
		"\2\2\2\u0127\u0129\3\2\2\2\u0128\u011b\3\2\2\2\u0128\u011e\3\2\2\2\u0128"+
		"\u0121\3\2\2\2\u0128\u0124\3\2\2\2\u0128\u0127\3\2\2\2\u0129\63\3\2\2"+
		"\2\u012a\u012b\7\31\2\2\u012b\u012c\7+\2\2\u012c\u012d\7\f\2\2\u012d\u012e"+
		"\7+\2\2\u012e\u012f\5\66\34\2\u012f\u0130\7#\2\2\u0130\u0131\5\66\34\2"+
		"\u0131\u0132\7#\2\2\u0132\u0133\5\66\34\2\u0133\u0134\7,\2\2\u0134\u0135"+
		"\7,\2\2\u0135\u0136\7:\2\2\u0136\u014b\3\2\2\2\u0137\u0138\7\31\2\2\u0138"+
		"\u0139\7+\2\2\u0139\u013a\7\r\2\2\u013a\u013b\7+\2\2\u013b\u013c\t\3\2"+
		"\2\u013c\u013d\7,\2\2\u013d\u013e\7,\2\2\u013e\u014b\7:\2\2\u013f\u0140"+
		"\7\31\2\2\u0140\u0141\7+\2\2\u0141\u0142\7\16\2\2\u0142\u0143\7+\2\2\u0143"+
		"\u0144\5\66\34\2\u0144\u0145\7#\2\2\u0145\u0146\5\66\34\2\u0146\u0147"+
		"\7,\2\2\u0147\u0148\7,\2\2\u0148\u0149\7:\2\2\u0149\u014b\3\2\2\2\u014a"+
		"\u012a\3\2\2\2\u014a\u0137\3\2\2\2\u014a\u013f\3\2\2\2\u014b\65\3\2\2"+
		"\2\u014c\u0150\t\3\2\2\u014d\u014e\7!\2\2\u014e\u0150\b\34\1\2\u014f\u014c"+
		"\3\2\2\2\u014f\u014d\3\2\2\2\u0150\67\3\2\2\2\u0151\u0152\7\32\2\2\u0152"+
		"\u0153\7+\2\2\u0153\u0154\5\"\22\2\u0154\u0155\7,\2\2\u0155\u0156\7:\2"+
		"\2\u01569\3\2\2\2\u0157\u0158\7!\2\2\u0158\u015b\7-\2\2\u0159\u015c\5"+
		"@!\2\u015a\u015c\5D#\2\u015b\u0159\3\2\2\2\u015b\u015a\3\2\2\2\u015c\u015d"+
		"\3\2\2\2\u015d\u015e\7:\2\2\u015e\u015f\b\36\1\2\u015f\u0167\3\2\2\2\u0160"+
		"\u0161\7!\2\2\u0161\u0162\7-\2\2\u0162\u0163\5<\37\2\u0163\u0164\7:\2"+
		"\2\u0164\u0165\b\36\1\2\u0165\u0167\3\2\2\2\u0166\u0157\3\2\2\2\u0166"+
		"\u0160\3\2\2\2\u0167;\3\2\2\2\u0168\u0169\t\4\2\2\u0169=\3\2\2\2\u016a"+
		"\u016d\5@!\2\u016b\u016d\5D#\2\u016c\u016a\3\2\2\2\u016c\u016b\3\2\2\2"+
		"\u016d\u016e\3\2\2\2\u016e\u0171\5H%\2\u016f\u0172\5@!\2\u0170\u0172\5"+
		"D#\2\u0171\u016f\3\2\2\2\u0171\u0170\3\2\2\2\u0172?\3\2\2\2\u0173\u0174"+
		"\5D#\2\u0174\u0175\5F$\2\u0175\u0176\5B\"\2\u0176A\3\2\2\2\u0177\u017d"+
		"\5D#\2\u0178\u0179\5D#\2\u0179\u017a\5F$\2\u017a\u017b\5B\"\2\u017b\u017d"+
		"\3\2\2\2\u017c\u0177\3\2\2\2\u017c\u0178\3\2\2\2\u017dC\3\2\2\2\u017e"+
		"\u017f\7!\2\2\u017f\u0182\b#\1\2\u0180\u0182\t\3\2\2\u0181\u017e\3\2\2"+
		"\2\u0181\u0180\3\2\2\2\u0182E\3\2\2\2\u0183\u0184\t\5\2\2\u0184G\3\2\2"+
		"\2\u0185\u0186\t\6\2\2\u0186I\3\2\2\2\u0187\u0188\7!\2\2\u0188\u0189\7"+
		"\65\2\2\u0189\u018a\5<\37\2\u018a\u018b\b&\1\2\u018bK\3\2\2\2\25\\o\177"+
		"\u00a9\u00b1\u00b9\u00d9\u00f5\u0106\u010c\u0128\u014a\u014f\u015b\u0166"+
		"\u016c\u0171\u017c\u0181";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}