// Generated from tcc.g4 by ANTLR 4.5
        
    import java.util.ArrayList;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tccLexer extends Lexer {
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
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "POLE", "ROBOT_O", "ROBOT_P", "ROBOT", "ID", "DIG", "COMMA", 
		"SUB", "NUM", "DP", "AC", "FC", "OC", "CC", "AP", "FP", "DPI", "ADD", 
		"MTP", "DIV", "LT", "GT", "LEQ", "GEQ", "EE", "DIF", "HAS", "RARROW", 
		"AND", "PV", "WSPC"
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


	         ArrayList<String> states = new ArrayList<>();
	         ArrayList<String> input = new ArrayList<>();
	         ArrayList<String> output = new ArrayList<>();
	         ArrayList<String> var = new ArrayList<>();
	         ArrayList<String> bool = new ArrayList<>();
	         ArrayList<String> flt = new ArrayList<>();
		 ArrayList<String> in = new ArrayList<>();
	         int cont=0;
	         

	public tccLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "tcc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2;\u0188\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31"+
		"\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\34"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35"+
		"\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \7 \u0136\n \f \16 \u0139\13 \3!\6"+
		"!\u013c\n!\r!\16!\u013d\3\"\3\"\3#\3#\3$\5$\u0145\n$\3$\6$\u0148\n$\r"+
		"$\16$\u0149\3$\3$\6$\u014e\n$\r$\16$\u014f\3%\3%\3&\3&\3\'\3\'\3(\3(\3"+
		")\3)\3*\3*\3+\3+\3,\3,\3,\3-\3-\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3\62\3"+
		"\62\3\62\3\63\3\63\3\63\3\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\67\3"+
		"\67\3\67\38\38\39\39\3:\6:\u0183\n:\r:\16:\u0184\3:\3:\2\2;\3\3\5\4\7"+
		"\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C"+
		"#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o9q:s;\3\2"+
		"\b\3\2\63\66\3\2\63\65\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\13\f\17\17"+
		"\"\"\u018d\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2"+
		"\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2"+
		"\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2"+
		"\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2"+
		"\2m\3\2\2\2\2o\3\2\2\2\2q\3\2\2\2\2s\3\2\2\2\3u\3\2\2\2\5|\3\2\2\2\7\177"+
		"\3\2\2\2\t\u0084\3\2\2\2\13\u008a\3\2\2\2\r\u0090\3\2\2\2\17\u0096\3\2"+
		"\2\2\21\u009b\3\2\2\2\23\u00a3\3\2\2\2\25\u00a7\3\2\2\2\27\u00ac\3\2\2"+
		"\2\31\u00b3\3\2\2\2\33\u00b8\3\2\2\2\35\u00bc\3\2\2\2\37\u00c2\3\2\2\2"+
		"!\u00ca\3\2\2\2#\u00d1\3\2\2\2%\u00d8\3\2\2\2\'\u00e0\3\2\2\2)\u00eb\3"+
		"\2\2\2+\u00f5\3\2\2\2-\u00f8\3\2\2\2/\u00fd\3\2\2\2\61\u0102\3\2\2\2\63"+
		"\u0105\3\2\2\2\65\u010a\3\2\2\2\67\u0110\3\2\2\29\u0117\3\2\2\2;\u0121"+
		"\3\2\2\2=\u012b\3\2\2\2?\u0133\3\2\2\2A\u013b\3\2\2\2C\u013f\3\2\2\2E"+
		"\u0141\3\2\2\2G\u0144\3\2\2\2I\u0151\3\2\2\2K\u0153\3\2\2\2M\u0155\3\2"+
		"\2\2O\u0157\3\2\2\2Q\u0159\3\2\2\2S\u015b\3\2\2\2U\u015d\3\2\2\2W\u015f"+
		"\3\2\2\2Y\u0162\3\2\2\2[\u0164\3\2\2\2]\u0166\3\2\2\2_\u0168\3\2\2\2a"+
		"\u016a\3\2\2\2c\u016c\3\2\2\2e\u016f\3\2\2\2g\u0172\3\2\2\2i\u0175\3\2"+
		"\2\2k\u0178\3\2\2\2m\u017a\3\2\2\2o\u017d\3\2\2\2q\u017f\3\2\2\2s\u0182"+
		"\3\2\2\2uv\7o\2\2vw\7q\2\2wx\7f\2\2xy\7w\2\2yz\7n\2\2z{\7g\2\2{\4\3\2"+
		"\2\2|}\7k\2\2}~\7p\2\2~\6\3\2\2\2\177\u0080\7d\2\2\u0080\u0081\7c\2\2"+
		"\u0081\u0082\7n\2\2\u0082\u0083\7n\2\2\u0083\b\3\2\2\2\u0084\u0085\7Z"+
		"\2\2\u0085\u0086\7n\2\2\u0086\u0087\7k\2\2\u0087\u0088\7p\2\2\u0088\u0089"+
		"\7g\2\2\u0089\n\3\2\2\2\u008a\u008b\7V\2\2\u008b\u008c\7n\2\2\u008c\u008d"+
		"\7k\2\2\u008d\u008e\7p\2\2\u008e\u008f\7g\2\2\u008f\f\3\2\2\2\u0090\u0091"+
		"\7N\2\2\u0091\u0092\7n\2\2\u0092\u0093\7k\2\2\u0093\u0094\7p\2\2\u0094"+
		"\u0095\7g\2\2\u0095\16\3\2\2\2\u0096\u0097\7n\2\2\u0097\u0098\7k\2\2\u0098"+
		"\u0099\7p\2\2\u0099\u009a\7g\2\2\u009a\20\3\2\2\2\u009b\u009c\7w\2\2\u009c"+
		"\u009d\7p\2\2\u009d\u009e\7m\2\2\u009e\u009f\7p\2\2\u009f\u00a0\7q\2\2"+
		"\u00a0\u00a1\7y\2\2\u00a1\u00a2\7p\2\2\u00a2\22\3\2\2\2\u00a3\u00a4\7"+
		"q\2\2\u00a4\u00a5\7w\2\2\u00a5\u00a6\7v\2\2\u00a6\24\3\2\2\2\u00a7\u00a8"+
		"\7y\2\2\u00a8\u00a9\7c\2\2\u00a9\u00aa\7n\2\2\u00aa\u00ab\7m\2\2\u00ab"+
		"\26\3\2\2\2\u00ac\u00ad\7f\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7h\2\2\u00af"+
		"\u00b0\7g\2\2\u00b0\u00b1\7p\2\2\u00b1\u00b2\7f\2\2\u00b2\30\3\2\2\2\u00b3"+
		"\u00b4\7m\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7e\2\2\u00b6\u00b7\7m\2\2"+
		"\u00b7\32\3\2\2\2\u00b8\u00b9\7x\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb\7"+
		"t\2\2\u00bb\34\3\2\2\2\u00bc\u00bd\7h\2\2\u00bd\u00be\7n\2\2\u00be\u00bf"+
		"\7q\2\2\u00bf\u00c0\7c\2\2\u00c0\u00c1\7v\2\2\u00c1\36\3\2\2\2\u00c2\u00c3"+
		"\7d\2\2\u00c3\u00c4\7q\2\2\u00c4\u00c5\7q\2\2\u00c5\u00c6\7n\2\2\u00c6"+
		"\u00c7\7g\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7p\2\2\u00c9 \3\2\2\2\u00ca"+
		"\u00cb\7u\2\2\u00cb\u00cc\7v\2\2\u00cc\u00cd\7c\2\2\u00cd\u00ce\7v\2\2"+
		"\u00ce\u00cf\7g\2\2\u00cf\u00d0\7u\2\2\u00d0\"\3\2\2\2\u00d1\u00d2\7c"+
		"\2\2\u00d2\u00d3\7v\2\2\u00d3\u00d4\7v\2\2\u00d4\u00d5\7c\2\2\u00d5\u00d6"+
		"\7e\2\2\u00d6\u00d7\7m\2\2\u00d7$\3\2\2\2\u00d8\u00d9\7f\2\2\u00d9\u00da"+
		"\7g\2\2\u00da\u00db\7h\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7p\2\2\u00dd"+
		"\u00de\7u\2\2\u00de\u00df\7g\2\2\u00df&\3\2\2\2\u00e0\u00e1\7i\2\2\u00e1"+
		"\u00e2\7q\2\2\u00e2\u00e3\7c\2\2\u00e3\u00e4\7n\2\2\u00e4\u00e5\7m\2\2"+
		"\u00e5\u00e6\7g\2\2\u00e6\u00e7\7g\2\2\u00e7\u00e8\7r\2\2\u00e8\u00e9"+
		"\7g\2\2\u00e9\u00ea\7t\2\2\u00ea(\3\2\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed"+
		"\7p\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7v\2\2\u00ef\u00f0\7k\2\2\u00f0"+
		"\u00f1\7c\2\2\u00f1\u00f2\7n\2\2\u00f2\u00f3\7n\2\2\u00f3\u00f4\7{\2\2"+
		"\u00f4*\3\2\2\2\u00f5\u00f6\7k\2\2\u00f6\u00f7\7h\2\2\u00f7,\3\2\2\2\u00f8"+
		"\u00f9\7g\2\2\u00f9\u00fa\7n\2\2\u00fa\u00fb\7u\2\2\u00fb\u00fc\7g\2\2"+
		"\u00fc.\3\2\2\2\u00fd\u00fe\7g\2\2\u00fe\u00ff\7o\2\2\u00ff\u0100\7k\2"+
		"\2\u0100\u0101\7v\2\2\u0101\60\3\2\2\2\u0102\u0103\7w\2\2\u0103\u0104"+
		"\7r\2\2\u0104\62\3\2\2\2\u0105\u0106\7v\2\2\u0106\u0107\7t\2\2\u0107\u0108"+
		"\7w\2\2\u0108\u0109\7g\2\2\u0109\64\3\2\2\2\u010a\u010b\7h\2\2\u010b\u010c"+
		"\7c\2\2\u010c\u010d\7n\2\2\u010d\u010e\7u\2\2\u010e\u010f\7g\2\2\u010f"+
		"\66\3\2\2\2\u0110\u0111\7r\2\2\u0111\u0112\7q\2\2\u0112\u0113\7n\2\2\u0113"+
		"\u0114\7g\2\2\u0114\u0115\3\2\2\2\u0115\u0116\t\2\2\2\u01168\3\2\2\2\u0117"+
		"\u0118\7t\2\2\u0118\u0119\7q\2\2\u0119\u011a\7d\2\2\u011a\u011b\7q\2\2"+
		"\u011b\u011c\7v\2\2\u011c\u011d\3\2\2\2\u011d\u011e\t\3\2\2\u011e\u011f"+
		"\7a\2\2\u011f\u0120\7q\2\2\u0120:\3\2\2\2\u0121\u0122\7t\2\2\u0122\u0123"+
		"\7q\2\2\u0123\u0124\7d\2\2\u0124\u0125\7q\2\2\u0125\u0126\7v\2\2\u0126"+
		"\u0127\3\2\2\2\u0127\u0128\t\3\2\2\u0128\u0129\7a\2\2\u0129\u012a\7r\2"+
		"\2\u012a<\3\2\2\2\u012b\u012c\7t\2\2\u012c\u012d\7q\2\2\u012d\u012e\7"+
		"d\2\2\u012e\u012f\7q\2\2\u012f\u0130\7v\2\2\u0130\u0131\3\2\2\2\u0131"+
		"\u0132\t\3\2\2\u0132>\3\2\2\2\u0133\u0137\t\4\2\2\u0134\u0136\t\5\2\2"+
		"\u0135\u0134\3\2\2\2\u0136\u0139\3\2\2\2\u0137\u0135\3\2\2\2\u0137\u0138"+
		"\3\2\2\2\u0138@\3\2\2\2\u0139\u0137\3\2\2\2\u013a\u013c\t\6\2\2\u013b"+
		"\u013a\3\2\2\2\u013c\u013d\3\2\2\2\u013d\u013b\3\2\2\2\u013d\u013e\3\2"+
		"\2\2\u013eB\3\2\2\2\u013f\u0140\7.\2\2\u0140D\3\2\2\2\u0141\u0142\7/\2"+
		"\2\u0142F\3\2\2\2\u0143\u0145\7/\2\2\u0144\u0143\3\2\2\2\u0144\u0145\3"+
		"\2\2\2\u0145\u0147\3\2\2\2\u0146\u0148\t\6\2\2\u0147\u0146\3\2\2\2\u0148"+
		"\u0149\3\2\2\2\u0149\u0147\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2"+
		"\2\2\u014b\u014d\7\60\2\2\u014c\u014e\t\6\2\2\u014d\u014c\3\2\2\2\u014e"+
		"\u014f\3\2\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2\2\u0150H\3\2\2\2"+
		"\u0151\u0152\7<\2\2\u0152J\3\2\2\2\u0153\u0154\7}\2\2\u0154L\3\2\2\2\u0155"+
		"\u0156\7\177\2\2\u0156N\3\2\2\2\u0157\u0158\7]\2\2\u0158P\3\2\2\2\u0159"+
		"\u015a\7_\2\2\u015aR\3\2\2\2\u015b\u015c\7*\2\2\u015cT\3\2\2\2\u015d\u015e"+
		"\7+\2\2\u015eV\3\2\2\2\u015f\u0160\7<\2\2\u0160\u0161\7?\2\2\u0161X\3"+
		"\2\2\2\u0162\u0163\7-\2\2\u0163Z\3\2\2\2\u0164\u0165\7,\2\2\u0165\\\3"+
		"\2\2\2\u0166\u0167\7\61\2\2\u0167^\3\2\2\2\u0168\u0169\7>\2\2\u0169`\3"+
		"\2\2\2\u016a\u016b\7@\2\2\u016bb\3\2\2\2\u016c\u016d\7>\2\2\u016d\u016e"+
		"\7?\2\2\u016ed\3\2\2\2\u016f\u0170\7@\2\2\u0170\u0171\7?\2\2\u0171f\3"+
		"\2\2\2\u0172\u0173\7?\2\2\u0173\u0174\7?\2\2\u0174h\3\2\2\2\u0175\u0176"+
		"\7#\2\2\u0176\u0177\7?\2\2\u0177j\3\2\2\2\u0178\u0179\7%\2\2\u0179l\3"+
		"\2\2\2\u017a\u017b\7/\2\2\u017b\u017c\7@\2\2\u017cn\3\2\2\2\u017d\u017e"+
		"\7(\2\2\u017ep\3\2\2\2\u017f\u0180\7=\2\2\u0180r\3\2\2\2\u0181\u0183\t"+
		"\7\2\2\u0182\u0181\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0182\3\2\2\2\u0184"+
		"\u0185\3\2\2\2\u0185\u0186\3\2\2\2\u0186\u0187\b:\2\2\u0187t\3\2\2\2\t"+
		"\2\u0137\u013d\u0144\u0149\u014f\u0184\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}