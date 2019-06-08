// Generated from D:/Documents/Studia/Kompilatory/src/main/java/pl/rejurhf/antlr\Some.g4 by ANTLR 4.7.2
package pl.rejurhf.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SomeParser extends Parser {
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
	public static final int
		RULE_classDeclaration = 0, RULE_className = 1, RULE_declaration = 2, RULE_method = 3, 
		RULE_methodName = 4, RULE_arguments = 5, RULE_methodCall = 6, RULE_callArguments = 7, 
		RULE_main = 8, RULE_line = 9, RULE_subLine = 10, RULE_printf = 11, RULE_assigment = 12, 
		RULE_ifDefinition = 13, RULE_ifBody = 14, RULE_conditions = 15, RULE_condition = 16, 
		RULE_logicOperator = 17, RULE_relationOperator = 18, RULE_forDefinition = 19, 
		RULE_value = 20, RULE_subValue = 21, RULE_mathOperation = 22, RULE_operator = 23, 
		RULE_subMathValue = 24;
	private static String[] makeRuleNames() {
		return new String[] {
			"classDeclaration", "className", "declaration", "method", "methodName", 
			"arguments", "methodCall", "callArguments", "main", "line", "subLine", 
			"printf", "assigment", "ifDefinition", "ifBody", "conditions", "condition", 
			"logicOperator", "relationOperator", "forDefinition", "value", "subValue", 
			"mathOperation", "operator", "subMathValue"
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

	@Override
	public String getGrammarFileName() { return "Some.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SomeParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ClassDeclarationContext extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(SomeParser.CLASS, 0); }
		public ClassNameContext className() {
			return getRuleContext(ClassNameContext.class,0);
		}
		public TerminalNode IS() { return getToken(SomeParser.IS, 0); }
		public TerminalNode BEGIN() { return getToken(SomeParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(SomeParser.END, 0); }
		public List<DeclarationContext> declaration() {
			return getRuleContexts(DeclarationContext.class);
		}
		public DeclarationContext declaration(int i) {
			return getRuleContext(DeclarationContext.class,i);
		}
		public List<MethodContext> method() {
			return getRuleContexts(MethodContext.class);
		}
		public MethodContext method(int i) {
			return getRuleContext(MethodContext.class,i);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SomeVisitor ) return ((SomeVisitor<? extends T>)visitor).visitClassDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_classDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(CLASS);
			setState(51);
			className();
			setState(52);
			match(IS);
			setState(56);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TYPE) {
				{
				{
				setState(53);
				declaration();
				}
				}
				setState(58);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==FUNCTION) {
				{
				{
				setState(59);
				method();
				}
				}
				setState(64);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(65);
			match(BEGIN);
			setState(67);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(66);
				main();
				}
				break;
			}
			setState(69);
			match(END);
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

	public static class ClassNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(SomeParser.NAME, 0); }
		public ClassNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_className; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SomeVisitor ) return ((SomeVisitor<? extends T>)visitor).visitClassName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClassNameContext className() throws RecognitionException {
		ClassNameContext _localctx = new ClassNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_className);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(NAME);
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

	public static class DeclarationContext extends ParserRuleContext {
		public TerminalNode TYPE() { return getToken(SomeParser.TYPE, 0); }
		public TerminalNode NAME() { return getToken(SomeParser.NAME, 0); }
		public TerminalNode SEMI() { return getToken(SomeParser.SEMI, 0); }
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SomeVisitor ) return ((SomeVisitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(TYPE);
			setState(74);
			match(NAME);
			setState(75);
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

	public static class MethodContext extends ParserRuleContext {
		public TerminalNode FUNCTION() { return getToken(SomeParser.FUNCTION, 0); }
		public MethodNameContext methodName() {
			return getRuleContext(MethodNameContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SomeParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SomeParser.RIGHT_PAREN, 0); }
		public TerminalNode IS() { return getToken(SomeParser.IS, 0); }
		public TerminalNode BEGIN() { return getToken(SomeParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(SomeParser.END, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public List<TerminalNode> RETURN() { return getTokens(SomeParser.RETURN); }
		public TerminalNode RETURN(int i) {
			return getToken(SomeParser.RETURN, i);
		}
		public TerminalNode TYPE() { return getToken(SomeParser.TYPE, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(SomeParser.SEMI, 0); }
		public MethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_method; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SomeVisitor ) return ((SomeVisitor<? extends T>)visitor).visitMethod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodContext method() throws RecognitionException {
		MethodContext _localctx = new MethodContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_method);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			match(FUNCTION);
			setState(78);
			methodName();
			setState(79);
			match(LEFT_PAREN);
			setState(81);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TYPE) {
				{
				setState(80);
				arguments();
				}
			}

			setState(83);
			match(RIGHT_PAREN);
			setState(86);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(84);
				match(RETURN);
				setState(85);
				match(TYPE);
				}
			}

			setState(88);
			match(IS);
			setState(89);
			match(BEGIN);
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINTF) | (1L << FOR) | (1L << NAME))) != 0)) {
				{
				{
				setState(90);
				line();
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RETURN) {
				{
				setState(96);
				match(RETURN);
				setState(97);
				value();
				setState(98);
				match(SEMI);
				}
			}

			setState(102);
			match(END);
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

	public static class MethodNameContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(SomeParser.NAME, 0); }
		public MethodNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodName; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SomeVisitor ) return ((SomeVisitor<? extends T>)visitor).visitMethodName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodNameContext methodName() throws RecognitionException {
		MethodNameContext _localctx = new MethodNameContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(NAME);
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

	public static class ArgumentsContext extends ParserRuleContext {
		public List<TerminalNode> TYPE() { return getTokens(SomeParser.TYPE); }
		public TerminalNode TYPE(int i) {
			return getToken(SomeParser.TYPE, i);
		}
		public List<TerminalNode> COLON() { return getTokens(SomeParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(SomeParser.COLON, i);
		}
		public List<TerminalNode> NAME() { return getTokens(SomeParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(SomeParser.NAME, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SomeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SomeParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SomeVisitor ) return ((SomeVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_arguments);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(106);
					match(TYPE);
					setState(107);
					match(COLON);
					setState(108);
					match(NAME);
					setState(109);
					match(COMMA);
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(115);
			match(TYPE);
			setState(116);
			match(COLON);
			setState(117);
			match(NAME);
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

	public static class MethodCallContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(SomeParser.NAME, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SomeParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SomeParser.RIGHT_PAREN, 0); }
		public CallArgumentsContext callArguments() {
			return getRuleContext(CallArgumentsContext.class,0);
		}
		public MethodCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodCall; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SomeVisitor ) return ((SomeVisitor<? extends T>)visitor).visitMethodCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MethodCallContext methodCall() throws RecognitionException {
		MethodCallContext _localctx = new MethodCallContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_methodCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(NAME);
			setState(120);
			match(LEFT_PAREN);
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << LEFT_PAREN) | (1L << INTEGER_VALUE) | (1L << STRING_VALUE) | (1L << NAME))) != 0)) {
				{
				setState(121);
				callArguments();
				}
			}

			setState(124);
			match(RIGHT_PAREN);
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

	public static class CallArgumentsContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SomeParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SomeParser.COMMA, i);
		}
		public CallArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArguments; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SomeVisitor ) return ((SomeVisitor<? extends T>)visitor).visitCallArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallArgumentsContext callArguments() throws RecognitionException {
		CallArgumentsContext _localctx = new CallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_callArguments);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(126);
					value();
					setState(127);
					match(COMMA);
					}
					} 
				}
				setState(133);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(134);
			value();
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

	public static class MainContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SomeVisitor ) return ((SomeVisitor<? extends T>)visitor).visitMain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINTF) | (1L << FOR) | (1L << NAME))) != 0)) {
				{
				{
				setState(136);
				line();
				}
				}
				setState(141);
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

	public static class LineContext extends ParserRuleContext {
		public IfDefinitionContext ifDefinition() {
			return getRuleContext(IfDefinitionContext.class,0);
		}
		public ForDefinitionContext forDefinition() {
			return getRuleContext(ForDefinitionContext.class,0);
		}
		public SubLineContext subLine() {
			return getRuleContext(SubLineContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SomeVisitor ) return ((SomeVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				{
				setState(142);
				ifDefinition();
				}
				break;
			case FOR:
				{
				setState(143);
				forDefinition();
				}
				break;
			case PRINTF:
			case NAME:
				{
				setState(144);
				subLine();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class SubLineContext extends ParserRuleContext {
		public TerminalNode SEMI() { return getToken(SomeParser.SEMI, 0); }
		public PrintfContext printf() {
			return getRuleContext(PrintfContext.class,0);
		}
		public AssigmentContext assigment() {
			return getRuleContext(AssigmentContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public SubLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subLine; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SomeVisitor ) return ((SomeVisitor<? extends T>)visitor).visitSubLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubLineContext subLine() throws RecognitionException {
		SubLineContext _localctx = new SubLineContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_subLine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(147);
				printf();
				}
				break;
			case 2:
				{
				setState(148);
				assigment();
				}
				break;
			case 3:
				{
				setState(149);
				methodCall();
				}
				break;
			}
			setState(152);
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

	public static class PrintfContext extends ParserRuleContext {
		public TerminalNode PRINTF() { return getToken(SomeParser.PRINTF, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SomeParser.LEFT_PAREN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SomeParser.RIGHT_PAREN, 0); }
		public PrintfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printf; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SomeVisitor ) return ((SomeVisitor<? extends T>)visitor).visitPrintf(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintfContext printf() throws RecognitionException {
		PrintfContext _localctx = new PrintfContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_printf);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(PRINTF);
			setState(155);
			match(LEFT_PAREN);
			setState(156);
			value();
			setState(157);
			match(RIGHT_PAREN);
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

	public static class AssigmentContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(SomeParser.NAME, 0); }
		public TerminalNode ASSIGN() { return getToken(SomeParser.ASSIGN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public AssigmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assigment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SomeVisitor ) return ((SomeVisitor<? extends T>)visitor).visitAssigment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssigmentContext assigment() throws RecognitionException {
		AssigmentContext _localctx = new AssigmentContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_assigment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(NAME);
			setState(160);
			match(ASSIGN);
			setState(161);
			value();
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

	public static class IfDefinitionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(SomeParser.IF, 0); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SomeParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SomeParser.LEFT_PAREN, i);
		}
		public List<ConditionsContext> conditions() {
			return getRuleContexts(ConditionsContext.class);
		}
		public ConditionsContext conditions(int i) {
			return getRuleContext(ConditionsContext.class,i);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SomeParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SomeParser.RIGHT_PAREN, i);
		}
		public List<TerminalNode> BEGIN() { return getTokens(SomeParser.BEGIN); }
		public TerminalNode BEGIN(int i) {
			return getToken(SomeParser.BEGIN, i);
		}
		public List<IfBodyContext> ifBody() {
			return getRuleContexts(IfBodyContext.class);
		}
		public IfBodyContext ifBody(int i) {
			return getRuleContext(IfBodyContext.class,i);
		}
		public TerminalNode END() { return getToken(SomeParser.END, 0); }
		public List<TerminalNode> ELSIF() { return getTokens(SomeParser.ELSIF); }
		public TerminalNode ELSIF(int i) {
			return getToken(SomeParser.ELSIF, i);
		}
		public TerminalNode ELSE() { return getToken(SomeParser.ELSE, 0); }
		public IfDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SomeVisitor ) return ((SomeVisitor<? extends T>)visitor).visitIfDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfDefinitionContext ifDefinition() throws RecognitionException {
		IfDefinitionContext _localctx = new IfDefinitionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_ifDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(IF);
			setState(164);
			match(LEFT_PAREN);
			setState(165);
			conditions();
			setState(166);
			match(RIGHT_PAREN);
			setState(167);
			match(BEGIN);
			setState(168);
			ifBody();
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ELSIF) {
				{
				{
				setState(169);
				match(ELSIF);
				setState(170);
				match(LEFT_PAREN);
				setState(171);
				conditions();
				setState(172);
				match(RIGHT_PAREN);
				setState(173);
				match(BEGIN);
				setState(174);
				ifBody();
				}
				}
				setState(180);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(181);
				match(ELSE);
				setState(182);
				ifBody();
				}
			}

			setState(185);
			match(END);
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

	public static class IfBodyContext extends ParserRuleContext {
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public IfBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBody; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SomeVisitor ) return ((SomeVisitor<? extends T>)visitor).visitIfBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBodyContext ifBody() throws RecognitionException {
		IfBodyContext _localctx = new IfBodyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ifBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINTF) | (1L << FOR) | (1L << NAME))) != 0)) {
				{
				{
				setState(187);
				line();
				}
				}
				setState(192);
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

	public static class ConditionsContext extends ParserRuleContext {
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public List<LogicOperatorContext> logicOperator() {
			return getRuleContexts(LogicOperatorContext.class);
		}
		public LogicOperatorContext logicOperator(int i) {
			return getRuleContext(LogicOperatorContext.class,i);
		}
		public ConditionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditions; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SomeVisitor ) return ((SomeVisitor<? extends T>)visitor).visitConditions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionsContext conditions() throws RecognitionException {
		ConditionsContext _localctx = new ConditionsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_conditions);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(193);
					condition();
					setState(194);
					logicOperator();
					}
					} 
				}
				setState(200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			}
			setState(201);
			condition();
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
		public List<SubMathValueContext> subMathValue() {
			return getRuleContexts(SubMathValueContext.class);
		}
		public SubMathValueContext subMathValue(int i) {
			return getRuleContext(SubMathValueContext.class,i);
		}
		public RelationOperatorContext relationOperator() {
			return getRuleContext(RelationOperatorContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SomeVisitor ) return ((SomeVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			subMathValue();
			setState(204);
			relationOperator();
			setState(205);
			subMathValue();
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

	public static class LogicOperatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(SomeParser.AND, 0); }
		public TerminalNode OR() { return getToken(SomeParser.OR, 0); }
		public LogicOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SomeVisitor ) return ((SomeVisitor<? extends T>)visitor).visitLogicOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicOperatorContext logicOperator() throws RecognitionException {
		LogicOperatorContext _localctx = new LogicOperatorContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_logicOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
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

	public static class RelationOperatorContext extends ParserRuleContext {
		public TerminalNode EQUAL() { return getToken(SomeParser.EQUAL, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(SomeParser.GREATER_EQUAL, 0); }
		public TerminalNode GREATER() { return getToken(SomeParser.GREATER, 0); }
		public TerminalNode LESSER() { return getToken(SomeParser.LESSER, 0); }
		public TerminalNode LESSER_EQUAL() { return getToken(SomeParser.LESSER_EQUAL, 0); }
		public RelationOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationOperator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SomeVisitor ) return ((SomeVisitor<? extends T>)visitor).visitRelationOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationOperatorContext relationOperator() throws RecognitionException {
		RelationOperatorContext _localctx = new RelationOperatorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_relationOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQUAL) | (1L << GREATER) | (1L << LESSER) | (1L << GREATER_EQUAL) | (1L << LESSER_EQUAL))) != 0)) ) {
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

	public static class ForDefinitionContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(SomeParser.FOR, 0); }
		public TerminalNode NAME() { return getToken(SomeParser.NAME, 0); }
		public TerminalNode IN() { return getToken(SomeParser.IN, 0); }
		public TerminalNode TYPE() { return getToken(SomeParser.TYPE, 0); }
		public TerminalNode RANGE() { return getToken(SomeParser.RANGE, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SomeParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SomeParser.INTEGER_VALUE, i);
		}
		public TerminalNode DOTDOT() { return getToken(SomeParser.DOTDOT, 0); }
		public TerminalNode BEGIN() { return getToken(SomeParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(SomeParser.END, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public ForDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forDefinition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SomeVisitor ) return ((SomeVisitor<? extends T>)visitor).visitForDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForDefinitionContext forDefinition() throws RecognitionException {
		ForDefinitionContext _localctx = new ForDefinitionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_forDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(FOR);
			setState(212);
			match(NAME);
			setState(213);
			match(IN);
			setState(214);
			match(TYPE);
			setState(215);
			match(RANGE);
			setState(216);
			match(INTEGER_VALUE);
			setState(217);
			match(DOTDOT);
			setState(218);
			match(INTEGER_VALUE);
			setState(219);
			match(BEGIN);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << PRINTF) | (1L << FOR) | (1L << NAME))) != 0)) {
				{
				{
				setState(220);
				line();
				}
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(226);
			match(END);
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

	public static class ValueContext extends ParserRuleContext {
		public SubValueContext subValue() {
			return getRuleContext(SubValueContext.class,0);
		}
		public MathOperationContext mathOperation() {
			return getRuleContext(MathOperationContext.class,0);
		}
		public MethodCallContext methodCall() {
			return getRuleContext(MethodCallContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SomeVisitor ) return ((SomeVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(228);
				subValue();
				}
				break;
			case 2:
				{
				setState(229);
				mathOperation(0);
				}
				break;
			case 3:
				{
				setState(230);
				methodCall();
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

	public static class SubValueContext extends ParserRuleContext {
		public TerminalNode STRING_VALUE() { return getToken(SomeParser.STRING_VALUE, 0); }
		public SubMathValueContext subMathValue() {
			return getRuleContext(SubMathValueContext.class,0);
		}
		public SubValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SomeVisitor ) return ((SomeVisitor<? extends T>)visitor).visitSubValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubValueContext subValue() throws RecognitionException {
		SubValueContext _localctx = new SubValueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_subValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_VALUE:
				{
				setState(233);
				match(STRING_VALUE);
				}
				break;
			case INTEGER_VALUE:
			case NAME:
				{
				setState(234);
				subMathValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class MathOperationContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SomeParser.LEFT_PAREN, 0); }
		public List<MathOperationContext> mathOperation() {
			return getRuleContexts(MathOperationContext.class);
		}
		public MathOperationContext mathOperation(int i) {
			return getRuleContext(MathOperationContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SomeParser.RIGHT_PAREN, 0); }
		public SubMathValueContext subMathValue() {
			return getRuleContext(SubMathValueContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SomeParser.MINUS, 0); }
		public OperatorContext operator() {
			return getRuleContext(OperatorContext.class,0);
		}
		public MathOperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathOperation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SomeVisitor ) return ((SomeVisitor<? extends T>)visitor).visitMathOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathOperationContext mathOperation() throws RecognitionException {
		return mathOperation(0);
	}

	private MathOperationContext mathOperation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MathOperationContext _localctx = new MathOperationContext(_ctx, _parentState);
		MathOperationContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_mathOperation, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT_PAREN:
				{
				setState(238);
				match(LEFT_PAREN);
				setState(239);
				mathOperation(0);
				setState(240);
				match(RIGHT_PAREN);
				}
				break;
			case MINUS:
			case INTEGER_VALUE:
			case NAME:
				{
				setState(243);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(242);
					match(MINUS);
					}
				}

				setState(245);
				subMathValue();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(254);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MathOperationContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_mathOperation);
					setState(248);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(249);
					operator();
					setState(250);
					mathOperation(4);
					}
					} 
				}
				setState(256);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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

	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SomeParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SomeParser.MINUS, 0); }
		public TerminalNode MUL() { return getToken(SomeParser.MUL, 0); }
		public TerminalNode DIV() { return getToken(SomeParser.DIV, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SomeVisitor ) return ((SomeVisitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL) | (1L << DIV) | (1L << PLUS) | (1L << MINUS))) != 0)) ) {
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

	public static class SubMathValueContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(SomeParser.NAME, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SomeParser.INTEGER_VALUE, 0); }
		public SubMathValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subMathValue; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SomeVisitor ) return ((SomeVisitor<? extends T>)visitor).visitSubMathValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubMathValueContext subMathValue() throws RecognitionException {
		SubMathValueContext _localctx = new SubMathValueContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_subMathValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_la = _input.LA(1);
			if ( !(_la==INTEGER_VALUE || _la==NAME) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 22:
			return mathOperation_sempred((MathOperationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean mathOperation_sempred(MathOperationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\'\u0108\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\3\2\3\2\3\2\3\2\7\29\n\2\f\2\16\2<\13\2\3\2\7\2?\n\2\f\2\16"+
		"\2B\13\2\3\2\3\2\5\2F\n\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5"+
		"\3\5\5\5T\n\5\3\5\3\5\3\5\5\5Y\n\5\3\5\3\5\3\5\7\5^\n\5\f\5\16\5a\13\5"+
		"\3\5\3\5\3\5\3\5\5\5g\n\5\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\7\7\7q\n\7\f\7"+
		"\16\7t\13\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\5\b}\n\b\3\b\3\b\3\t\3\t\3\t\7"+
		"\t\u0084\n\t\f\t\16\t\u0087\13\t\3\t\3\t\3\n\7\n\u008c\n\n\f\n\16\n\u008f"+
		"\13\n\3\13\3\13\3\13\5\13\u0094\n\13\3\f\3\f\3\f\5\f\u0099\n\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00b3\n\17\f\17\16\17\u00b6\13"+
		"\17\3\17\3\17\5\17\u00ba\n\17\3\17\3\17\3\20\7\20\u00bf\n\20\f\20\16\20"+
		"\u00c2\13\20\3\21\3\21\3\21\7\21\u00c7\n\21\f\21\16\21\u00ca\13\21\3\21"+
		"\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\7\25\u00e0\n\25\f\25\16\25\u00e3\13\25\3\25"+
		"\3\25\3\26\3\26\3\26\5\26\u00ea\n\26\3\27\3\27\5\27\u00ee\n\27\3\30\3"+
		"\30\3\30\3\30\3\30\3\30\5\30\u00f6\n\30\3\30\5\30\u00f9\n\30\3\30\3\30"+
		"\3\30\3\30\7\30\u00ff\n\30\f\30\16\30\u0102\13\30\3\31\3\31\3\32\3\32"+
		"\3\32\2\3.\33\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\2"+
		"\6\3\2 !\3\2\33\37\3\2\21\24\4\2##%%\2\u0108\2\64\3\2\2\2\4I\3\2\2\2\6"+
		"K\3\2\2\2\bO\3\2\2\2\nj\3\2\2\2\fr\3\2\2\2\16y\3\2\2\2\20\u0085\3\2\2"+
		"\2\22\u008d\3\2\2\2\24\u0093\3\2\2\2\26\u0098\3\2\2\2\30\u009c\3\2\2\2"+
		"\32\u00a1\3\2\2\2\34\u00a5\3\2\2\2\36\u00c0\3\2\2\2 \u00c8\3\2\2\2\"\u00cd"+
		"\3\2\2\2$\u00d1\3\2\2\2&\u00d3\3\2\2\2(\u00d5\3\2\2\2*\u00e9\3\2\2\2,"+
		"\u00ed\3\2\2\2.\u00f8\3\2\2\2\60\u0103\3\2\2\2\62\u0105\3\2\2\2\64\65"+
		"\7\3\2\2\65\66\5\4\3\2\66:\7\4\2\2\679\5\6\4\28\67\3\2\2\29<\3\2\2\2:"+
		"8\3\2\2\2:;\3\2\2\2;@\3\2\2\2<:\3\2\2\2=?\5\b\5\2>=\3\2\2\2?B\3\2\2\2"+
		"@>\3\2\2\2@A\3\2\2\2AC\3\2\2\2B@\3\2\2\2CE\7\5\2\2DF\5\22\n\2ED\3\2\2"+
		"\2EF\3\2\2\2FG\3\2\2\2GH\7\6\2\2H\3\3\2\2\2IJ\7%\2\2J\5\3\2\2\2KL\7\20"+
		"\2\2LM\7%\2\2MN\7\27\2\2N\7\3\2\2\2OP\7\b\2\2PQ\5\n\6\2QS\7\31\2\2RT\5"+
		"\f\7\2SR\3\2\2\2ST\3\2\2\2TU\3\2\2\2UX\7\32\2\2VW\7\7\2\2WY\7\20\2\2X"+
		"V\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z[\7\4\2\2[_\7\5\2\2\\^\5\24\13\2]\\\3\2"+
		"\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`f\3\2\2\2a_\3\2\2\2bc\7\7\2\2cd\5*"+
		"\26\2de\7\27\2\2eg\3\2\2\2fb\3\2\2\2fg\3\2\2\2gh\3\2\2\2hi\7\6\2\2i\t"+
		"\3\2\2\2jk\7%\2\2k\13\3\2\2\2lm\7\20\2\2mn\7\26\2\2no\7%\2\2oq\7\30\2"+
		"\2pl\3\2\2\2qt\3\2\2\2rp\3\2\2\2rs\3\2\2\2su\3\2\2\2tr\3\2\2\2uv\7\20"+
		"\2\2vw\7\26\2\2wx\7%\2\2x\r\3\2\2\2yz\7%\2\2z|\7\31\2\2{}\5\20\t\2|{\3"+
		"\2\2\2|}\3\2\2\2}~\3\2\2\2~\177\7\32\2\2\177\17\3\2\2\2\u0080\u0081\5"+
		"*\26\2\u0081\u0082\7\30\2\2\u0082\u0084\3\2\2\2\u0083\u0080\3\2\2\2\u0084"+
		"\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0088\3\2"+
		"\2\2\u0087\u0085\3\2\2\2\u0088\u0089\5*\26\2\u0089\21\3\2\2\2\u008a\u008c"+
		"\5\24\13\2\u008b\u008a\3\2\2\2\u008c\u008f\3\2\2\2\u008d\u008b\3\2\2\2"+
		"\u008d\u008e\3\2\2\2\u008e\23\3\2\2\2\u008f\u008d\3\2\2\2\u0090\u0094"+
		"\5\34\17\2\u0091\u0094\5(\25\2\u0092\u0094\5\26\f\2\u0093\u0090\3\2\2"+
		"\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\25\3\2\2\2\u0095\u0099"+
		"\5\30\r\2\u0096\u0099\5\32\16\2\u0097\u0099\5\16\b\2\u0098\u0095\3\2\2"+
		"\2\u0098\u0096\3\2\2\2\u0098\u0097\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b"+
		"\7\27\2\2\u009b\27\3\2\2\2\u009c\u009d\7\f\2\2\u009d\u009e\7\31\2\2\u009e"+
		"\u009f\5*\26\2\u009f\u00a0\7\32\2\2\u00a0\31\3\2\2\2\u00a1\u00a2\7%\2"+
		"\2\u00a2\u00a3\7\25\2\2\u00a3\u00a4\5*\26\2\u00a4\33\3\2\2\2\u00a5\u00a6"+
		"\7\t\2\2\u00a6\u00a7\7\31\2\2\u00a7\u00a8\5 \21\2\u00a8\u00a9\7\32\2\2"+
		"\u00a9\u00aa\7\5\2\2\u00aa\u00b4\5\36\20\2\u00ab\u00ac\7\13\2\2\u00ac"+
		"\u00ad\7\31\2\2\u00ad\u00ae\5 \21\2\u00ae\u00af\7\32\2\2\u00af\u00b0\7"+
		"\5\2\2\u00b0\u00b1\5\36\20\2\u00b1\u00b3\3\2\2\2\u00b2\u00ab\3\2\2\2\u00b3"+
		"\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b9\3\2"+
		"\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00b8\7\n\2\2\u00b8\u00ba\5\36\20\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bc\7\6"+
		"\2\2\u00bc\35\3\2\2\2\u00bd\u00bf\5\24\13\2\u00be\u00bd\3\2\2\2\u00bf"+
		"\u00c2\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\37\3\2\2"+
		"\2\u00c2\u00c0\3\2\2\2\u00c3\u00c4\5\"\22\2\u00c4\u00c5\5$\23\2\u00c5"+
		"\u00c7\3\2\2\2\u00c6\u00c3\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3\2"+
		"\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cb\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb"+
		"\u00cc\5\"\22\2\u00cc!\3\2\2\2\u00cd\u00ce\5\62\32\2\u00ce\u00cf\5&\24"+
		"\2\u00cf\u00d0\5\62\32\2\u00d0#\3\2\2\2\u00d1\u00d2\t\2\2\2\u00d2%\3\2"+
		"\2\2\u00d3\u00d4\t\3\2\2\u00d4\'\3\2\2\2\u00d5\u00d6\7\r\2\2\u00d6\u00d7"+
		"\7%\2\2\u00d7\u00d8\7\16\2\2\u00d8\u00d9\7\20\2\2\u00d9\u00da\7\17\2\2"+
		"\u00da\u00db\7#\2\2\u00db\u00dc\7\"\2\2\u00dc\u00dd\7#\2\2\u00dd\u00e1"+
		"\7\5\2\2\u00de\u00e0\5\24\13\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2"+
		"\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e1"+
		"\3\2\2\2\u00e4\u00e5\7\6\2\2\u00e5)\3\2\2\2\u00e6\u00ea\5,\27\2\u00e7"+
		"\u00ea\5.\30\2\u00e8\u00ea\5\16\b\2\u00e9\u00e6\3\2\2\2\u00e9\u00e7\3"+
		"\2\2\2\u00e9\u00e8\3\2\2\2\u00ea+\3\2\2\2\u00eb\u00ee\7$\2\2\u00ec\u00ee"+
		"\5\62\32\2\u00ed\u00eb\3\2\2\2\u00ed\u00ec\3\2\2\2\u00ee-\3\2\2\2\u00ef"+
		"\u00f0\b\30\1\2\u00f0\u00f1\7\31\2\2\u00f1\u00f2\5.\30\2\u00f2\u00f3\7"+
		"\32\2\2\u00f3\u00f9\3\2\2\2\u00f4\u00f6\7\24\2\2\u00f5\u00f4\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f9\5\62\32\2\u00f8\u00ef\3"+
		"\2\2\2\u00f8\u00f5\3\2\2\2\u00f9\u0100\3\2\2\2\u00fa\u00fb\f\5\2\2\u00fb"+
		"\u00fc\5\60\31\2\u00fc\u00fd\5.\30\6\u00fd\u00ff\3\2\2\2\u00fe\u00fa\3"+
		"\2\2\2\u00ff\u0102\3\2\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101"+
		"/\3\2\2\2\u0102\u0100\3\2\2\2\u0103\u0104\t\4\2\2\u0104\61\3\2\2\2\u0105"+
		"\u0106\t\5\2\2\u0106\63\3\2\2\2\31:@ESX_fr|\u0085\u008d\u0093\u0098\u00b4"+
		"\u00b9\u00c0\u00c8\u00e1\u00e9\u00ed\u00f5\u00f8\u0100";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}