package Javacomp;// Generated from C:/Users/Marquinhos/IdeaProjects/JavaC/src\LFA_Questao3.g4 by ANTLR 4.6
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LFA_Questao3Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LFA_Questao3Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LFA_Questao3Parser#goal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoal(LFA_Questao3Parser.GoalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LFA_Questao3Parser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(LFA_Questao3Parser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link LFA_Questao3Parser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(LFA_Questao3Parser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link LFA_Questao3Parser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(LFA_Questao3Parser.ExpressionContext ctx);
}