package Javacomp;// Generated from C:/Users/Marquinhos/IdeaProjects/JavaC/src\LFA_Questao3.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LFA_Questao3Parser}.
 */
public interface LFA_Questao3Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LFA_Questao3Parser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(LFA_Questao3Parser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LFA_Questao3Parser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(LFA_Questao3Parser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LFA_Questao3Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(LFA_Questao3Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LFA_Questao3Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(LFA_Questao3Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LFA_Questao3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(LFA_Questao3Parser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link LFA_Questao3Parser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(LFA_Questao3Parser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link LFA_Questao3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LFA_Questao3Parser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LFA_Questao3Parser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LFA_Questao3Parser.ExpressionContext ctx);
}