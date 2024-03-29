// Generated from D:/Documents/Studia/Kompilatory/src/main/java/pl/rejurhf/antlr\Some.g4 by ANTLR 4.7.2
package pl.rejurhf.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SomeLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CLASS=1, IS=2, BEGIN=3, END=4, RETURN=5, FUNCTION=6, IF=7, ELSE=8, ELSIF=9, 
		PRINTF=10, FOR=11, IN=12, RANGE=13, TYPE=14, MUL=15, DIV=16, PLUS=17, 
		MINUS=18, ASSIGN=19, COLON=20, SEMI=21, COMMA=22, LEFT_PAREN=23, RIGHT_PAREN=24, 
		EQUAL=25, GREATER=26, LESSER=27, GREATER_EQUAL=28, LESSER_EQUAL=29, AND=30, 
		OR=31, DOTDOT=32, INTEGER_VALUE=33, STRING_VALUE=34, NAME=35, NAMEU=36, 
		WS=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"CLASS", "IS", "BEGIN", "END", "RETURN", "FUNCTION", "IF", "ELSE", "ELSIF", 
			"PRINTF", "FOR", "IN", "RANGE", "TYPE", "MUL", "DIV", "PLUS", "MINUS", 
			"ASSIGN", "COLON", "SEMI", "COMMA", "LEFT_PAREN", "RIGHT_PAREN", "EQUAL", 
			"GREATER", "LESSER", "GREATER_EQUAL", "LESSER_EQUAL", "AND", "OR", "DOTDOT", 
			"INTEGER_VALUE", "STRING_VALUE", "NAME", "NAMEU", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'class'", "'is'", "'begin'", "'end'", "'return'", "'function'", 
			"'if'", "'else'", "'elsif'", "'printf'", "'for'", "'in'", "'range'", 
			null, "'*'", "'/'", "'+'", "'-'", "':='", "':'", "';'", "','", "'('", 
			"')'", "'=='", "'>'", "'<'", "'>='", "'<='", "'&&'", "'||'", "'..'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CLASS", "IS", "BEGIN", "END", "RETURN", "FUNCTION", "IF", "ELSE", 
			"ELSIF", "PRINTF", "FOR", "IN", "RANGE", "TYPE", "MUL", "DIV", "PLUS", 
			"MINUS", "ASSIGN", "COLON", "SEMI", "COMMA", "LEFT_PAREN", "RIGHT_PAREN", 
			"EQUAL", "GREATER", "LESSER", "GREATER_EQUAL", "LESSER_EQUAL", "AND", 
			"OR", "DOTDOT", "INTEGER_VALUE", "STRING_VALUE", "NAME", "NAMEU", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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


	public SomeLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Some.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u00f6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00a0\n\17\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3 \3 \3 \3!\3!\3!\3\"\3\"\3\"\7\"\u00d0"+
		"\n\"\f\"\16\"\u00d3\13\"\5\"\u00d5\n\"\3#\3#\7#\u00d9\n#\f#\16#\u00dc"+
		"\13#\3#\3#\3$\6$\u00e1\n$\r$\16$\u00e2\3%\6%\u00e6\n%\r%\16%\u00e7\3%"+
		"\7%\u00eb\n%\f%\16%\u00ee\13%\3&\6&\u00f1\n&\r&\16&\u00f2\3&\3&\2\2\'"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'\3\2\b\3\2\63;\3\2\62;\3\2$$\5\2\62;C\\c|\4\2C\\c|\5"+
		"\2\13\f\17\17\"\"\2\u00fd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67"+
		"\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2"+
		"\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\3M\3\2\2\2\5S\3\2\2\2"+
		"\7V\3\2\2\2\t\\\3\2\2\2\13`\3\2\2\2\rg\3\2\2\2\17p\3\2\2\2\21s\3\2\2\2"+
		"\23x\3\2\2\2\25~\3\2\2\2\27\u0085\3\2\2\2\31\u0089\3\2\2\2\33\u008c\3"+
		"\2\2\2\35\u009f\3\2\2\2\37\u00a1\3\2\2\2!\u00a3\3\2\2\2#\u00a5\3\2\2\2"+
		"%\u00a7\3\2\2\2\'\u00a9\3\2\2\2)\u00ac\3\2\2\2+\u00ae\3\2\2\2-\u00b0\3"+
		"\2\2\2/\u00b2\3\2\2\2\61\u00b4\3\2\2\2\63\u00b6\3\2\2\2\65\u00b9\3\2\2"+
		"\2\67\u00bb\3\2\2\29\u00bd\3\2\2\2;\u00c0\3\2\2\2=\u00c3\3\2\2\2?\u00c6"+
		"\3\2\2\2A\u00c9\3\2\2\2C\u00d4\3\2\2\2E\u00d6\3\2\2\2G\u00e0\3\2\2\2I"+
		"\u00e5\3\2\2\2K\u00f0\3\2\2\2MN\7e\2\2NO\7n\2\2OP\7c\2\2PQ\7u\2\2QR\7"+
		"u\2\2R\4\3\2\2\2ST\7k\2\2TU\7u\2\2U\6\3\2\2\2VW\7d\2\2WX\7g\2\2XY\7i\2"+
		"\2YZ\7k\2\2Z[\7p\2\2[\b\3\2\2\2\\]\7g\2\2]^\7p\2\2^_\7f\2\2_\n\3\2\2\2"+
		"`a\7t\2\2ab\7g\2\2bc\7v\2\2cd\7w\2\2de\7t\2\2ef\7p\2\2f\f\3\2\2\2gh\7"+
		"h\2\2hi\7w\2\2ij\7p\2\2jk\7e\2\2kl\7v\2\2lm\7k\2\2mn\7q\2\2no\7p\2\2o"+
		"\16\3\2\2\2pq\7k\2\2qr\7h\2\2r\20\3\2\2\2st\7g\2\2tu\7n\2\2uv\7u\2\2v"+
		"w\7g\2\2w\22\3\2\2\2xy\7g\2\2yz\7n\2\2z{\7u\2\2{|\7k\2\2|}\7h\2\2}\24"+
		"\3\2\2\2~\177\7r\2\2\177\u0080\7t\2\2\u0080\u0081\7k\2\2\u0081\u0082\7"+
		"p\2\2\u0082\u0083\7v\2\2\u0083\u0084\7h\2\2\u0084\26\3\2\2\2\u0085\u0086"+
		"\7h\2\2\u0086\u0087\7q\2\2\u0087\u0088\7t\2\2\u0088\30\3\2\2\2\u0089\u008a"+
		"\7k\2\2\u008a\u008b\7p\2\2\u008b\32\3\2\2\2\u008c\u008d\7t\2\2\u008d\u008e"+
		"\7c\2\2\u008e\u008f\7p\2\2\u008f\u0090\7i\2\2\u0090\u0091\7g\2\2\u0091"+
		"\34\3\2\2\2\u0092\u0093\7K\2\2\u0093\u0094\7p\2\2\u0094\u0095\7v\2\2\u0095"+
		"\u0096\7g\2\2\u0096\u0097\7i\2\2\u0097\u0098\7g\2\2\u0098\u00a0\7t\2\2"+
		"\u0099\u009a\7U\2\2\u009a\u009b\7v\2\2\u009b\u009c\7t\2\2\u009c\u009d"+
		"\7k\2\2\u009d\u009e\7p\2\2\u009e\u00a0\7i\2\2\u009f\u0092\3\2\2\2\u009f"+
		"\u0099\3\2\2\2\u00a0\36\3\2\2\2\u00a1\u00a2\7,\2\2\u00a2 \3\2\2\2\u00a3"+
		"\u00a4\7\61\2\2\u00a4\"\3\2\2\2\u00a5\u00a6\7-\2\2\u00a6$\3\2\2\2\u00a7"+
		"\u00a8\7/\2\2\u00a8&\3\2\2\2\u00a9\u00aa\7<\2\2\u00aa\u00ab\7?\2\2\u00ab"+
		"(\3\2\2\2\u00ac\u00ad\7<\2\2\u00ad*\3\2\2\2\u00ae\u00af\7=\2\2\u00af,"+
		"\3\2\2\2\u00b0\u00b1\7.\2\2\u00b1.\3\2\2\2\u00b2\u00b3\7*\2\2\u00b3\60"+
		"\3\2\2\2\u00b4\u00b5\7+\2\2\u00b5\62\3\2\2\2\u00b6\u00b7\7?\2\2\u00b7"+
		"\u00b8\7?\2\2\u00b8\64\3\2\2\2\u00b9\u00ba\7@\2\2\u00ba\66\3\2\2\2\u00bb"+
		"\u00bc\7>\2\2\u00bc8\3\2\2\2\u00bd\u00be\7@\2\2\u00be\u00bf\7?\2\2\u00bf"+
		":\3\2\2\2\u00c0\u00c1\7>\2\2\u00c1\u00c2\7?\2\2\u00c2<\3\2\2\2\u00c3\u00c4"+
		"\7(\2\2\u00c4\u00c5\7(\2\2\u00c5>\3\2\2\2\u00c6\u00c7\7~\2\2\u00c7\u00c8"+
		"\7~\2\2\u00c8@\3\2\2\2\u00c9\u00ca\7\60\2\2\u00ca\u00cb\7\60\2\2\u00cb"+
		"B\3\2\2\2\u00cc\u00d5\7\62\2\2\u00cd\u00d1\t\2\2\2\u00ce\u00d0\t\3\2\2"+
		"\u00cf\u00ce\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2"+
		"\3\2\2\2\u00d2\u00d5\3\2\2\2\u00d3\u00d1\3\2\2\2\u00d4\u00cc\3\2\2\2\u00d4"+
		"\u00cd\3\2\2\2\u00d5D\3\2\2\2\u00d6\u00da\7$\2\2\u00d7\u00d9\n\4\2\2\u00d8"+
		"\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00da\u00db\3\2"+
		"\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2\2\2\u00dd\u00de\7$\2\2\u00de"+
		"F\3\2\2\2\u00df\u00e1\t\5\2\2\u00e0\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2"+
		"\u00e2\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3H\3\2\2\2\u00e4\u00e6\t"+
		"\6\2\2\u00e5\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7"+
		"\u00e8\3\2\2\2\u00e8\u00ec\3\2\2\2\u00e9\u00eb\t\5\2\2\u00ea\u00e9\3\2"+
		"\2\2\u00eb\u00ee\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec\u00ed\3\2\2\2\u00ed"+
		"J\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f1\t\7\2\2\u00f0\u00ef\3\2\2\2"+
		"\u00f1\u00f2\3\2\2\2\u00f2\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4"+
		"\3\2\2\2\u00f4\u00f5\b&\2\2\u00f5L\3\2\2\2\13\2\u009f\u00d1\u00d4\u00da"+
		"\u00e2\u00e7\u00ec\u00f2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}