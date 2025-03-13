// Generated from /home/sebas/Universidad/1 2025/Compi2/Proyecto1/OLC2_Proyecto1_202010298/api/grammars/Language.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, INT=29, BOOL=30, FLOAT=31, STRING=32, 
		RUNE=33, WS=34, ID=35;
	public static final int
		RULE_program = 0, RULE_declaraciones = 1, RULE_declaracion_variable = 2, 
		RULE_stmt = 3, RULE_tipo = 4, RULE_expr = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaraciones", "declaracion_variable", "stmt", "tipo", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "'='", "';'", "':='", "'fmt.Println('", "')'", "'{'", 
			"'}'", "'if'", "'('", "'else'", "'while'", "'int'", "'float64'", "'string'", 
			"'bool'", "'rune'", "'-'", "'*'", "'/'", "'%'", "'+'", "'>'", "'<'", 
			"'>='", "'<='", "'=='", "'!='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
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

	@Override
	public String getGrammarFileName() { return "Language.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<DeclaracionesContext> declaraciones() {
			return getRuleContexts(DeclaracionesContext.class);
		}
		public DeclaracionesContext declaraciones(int i) {
			return getRuleContext(DeclaracionesContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 51003004578L) != 0)) {
				{
				{
				setState(12);
				declaraciones();
				}
				}
				setState(17);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionesContext extends ParserRuleContext {
		public Declaracion_variableContext declaracion_variable() {
			return getRuleContext(Declaracion_variableContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public DeclaracionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaraciones; }
	}

	public final DeclaracionesContext declaraciones() throws RecognitionException {
		DeclaracionesContext _localctx = new DeclaracionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaraciones);
		try {
			setState(20);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(18);
				declaracion_variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(19);
				stmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracion_variableContext extends ParserRuleContext {
		public Declaracion_variableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_variable; }
	 
		public Declaracion_variableContext() { }
		public void copyFrom(Declaracion_variableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionVariableConValorContext extends Declaracion_variableContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclaracionVariableConValorContext(Declaracion_variableContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionVariableSinValorContext extends Declaracion_variableContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DeclaracionVariableSinValorContext(Declaracion_variableContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionImplicitaContext extends Declaracion_variableContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclaracionImplicitaContext(Declaracion_variableContext ctx) { copyFrom(ctx); }
	}

	public final Declaracion_variableContext declaracion_variable() throws RecognitionException {
		Declaracion_variableContext _localctx = new Declaracion_variableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracion_variable);
		try {
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new DeclaracionVariableConValorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(22);
				match(T__0);
				setState(23);
				match(ID);
				setState(24);
				tipo();
				setState(25);
				match(T__1);
				setState(26);
				expr(0);
				setState(27);
				match(T__2);
				}
				break;
			case 2:
				_localctx = new DeclaracionVariableSinValorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(29);
				match(T__0);
				setState(30);
				match(ID);
				setState(31);
				tipo();
				setState(32);
				match(T__2);
				}
				break;
			case 3:
				_localctx = new DeclaracionImplicitaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(34);
				match(ID);
				setState(35);
				match(T__3);
				setState(36);
				expr(0);
				setState(37);
				match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StmtContext extends ParserRuleContext {
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
	 
		public StmtContext() { }
		public void copyFrom(StmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExpresionContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FmtPrintContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FmtPrintContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BloqueContext extends StmtContext {
		public List<DeclaracionesContext> declaraciones() {
			return getRuleContexts(DeclaracionesContext.class);
		}
		public DeclaracionesContext declaraciones(int i) {
			return getRuleContext(DeclaracionesContext.class,i);
		}
		public BloqueContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public WhileContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<StmtContext> stmt() {
			return getRuleContexts(StmtContext.class);
		}
		public StmtContext stmt(int i) {
			return getRuleContext(StmtContext.class,i);
		}
		public IfContext(StmtContext ctx) { copyFrom(ctx); }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stmt);
		int _la;
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
			case T__17:
			case INT:
			case BOOL:
			case FLOAT:
			case STRING:
			case RUNE:
			case ID:
				_localctx = new ExpresionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(41);
				expr(0);
				setState(42);
				match(T__2);
				}
				break;
			case T__4:
				_localctx = new FmtPrintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(44);
				match(T__4);
				setState(45);
				expr(0);
				setState(46);
				match(T__5);
				setState(47);
				match(T__2);
				}
				break;
			case T__6:
				_localctx = new BloqueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				match(T__6);
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 51003004578L) != 0)) {
					{
					{
					setState(50);
					declaraciones();
					}
					}
					setState(55);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(56);
				match(T__7);
				}
				break;
			case T__8:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(57);
				match(T__8);
				setState(58);
				match(T__9);
				setState(59);
				expr(0);
				setState(60);
				match(T__5);
				setState(61);
				stmt();
				setState(64);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(62);
					match(T__10);
					setState(63);
					stmt();
					}
					break;
				}
				}
				break;
			case T__11:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				match(T__11);
				setState(67);
				match(T__9);
				setState(68);
				expr(0);
				setState(69);
				match(T__5);
				setState(70);
				stmt();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	 
		public TipoContext() { }
		public void copyFrom(TipoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TipoBoolContext extends TipoContext {
		public TipoBoolContext(TipoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TipoFloatContext extends TipoContext {
		public TipoFloatContext(TipoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TipoStringContext extends TipoContext {
		public TipoStringContext(TipoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TipoIntContext extends TipoContext {
		public TipoIntContext(TipoContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class TipoRuneContext extends TipoContext {
		public TipoRuneContext(TipoContext ctx) { copyFrom(ctx); }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo);
		try {
			setState(79);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__12:
				_localctx = new TipoIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				match(T__12);
				}
				break;
			case T__13:
				_localctx = new TipoFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(T__13);
				}
				break;
			case T__14:
				_localctx = new TipoStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				match(T__14);
				}
				break;
			case T__15:
				_localctx = new TipoBoolContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				match(T__15);
				}
				break;
			case T__16:
				_localctx = new TipoRuneContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(78);
				match(T__16);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParentesisContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParentesisContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class StringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(LanguageParser.STRING, 0); }
		public StringContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IgualdadContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public IgualdadContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegacionContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegacionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SumResContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SumResContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatContext extends ExprContext {
		public TerminalNode FLOAT() { return getToken(LanguageParser.FLOAT, 0); }
		public FloatContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivModContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulDivModContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ExprContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AsignacionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EnteroContext extends ExprContext {
		public TerminalNode INT() { return getToken(LanguageParser.INT, 0); }
		public EnteroContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelacionalesContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RelacionalesContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ExprContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public IdContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BooleanContext extends ExprContext {
		public TerminalNode BOOL() { return getToken(LanguageParser.BOOL, 0); }
		public BooleanContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RuneContext extends ExprContext {
		public TerminalNode RUNE() { return getToken(LanguageParser.RUNE, 0); }
		public RuneContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				_localctx = new NegacionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(82);
				match(T__17);
				setState(83);
				expr(13);
				}
				break;
			case 2:
				{
				_localctx = new AsignacionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(84);
				match(ID);
				setState(85);
				match(T__1);
				setState(86);
				expr(8);
				}
				break;
			case 3:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(87);
				match(BOOL);
				}
				break;
			case 4:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(88);
				match(FLOAT);
				}
				break;
			case 5:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(89);
				match(STRING);
				}
				break;
			case 6:
				{
				_localctx = new RuneContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(90);
				match(RUNE);
				}
				break;
			case 7:
				{
				_localctx = new EnteroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				match(INT);
				}
				break;
			case 8:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				match(ID);
				}
				break;
			case 9:
				{
				_localctx = new ParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(93);
				match(T__9);
				setState(94);
				expr(0);
				setState(95);
				match(T__5);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(113);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(111);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(99);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(100);
						((MulDivModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3670016L) != 0)) ) {
							((MulDivModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(101);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new SumResContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(102);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(103);
						((SumResContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__17 || _la==T__21) ) {
							((SumResContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(104);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new RelacionalesContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(105);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(106);
						((RelacionalesContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 125829120L) != 0)) ) {
							((RelacionalesContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(107);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new IgualdadContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(108);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(109);
						((IgualdadContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__26 || _la==T__27) ) {
							((IgualdadContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(110);
						expr(10);
						}
						break;
					}
					} 
				}
				setState(115);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001#u\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002\u0002"+
		"\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002\u0005"+
		"\u0007\u0005\u0001\u0000\u0005\u0000\u000e\b\u0000\n\u0000\f\u0000\u0011"+
		"\t\u0000\u0001\u0001\u0001\u0001\u0003\u0001\u0015\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002(\b\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u00034\b\u0003"+
		"\n\u0003\f\u00037\t\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003A\b\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003I\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004P\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005b\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005p\b\u0005\n\u0005\f\u0005"+
		"s\t\u0005\u0001\u0005\u0000\u0001\n\u0006\u0000\u0002\u0004\u0006\b\n"+
		"\u0000\u0004\u0001\u0000\u0013\u0015\u0002\u0000\u0012\u0012\u0016\u0016"+
		"\u0001\u0000\u0017\u001a\u0001\u0000\u001b\u001c\u0088\u0000\u000f\u0001"+
		"\u0000\u0000\u0000\u0002\u0014\u0001\u0000\u0000\u0000\u0004\'\u0001\u0000"+
		"\u0000\u0000\u0006H\u0001\u0000\u0000\u0000\bO\u0001\u0000\u0000\u0000"+
		"\na\u0001\u0000\u0000\u0000\f\u000e\u0003\u0002\u0001\u0000\r\f\u0001"+
		"\u0000\u0000\u0000\u000e\u0011\u0001\u0000\u0000\u0000\u000f\r\u0001\u0000"+
		"\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000\u0010\u0001\u0001\u0000"+
		"\u0000\u0000\u0011\u000f\u0001\u0000\u0000\u0000\u0012\u0015\u0003\u0004"+
		"\u0002\u0000\u0013\u0015\u0003\u0006\u0003\u0000\u0014\u0012\u0001\u0000"+
		"\u0000\u0000\u0014\u0013\u0001\u0000\u0000\u0000\u0015\u0003\u0001\u0000"+
		"\u0000\u0000\u0016\u0017\u0005\u0001\u0000\u0000\u0017\u0018\u0005#\u0000"+
		"\u0000\u0018\u0019\u0003\b\u0004\u0000\u0019\u001a\u0005\u0002\u0000\u0000"+
		"\u001a\u001b\u0003\n\u0005\u0000\u001b\u001c\u0005\u0003\u0000\u0000\u001c"+
		"(\u0001\u0000\u0000\u0000\u001d\u001e\u0005\u0001\u0000\u0000\u001e\u001f"+
		"\u0005#\u0000\u0000\u001f \u0003\b\u0004\u0000 !\u0005\u0003\u0000\u0000"+
		"!(\u0001\u0000\u0000\u0000\"#\u0005#\u0000\u0000#$\u0005\u0004\u0000\u0000"+
		"$%\u0003\n\u0005\u0000%&\u0005\u0003\u0000\u0000&(\u0001\u0000\u0000\u0000"+
		"\'\u0016\u0001\u0000\u0000\u0000\'\u001d\u0001\u0000\u0000\u0000\'\"\u0001"+
		"\u0000\u0000\u0000(\u0005\u0001\u0000\u0000\u0000)*\u0003\n\u0005\u0000"+
		"*+\u0005\u0003\u0000\u0000+I\u0001\u0000\u0000\u0000,-\u0005\u0005\u0000"+
		"\u0000-.\u0003\n\u0005\u0000./\u0005\u0006\u0000\u0000/0\u0005\u0003\u0000"+
		"\u00000I\u0001\u0000\u0000\u000015\u0005\u0007\u0000\u000024\u0003\u0002"+
		"\u0001\u000032\u0001\u0000\u0000\u000047\u0001\u0000\u0000\u000053\u0001"+
		"\u0000\u0000\u000056\u0001\u0000\u0000\u000068\u0001\u0000\u0000\u0000"+
		"75\u0001\u0000\u0000\u00008I\u0005\b\u0000\u00009:\u0005\t\u0000\u0000"+
		":;\u0005\n\u0000\u0000;<\u0003\n\u0005\u0000<=\u0005\u0006\u0000\u0000"+
		"=@\u0003\u0006\u0003\u0000>?\u0005\u000b\u0000\u0000?A\u0003\u0006\u0003"+
		"\u0000@>\u0001\u0000\u0000\u0000@A\u0001\u0000\u0000\u0000AI\u0001\u0000"+
		"\u0000\u0000BC\u0005\f\u0000\u0000CD\u0005\n\u0000\u0000DE\u0003\n\u0005"+
		"\u0000EF\u0005\u0006\u0000\u0000FG\u0003\u0006\u0003\u0000GI\u0001\u0000"+
		"\u0000\u0000H)\u0001\u0000\u0000\u0000H,\u0001\u0000\u0000\u0000H1\u0001"+
		"\u0000\u0000\u0000H9\u0001\u0000\u0000\u0000HB\u0001\u0000\u0000\u0000"+
		"I\u0007\u0001\u0000\u0000\u0000JP\u0005\r\u0000\u0000KP\u0005\u000e\u0000"+
		"\u0000LP\u0005\u000f\u0000\u0000MP\u0005\u0010\u0000\u0000NP\u0005\u0011"+
		"\u0000\u0000OJ\u0001\u0000\u0000\u0000OK\u0001\u0000\u0000\u0000OL\u0001"+
		"\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000ON\u0001\u0000\u0000\u0000"+
		"P\t\u0001\u0000\u0000\u0000QR\u0006\u0005\uffff\uffff\u0000RS\u0005\u0012"+
		"\u0000\u0000Sb\u0003\n\u0005\rTU\u0005#\u0000\u0000UV\u0005\u0002\u0000"+
		"\u0000Vb\u0003\n\u0005\bWb\u0005\u001e\u0000\u0000Xb\u0005\u001f\u0000"+
		"\u0000Yb\u0005 \u0000\u0000Zb\u0005!\u0000\u0000[b\u0005\u001d\u0000\u0000"+
		"\\b\u0005#\u0000\u0000]^\u0005\n\u0000\u0000^_\u0003\n\u0005\u0000_`\u0005"+
		"\u0006\u0000\u0000`b\u0001\u0000\u0000\u0000aQ\u0001\u0000\u0000\u0000"+
		"aT\u0001\u0000\u0000\u0000aW\u0001\u0000\u0000\u0000aX\u0001\u0000\u0000"+
		"\u0000aY\u0001\u0000\u0000\u0000aZ\u0001\u0000\u0000\u0000a[\u0001\u0000"+
		"\u0000\u0000a\\\u0001\u0000\u0000\u0000a]\u0001\u0000\u0000\u0000bq\u0001"+
		"\u0000\u0000\u0000cd\n\f\u0000\u0000de\u0007\u0000\u0000\u0000ep\u0003"+
		"\n\u0005\rfg\n\u000b\u0000\u0000gh\u0007\u0001\u0000\u0000hp\u0003\n\u0005"+
		"\fij\n\n\u0000\u0000jk\u0007\u0002\u0000\u0000kp\u0003\n\u0005\u000bl"+
		"m\n\t\u0000\u0000mn\u0007\u0003\u0000\u0000np\u0003\n\u0005\noc\u0001"+
		"\u0000\u0000\u0000of\u0001\u0000\u0000\u0000oi\u0001\u0000\u0000\u0000"+
		"ol\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000"+
		"\u0000qr\u0001\u0000\u0000\u0000r\u000b\u0001\u0000\u0000\u0000sq\u0001"+
		"\u0000\u0000\u0000\n\u000f\u0014\'5@HOaoq";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}