// Generated from ipsumUN.g4 by ANTLR 4.7
package classes;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ipsumUNParser}.
 */
public interface ipsumUNListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ipsumUNParser#principal}.
	 * @param ctx the parse tree
	 */
	void enterPrincipal(ipsumUNParser.PrincipalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ipsumUNParser#principal}.
	 * @param ctx the parse tree
	 */
	void exitPrincipal(ipsumUNParser.PrincipalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ipsumUNParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterCommands(ipsumUNParser.CommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ipsumUNParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitCommands(ipsumUNParser.CommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ipsumUNParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(ipsumUNParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link ipsumUNParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(ipsumUNParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link ipsumUNParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(ipsumUNParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link ipsumUNParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(ipsumUNParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link ipsumUNParser#repeat}.
	 * @param ctx the parse tree
	 */
	void enterRepeat(ipsumUNParser.RepeatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ipsumUNParser#repeat}.
	 * @param ctx the parse tree
	 */
	void exitRepeat(ipsumUNParser.RepeatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ipsumUNParser#printexpr}.
	 * @param ctx the parse tree
	 */
	void enterPrintexpr(ipsumUNParser.PrintexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ipsumUNParser#printexpr}.
	 * @param ctx the parse tree
	 */
	void exitPrintexpr(ipsumUNParser.PrintexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ipsumUNParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ipsumUNParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ipsumUNParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ipsumUNParser.ExprContext ctx);
}