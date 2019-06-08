// Generated from D:/Documents/Studia/Kompilatory/src/main/java/pl/rejurhf/antlr\Some.g4 by ANTLR 4.7.2
package pl.rejurhf.generated;
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
	 * Visit a parse tree produced by {@link SomeParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(SomeParser.DeclarationContext ctx);
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
	 * Visit a parse tree produced by {@link SomeParser#arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments(SomeParser.ArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SomeParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(SomeParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SomeParser#callArguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallArguments(SomeParser.CallArgumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SomeParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(SomeParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link SomeParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(SomeParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link SomeParser#subLine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubLine(SomeParser.SubLineContext ctx);
	/**
	 * Visit a parse tree produced by {@link SomeParser#printf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintf(SomeParser.PrintfContext ctx);
	/**
	 * Visit a parse tree produced by {@link SomeParser#assigment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssigment(SomeParser.AssigmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SomeParser#ifDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfDefinition(SomeParser.IfDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SomeParser#ifBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBody(SomeParser.IfBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SomeParser#conditions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditions(SomeParser.ConditionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SomeParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(SomeParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SomeParser#logicOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicOperator(SomeParser.LogicOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SomeParser#relationOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelationOperator(SomeParser.RelationOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SomeParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(SomeParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SomeParser#subValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubValue(SomeParser.SubValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SomeParser#mathOperation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathOperation(SomeParser.MathOperationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SomeParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(SomeParser.OperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SomeParser#subMathValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubMathValue(SomeParser.SubMathValueContext ctx);
}