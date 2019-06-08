// Generated from D:/Documents/Studia/Kompilatory/src/main/java/pl/rejurhf/antlr\Some.g4 by ANTLR 4.7.2
package pl.rejurhf.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SomeParser}.
 */
public interface SomeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SomeParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(SomeParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SomeParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(SomeParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SomeParser#className}.
	 * @param ctx the parse tree
	 */
	void enterClassName(SomeParser.ClassNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SomeParser#className}.
	 * @param ctx the parse tree
	 */
	void exitClassName(SomeParser.ClassNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SomeParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(SomeParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link SomeParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(SomeParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link SomeParser#methodName}.
	 * @param ctx the parse tree
	 */
	void enterMethodName(SomeParser.MethodNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SomeParser#methodName}.
	 * @param ctx the parse tree
	 */
	void exitMethodName(SomeParser.MethodNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SomeParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(SomeParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SomeParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(SomeParser.InstructionContext ctx);
}