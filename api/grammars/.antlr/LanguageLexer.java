// Generated from /home/sebas/Universidad/1 2025/Compi2/Proyecto1/OLC2_Proyecto1_202010298/api/grammars/Language.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class LanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, INT=17, 
		BOOL=18, FLOAT=19, STRING=20, RUNE=21, WS=22, ID=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "INT", 
			"BOOL", "FLOAT", "STRING", "RUNE", "WS", "ID"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "'='", "';'", "'fmt.Println('", "')'", "'-'", "'*'", "'/'", 
			"'+'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'('"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, "INT", "BOOL", "FLOAT", "STRING", "RUNE", 
			"WS", "ID"
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


	public LanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Language.g4"; }

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
		"\u0004\u0000\u0017\u0094\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014"+
		"\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f"+
		"\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f"+
		"\u0001\u000f\u0001\u0010\u0004\u0010b\b\u0010\u000b\u0010\f\u0010c\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0003\u0011o\b\u0011\u0001\u0012\u0004"+
		"\u0012r\b\u0012\u000b\u0012\f\u0012s\u0001\u0012\u0001\u0012\u0004\u0012"+
		"x\b\u0012\u000b\u0012\f\u0012y\u0001\u0013\u0001\u0013\u0005\u0013~\b"+
		"\u0013\n\u0013\f\u0013\u0081\t\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0004\u0015\u008a\b\u0015"+
		"\u000b\u0015\f\u0015\u008b\u0001\u0015\u0001\u0015\u0001\u0016\u0004\u0016"+
		"\u0091\b\u0016\u000b\u0016\f\u0016\u0092\u0000\u0000\u0017\u0001\u0001"+
		"\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f"+
		"\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f"+
		"\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016-\u0017\u0001\u0000"+
		"\u0005\u0001\u000009\u0001\u0000\"\"\u0001\u0000\'\'\u0003\u0000\t\n\r"+
		"\r  \u0002\u0000AZaz\u009a\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003"+
		"\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007"+
		"\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001"+
		"\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000"+
		"\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000"+
		"\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000"+
		"\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000"+
		"\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000"+
		"\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000"+
		"\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000\u0000\u0000\u0000"+
		")\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000\u0000-\u0001"+
		"\u0000\u0000\u0000\u0001/\u0001\u0000\u0000\u0000\u00033\u0001\u0000\u0000"+
		"\u0000\u00055\u0001\u0000\u0000\u0000\u00077\u0001\u0000\u0000\u0000\t"+
		"D\u0001\u0000\u0000\u0000\u000bF\u0001\u0000\u0000\u0000\rH\u0001\u0000"+
		"\u0000\u0000\u000fJ\u0001\u0000\u0000\u0000\u0011L\u0001\u0000\u0000\u0000"+
		"\u0013N\u0001\u0000\u0000\u0000\u0015P\u0001\u0000\u0000\u0000\u0017R"+
		"\u0001\u0000\u0000\u0000\u0019U\u0001\u0000\u0000\u0000\u001bX\u0001\u0000"+
		"\u0000\u0000\u001d[\u0001\u0000\u0000\u0000\u001f^\u0001\u0000\u0000\u0000"+
		"!a\u0001\u0000\u0000\u0000#n\u0001\u0000\u0000\u0000%q\u0001\u0000\u0000"+
		"\u0000\'{\u0001\u0000\u0000\u0000)\u0084\u0001\u0000\u0000\u0000+\u0089"+
		"\u0001\u0000\u0000\u0000-\u0090\u0001\u0000\u0000\u0000/0\u0005v\u0000"+
		"\u000001\u0005a\u0000\u000012\u0005r\u0000\u00002\u0002\u0001\u0000\u0000"+
		"\u000034\u0005=\u0000\u00004\u0004\u0001\u0000\u0000\u000056\u0005;\u0000"+
		"\u00006\u0006\u0001\u0000\u0000\u000078\u0005f\u0000\u000089\u0005m\u0000"+
		"\u00009:\u0005t\u0000\u0000:;\u0005.\u0000\u0000;<\u0005P\u0000\u0000"+
		"<=\u0005r\u0000\u0000=>\u0005i\u0000\u0000>?\u0005n\u0000\u0000?@\u0005"+
		"t\u0000\u0000@A\u0005l\u0000\u0000AB\u0005n\u0000\u0000BC\u0005(\u0000"+
		"\u0000C\b\u0001\u0000\u0000\u0000DE\u0005)\u0000\u0000E\n\u0001\u0000"+
		"\u0000\u0000FG\u0005-\u0000\u0000G\f\u0001\u0000\u0000\u0000HI\u0005*"+
		"\u0000\u0000I\u000e\u0001\u0000\u0000\u0000JK\u0005/\u0000\u0000K\u0010"+
		"\u0001\u0000\u0000\u0000LM\u0005+\u0000\u0000M\u0012\u0001\u0000\u0000"+
		"\u0000NO\u0005>\u0000\u0000O\u0014\u0001\u0000\u0000\u0000PQ\u0005<\u0000"+
		"\u0000Q\u0016\u0001\u0000\u0000\u0000RS\u0005>\u0000\u0000ST\u0005=\u0000"+
		"\u0000T\u0018\u0001\u0000\u0000\u0000UV\u0005<\u0000\u0000VW\u0005=\u0000"+
		"\u0000W\u001a\u0001\u0000\u0000\u0000XY\u0005=\u0000\u0000YZ\u0005=\u0000"+
		"\u0000Z\u001c\u0001\u0000\u0000\u0000[\\\u0005!\u0000\u0000\\]\u0005="+
		"\u0000\u0000]\u001e\u0001\u0000\u0000\u0000^_\u0005(\u0000\u0000_ \u0001"+
		"\u0000\u0000\u0000`b\u0007\u0000\u0000\u0000a`\u0001\u0000\u0000\u0000"+
		"bc\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000"+
		"\u0000d\"\u0001\u0000\u0000\u0000ef\u0005t\u0000\u0000fg\u0005r\u0000"+
		"\u0000gh\u0005u\u0000\u0000ho\u0005e\u0000\u0000ij\u0005f\u0000\u0000"+
		"jk\u0005a\u0000\u0000kl\u0005l\u0000\u0000lm\u0005s\u0000\u0000mo\u0005"+
		"e\u0000\u0000ne\u0001\u0000\u0000\u0000ni\u0001\u0000\u0000\u0000o$\u0001"+
		"\u0000\u0000\u0000pr\u0007\u0000\u0000\u0000qp\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000st\u0001\u0000\u0000"+
		"\u0000tu\u0001\u0000\u0000\u0000uw\u0005.\u0000\u0000vx\u0007\u0000\u0000"+
		"\u0000wv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yw\u0001\u0000"+
		"\u0000\u0000yz\u0001\u0000\u0000\u0000z&\u0001\u0000\u0000\u0000{\u007f"+
		"\u0005\"\u0000\u0000|~\b\u0001\u0000\u0000}|\u0001\u0000\u0000\u0000~"+
		"\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000\u007f\u0080"+
		"\u0001\u0000\u0000\u0000\u0080\u0082\u0001\u0000\u0000\u0000\u0081\u007f"+
		"\u0001\u0000\u0000\u0000\u0082\u0083\u0005\"\u0000\u0000\u0083(\u0001"+
		"\u0000\u0000\u0000\u0084\u0085\u0005\'\u0000\u0000\u0085\u0086\b\u0002"+
		"\u0000\u0000\u0086\u0087\u0005\'\u0000\u0000\u0087*\u0001\u0000\u0000"+
		"\u0000\u0088\u008a\u0007\u0003\u0000\u0000\u0089\u0088\u0001\u0000\u0000"+
		"\u0000\u008a\u008b\u0001\u0000\u0000\u0000\u008b\u0089\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008d\u0001\u0000\u0000"+
		"\u0000\u008d\u008e\u0006\u0015\u0000\u0000\u008e,\u0001\u0000\u0000\u0000"+
		"\u008f\u0091\u0007\u0004\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000"+
		"\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000"+
		"\u0092\u0093\u0001\u0000\u0000\u0000\u0093.\u0001\u0000\u0000\u0000\b"+
		"\u0000cnsy\u007f\u008b\u0092\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}