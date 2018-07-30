// Generated from C:/Users/Marquinhos/IdeaProjects/JavaC/src\LFA_Questao3.g4 by ANTLR 4.6
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LFA_Questao3Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, Identificador=16, 
		Operador_Booleano=17, Operador_relacional=18, Operador_atribuicao=19, 
		Operador_matematico=20, Inteiro_literal=21, Numero_decimal=22, Espaco_branco=23, 
		Comentar_variaslinhas=24, Comentarumalinha=25;
	public static final int
		RULE_goal = 0, RULE_type = 1, RULE_statement = 2, RULE_expression = 3;
	public static final String[] ruleNames = {
		"goal", "type", "statement", "expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'int'", "'['", "']'", "'boolean'", "'{'", "'}'", "'if'", "'('", 
		"')'", "'else'", "'for'", "'='", "';'", "'System.out.println'", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, "Identificador", "Operador_Booleano", "Operador_relacional", 
		"Operador_atribuicao", "Operador_matematico", "Inteiro_literal", "Numero_decimal", 
		"Espaco_branco", "Comentar_variaslinhas", "Comentarumalinha"
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
	public String getGrammarFileName() { return "LFA_Questao3.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LFA_Questao3Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GoalContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LFA_Questao3Parser.EOF, 0); }
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LFA_Questao3Listener ) ((LFA_Questao3Listener)listener).enterGoal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LFA_Questao3Listener ) ((LFA_Questao3Listener)listener).exitGoal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LFA_Questao3Visitor ) return ((LFA_Questao3Visitor<? extends T>)visitor).visitGoal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_goal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			statement();
			setState(9);
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

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode Identificador() { return getToken(LFA_Questao3Parser.Identificador, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LFA_Questao3Listener ) ((LFA_Questao3Listener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LFA_Questao3Listener ) ((LFA_Questao3Listener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LFA_Questao3Visitor ) return ((LFA_Questao3Visitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_type);
		try {
			setState(17);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(11);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(12);
				match(T__0);
				setState(13);
				match(T__1);
				setState(14);
				match(T__2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(15);
				match(T__3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(16);
				match(Identificador);
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

	public static class StatementContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode Identificador() { return getToken(LFA_Questao3Parser.Identificador, 0); }
		public TerminalNode Operador_atribuicao() { return getToken(LFA_Questao3Parser.Operador_atribuicao, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LFA_Questao3Listener ) ((LFA_Questao3Listener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LFA_Questao3Listener ) ((LFA_Questao3Listener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LFA_Questao3Visitor ) return ((LFA_Questao3Visitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				match(T__4);
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__4) | (1L << T__6) | (1L << T__10) | (1L << T__13) | (1L << Identificador))) != 0)) {
					{
					{
					setState(20);
					statement();
					}
					}
					setState(25);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(26);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				match(T__6);
				setState(28);
				match(T__7);
				setState(29);
				expression(0);
				setState(30);
				match(T__8);
				setState(31);
				statement();
				setState(33);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(32);
					match(T__9);
					}
					break;
				}
				setState(36);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(35);
					statement();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(38);
				match(T__10);
				setState(39);
				match(T__7);
				setState(40);
				type();
				setState(41);
				match(Identificador);
				setState(42);
				match(T__11);
				setState(43);
				expression(0);
				setState(44);
				match(T__12);
				setState(45);
				expression(0);
				setState(46);
				match(T__12);
				setState(47);
				expression(0);
				setState(48);
				match(Operador_atribuicao);
				setState(49);
				match(T__8);
				setState(50);
				statement();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				match(T__13);
				setState(53);
				match(T__7);
				setState(54);
				expression(0);
				setState(55);
				match(T__8);
				setState(56);
				match(T__12);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(58);
				match(Identificador);
				setState(59);
				match(T__11);
				setState(60);
				expression(0);
				setState(61);
				match(T__12);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(63);
				match(Identificador);
				setState(64);
				match(T__1);
				setState(65);
				expression(0);
				setState(66);
				match(T__2);
				setState(67);
				match(T__11);
				setState(68);
				expression(0);
				setState(69);
				match(T__12);
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Inteiro_literal() { return getToken(LFA_Questao3Parser.Inteiro_literal, 0); }
		public TerminalNode Numero_decimal() { return getToken(LFA_Questao3Parser.Numero_decimal, 0); }
		public TerminalNode Operador_Booleano() { return getToken(LFA_Questao3Parser.Operador_Booleano, 0); }
		public TerminalNode Operador_atribuicao() { return getToken(LFA_Questao3Parser.Operador_atribuicao, 0); }
		public TerminalNode Operador_matematico() { return getToken(LFA_Questao3Parser.Operador_matematico, 0); }
		public TerminalNode Identificador() { return getToken(LFA_Questao3Parser.Identificador, 0); }
		public TerminalNode Operador_relacional() { return getToken(LFA_Questao3Parser.Operador_relacional, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LFA_Questao3Listener ) ((LFA_Questao3Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LFA_Questao3Listener ) ((LFA_Questao3Listener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LFA_Questao3Visitor ) return ((LFA_Questao3Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__14:
				{
				setState(74);
				match(T__14);
				setState(75);
				expression(8);
				}
				break;
			case T__7:
				{
				setState(76);
				match(T__7);
				setState(77);
				expression(0);
				setState(78);
				match(T__8);
				}
				break;
			case Inteiro_literal:
				{
				setState(80);
				match(Inteiro_literal);
				}
				break;
			case Numero_decimal:
				{
				setState(81);
				match(Numero_decimal);
				}
				break;
			case Operador_Booleano:
				{
				setState(82);
				match(Operador_Booleano);
				}
				break;
			case Operador_atribuicao:
				{
				setState(83);
				match(Operador_atribuicao);
				}
				break;
			case Operador_matematico:
				{
				setState(84);
				match(Operador_matematico);
				}
				break;
			case Identificador:
				{
				setState(85);
				match(Identificador);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(101);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(99);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(88);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(89);
						match(Operador_relacional);
						setState(90);
						expression(11);
						}
						break;
					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(91);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(92);
						match(Operador_matematico);
						setState(93);
						expression(10);
						}
						break;
					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(94);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(95);
						match(T__1);
						setState(96);
						expression(0);
						setState(97);
						match(T__2);
						}
						break;
					}
					} 
				}
				setState(103);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
		case 3:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 11);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\33k\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\5\3\24\n\3\3\4"+
		"\3\4\7\4\30\n\4\f\4\16\4\33\13\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4$\n\4"+
		"\3\4\5\4\'\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4J\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5"+
		"\5Y\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5f\n\5\f\5\16\5"+
		"i\13\5\3\5\2\3\b\6\2\4\6\b\2\2{\2\n\3\2\2\2\4\23\3\2\2\2\6I\3\2\2\2\b"+
		"X\3\2\2\2\n\13\5\6\4\2\13\f\7\2\2\3\f\3\3\2\2\2\r\24\7\3\2\2\16\17\7\3"+
		"\2\2\17\20\7\4\2\2\20\24\7\5\2\2\21\24\7\6\2\2\22\24\7\22\2\2\23\r\3\2"+
		"\2\2\23\16\3\2\2\2\23\21\3\2\2\2\23\22\3\2\2\2\24\5\3\2\2\2\25\31\7\7"+
		"\2\2\26\30\5\6\4\2\27\26\3\2\2\2\30\33\3\2\2\2\31\27\3\2\2\2\31\32\3\2"+
		"\2\2\32\34\3\2\2\2\33\31\3\2\2\2\34J\7\b\2\2\35\36\7\t\2\2\36\37\7\n\2"+
		"\2\37 \5\b\5\2 !\7\13\2\2!#\5\6\4\2\"$\7\f\2\2#\"\3\2\2\2#$\3\2\2\2$&"+
		"\3\2\2\2%\'\5\6\4\2&%\3\2\2\2&\'\3\2\2\2\'J\3\2\2\2()\7\r\2\2)*\7\n\2"+
		"\2*+\5\4\3\2+,\7\22\2\2,-\7\16\2\2-.\5\b\5\2./\7\17\2\2/\60\5\b\5\2\60"+
		"\61\7\17\2\2\61\62\5\b\5\2\62\63\7\25\2\2\63\64\7\13\2\2\64\65\5\6\4\2"+
		"\65J\3\2\2\2\66\67\7\20\2\2\678\7\n\2\289\5\b\5\29:\7\13\2\2:;\7\17\2"+
		"\2;J\3\2\2\2<=\7\22\2\2=>\7\16\2\2>?\5\b\5\2?@\7\17\2\2@J\3\2\2\2AB\7"+
		"\22\2\2BC\7\4\2\2CD\5\b\5\2DE\7\5\2\2EF\7\16\2\2FG\5\b\5\2GH\7\17\2\2"+
		"HJ\3\2\2\2I\25\3\2\2\2I\35\3\2\2\2I(\3\2\2\2I\66\3\2\2\2I<\3\2\2\2IA\3"+
		"\2\2\2J\7\3\2\2\2KL\b\5\1\2LM\7\21\2\2MY\5\b\5\nNO\7\n\2\2OP\5\b\5\2P"+
		"Q\7\13\2\2QY\3\2\2\2RY\7\27\2\2SY\7\30\2\2TY\7\23\2\2UY\7\25\2\2VY\7\26"+
		"\2\2WY\7\22\2\2XK\3\2\2\2XN\3\2\2\2XR\3\2\2\2XS\3\2\2\2XT\3\2\2\2XU\3"+
		"\2\2\2XV\3\2\2\2XW\3\2\2\2Yg\3\2\2\2Z[\f\f\2\2[\\\7\24\2\2\\f\5\b\5\r"+
		"]^\f\13\2\2^_\7\26\2\2_f\5\b\5\f`a\f\r\2\2ab\7\4\2\2bc\5\b\5\2cd\7\5\2"+
		"\2df\3\2\2\2eZ\3\2\2\2e]\3\2\2\2e`\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2"+
		"\2h\t\3\2\2\2ig\3\2\2\2\n\23\31#&IXeg";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}