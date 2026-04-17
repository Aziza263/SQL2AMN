// Generated from PlPgSQL.g4 by ANTLR 4.13.1
package SQL2AMN.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class PlPgSQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CREATE=1, TABLE=2, OR=3, REPLACE=4, FUNCTION=5, RETURNS=6, VOID=7, LANGUAGE=8, 
		PLPGSQL=9, BEGIN=10, END=11, DECLARE=12, FOR=13, IN=14, SELECT=15, FROM=16, 
		LOOP=17, INSERT=18, INTO=19, VALUES=20, WHERE=21, IF=22, THEN=23, ELSE=24, 
		IS=25, NULL_=26, AND=27, NOT=28, PRIMARY=29, KEY=30, CONSTRAINT=31, GENERATED=32, 
		BY=33, DEFAULT=34, AS=35, IDENTITY=36, BIGINT=37, VARCHAR=38, STAR=39, 
		RECORD=40, LPAREN=41, RPAREN=42, SEMI=43, COMMA=44, DOT=45, EQ=46, ASSIGN=47, 
		DOLLAR=48, STRING_LITERAL=49, INTEGER_LITERAL=50, IDENTIFIER=51, WS=52, 
		COMMENT=53, BLOCK_COMMENT=54;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_createTableStatement = 2, RULE_columnDef = 3, 
		RULE_constraintDef = 4, RULE_dataType = 5, RULE_createFunctionStatement = 6, 
		RULE_declareBlock = 7, RULE_variableDeclaration = 8, RULE_plStatement = 9, 
		RULE_forLoopStatement = 10, RULE_ifStatement = 11, RULE_insertStatement = 12, 
		RULE_selectIntoStatement = 13, RULE_assignmentStatement = 14, RULE_condition = 15, 
		RULE_expression = 16, RULE_schemaName = 17, RULE_tableName = 18, RULE_functionName = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "createTableStatement", "columnDef", "constraintDef", 
			"dataType", "createFunctionStatement", "declareBlock", "variableDeclaration", 
			"plStatement", "forLoopStatement", "ifStatement", "insertStatement", 
			"selectIntoStatement", "assignmentStatement", "condition", "expression", 
			"schemaName", "tableName", "functionName"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "'*'", null, "'('", "')'", "';'", "','", "'.'", "'='", 
			"':='", "'$$'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CREATE", "TABLE", "OR", "REPLACE", "FUNCTION", "RETURNS", "VOID", 
			"LANGUAGE", "PLPGSQL", "BEGIN", "END", "DECLARE", "FOR", "IN", "SELECT", 
			"FROM", "LOOP", "INSERT", "INTO", "VALUES", "WHERE", "IF", "THEN", "ELSE", 
			"IS", "NULL_", "AND", "NOT", "PRIMARY", "KEY", "CONSTRAINT", "GENERATED", 
			"BY", "DEFAULT", "AS", "IDENTITY", "BIGINT", "VARCHAR", "STAR", "RECORD", 
			"LPAREN", "RPAREN", "SEMI", "COMMA", "DOT", "EQ", "ASSIGN", "DOLLAR", 
			"STRING_LITERAL", "INTEGER_LITERAL", "IDENTIFIER", "WS", "COMMENT", "BLOCK_COMMENT"
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
	public String getGrammarFileName() { return "PlPgSQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PlPgSQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PlPgSQLParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(40);
				statement();
				}
				}
				setState(43); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==CREATE );
			setState(45);
			match(EOF);
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
	public static class StatementContext extends ParserRuleContext {
		public CreateTableStatementContext createTableStatement() {
			return getRuleContext(CreateTableStatementContext.class,0);
		}
		public CreateFunctionStatementContext createFunctionStatement() {
			return getRuleContext(CreateFunctionStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(49);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(47);
				createTableStatement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				createFunctionStatement();
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
	public static class CreateTableStatementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(PlPgSQLParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(PlPgSQLParser.TABLE, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PlPgSQLParser.DOT, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PlPgSQLParser.LPAREN, 0); }
		public List<ColumnDefContext> columnDef() {
			return getRuleContexts(ColumnDefContext.class);
		}
		public ColumnDefContext columnDef(int i) {
			return getRuleContext(ColumnDefContext.class,i);
		}
		public TerminalNode RPAREN() { return getToken(PlPgSQLParser.RPAREN, 0); }
		public TerminalNode SEMI() { return getToken(PlPgSQLParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PlPgSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlPgSQLParser.COMMA, i);
		}
		public ConstraintDefContext constraintDef() {
			return getRuleContext(ConstraintDefContext.class,0);
		}
		public CreateTableStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).enterCreateTableStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).exitCreateTableStatement(this);
		}
	}

	public final CreateTableStatementContext createTableStatement() throws RecognitionException {
		CreateTableStatementContext _localctx = new CreateTableStatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_createTableStatement);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(CREATE);
			setState(52);
			match(TABLE);
			setState(53);
			schemaName();
			setState(54);
			match(DOT);
			setState(55);
			tableName();
			setState(56);
			match(LPAREN);
			setState(57);
			columnDef();
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(58);
					match(COMMA);
					setState(59);
					columnDef();
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(65);
				match(COMMA);
				}
			}

			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CONSTRAINT) {
				{
				setState(68);
				constraintDef();
				}
			}

			setState(71);
			match(RPAREN);
			setState(72);
			match(SEMI);
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
	public static class ColumnDefContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PlPgSQLParser.IDENTIFIER, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode NOT() { return getToken(PlPgSQLParser.NOT, 0); }
		public TerminalNode NULL_() { return getToken(PlPgSQLParser.NULL_, 0); }
		public TerminalNode GENERATED() { return getToken(PlPgSQLParser.GENERATED, 0); }
		public TerminalNode BY() { return getToken(PlPgSQLParser.BY, 0); }
		public TerminalNode DEFAULT() { return getToken(PlPgSQLParser.DEFAULT, 0); }
		public TerminalNode AS() { return getToken(PlPgSQLParser.AS, 0); }
		public TerminalNode IDENTITY() { return getToken(PlPgSQLParser.IDENTITY, 0); }
		public ColumnDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).enterColumnDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).exitColumnDef(this);
		}
	}

	public final ColumnDefContext columnDef() throws RecognitionException {
		ColumnDefContext _localctx = new ColumnDefContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_columnDef);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(IDENTIFIER);
			setState(75);
			dataType();
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(76);
				match(NOT);
				setState(77);
				match(NULL_);
				}
			}

			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GENERATED) {
				{
				setState(80);
				match(GENERATED);
				setState(81);
				match(BY);
				setState(82);
				match(DEFAULT);
				setState(83);
				match(AS);
				setState(84);
				match(IDENTITY);
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
	public static class ConstraintDefContext extends ParserRuleContext {
		public TerminalNode CONSTRAINT() { return getToken(PlPgSQLParser.CONSTRAINT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(PlPgSQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PlPgSQLParser.IDENTIFIER, i);
		}
		public TerminalNode PRIMARY() { return getToken(PlPgSQLParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(PlPgSQLParser.KEY, 0); }
		public TerminalNode LPAREN() { return getToken(PlPgSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PlPgSQLParser.RPAREN, 0); }
		public ConstraintDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).enterConstraintDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).exitConstraintDef(this);
		}
	}

	public final ConstraintDefContext constraintDef() throws RecognitionException {
		ConstraintDefContext _localctx = new ConstraintDefContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_constraintDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(CONSTRAINT);
			setState(88);
			match(IDENTIFIER);
			setState(89);
			match(PRIMARY);
			setState(90);
			match(KEY);
			setState(91);
			match(LPAREN);
			setState(92);
			match(IDENTIFIER);
			setState(93);
			match(RPAREN);
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
	public static class DataTypeContext extends ParserRuleContext {
		public TerminalNode BIGINT() { return getToken(PlPgSQLParser.BIGINT, 0); }
		public TerminalNode VARCHAR() { return getToken(PlPgSQLParser.VARCHAR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PlPgSQLParser.IDENTIFIER, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).exitDataType(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dataType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2252212130545664L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class CreateFunctionStatementContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(PlPgSQLParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(PlPgSQLParser.FUNCTION, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PlPgSQLParser.DOT, 0); }
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(PlPgSQLParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(PlPgSQLParser.RPAREN, 0); }
		public TerminalNode RETURNS() { return getToken(PlPgSQLParser.RETURNS, 0); }
		public TerminalNode VOID() { return getToken(PlPgSQLParser.VOID, 0); }
		public TerminalNode AS() { return getToken(PlPgSQLParser.AS, 0); }
		public List<TerminalNode> DOLLAR() { return getTokens(PlPgSQLParser.DOLLAR); }
		public TerminalNode DOLLAR(int i) {
			return getToken(PlPgSQLParser.DOLLAR, i);
		}
		public TerminalNode BEGIN() { return getToken(PlPgSQLParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(PlPgSQLParser.END, 0); }
		public List<TerminalNode> SEMI() { return getTokens(PlPgSQLParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(PlPgSQLParser.SEMI, i);
		}
		public TerminalNode LANGUAGE() { return getToken(PlPgSQLParser.LANGUAGE, 0); }
		public TerminalNode PLPGSQL() { return getToken(PlPgSQLParser.PLPGSQL, 0); }
		public TerminalNode OR() { return getToken(PlPgSQLParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(PlPgSQLParser.REPLACE, 0); }
		public DeclareBlockContext declareBlock() {
			return getRuleContext(DeclareBlockContext.class,0);
		}
		public List<PlStatementContext> plStatement() {
			return getRuleContexts(PlStatementContext.class);
		}
		public PlStatementContext plStatement(int i) {
			return getRuleContext(PlStatementContext.class,i);
		}
		public CreateFunctionStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFunctionStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).enterCreateFunctionStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).exitCreateFunctionStatement(this);
		}
	}

	public final CreateFunctionStatementContext createFunctionStatement() throws RecognitionException {
		CreateFunctionStatementContext _localctx = new CreateFunctionStatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_createFunctionStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(CREATE);
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OR) {
				{
				setState(98);
				match(OR);
				setState(99);
				match(REPLACE);
				}
			}

			setState(102);
			match(FUNCTION);
			setState(103);
			schemaName();
			setState(104);
			match(DOT);
			setState(105);
			functionName();
			setState(106);
			match(LPAREN);
			setState(107);
			match(RPAREN);
			setState(108);
			match(RETURNS);
			setState(109);
			match(VOID);
			setState(110);
			match(AS);
			setState(111);
			match(DOLLAR);
			setState(112);
			match(DOLLAR);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(113);
				declareBlock();
				}
			}

			setState(116);
			match(BEGIN);
			setState(118); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(117);
				plStatement();
				}
				}
				setState(120); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2251799818182656L) != 0) );
			setState(122);
			match(END);
			setState(123);
			match(SEMI);
			setState(124);
			match(DOLLAR);
			setState(125);
			match(DOLLAR);
			setState(126);
			match(LANGUAGE);
			setState(127);
			match(PLPGSQL);
			setState(128);
			match(SEMI);
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
	public static class DeclareBlockContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(PlPgSQLParser.DECLARE, 0); }
		public List<VariableDeclarationContext> variableDeclaration() {
			return getRuleContexts(VariableDeclarationContext.class);
		}
		public VariableDeclarationContext variableDeclaration(int i) {
			return getRuleContext(VariableDeclarationContext.class,i);
		}
		public DeclareBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declareBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).enterDeclareBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).exitDeclareBlock(this);
		}
	}

	public final DeclareBlockContext declareBlock() throws RecognitionException {
		DeclareBlockContext _localctx = new DeclareBlockContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declareBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(DECLARE);
			setState(132); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(131);
				variableDeclaration();
				}
				}
				setState(134); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
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
	public static class VariableDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PlPgSQLParser.IDENTIFIER, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PlPgSQLParser.SEMI, 0); }
		public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).enterVariableDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).exitVariableDeclaration(this);
		}
	}

	public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
		VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_variableDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(IDENTIFIER);
			setState(137);
			dataType();
			setState(138);
			match(SEMI);
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
	public static class PlStatementContext extends ParserRuleContext {
		public ForLoopStatementContext forLoopStatement() {
			return getRuleContext(ForLoopStatementContext.class,0);
		}
		public IfStatementContext ifStatement() {
			return getRuleContext(IfStatementContext.class,0);
		}
		public InsertStatementContext insertStatement() {
			return getRuleContext(InsertStatementContext.class,0);
		}
		public SelectIntoStatementContext selectIntoStatement() {
			return getRuleContext(SelectIntoStatementContext.class,0);
		}
		public AssignmentStatementContext assignmentStatement() {
			return getRuleContext(AssignmentStatementContext.class,0);
		}
		public PlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).enterPlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).exitPlStatement(this);
		}
	}

	public final PlStatementContext plStatement() throws RecognitionException {
		PlStatementContext _localctx = new PlStatementContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_plStatement);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				forLoopStatement();
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				ifStatement();
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(142);
				insertStatement();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 4);
				{
				setState(143);
				selectIntoStatement();
				}
				break;
			case IDENTIFIER:
				enterOuterAlt(_localctx, 5);
				{
				setState(144);
				assignmentStatement();
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
	public static class ForLoopStatementContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(PlPgSQLParser.FOR, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PlPgSQLParser.IDENTIFIER, 0); }
		public TerminalNode IN() { return getToken(PlPgSQLParser.IN, 0); }
		public TerminalNode LPAREN() { return getToken(PlPgSQLParser.LPAREN, 0); }
		public TerminalNode SELECT() { return getToken(PlPgSQLParser.SELECT, 0); }
		public TerminalNode STAR() { return getToken(PlPgSQLParser.STAR, 0); }
		public TerminalNode FROM() { return getToken(PlPgSQLParser.FROM, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PlPgSQLParser.DOT, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(PlPgSQLParser.RPAREN, 0); }
		public List<TerminalNode> LOOP() { return getTokens(PlPgSQLParser.LOOP); }
		public TerminalNode LOOP(int i) {
			return getToken(PlPgSQLParser.LOOP, i);
		}
		public TerminalNode END() { return getToken(PlPgSQLParser.END, 0); }
		public TerminalNode SEMI() { return getToken(PlPgSQLParser.SEMI, 0); }
		public List<PlStatementContext> plStatement() {
			return getRuleContexts(PlStatementContext.class);
		}
		public PlStatementContext plStatement(int i) {
			return getRuleContext(PlStatementContext.class,i);
		}
		public ForLoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoopStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).enterForLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).exitForLoopStatement(this);
		}
	}

	public final ForLoopStatementContext forLoopStatement() throws RecognitionException {
		ForLoopStatementContext _localctx = new ForLoopStatementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forLoopStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			match(FOR);
			setState(148);
			match(IDENTIFIER);
			setState(149);
			match(IN);
			setState(150);
			match(LPAREN);
			setState(151);
			match(SELECT);
			setState(152);
			match(STAR);
			setState(153);
			match(FROM);
			setState(154);
			schemaName();
			setState(155);
			match(DOT);
			setState(156);
			tableName();
			setState(157);
			match(RPAREN);
			setState(158);
			match(LOOP);
			setState(160); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(159);
				plStatement();
				}
				}
				setState(162); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2251799818182656L) != 0) );
			setState(164);
			match(END);
			setState(165);
			match(LOOP);
			setState(166);
			match(SEMI);
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
	public static class IfStatementContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(PlPgSQLParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(PlPgSQLParser.IF, i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(PlPgSQLParser.THEN, 0); }
		public TerminalNode END() { return getToken(PlPgSQLParser.END, 0); }
		public TerminalNode SEMI() { return getToken(PlPgSQLParser.SEMI, 0); }
		public List<PlStatementContext> plStatement() {
			return getRuleContexts(PlStatementContext.class);
		}
		public PlStatementContext plStatement(int i) {
			return getRuleContext(PlStatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(PlPgSQLParser.ELSE, 0); }
		public IfStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).enterIfStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).exitIfStatement(this);
		}
	}

	public final IfStatementContext ifStatement() throws RecognitionException {
		IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_ifStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(IF);
			setState(169);
			condition();
			setState(170);
			match(THEN);
			setState(172); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(171);
				plStatement();
				}
				}
				setState(174); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2251799818182656L) != 0) );
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(176);
				match(ELSE);
				setState(178); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(177);
					plStatement();
					}
					}
					setState(180); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 2251799818182656L) != 0) );
				}
			}

			setState(184);
			match(END);
			setState(185);
			match(IF);
			setState(186);
			match(SEMI);
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
	public static class InsertStatementContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(PlPgSQLParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(PlPgSQLParser.INTO, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PlPgSQLParser.DOT, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public List<TerminalNode> LPAREN() { return getTokens(PlPgSQLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(PlPgSQLParser.LPAREN, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(PlPgSQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PlPgSQLParser.IDENTIFIER, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(PlPgSQLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(PlPgSQLParser.RPAREN, i);
		}
		public TerminalNode VALUES() { return getToken(PlPgSQLParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode SEMI() { return getToken(PlPgSQLParser.SEMI, 0); }
		public List<TerminalNode> COMMA() { return getTokens(PlPgSQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PlPgSQLParser.COMMA, i);
		}
		public InsertStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).enterInsertStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).exitInsertStatement(this);
		}
	}

	public final InsertStatementContext insertStatement() throws RecognitionException {
		InsertStatementContext _localctx = new InsertStatementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_insertStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(INSERT);
			setState(189);
			match(INTO);
			setState(190);
			schemaName();
			setState(191);
			match(DOT);
			setState(192);
			tableName();
			setState(193);
			match(LPAREN);
			setState(194);
			match(IDENTIFIER);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(195);
				match(COMMA);
				setState(196);
				match(IDENTIFIER);
				}
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(202);
			match(RPAREN);
			setState(203);
			match(VALUES);
			setState(204);
			match(LPAREN);
			setState(205);
			expression();
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(206);
				match(COMMA);
				setState(207);
				expression();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
			match(RPAREN);
			setState(214);
			match(SEMI);
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
	public static class SelectIntoStatementContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(PlPgSQLParser.SELECT, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(PlPgSQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PlPgSQLParser.IDENTIFIER, i);
		}
		public TerminalNode INTO() { return getToken(PlPgSQLParser.INTO, 0); }
		public TerminalNode FROM() { return getToken(PlPgSQLParser.FROM, 0); }
		public SchemaNameContext schemaName() {
			return getRuleContext(SchemaNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PlPgSQLParser.DOT, 0); }
		public TableNameContext tableName() {
			return getRuleContext(TableNameContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(PlPgSQLParser.WHERE, 0); }
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PlPgSQLParser.SEMI, 0); }
		public SelectIntoStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectIntoStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).enterSelectIntoStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).exitSelectIntoStatement(this);
		}
	}

	public final SelectIntoStatementContext selectIntoStatement() throws RecognitionException {
		SelectIntoStatementContext _localctx = new SelectIntoStatementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_selectIntoStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(SELECT);
			setState(217);
			match(IDENTIFIER);
			setState(218);
			match(INTO);
			setState(219);
			match(IDENTIFIER);
			setState(220);
			match(FROM);
			setState(221);
			schemaName();
			setState(222);
			match(DOT);
			setState(223);
			tableName();
			setState(224);
			match(WHERE);
			setState(225);
			condition();
			setState(226);
			match(SEMI);
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
	public static class AssignmentStatementContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PlPgSQLParser.IDENTIFIER, 0); }
		public TerminalNode ASSIGN() { return getToken(PlPgSQLParser.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(PlPgSQLParser.SEMI, 0); }
		public AssignmentStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).enterAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).exitAssignmentStatement(this);
		}
	}

	public final AssignmentStatementContext assignmentStatement() throws RecognitionException {
		AssignmentStatementContext _localctx = new AssignmentStatementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_assignmentStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(IDENTIFIER);
			setState(229);
			match(ASSIGN);
			setState(230);
			expression();
			setState(231);
			match(SEMI);
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
	public static class ConditionContext extends ParserRuleContext {
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
	 
		public ConditionContext() { }
		public void copyFrom(ConditionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndConditionContext extends ConditionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(PlPgSQLParser.AND, 0); }
		public AndConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).enterAndCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).exitAndCondition(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IsNullConditionContext extends ConditionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode IS() { return getToken(PlPgSQLParser.IS, 0); }
		public TerminalNode NULL_() { return getToken(PlPgSQLParser.NULL_, 0); }
		public IsNullConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).enterIsNullCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).exitIsNullCondition(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqConditionContext extends ConditionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode EQ() { return getToken(PlPgSQLParser.EQ, 0); }
		public EqConditionContext(ConditionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).enterEqCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).exitEqCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_condition);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new IsNullConditionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(233);
				expression();
				setState(234);
				match(IS);
				setState(235);
				match(NULL_);
				}
				break;
			case 2:
				_localctx = new EqConditionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				expression();
				setState(238);
				match(EQ);
				setState(239);
				expression();
				}
				break;
			case 3:
				_localctx = new AndConditionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(241);
				expression();
				setState(242);
				match(AND);
				setState(243);
				expression();
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
	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FieldAccessContext extends ExpressionContext {
		public List<TerminalNode> IDENTIFIER() { return getTokens(PlPgSQLParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PlPgSQLParser.IDENTIFIER, i);
		}
		public TerminalNode DOT() { return getToken(PlPgSQLParser.DOT, 0); }
		public FieldAccessContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).enterFieldAccess(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).exitFieldAccess(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntLiteralContext extends ExpressionContext {
		public TerminalNode INTEGER_LITERAL() { return getToken(PlPgSQLParser.INTEGER_LITERAL, 0); }
		public IntLiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).enterIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).exitIntLiteral(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VarRefContext extends ExpressionContext {
		public TerminalNode IDENTIFIER() { return getToken(PlPgSQLParser.IDENTIFIER, 0); }
		public VarRefContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).enterVarRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).exitVarRef(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ExpressionContext {
		public TerminalNode STRING_LITERAL() { return getToken(PlPgSQLParser.STRING_LITERAL, 0); }
		public LiteralContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).exitLiteral(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expression);
		try {
			setState(253);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				_localctx = new FieldAccessContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(IDENTIFIER);
				setState(248);
				match(DOT);
				setState(249);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new VarRefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				match(IDENTIFIER);
				}
				break;
			case 3:
				_localctx = new LiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				match(STRING_LITERAL);
				}
				break;
			case 4:
				_localctx = new IntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(252);
				match(INTEGER_LITERAL);
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
	public static class SchemaNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PlPgSQLParser.IDENTIFIER, 0); }
		public SchemaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).enterSchemaName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).exitSchemaName(this);
		}
	}

	public final SchemaNameContext schemaName() throws RecognitionException {
		SchemaNameContext _localctx = new SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(255);
			match(IDENTIFIER);
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
	public static class TableNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PlPgSQLParser.IDENTIFIER, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).exitTableName(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(IDENTIFIER);
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
	public static class FunctionNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER() { return getToken(PlPgSQLParser.IDENTIFIER, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PlPgSQLListener ) ((PlPgSQLListener)listener).exitFunctionName(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(IDENTIFIER);
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
		"\u0004\u00016\u0106\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0004\u0000*\b\u0000\u000b\u0000"+
		"\f\u0000+\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0003\u0001"+
		"2\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002=\b\u0002"+
		"\n\u0002\f\u0002@\t\u0002\u0001\u0002\u0003\u0002C\b\u0002\u0001\u0002"+
		"\u0003\u0002F\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003O\b\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003V\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006e\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006s\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0004\u0006w\b\u0006\u000b\u0006\f\u0006x\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0004\u0007\u0085\b\u0007\u000b\u0007\f"+
		"\u0007\u0086\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\t\u0092\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0004\n\u00a1"+
		"\b\n\u000b\n\f\n\u00a2\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u00ad\b\u000b\u000b\u000b\f"+
		"\u000b\u00ae\u0001\u000b\u0001\u000b\u0004\u000b\u00b3\b\u000b\u000b\u000b"+
		"\f\u000b\u00b4\u0003\u000b\u00b7\b\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0005\f\u00c6\b\f\n\f\f\f\u00c9\t\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00d1\b\f\n\f\f\f\u00d4\t\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00f6\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u00fe"+
		"\b\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0000\u0000\u0014\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&\u0000\u0001\u0002"+
		"\u0000%&33\u010b\u0000)\u0001\u0000\u0000\u0000\u00021\u0001\u0000\u0000"+
		"\u0000\u00043\u0001\u0000\u0000\u0000\u0006J\u0001\u0000\u0000\u0000\b"+
		"W\u0001\u0000\u0000\u0000\n_\u0001\u0000\u0000\u0000\fa\u0001\u0000\u0000"+
		"\u0000\u000e\u0082\u0001\u0000\u0000\u0000\u0010\u0088\u0001\u0000\u0000"+
		"\u0000\u0012\u0091\u0001\u0000\u0000\u0000\u0014\u0093\u0001\u0000\u0000"+
		"\u0000\u0016\u00a8\u0001\u0000\u0000\u0000\u0018\u00bc\u0001\u0000\u0000"+
		"\u0000\u001a\u00d8\u0001\u0000\u0000\u0000\u001c\u00e4\u0001\u0000\u0000"+
		"\u0000\u001e\u00f5\u0001\u0000\u0000\u0000 \u00fd\u0001\u0000\u0000\u0000"+
		"\"\u00ff\u0001\u0000\u0000\u0000$\u0101\u0001\u0000\u0000\u0000&\u0103"+
		"\u0001\u0000\u0000\u0000(*\u0003\u0002\u0001\u0000)(\u0001\u0000\u0000"+
		"\u0000*+\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000+,\u0001\u0000"+
		"\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0005\u0000\u0000\u0001.\u0001"+
		"\u0001\u0000\u0000\u0000/2\u0003\u0004\u0002\u000002\u0003\f\u0006\u0000"+
		"1/\u0001\u0000\u0000\u000010\u0001\u0000\u0000\u00002\u0003\u0001\u0000"+
		"\u0000\u000034\u0005\u0001\u0000\u000045\u0005\u0002\u0000\u000056\u0003"+
		"\"\u0011\u000067\u0005-\u0000\u000078\u0003$\u0012\u000089\u0005)\u0000"+
		"\u00009>\u0003\u0006\u0003\u0000:;\u0005,\u0000\u0000;=\u0003\u0006\u0003"+
		"\u0000<:\u0001\u0000\u0000\u0000=@\u0001\u0000\u0000\u0000><\u0001\u0000"+
		"\u0000\u0000>?\u0001\u0000\u0000\u0000?B\u0001\u0000\u0000\u0000@>\u0001"+
		"\u0000\u0000\u0000AC\u0005,\u0000\u0000BA\u0001\u0000\u0000\u0000BC\u0001"+
		"\u0000\u0000\u0000CE\u0001\u0000\u0000\u0000DF\u0003\b\u0004\u0000ED\u0001"+
		"\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0001\u0000\u0000\u0000"+
		"GH\u0005*\u0000\u0000HI\u0005+\u0000\u0000I\u0005\u0001\u0000\u0000\u0000"+
		"JK\u00053\u0000\u0000KN\u0003\n\u0005\u0000LM\u0005\u001c\u0000\u0000"+
		"MO\u0005\u001a\u0000\u0000NL\u0001\u0000\u0000\u0000NO\u0001\u0000\u0000"+
		"\u0000OU\u0001\u0000\u0000\u0000PQ\u0005 \u0000\u0000QR\u0005!\u0000\u0000"+
		"RS\u0005\"\u0000\u0000ST\u0005#\u0000\u0000TV\u0005$\u0000\u0000UP\u0001"+
		"\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000V\u0007\u0001\u0000\u0000"+
		"\u0000WX\u0005\u001f\u0000\u0000XY\u00053\u0000\u0000YZ\u0005\u001d\u0000"+
		"\u0000Z[\u0005\u001e\u0000\u0000[\\\u0005)\u0000\u0000\\]\u00053\u0000"+
		"\u0000]^\u0005*\u0000\u0000^\t\u0001\u0000\u0000\u0000_`\u0007\u0000\u0000"+
		"\u0000`\u000b\u0001\u0000\u0000\u0000ad\u0005\u0001\u0000\u0000bc\u0005"+
		"\u0003\u0000\u0000ce\u0005\u0004\u0000\u0000db\u0001\u0000\u0000\u0000"+
		"de\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000\u0000fg\u0005\u0005\u0000"+
		"\u0000gh\u0003\"\u0011\u0000hi\u0005-\u0000\u0000ij\u0003&\u0013\u0000"+
		"jk\u0005)\u0000\u0000kl\u0005*\u0000\u0000lm\u0005\u0006\u0000\u0000m"+
		"n\u0005\u0007\u0000\u0000no\u0005#\u0000\u0000op\u00050\u0000\u0000pr"+
		"\u00050\u0000\u0000qs\u0003\u000e\u0007\u0000rq\u0001\u0000\u0000\u0000"+
		"rs\u0001\u0000\u0000\u0000st\u0001\u0000\u0000\u0000tv\u0005\n\u0000\u0000"+
		"uw\u0003\u0012\t\u0000vu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000"+
		"xv\u0001\u0000\u0000\u0000xy\u0001\u0000\u0000\u0000yz\u0001\u0000\u0000"+
		"\u0000z{\u0005\u000b\u0000\u0000{|\u0005+\u0000\u0000|}\u00050\u0000\u0000"+
		"}~\u00050\u0000\u0000~\u007f\u0005\b\u0000\u0000\u007f\u0080\u0005\t\u0000"+
		"\u0000\u0080\u0081\u0005+\u0000\u0000\u0081\r\u0001\u0000\u0000\u0000"+
		"\u0082\u0084\u0005\f\u0000\u0000\u0083\u0085\u0003\u0010\b\u0000\u0084"+
		"\u0083\u0001\u0000\u0000\u0000\u0085\u0086\u0001\u0000\u0000\u0000\u0086"+
		"\u0084\u0001\u0000\u0000\u0000\u0086\u0087\u0001\u0000\u0000\u0000\u0087"+
		"\u000f\u0001\u0000\u0000\u0000\u0088\u0089\u00053\u0000\u0000\u0089\u008a"+
		"\u0003\n\u0005\u0000\u008a\u008b\u0005+\u0000\u0000\u008b\u0011\u0001"+
		"\u0000\u0000\u0000\u008c\u0092\u0003\u0014\n\u0000\u008d\u0092\u0003\u0016"+
		"\u000b\u0000\u008e\u0092\u0003\u0018\f\u0000\u008f\u0092\u0003\u001a\r"+
		"\u0000\u0090\u0092\u0003\u001c\u000e\u0000\u0091\u008c\u0001\u0000\u0000"+
		"\u0000\u0091\u008d\u0001\u0000\u0000\u0000\u0091\u008e\u0001\u0000\u0000"+
		"\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0090\u0001\u0000\u0000"+
		"\u0000\u0092\u0013\u0001\u0000\u0000\u0000\u0093\u0094\u0005\r\u0000\u0000"+
		"\u0094\u0095\u00053\u0000\u0000\u0095\u0096\u0005\u000e\u0000\u0000\u0096"+
		"\u0097\u0005)\u0000\u0000\u0097\u0098\u0005\u000f\u0000\u0000\u0098\u0099"+
		"\u0005\'\u0000\u0000\u0099\u009a\u0005\u0010\u0000\u0000\u009a\u009b\u0003"+
		"\"\u0011\u0000\u009b\u009c\u0005-\u0000\u0000\u009c\u009d\u0003$\u0012"+
		"\u0000\u009d\u009e\u0005*\u0000\u0000\u009e\u00a0\u0005\u0011\u0000\u0000"+
		"\u009f\u00a1\u0003\u0012\t\u0000\u00a0\u009f\u0001\u0000\u0000\u0000\u00a1"+
		"\u00a2\u0001\u0000\u0000\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2"+
		"\u00a3\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4"+
		"\u00a5\u0005\u000b\u0000\u0000\u00a5\u00a6\u0005\u0011\u0000\u0000\u00a6"+
		"\u00a7\u0005+\u0000\u0000\u00a7\u0015\u0001\u0000\u0000\u0000\u00a8\u00a9"+
		"\u0005\u0016\u0000\u0000\u00a9\u00aa\u0003\u001e\u000f\u0000\u00aa\u00ac"+
		"\u0005\u0017\u0000\u0000\u00ab\u00ad\u0003\u0012\t\u0000\u00ac\u00ab\u0001"+
		"\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000\u00ae\u00ac\u0001"+
		"\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b0\u00b2\u0005\u0018\u0000\u0000\u00b1\u00b3\u0003"+
		"\u0012\t\u0000\u00b2\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b4\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b2\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6\u00b0\u0001\u0000"+
		"\u0000\u0000\u00b6\u00b7\u0001\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000"+
		"\u0000\u0000\u00b8\u00b9\u0005\u000b\u0000\u0000\u00b9\u00ba\u0005\u0016"+
		"\u0000\u0000\u00ba\u00bb\u0005+\u0000\u0000\u00bb\u0017\u0001\u0000\u0000"+
		"\u0000\u00bc\u00bd\u0005\u0012\u0000\u0000\u00bd\u00be\u0005\u0013\u0000"+
		"\u0000\u00be\u00bf\u0003\"\u0011\u0000\u00bf\u00c0\u0005-\u0000\u0000"+
		"\u00c0\u00c1\u0003$\u0012\u0000\u00c1\u00c2\u0005)\u0000\u0000\u00c2\u00c7"+
		"\u00053\u0000\u0000\u00c3\u00c4\u0005,\u0000\u0000\u00c4\u00c6\u00053"+
		"\u0000\u0000\u00c5\u00c3\u0001\u0000\u0000\u0000\u00c6\u00c9\u0001\u0000"+
		"\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c8\u0001\u0000"+
		"\u0000\u0000\u00c8\u00ca\u0001\u0000\u0000\u0000\u00c9\u00c7\u0001\u0000"+
		"\u0000\u0000\u00ca\u00cb\u0005*\u0000\u0000\u00cb\u00cc\u0005\u0014\u0000"+
		"\u0000\u00cc\u00cd\u0005)\u0000\u0000\u00cd\u00d2\u0003 \u0010\u0000\u00ce"+
		"\u00cf\u0005,\u0000\u0000\u00cf\u00d1\u0003 \u0010\u0000\u00d0\u00ce\u0001"+
		"\u0000\u0000\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001"+
		"\u0000\u0000\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d5\u0001"+
		"\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d6\u0005"+
		"*\u0000\u0000\u00d6\u00d7\u0005+\u0000\u0000\u00d7\u0019\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u0005\u000f\u0000\u0000\u00d9\u00da\u00053\u0000\u0000"+
		"\u00da\u00db\u0005\u0013\u0000\u0000\u00db\u00dc\u00053\u0000\u0000\u00dc"+
		"\u00dd\u0005\u0010\u0000\u0000\u00dd\u00de\u0003\"\u0011\u0000\u00de\u00df"+
		"\u0005-\u0000\u0000\u00df\u00e0\u0003$\u0012\u0000\u00e0\u00e1\u0005\u0015"+
		"\u0000\u0000\u00e1\u00e2\u0003\u001e\u000f\u0000\u00e2\u00e3\u0005+\u0000"+
		"\u0000\u00e3\u001b\u0001\u0000\u0000\u0000\u00e4\u00e5\u00053\u0000\u0000"+
		"\u00e5\u00e6\u0005/\u0000\u0000\u00e6\u00e7\u0003 \u0010\u0000\u00e7\u00e8"+
		"\u0005+\u0000\u0000\u00e8\u001d\u0001\u0000\u0000\u0000\u00e9\u00ea\u0003"+
		" \u0010\u0000\u00ea\u00eb\u0005\u0019\u0000\u0000\u00eb\u00ec\u0005\u001a"+
		"\u0000\u0000\u00ec\u00f6\u0001\u0000\u0000\u0000\u00ed\u00ee\u0003 \u0010"+
		"\u0000\u00ee\u00ef\u0005.\u0000\u0000\u00ef\u00f0\u0003 \u0010\u0000\u00f0"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f1\u00f2\u0003 \u0010\u0000\u00f2\u00f3"+
		"\u0005\u001b\u0000\u0000\u00f3\u00f4\u0003 \u0010\u0000\u00f4\u00f6\u0001"+
		"\u0000\u0000\u0000\u00f5\u00e9\u0001\u0000\u0000\u0000\u00f5\u00ed\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f1\u0001\u0000\u0000\u0000\u00f6\u001f\u0001"+
		"\u0000\u0000\u0000\u00f7\u00f8\u00053\u0000\u0000\u00f8\u00f9\u0005-\u0000"+
		"\u0000\u00f9\u00fe\u00053\u0000\u0000\u00fa\u00fe\u00053\u0000\u0000\u00fb"+
		"\u00fe\u00051\u0000\u0000\u00fc\u00fe\u00052\u0000\u0000\u00fd\u00f7\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fa\u0001\u0000\u0000\u0000\u00fd\u00fb\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fc\u0001\u0000\u0000\u0000\u00fe!\u0001\u0000"+
		"\u0000\u0000\u00ff\u0100\u00053\u0000\u0000\u0100#\u0001\u0000\u0000\u0000"+
		"\u0101\u0102\u00053\u0000\u0000\u0102%\u0001\u0000\u0000\u0000\u0103\u0104"+
		"\u00053\u0000\u0000\u0104\'\u0001\u0000\u0000\u0000\u0014+1>BENUdrx\u0086"+
		"\u0091\u00a2\u00ae\u00b4\u00b6\u00c7\u00d2\u00f5\u00fd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}