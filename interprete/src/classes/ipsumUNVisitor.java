// Generated from ipsumUN.g4 by ANTLR 4.7
package classes;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ipsumUNParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ipsumUNVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ipsumUNParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommands(ipsumUNParser.CommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ipsumUNParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(ipsumUNParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link ipsumUNParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(ipsumUNParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link ipsumUNParser#repeat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat(ipsumUNParser.RepeatContext ctx);
	/**
	 * Visit a parse tree produced by {@link ipsumUNParser#printexpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintexpr(ipsumUNParser.PrintexprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ipsumUNParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(ipsumUNParser.ExprContext ctx);
}