// Generated from ipsumUN.g4 by ANTLR 4.7
package classes;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ipsumUNLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, COMMENT=11, LINE_COMMENT=12, WS=13, VAR=14, PIZQ=15, PDER=16, 
		ROP=17, SMCOLON=18, MULOP=19, SUMOP=20, DOUBLE=21, ID=22;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "COMMENT", "LINE_COMMENT", "WS", "VAR", "PIZQ", "PDER", "ROP", 
		"SMCOLON", "MULOP", "SUMOP", "DOUBLE", "ID"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'as'", "'if'", "'then'", "'endif'", "'repeat'", "'times'", 
		"'endrepeat'", "'print'", null, null, null, "'var'", "'('", "')'", null, 
		"';'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "COMMENT", 
		"LINE_COMMENT", "WS", "VAR", "PIZQ", "PDER", "ROP", "SMCOLON", "MULOP", 
		"SUMOP", "DOUBLE", "ID"
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


	public ipsumUNLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "ipsumUN.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\30\u00b0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3"+
		"\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7"+
		"\ff\n\f\f\f\16\fi\13\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\7\rt\n\r\f"+
		"\r\16\rw\13\r\3\r\3\r\3\16\6\16|\n\16\r\16\16\16}\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\5\22\u0094\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\26\6\26\u009d"+
		"\n\26\r\26\16\26\u009e\3\26\3\26\3\26\6\26\u00a4\n\26\r\26\16\26\u00a5"+
		"\5\26\u00a8\n\26\3\27\3\27\7\27\u00ac\n\27\f\27\16\27\u00af\13\27\3g\2"+
		"\30\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35"+
		"\20\37\21!\22#\23%\24\'\25)\26+\27-\30\3\2\n\4\2\f\f\17\17\5\2\13\f\17"+
		"\17\"\"\4\2,,\61\61\4\2--//\3\2\62;\3\2\60\60\4\2C\\c|\6\2\62;C\\aac|"+
		"\2\u00bb\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2"+
		"\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27"+
		"\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2"+
		"\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2"+
		"\3/\3\2\2\2\5\61\3\2\2\2\7\63\3\2\2\2\t\66\3\2\2\2\139\3\2\2\2\r>\3\2"+
		"\2\2\17D\3\2\2\2\21K\3\2\2\2\23Q\3\2\2\2\25[\3\2\2\2\27a\3\2\2\2\31o\3"+
		"\2\2\2\33{\3\2\2\2\35\u0081\3\2\2\2\37\u0085\3\2\2\2!\u0087\3\2\2\2#\u0093"+
		"\3\2\2\2%\u0095\3\2\2\2\'\u0097\3\2\2\2)\u0099\3\2\2\2+\u009c\3\2\2\2"+
		"-\u00a9\3\2\2\2/\60\7}\2\2\60\4\3\2\2\2\61\62\7\177\2\2\62\6\3\2\2\2\63"+
		"\64\7c\2\2\64\65\7u\2\2\65\b\3\2\2\2\66\67\7k\2\2\678\7h\2\28\n\3\2\2"+
		"\29:\7v\2\2:;\7j\2\2;<\7g\2\2<=\7p\2\2=\f\3\2\2\2>?\7g\2\2?@\7p\2\2@A"+
		"\7f\2\2AB\7k\2\2BC\7h\2\2C\16\3\2\2\2DE\7t\2\2EF\7g\2\2FG\7r\2\2GH\7g"+
		"\2\2HI\7c\2\2IJ\7v\2\2J\20\3\2\2\2KL\7v\2\2LM\7k\2\2MN\7o\2\2NO\7g\2\2"+
		"OP\7u\2\2P\22\3\2\2\2QR\7g\2\2RS\7p\2\2ST\7f\2\2TU\7t\2\2UV\7g\2\2VW\7"+
		"r\2\2WX\7g\2\2XY\7c\2\2YZ\7v\2\2Z\24\3\2\2\2[\\\7r\2\2\\]\7t\2\2]^\7k"+
		"\2\2^_\7p\2\2_`\7v\2\2`\26\3\2\2\2ab\7\61\2\2bc\7,\2\2cg\3\2\2\2df\13"+
		"\2\2\2ed\3\2\2\2fi\3\2\2\2gh\3\2\2\2ge\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk\7"+
		",\2\2kl\7\61\2\2lm\3\2\2\2mn\b\f\2\2n\30\3\2\2\2op\7\61\2\2pq\7\61\2\2"+
		"qu\3\2\2\2rt\n\2\2\2sr\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2"+
		"wu\3\2\2\2xy\b\r\2\2y\32\3\2\2\2z|\t\3\2\2{z\3\2\2\2|}\3\2\2\2}{\3\2\2"+
		"\2}~\3\2\2\2~\177\3\2\2\2\177\u0080\b\16\2\2\u0080\34\3\2\2\2\u0081\u0082"+
		"\7x\2\2\u0082\u0083\7c\2\2\u0083\u0084\7t\2\2\u0084\36\3\2\2\2\u0085\u0086"+
		"\7*\2\2\u0086 \3\2\2\2\u0087\u0088\7+\2\2\u0088\"\3\2\2\2\u0089\u0094"+
		"\7>\2\2\u008a\u008b\7>\2\2\u008b\u0094\7?\2\2\u008c\u008d\7@\2\2\u008d"+
		"\u0094\7?\2\2\u008e\u0094\7@\2\2\u008f\u0090\7?\2\2\u0090\u0094\7?\2\2"+
		"\u0091\u0092\7#\2\2\u0092\u0094\7?\2\2\u0093\u0089\3\2\2\2\u0093\u008a"+
		"\3\2\2\2\u0093\u008c\3\2\2\2\u0093\u008e\3\2\2\2\u0093\u008f\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0094$\3\2\2\2\u0095\u0096\7=\2\2\u0096&\3\2\2\2\u0097"+
		"\u0098\t\4\2\2\u0098(\3\2\2\2\u0099\u009a\t\5\2\2\u009a*\3\2\2\2\u009b"+
		"\u009d\t\6\2\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2"+
		"\2\2\u009e\u009f\3\2\2\2\u009f\u00a7\3\2\2\2\u00a0\u00a8\3\2\2\2\u00a1"+
		"\u00a3\t\7\2\2\u00a2\u00a4\t\6\2\2\u00a3\u00a2\3\2\2\2\u00a4\u00a5\3\2"+
		"\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7"+
		"\u00a0\3\2\2\2\u00a7\u00a1\3\2\2\2\u00a8,\3\2\2\2\u00a9\u00ad\t\b\2\2"+
		"\u00aa\u00ac\t\t\2\2\u00ab\u00aa\3\2\2\2\u00ac\u00af\3\2\2\2\u00ad\u00ab"+
		"\3\2\2\2\u00ad\u00ae\3\2\2\2\u00ae.\3\2\2\2\u00af\u00ad\3\2\2\2\13\2g"+
		"u}\u0093\u009e\u00a5\u00a7\u00ad\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}