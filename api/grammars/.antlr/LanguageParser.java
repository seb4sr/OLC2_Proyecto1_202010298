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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, T__46=47, INT=48, BOOL=49, FLOAT=50, STRING=51, RUNE=52, NIL=53, 
		WS=54, ID=55, COMENTARIO=56, COMENTARIOMULTILINEA=57;
	public static final int
		RULE_program = 0, RULE_declaraciones = 1, RULE_declaracion_variable = 2, 
		RULE_valores2Slices = 3, RULE_valorUnitario = 4, RULE_declaracion_structs = 5, 
		RULE_structBody = 6, RULE_declaracion_variableStruct = 7, RULE_declaracion_Fstructs = 8, 
		RULE_declaracion_funciones = 9, RULE_parametros = 10, RULE_stmt = 11, 
		RULE_inicializacionesfor = 12, RULE_tipo = 13, RULE_call = 14, RULE_atri = 15, 
		RULE_expr = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "declaraciones", "declaracion_variable", "valores2Slices", 
			"valorUnitario", "declaracion_structs", "structBody", "declaracion_variableStruct", 
			"declaracion_Fstructs", "declaracion_funciones", "parametros", "stmt", 
			"inicializacionesfor", "tipo", "call", "atri", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "'='", "';'", "':='", "'[]'", "'{'", "','", "'}'", "'[][]'", 
			"'type'", "'struct'", "'func('", "')'", "'('", "'func'", "'fmt.Println('", 
			"'if'", "'else'", "'for'", "'break'", "'continue'", "'return'", "'int'", 
			"'float64'", "'string'", "'bool'", "'rune'", "'-'", "'!'", "'['", "']'", 
			"'++'", "'--'", "'*'", "'/'", "'%'", "'+'", "'>'", "'<'", "'>='", "'<='", 
			"'=='", "'!='", "'slices.Index('", "'&&'", "'||'", "'new'", null, null, 
			null, null, null, "'nil'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"INT", "BOOL", "FLOAT", "STRING", "RUNE", "NIL", "WS", "ID", "COMENTARIO", 
			"COMENTARIOMULTILINEA"
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
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 53920051039556674L) != 0)) {
				{
				{
				setState(34);
				declaraciones();
				}
				}
				setState(39);
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
		public Declaracion_funcionesContext declaracion_funciones() {
			return getRuleContext(Declaracion_funcionesContext.class,0);
		}
		public Declaracion_structsContext declaracion_structs() {
			return getRuleContext(Declaracion_structsContext.class,0);
		}
		public Declaracion_FstructsContext declaracion_Fstructs() {
			return getRuleContext(Declaracion_FstructsContext.class,0);
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
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				declaracion_variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				declaracion_funciones();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				declaracion_structs();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(43);
				declaracion_Fstructs();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(44);
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
	public static class Declaracion2SliceValoresContext extends Declaracion_variableContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Valores2SlicesContext valores2Slices() {
			return getRuleContext(Valores2SlicesContext.class,0);
		}
		public Declaracion2SliceValoresContext(Declaracion_variableContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Declaracion2SliceSinValoresContext extends Declaracion_variableContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Declaracion2SliceSinValoresContext(Declaracion_variableContext ctx) { copyFrom(ctx); }
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
	public static class DeclaracionSliceValoresContext extends Declaracion_variableContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public DeclaracionSliceValoresContext(Declaracion_variableContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionImplicitaContext extends Declaracion_variableContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclaracionImplicitaContext(Declaracion_variableContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionSliceSinValoresContext extends Declaracion_variableContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DeclaracionSliceSinValoresContext(Declaracion_variableContext ctx) { copyFrom(ctx); }
	}

	public final Declaracion_variableContext declaracion_variable() throws RecognitionException {
		Declaracion_variableContext _localctx = new Declaracion_variableContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaracion_variable);
		int _la;
		try {
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new DeclaracionVariableConValorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				match(T__0);
				setState(48);
				match(ID);
				setState(49);
				tipo();
				setState(50);
				match(T__1);
				setState(51);
				expr(0);
				setState(53);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(52);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new DeclaracionVariableSinValorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				match(T__0);
				setState(56);
				match(ID);
				setState(57);
				tipo();
				setState(59);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(58);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new DeclaracionImplicitaContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(61);
				match(ID);
				setState(62);
				match(T__3);
				setState(63);
				expr(0);
				setState(65);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(64);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new DeclaracionSliceValoresContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(67);
				match(ID);
				setState(68);
				match(T__1);
				setState(69);
				match(T__4);
				setState(70);
				tipo();
				setState(71);
				match(T__5);
				setState(72);
				expr(0);
				setState(75); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(73);
					match(T__6);
					setState(74);
					expr(0);
					}
					}
					setState(77); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__6 );
				setState(79);
				match(T__7);
				setState(81);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(80);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new DeclaracionSliceSinValoresContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				match(T__0);
				setState(84);
				match(ID);
				setState(85);
				match(T__4);
				setState(86);
				tipo();
				setState(88);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(87);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new Declaracion2SliceValoresContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(90);
				match(ID);
				setState(91);
				match(T__1);
				setState(92);
				match(T__8);
				setState(93);
				tipo();
				setState(94);
				match(T__5);
				setState(95);
				valores2Slices();
				setState(96);
				match(T__7);
				setState(98);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(97);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 7:
				_localctx = new Declaracion2SliceSinValoresContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(100);
				match(T__0);
				setState(101);
				match(ID);
				setState(102);
				match(T__8);
				setState(103);
				tipo();
				setState(105);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
				case 1:
					{
					setState(104);
					match(T__2);
					}
					break;
				}
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
	public static class Valores2SlicesContext extends ParserRuleContext {
		public List<ValorUnitarioContext> valorUnitario() {
			return getRuleContexts(ValorUnitarioContext.class);
		}
		public ValorUnitarioContext valorUnitario(int i) {
			return getRuleContext(ValorUnitarioContext.class,i);
		}
		public Valores2SlicesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valores2Slices; }
	}

	public final Valores2SlicesContext valores2Slices() throws RecognitionException {
		Valores2SlicesContext _localctx = new Valores2SlicesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_valores2Slices);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			valorUnitario();
			setState(112); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(110);
				match(T__6);
				setState(111);
				valorUnitario();
				}
				}
				setState(114); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 );
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
	public static class ValorUnitarioContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ValorUnitarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valorUnitario; }
	}

	public final ValorUnitarioContext valorUnitario() throws RecognitionException {
		ValorUnitarioContext _localctx = new ValorUnitarioContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_valorUnitario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__5);
			setState(117);
			expr(0);
			setState(120); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(118);
				match(T__6);
				setState(119);
				expr(0);
				}
				}
				setState(122); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__6 );
			setState(124);
			match(T__7);
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
	public static class Declaracion_structsContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public List<StructBodyContext> structBody() {
			return getRuleContexts(StructBodyContext.class);
		}
		public StructBodyContext structBody(int i) {
			return getRuleContext(StructBodyContext.class,i);
		}
		public Declaracion_structsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_structs; }
	}

	public final Declaracion_structsContext declaracion_structs() throws RecognitionException {
		Declaracion_structsContext _localctx = new Declaracion_structsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_declaracion_structs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__9);
			setState(127);
			match(ID);
			setState(128);
			match(T__10);
			setState(129);
			match(T__5);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 36028797018996738L) != 0)) {
				{
				{
				setState(130);
				structBody();
				}
				}
				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(136);
			match(T__7);
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
	public static class StructBodyContext extends ParserRuleContext {
		public Declaracion_variableContext declaracion_variable() {
			return getRuleContext(Declaracion_variableContext.class,0);
		}
		public Declaracion_funcionesContext declaracion_funciones() {
			return getRuleContext(Declaracion_funcionesContext.class,0);
		}
		public StructBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structBody; }
	}

	public final StructBodyContext structBody() throws RecognitionException {
		StructBodyContext _localctx = new StructBodyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_structBody);
		try {
			setState(140);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(138);
				declaracion_variable();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				declaracion_funciones();
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
	public static class Declaracion_variableStructContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public Declaracion_variableStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_variableStruct; }
	}

	public final Declaracion_variableStructContext declaracion_variableStruct() throws RecognitionException {
		Declaracion_variableStructContext _localctx = new Declaracion_variableStructContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaracion_variableStruct);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			tipo();
			setState(143);
			match(ID);
			setState(145);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(144);
				match(T__2);
				}
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
	public static class Declaracion_FstructsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(LanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LanguageParser.ID, i);
		}
		public Declaracion_FstructsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_Fstructs; }
	}

	public final Declaracion_FstructsContext declaracion_Fstructs() throws RecognitionException {
		Declaracion_FstructsContext _localctx = new Declaracion_FstructsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaracion_Fstructs);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(T__11);
			setState(148);
			match(ID);
			setState(149);
			match(ID);
			setState(150);
			match(T__12);
			setState(151);
			match(ID);
			setState(152);
			match(T__13);
			setState(153);
			match(T__12);
			setState(154);
			match(T__5);
			setState(155);
			match(T__7);
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
	public static class Declaracion_funcionesContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public List<DeclaracionesContext> declaraciones() {
			return getRuleContexts(DeclaracionesContext.class);
		}
		public DeclaracionesContext declaraciones(int i) {
			return getRuleContext(DeclaracionesContext.class,i);
		}
		public Declaracion_funcionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_funciones; }
	}

	public final Declaracion_funcionesContext declaracion_funciones() throws RecognitionException {
		Declaracion_funcionesContext _localctx = new Declaracion_funcionesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaracion_funciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__14);
			setState(158);
			match(ID);
			setState(159);
			match(T__13);
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(160);
				parametros();
				}
			}

			setState(163);
			match(T__12);
			setState(164);
			match(T__5);
			setState(168);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 53920051039556674L) != 0)) {
				{
				{
				setState(165);
				declaraciones();
				}
				}
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(171);
			match(T__7);
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
	public static class ParametrosContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(LanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LanguageParser.ID, i);
		}
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(ID);
			setState(174);
			tipo();
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(175);
				match(T__6);
				setState(176);
				match(ID);
				setState(177);
				tipo();
				}
				}
				setState(182);
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
	public static class ReturnContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FmtPrintContext extends StmtContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public FmtPrintContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForContext extends StmtContext {
		public InicializacionesforContext inicializacionesfor() {
			return getRuleContext(InicializacionesforContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ForContext(StmtContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakContext extends StmtContext {
		public BreakContext(StmtContext ctx) { copyFrom(ctx); }
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
	public static class ContinueContext extends StmtContext {
		public ContinueContext(StmtContext ctx) { copyFrom(ctx); }
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
	@SuppressWarnings("CheckReturnValue")
	public static class ForCondContext extends StmtContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public ForCondContext(StmtContext ctx) { copyFrom(ctx); }
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_stmt);
		int _la;
		try {
			setState(242);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				_localctx = new ExpresionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				expr(0);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(184);
					match(T__2);
					}
				}

				}
				break;
			case 2:
				_localctx = new FmtPrintContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(T__15);
				setState(188);
				expr(0);
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__6) {
					{
					{
					setState(189);
					match(T__6);
					setState(190);
					expr(0);
					}
					}
					setState(195);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(196);
				match(T__12);
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(197);
					match(T__2);
					}
				}

				}
				break;
			case 3:
				_localctx = new BloqueContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(200);
				match(T__5);
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 53920051039556674L) != 0)) {
					{
					{
					setState(201);
					declaraciones();
					}
					}
					setState(206);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(207);
				match(T__7);
				}
				break;
			case 4:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(208);
				match(T__16);
				setState(209);
				expr(0);
				setState(210);
				stmt();
				setState(213);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(211);
					match(T__17);
					setState(212);
					stmt();
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new ForCondContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(215);
				match(T__18);
				setState(216);
				expr(0);
				setState(217);
				stmt();
				}
				break;
			case 6:
				_localctx = new ForContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(219);
				match(T__18);
				setState(220);
				inicializacionesfor();
				setState(221);
				match(T__2);
				setState(222);
				expr(0);
				setState(223);
				match(T__2);
				setState(224);
				expr(0);
				setState(225);
				stmt();
				}
				break;
			case 7:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(227);
				match(T__19);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(228);
					match(T__2);
					}
				}

				}
				break;
			case 8:
				_localctx = new ContinueContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(231);
				match(T__20);
				setState(233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(232);
					match(T__2);
					}
				}

				}
				break;
			case 9:
				_localctx = new ReturnContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(235);
				match(T__21);
				setState(237);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
				case 1:
					{
					setState(236);
					expr(0);
					}
					break;
				}
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(239);
					match(T__2);
					}
				}

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
	public static class InicializacionesforContext extends ParserRuleContext {
		public Declaracion_variableContext declaracion_variable() {
			return getRuleContext(Declaracion_variableContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InicializacionesforContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicializacionesfor; }
	}

	public final InicializacionesforContext inicializacionesfor() throws RecognitionException {
		InicializacionesforContext _localctx = new InicializacionesforContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_inicializacionesfor);
		try {
			setState(246);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				declaracion_variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(245);
				expr(0);
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
		enterRule(_localctx, 26, RULE_tipo);
		try {
			setState(253);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				_localctx = new TipoIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(248);
				match(T__22);
				}
				break;
			case T__23:
				_localctx = new TipoFloatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(249);
				match(T__23);
				}
				break;
			case T__24:
				_localctx = new TipoStringContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(250);
				match(T__24);
				}
				break;
			case T__25:
				_localctx = new TipoBoolContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(251);
				match(T__25);
				}
				break;
			case T__26:
				_localctx = new TipoRuneContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(252);
				match(T__26);
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
	public static class CallContext extends ParserRuleContext {
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
	 
		public CallContext() { }
		public void copyFrom(CallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FunCallContext extends CallContext {
		public AtriContext atri() {
			return getRuleContext(AtriContext.class,0);
		}
		public FunCallContext(CallContext ctx) { copyFrom(ctx); }
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_call);
		int _la;
		try {
			_localctx = new FunCallContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(T__13);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 53920051031457792L) != 0)) {
				{
				setState(256);
				atri();
				}
			}

			setState(259);
			match(T__12);
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
	public static class AtriContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AtriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atri; }
	}

	public final AtriContext atri() throws RecognitionException {
		AtriContext _localctx = new AtriContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_atri);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			expr(0);
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(262);
				match(T__6);
				setState(263);
				expr(0);
				}
				}
				setState(268);
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
	public static class OrContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SliceIndexContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public SliceIndexContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstanciaContext extends ExprContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public AtriContext atri() {
			return getRuleContext(AtriContext.class,0);
		}
		public InstanciaContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParentesisContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParentesisContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncreContext extends ExprContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public IncreContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class NuloContext extends ExprContext {
		public TerminalNode NIL() { return getToken(LanguageParser.NIL, 0); }
		public NuloContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class NotContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotContext(ExprContext ctx) { copyFrom(ctx); }
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
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
	public static class AndContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DecreContext extends ExprContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public DecreContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CallExprContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<CallContext> call() {
			return getRuleContexts(CallContext.class);
		}
		public CallContext call(int i) {
			return getRuleContext(CallContext.class,i);
		}
		public CallExprContext(ExprContext ctx) { copyFrom(ctx); }
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
	@SuppressWarnings("CheckReturnValue")
	public static class GetSlicesContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public GetSlicesContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 32;
		enterRecursionRule(_localctx, 32, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				_localctx = new NegacionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(270);
				match(T__27);
				setState(271);
				expr(23);
				}
				break;
			case 2:
				{
				_localctx = new NotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(272);
				match(T__28);
				setState(273);
				expr(22);
				}
				break;
			case 3:
				{
				_localctx = new IncreContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(274);
				match(ID);
				setState(275);
				match(T__31);
				}
				break;
			case 4:
				{
				_localctx = new DecreContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(276);
				match(ID);
				setState(277);
				match(T__32);
				}
				break;
			case 5:
				{
				_localctx = new SliceIndexContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(278);
				match(T__43);
				setState(279);
				expr(0);
				setState(280);
				match(T__6);
				setState(281);
				expr(0);
				setState(282);
				match(T__12);
				}
				break;
			case 6:
				{
				_localctx = new BooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(284);
				match(BOOL);
				setState(286);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(285);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 7:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(288);
				match(FLOAT);
				setState(290);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(289);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 8:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(292);
				match(STRING);
				setState(294);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
				case 1:
					{
					setState(293);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 9:
				{
				_localctx = new RuneContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(296);
				match(RUNE);
				setState(298);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
				case 1:
					{
					setState(297);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 10:
				{
				_localctx = new EnteroContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(300);
				match(INT);
				setState(302);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
				case 1:
					{
					setState(301);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 11:
				{
				_localctx = new NuloContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(304);
				match(NIL);
				setState(306);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
				case 1:
					{
					setState(305);
					match(T__2);
					}
					break;
				}
				}
				break;
			case 12:
				{
				_localctx = new InstanciaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(308);
				match(T__46);
				setState(309);
				match(ID);
				setState(310);
				match(T__13);
				setState(312);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 53920051031457792L) != 0)) {
					{
					setState(311);
					atri();
					}
				}

				setState(314);
				match(T__12);
				}
				break;
			case 13:
				{
				_localctx = new IdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(315);
				match(ID);
				}
				break;
			case 14:
				{
				_localctx = new ParentesisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(316);
				match(T__13);
				setState(317);
				expr(0);
				setState(318);
				match(T__12);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(361);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(359);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(322);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(323);
						((MulDivModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 120259084288L) != 0)) ) {
							((MulDivModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(324);
						expr(18);
						}
						break;
					case 2:
						{
						_localctx = new SumResContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(325);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(326);
						((SumResContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__27 || _la==T__36) ) {
							((SumResContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(327);
						expr(17);
						}
						break;
					case 3:
						{
						_localctx = new RelacionalesContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(328);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(329);
						((RelacionalesContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4123168604160L) != 0)) ) {
							((RelacionalesContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(330);
						expr(16);
						}
						break;
					case 4:
						{
						_localctx = new IgualdadContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(331);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(332);
						((IgualdadContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__41 || _la==T__42) ) {
							((IgualdadContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(333);
						expr(15);
						}
						break;
					case 5:
						{
						_localctx = new AndContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(334);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(335);
						match(T__44);
						setState(336);
						expr(13);
						}
						break;
					case 6:
						{
						_localctx = new OrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(337);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(338);
						match(T__45);
						setState(339);
						expr(12);
						}
						break;
					case 7:
						{
						_localctx = new AsignacionContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(340);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(341);
						match(T__1);
						setState(342);
						expr(11);
						}
						break;
					case 8:
						{
						_localctx = new CallExprContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(343);
						if (!(precpred(_ctx, 21))) throw new FailedPredicateException(this, "precpred(_ctx, 21)");
						setState(345); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(344);
								call();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(347); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 9:
						{
						_localctx = new GetSlicesContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(349);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(350);
						match(T__29);
						setState(351);
						expr(0);
						setState(352);
						match(T__30);
						setState(357);
						_errHandler.sync(this);
						switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
						case 1:
							{
							setState(353);
							match(T__29);
							setState(354);
							expr(0);
							setState(355);
							match(T__30);
							}
							break;
						}
						}
						break;
					}
					} 
				}
				setState(363);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
		case 16:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 17);
		case 1:
			return precpred(_ctx, 16);
		case 2:
			return precpred(_ctx, 15);
		case 3:
			return precpred(_ctx, 14);
		case 4:
			return precpred(_ctx, 12);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 10);
		case 7:
			return precpred(_ctx, 21);
		case 8:
			return precpred(_ctx, 20);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00019\u016d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0005\u0000$\b\u0000\n\u0000\f\u0000"+
		"\'\t\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001.\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u00026\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002<\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002B\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0004\u0002L\b\u0002\u000b\u0002\f\u0002M\u0001\u0002\u0001\u0002\u0003"+
		"\u0002R\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002Y\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002c\b"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002j\b\u0002\u0003\u0002l\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0004\u0003q\b\u0003\u000b\u0003\f\u0003r\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0004\u0004y\b\u0004\u000b\u0004\f\u0004z\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0005\u0005\u0084\b\u0005\n\u0005\f\u0005\u0087\t\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0006\u0001\u0006\u0003\u0006\u008d\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u0092\b\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u00a2\b\t\u0001\t\u0001\t\u0001\t\u0005\t\u00a7\b\t"+
		"\n\t\f\t\u00aa\t\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0005\n\u00b3\b\n\n\n\f\n\u00b6\t\n\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00ba\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b"+
		"\u00c0\b\u000b\n\u000b\f\u000b\u00c3\t\u000b\u0001\u000b\u0001\u000b\u0003"+
		"\u000b\u00c7\b\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u00cb\b\u000b"+
		"\n\u000b\f\u000b\u00ce\t\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00d6\b\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0003\u000b\u00e6\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00ea"+
		"\b\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00ee\b\u000b\u0001\u000b"+
		"\u0003\u000b\u00f1\b\u000b\u0003\u000b\u00f3\b\u000b\u0001\f\u0001\f\u0003"+
		"\f\u00f7\b\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00fe\b\r"+
		"\u0001\u000e\u0001\u000e\u0003\u000e\u0102\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u0109\b\u000f\n\u000f"+
		"\f\u000f\u010c\t\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0003\u0010\u011f\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u0123\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0127\b\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u012b\b\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u012f\b\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0133\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u0139\b\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u0141\b\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0004\u0010\u015a\b\u0010\u000b\u0010\f\u0010\u015b\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0003\u0010\u0166\b\u0010\u0005\u0010\u0168\b\u0010"+
		"\n\u0010\f\u0010\u016b\t\u0010\u0001\u0010\u0000\u0001 \u0011\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \u0000\u0004\u0001\u0000\"$\u0002\u0000\u001c\u001c%%\u0001\u0000&)\u0001"+
		"\u0000*+\u01ad\u0000%\u0001\u0000\u0000\u0000\u0002-\u0001\u0000\u0000"+
		"\u0000\u0004k\u0001\u0000\u0000\u0000\u0006m\u0001\u0000\u0000\u0000\b"+
		"t\u0001\u0000\u0000\u0000\n~\u0001\u0000\u0000\u0000\f\u008c\u0001\u0000"+
		"\u0000\u0000\u000e\u008e\u0001\u0000\u0000\u0000\u0010\u0093\u0001\u0000"+
		"\u0000\u0000\u0012\u009d\u0001\u0000\u0000\u0000\u0014\u00ad\u0001\u0000"+
		"\u0000\u0000\u0016\u00f2\u0001\u0000\u0000\u0000\u0018\u00f6\u0001\u0000"+
		"\u0000\u0000\u001a\u00fd\u0001\u0000\u0000\u0000\u001c\u00ff\u0001\u0000"+
		"\u0000\u0000\u001e\u0105\u0001\u0000\u0000\u0000 \u0140\u0001\u0000\u0000"+
		"\u0000\"$\u0003\u0002\u0001\u0000#\"\u0001\u0000\u0000\u0000$\'\u0001"+
		"\u0000\u0000\u0000%#\u0001\u0000\u0000\u0000%&\u0001\u0000\u0000\u0000"+
		"&\u0001\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000(.\u0003\u0004"+
		"\u0002\u0000).\u0003\u0012\t\u0000*.\u0003\n\u0005\u0000+.\u0003\u0010"+
		"\b\u0000,.\u0003\u0016\u000b\u0000-(\u0001\u0000\u0000\u0000-)\u0001\u0000"+
		"\u0000\u0000-*\u0001\u0000\u0000\u0000-+\u0001\u0000\u0000\u0000-,\u0001"+
		"\u0000\u0000\u0000.\u0003\u0001\u0000\u0000\u0000/0\u0005\u0001\u0000"+
		"\u000001\u00057\u0000\u000012\u0003\u001a\r\u000023\u0005\u0002\u0000"+
		"\u000035\u0003 \u0010\u000046\u0005\u0003\u0000\u000054\u0001\u0000\u0000"+
		"\u000056\u0001\u0000\u0000\u00006l\u0001\u0000\u0000\u000078\u0005\u0001"+
		"\u0000\u000089\u00057\u0000\u00009;\u0003\u001a\r\u0000:<\u0005\u0003"+
		"\u0000\u0000;:\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000<l\u0001"+
		"\u0000\u0000\u0000=>\u00057\u0000\u0000>?\u0005\u0004\u0000\u0000?A\u0003"+
		" \u0010\u0000@B\u0005\u0003\u0000\u0000A@\u0001\u0000\u0000\u0000AB\u0001"+
		"\u0000\u0000\u0000Bl\u0001\u0000\u0000\u0000CD\u00057\u0000\u0000DE\u0005"+
		"\u0002\u0000\u0000EF\u0005\u0005\u0000\u0000FG\u0003\u001a\r\u0000GH\u0005"+
		"\u0006\u0000\u0000HK\u0003 \u0010\u0000IJ\u0005\u0007\u0000\u0000JL\u0003"+
		" \u0010\u0000KI\u0001\u0000\u0000\u0000LM\u0001\u0000\u0000\u0000MK\u0001"+
		"\u0000\u0000\u0000MN\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000\u0000"+
		"OQ\u0005\b\u0000\u0000PR\u0005\u0003\u0000\u0000QP\u0001\u0000\u0000\u0000"+
		"QR\u0001\u0000\u0000\u0000Rl\u0001\u0000\u0000\u0000ST\u0005\u0001\u0000"+
		"\u0000TU\u00057\u0000\u0000UV\u0005\u0005\u0000\u0000VX\u0003\u001a\r"+
		"\u0000WY\u0005\u0003\u0000\u0000XW\u0001\u0000\u0000\u0000XY\u0001\u0000"+
		"\u0000\u0000Yl\u0001\u0000\u0000\u0000Z[\u00057\u0000\u0000[\\\u0005\u0002"+
		"\u0000\u0000\\]\u0005\t\u0000\u0000]^\u0003\u001a\r\u0000^_\u0005\u0006"+
		"\u0000\u0000_`\u0003\u0006\u0003\u0000`b\u0005\b\u0000\u0000ac\u0005\u0003"+
		"\u0000\u0000ba\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cl\u0001"+
		"\u0000\u0000\u0000de\u0005\u0001\u0000\u0000ef\u00057\u0000\u0000fg\u0005"+
		"\t\u0000\u0000gi\u0003\u001a\r\u0000hj\u0005\u0003\u0000\u0000ih\u0001"+
		"\u0000\u0000\u0000ij\u0001\u0000\u0000\u0000jl\u0001\u0000\u0000\u0000"+
		"k/\u0001\u0000\u0000\u0000k7\u0001\u0000\u0000\u0000k=\u0001\u0000\u0000"+
		"\u0000kC\u0001\u0000\u0000\u0000kS\u0001\u0000\u0000\u0000kZ\u0001\u0000"+
		"\u0000\u0000kd\u0001\u0000\u0000\u0000l\u0005\u0001\u0000\u0000\u0000"+
		"mp\u0003\b\u0004\u0000no\u0005\u0007\u0000\u0000oq\u0003\b\u0004\u0000"+
		"pn\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000"+
		"\u0000rs\u0001\u0000\u0000\u0000s\u0007\u0001\u0000\u0000\u0000tu\u0005"+
		"\u0006\u0000\u0000ux\u0003 \u0010\u0000vw\u0005\u0007\u0000\u0000wy\u0003"+
		" \u0010\u0000xv\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000\u0000zx\u0001"+
		"\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{|\u0001\u0000\u0000\u0000"+
		"|}\u0005\b\u0000\u0000}\t\u0001\u0000\u0000\u0000~\u007f\u0005\n\u0000"+
		"\u0000\u007f\u0080\u00057\u0000\u0000\u0080\u0081\u0005\u000b\u0000\u0000"+
		"\u0081\u0085\u0005\u0006\u0000\u0000\u0082\u0084\u0003\f\u0006\u0000\u0083"+
		"\u0082\u0001\u0000\u0000\u0000\u0084\u0087\u0001\u0000\u0000\u0000\u0085"+
		"\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086"+
		"\u0088\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088"+
		"\u0089\u0005\b\u0000\u0000\u0089\u000b\u0001\u0000\u0000\u0000\u008a\u008d"+
		"\u0003\u0004\u0002\u0000\u008b\u008d\u0003\u0012\t\u0000\u008c\u008a\u0001"+
		"\u0000\u0000\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\r\u0001\u0000"+
		"\u0000\u0000\u008e\u008f\u0003\u001a\r\u0000\u008f\u0091\u00057\u0000"+
		"\u0000\u0090\u0092\u0005\u0003\u0000\u0000\u0091\u0090\u0001\u0000\u0000"+
		"\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u000f\u0001\u0000\u0000"+
		"\u0000\u0093\u0094\u0005\f\u0000\u0000\u0094\u0095\u00057\u0000\u0000"+
		"\u0095\u0096\u00057\u0000\u0000\u0096\u0097\u0005\r\u0000\u0000\u0097"+
		"\u0098\u00057\u0000\u0000\u0098\u0099\u0005\u000e\u0000\u0000\u0099\u009a"+
		"\u0005\r\u0000\u0000\u009a\u009b\u0005\u0006\u0000\u0000\u009b\u009c\u0005"+
		"\b\u0000\u0000\u009c\u0011\u0001\u0000\u0000\u0000\u009d\u009e\u0005\u000f"+
		"\u0000\u0000\u009e\u009f\u00057\u0000\u0000\u009f\u00a1\u0005\u000e\u0000"+
		"\u0000\u00a0\u00a2\u0003\u0014\n\u0000\u00a1\u00a0\u0001\u0000\u0000\u0000"+
		"\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a3\u0001\u0000\u0000\u0000"+
		"\u00a3\u00a4\u0005\r\u0000\u0000\u00a4\u00a8\u0005\u0006\u0000\u0000\u00a5"+
		"\u00a7\u0003\u0002\u0001\u0000\u00a6\u00a5\u0001\u0000\u0000\u0000\u00a7"+
		"\u00aa\u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000\u00a8"+
		"\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ab\u0001\u0000\u0000\u0000\u00aa"+
		"\u00a8\u0001\u0000\u0000\u0000\u00ab\u00ac\u0005\b\u0000\u0000\u00ac\u0013"+
		"\u0001\u0000\u0000\u0000\u00ad\u00ae\u00057\u0000\u0000\u00ae\u00b4\u0003"+
		"\u001a\r\u0000\u00af\u00b0\u0005\u0007\u0000\u0000\u00b0\u00b1\u00057"+
		"\u0000\u0000\u00b1\u00b3\u0003\u001a\r\u0000\u00b2\u00af\u0001\u0000\u0000"+
		"\u0000\u00b3\u00b6\u0001\u0000\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000"+
		"\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u0015\u0001\u0000\u0000"+
		"\u0000\u00b6\u00b4\u0001\u0000\u0000\u0000\u00b7\u00b9\u0003 \u0010\u0000"+
		"\u00b8\u00ba\u0005\u0003\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000"+
		"\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba\u00f3\u0001\u0000\u0000\u0000"+
		"\u00bb\u00bc\u0005\u0010\u0000\u0000\u00bc\u00c1\u0003 \u0010\u0000\u00bd"+
		"\u00be\u0005\u0007\u0000\u0000\u00be\u00c0\u0003 \u0010\u0000\u00bf\u00bd"+
		"\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1\u00bf"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4\u00c6"+
		"\u0005\r\u0000\u0000\u00c5\u00c7\u0005\u0003\u0000\u0000\u00c6\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7\u00f3\u0001"+
		"\u0000\u0000\u0000\u00c8\u00cc\u0005\u0006\u0000\u0000\u00c9\u00cb\u0003"+
		"\u0002\u0001\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001"+
		"\u0000\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001"+
		"\u0000\u0000\u0000\u00cd\u00cf\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001"+
		"\u0000\u0000\u0000\u00cf\u00f3\u0005\b\u0000\u0000\u00d0\u00d1\u0005\u0011"+
		"\u0000\u0000\u00d1\u00d2\u0003 \u0010\u0000\u00d2\u00d5\u0003\u0016\u000b"+
		"\u0000\u00d3\u00d4\u0005\u0012\u0000\u0000\u00d4\u00d6\u0003\u0016\u000b"+
		"\u0000\u00d5\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000"+
		"\u0000\u00d6\u00f3\u0001\u0000\u0000\u0000\u00d7\u00d8\u0005\u0013\u0000"+
		"\u0000\u00d8\u00d9\u0003 \u0010\u0000\u00d9\u00da\u0003\u0016\u000b\u0000"+
		"\u00da\u00f3\u0001\u0000\u0000\u0000\u00db\u00dc\u0005\u0013\u0000\u0000"+
		"\u00dc\u00dd\u0003\u0018\f\u0000\u00dd\u00de\u0005\u0003\u0000\u0000\u00de"+
		"\u00df\u0003 \u0010\u0000\u00df\u00e0\u0005\u0003\u0000\u0000\u00e0\u00e1"+
		"\u0003 \u0010\u0000\u00e1\u00e2\u0003\u0016\u000b\u0000\u00e2\u00f3\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e5\u0005\u0014\u0000\u0000\u00e4\u00e6\u0005"+
		"\u0003\u0000\u0000\u00e5\u00e4\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001"+
		"\u0000\u0000\u0000\u00e6\u00f3\u0001\u0000\u0000\u0000\u00e7\u00e9\u0005"+
		"\u0015\u0000\u0000\u00e8\u00ea\u0005\u0003\u0000\u0000\u00e9\u00e8\u0001"+
		"\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00f3\u0001"+
		"\u0000\u0000\u0000\u00eb\u00ed\u0005\u0016\u0000\u0000\u00ec\u00ee\u0003"+
		" \u0010\u0000\u00ed\u00ec\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001\u0000"+
		"\u0000\u0000\u00ee\u00f0\u0001\u0000\u0000\u0000\u00ef\u00f1\u0005\u0003"+
		"\u0000\u0000\u00f0\u00ef\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f1\u00f3\u0001\u0000\u0000\u0000\u00f2\u00b7\u0001\u0000"+
		"\u0000\u0000\u00f2\u00bb\u0001\u0000\u0000\u0000\u00f2\u00c8\u0001\u0000"+
		"\u0000\u0000\u00f2\u00d0\u0001\u0000\u0000\u0000\u00f2\u00d7\u0001\u0000"+
		"\u0000\u0000\u00f2\u00db\u0001\u0000\u0000\u0000\u00f2\u00e3\u0001\u0000"+
		"\u0000\u0000\u00f2\u00e7\u0001\u0000\u0000\u0000\u00f2\u00eb\u0001\u0000"+
		"\u0000\u0000\u00f3\u0017\u0001\u0000\u0000\u0000\u00f4\u00f7\u0003\u0004"+
		"\u0002\u0000\u00f5\u00f7\u0003 \u0010\u0000\u00f6\u00f4\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f5\u0001\u0000\u0000\u0000\u00f7\u0019\u0001\u0000\u0000"+
		"\u0000\u00f8\u00fe\u0005\u0017\u0000\u0000\u00f9\u00fe\u0005\u0018\u0000"+
		"\u0000\u00fa\u00fe\u0005\u0019\u0000\u0000\u00fb\u00fe\u0005\u001a\u0000"+
		"\u0000\u00fc\u00fe\u0005\u001b\u0000\u0000\u00fd\u00f8\u0001\u0000\u0000"+
		"\u0000\u00fd\u00f9\u0001\u0000\u0000\u0000\u00fd\u00fa\u0001\u0000\u0000"+
		"\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fc\u0001\u0000\u0000"+
		"\u0000\u00fe\u001b\u0001\u0000\u0000\u0000\u00ff\u0101\u0005\u000e\u0000"+
		"\u0000\u0100\u0102\u0003\u001e\u000f\u0000\u0101\u0100\u0001\u0000\u0000"+
		"\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0103\u0001\u0000\u0000"+
		"\u0000\u0103\u0104\u0005\r\u0000\u0000\u0104\u001d\u0001\u0000\u0000\u0000"+
		"\u0105\u010a\u0003 \u0010\u0000\u0106\u0107\u0005\u0007\u0000\u0000\u0107"+
		"\u0109\u0003 \u0010\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u010c"+
		"\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000\u0000\u0000\u010a\u010b"+
		"\u0001\u0000\u0000\u0000\u010b\u001f\u0001\u0000\u0000\u0000\u010c\u010a"+
		"\u0001\u0000\u0000\u0000\u010d\u010e\u0006\u0010\uffff\uffff\u0000\u010e"+
		"\u010f\u0005\u001c\u0000\u0000\u010f\u0141\u0003 \u0010\u0017\u0110\u0111"+
		"\u0005\u001d\u0000\u0000\u0111\u0141\u0003 \u0010\u0016\u0112\u0113\u0005"+
		"7\u0000\u0000\u0113\u0141\u0005 \u0000\u0000\u0114\u0115\u00057\u0000"+
		"\u0000\u0115\u0141\u0005!\u0000\u0000\u0116\u0117\u0005,\u0000\u0000\u0117"+
		"\u0118\u0003 \u0010\u0000\u0118\u0119\u0005\u0007\u0000\u0000\u0119\u011a"+
		"\u0003 \u0010\u0000\u011a\u011b\u0005\r\u0000\u0000\u011b\u0141\u0001"+
		"\u0000\u0000\u0000\u011c\u011e\u00051\u0000\u0000\u011d\u011f\u0005\u0003"+
		"\u0000\u0000\u011e\u011d\u0001\u0000\u0000\u0000\u011e\u011f\u0001\u0000"+
		"\u0000\u0000\u011f\u0141\u0001\u0000\u0000\u0000\u0120\u0122\u00052\u0000"+
		"\u0000\u0121\u0123\u0005\u0003\u0000\u0000\u0122\u0121\u0001\u0000\u0000"+
		"\u0000\u0122\u0123\u0001\u0000\u0000\u0000\u0123\u0141\u0001\u0000\u0000"+
		"\u0000\u0124\u0126\u00053\u0000\u0000\u0125\u0127\u0005\u0003\u0000\u0000"+
		"\u0126\u0125\u0001\u0000\u0000\u0000\u0126\u0127\u0001\u0000\u0000\u0000"+
		"\u0127\u0141\u0001\u0000\u0000\u0000\u0128\u012a\u00054\u0000\u0000\u0129"+
		"\u012b\u0005\u0003\u0000\u0000\u012a\u0129\u0001\u0000\u0000\u0000\u012a"+
		"\u012b\u0001\u0000\u0000\u0000\u012b\u0141\u0001\u0000\u0000\u0000\u012c"+
		"\u012e\u00050\u0000\u0000\u012d\u012f\u0005\u0003\u0000\u0000\u012e\u012d"+
		"\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000\u012f\u0141"+
		"\u0001\u0000\u0000\u0000\u0130\u0132\u00055\u0000\u0000\u0131\u0133\u0005"+
		"\u0003\u0000\u0000\u0132\u0131\u0001\u0000\u0000\u0000\u0132\u0133\u0001"+
		"\u0000\u0000\u0000\u0133\u0141\u0001\u0000\u0000\u0000\u0134\u0135\u0005"+
		"/\u0000\u0000\u0135\u0136\u00057\u0000\u0000\u0136\u0138\u0005\u000e\u0000"+
		"\u0000\u0137\u0139\u0003\u001e\u000f\u0000\u0138\u0137\u0001\u0000\u0000"+
		"\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139\u013a\u0001\u0000\u0000"+
		"\u0000\u013a\u0141\u0005\r\u0000\u0000\u013b\u0141\u00057\u0000\u0000"+
		"\u013c\u013d\u0005\u000e\u0000\u0000\u013d\u013e\u0003 \u0010\u0000\u013e"+
		"\u013f\u0005\r\u0000\u0000\u013f\u0141\u0001\u0000\u0000\u0000\u0140\u010d"+
		"\u0001\u0000\u0000\u0000\u0140\u0110\u0001\u0000\u0000\u0000\u0140\u0112"+
		"\u0001\u0000\u0000\u0000\u0140\u0114\u0001\u0000\u0000\u0000\u0140\u0116"+
		"\u0001\u0000\u0000\u0000\u0140\u011c\u0001\u0000\u0000\u0000\u0140\u0120"+
		"\u0001\u0000\u0000\u0000\u0140\u0124\u0001\u0000\u0000\u0000\u0140\u0128"+
		"\u0001\u0000\u0000\u0000\u0140\u012c\u0001\u0000\u0000\u0000\u0140\u0130"+
		"\u0001\u0000\u0000\u0000\u0140\u0134\u0001\u0000\u0000\u0000\u0140\u013b"+
		"\u0001\u0000\u0000\u0000\u0140\u013c\u0001\u0000\u0000\u0000\u0141\u0169"+
		"\u0001\u0000\u0000\u0000\u0142\u0143\n\u0011\u0000\u0000\u0143\u0144\u0007"+
		"\u0000\u0000\u0000\u0144\u0168\u0003 \u0010\u0012\u0145\u0146\n\u0010"+
		"\u0000\u0000\u0146\u0147\u0007\u0001\u0000\u0000\u0147\u0168\u0003 \u0010"+
		"\u0011\u0148\u0149\n\u000f\u0000\u0000\u0149\u014a\u0007\u0002\u0000\u0000"+
		"\u014a\u0168\u0003 \u0010\u0010\u014b\u014c\n\u000e\u0000\u0000\u014c"+
		"\u014d\u0007\u0003\u0000\u0000\u014d\u0168\u0003 \u0010\u000f\u014e\u014f"+
		"\n\f\u0000\u0000\u014f\u0150\u0005-\u0000\u0000\u0150\u0168\u0003 \u0010"+
		"\r\u0151\u0152\n\u000b\u0000\u0000\u0152\u0153\u0005.\u0000\u0000\u0153"+
		"\u0168\u0003 \u0010\f\u0154\u0155\n\n\u0000\u0000\u0155\u0156\u0005\u0002"+
		"\u0000\u0000\u0156\u0168\u0003 \u0010\u000b\u0157\u0159\n\u0015\u0000"+
		"\u0000\u0158\u015a\u0003\u001c\u000e\u0000\u0159\u0158\u0001\u0000\u0000"+
		"\u0000\u015a\u015b\u0001\u0000\u0000\u0000\u015b\u0159\u0001\u0000\u0000"+
		"\u0000\u015b\u015c\u0001\u0000\u0000\u0000\u015c\u0168\u0001\u0000\u0000"+
		"\u0000\u015d\u015e\n\u0014\u0000\u0000\u015e\u015f\u0005\u001e\u0000\u0000"+
		"\u015f\u0160\u0003 \u0010\u0000\u0160\u0165\u0005\u001f\u0000\u0000\u0161"+
		"\u0162\u0005\u001e\u0000\u0000\u0162\u0163\u0003 \u0010\u0000\u0163\u0164"+
		"\u0005\u001f\u0000\u0000\u0164\u0166\u0001\u0000\u0000\u0000\u0165\u0161"+
		"\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166\u0168"+
		"\u0001\u0000\u0000\u0000\u0167\u0142\u0001\u0000\u0000\u0000\u0167\u0145"+
		"\u0001\u0000\u0000\u0000\u0167\u0148\u0001\u0000\u0000\u0000\u0167\u014b"+
		"\u0001\u0000\u0000\u0000\u0167\u014e\u0001\u0000\u0000\u0000\u0167\u0151"+
		"\u0001\u0000\u0000\u0000\u0167\u0154\u0001\u0000\u0000\u0000\u0167\u0157"+
		"\u0001\u0000\u0000\u0000\u0167\u015d\u0001\u0000\u0000\u0000\u0168\u016b"+
		"\u0001\u0000\u0000\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u0169\u016a"+
		"\u0001\u0000\u0000\u0000\u016a!\u0001\u0000\u0000\u0000\u016b\u0169\u0001"+
		"\u0000\u0000\u0000-%-5;AMQXbikrz\u0085\u008c\u0091\u00a1\u00a8\u00b4\u00b9"+
		"\u00c1\u00c6\u00cc\u00d5\u00e5\u00e9\u00ed\u00f0\u00f2\u00f6\u00fd\u0101"+
		"\u010a\u011e\u0122\u0126\u012a\u012e\u0132\u0138\u0140\u015b\u0165\u0167"+
		"\u0169";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}