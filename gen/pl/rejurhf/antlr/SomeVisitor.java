// Generated from D:/Documents/Studia/Kompilatory/src/main/java/pl/rejurhf/antlr\Some.g4 by ANTLR 4.7.2
package pl.rejurhf.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SomeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SomeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SomeParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(SomeParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SomeParser#className}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassName(SomeParser.ClassNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SomeParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(SomeParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link SomeParser#methodName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodName(SomeParser.MethodNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SomeParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(SomeParser.InstructionContext ctx);
}