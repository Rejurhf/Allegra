package pl.rejurhf;

import pl.rejurhf.generated.SomeBaseVisitor;
import pl.rejurhf.generated.SomeParser;

import java.util.HashMap;
import java.util.Map;

public class MyVisitor extends SomeBaseVisitor {
    private final Map<String, String> mappings;

    public MyVisitor() {
        this.mappings = new HashMap<String, String>();
        mappings.put("String", "String");
        mappings.put("Integer", "int");
    }

    @Override
    protected Object defaultResult() {
        return "Default";
    }

    @Override
    protected Object aggregateResult(Object aggregate, Object nextResult) {
        System.out.println(aggregate.toString());
        return aggregate.toString() + nextResult.toString();
    }

    @Override
    public Object visitClassDeclaration(SomeParser.ClassDeclarationContext ctx) {
        // class header
        StringBuilder sb = new StringBuilder("public class ");
        sb.append(visit(ctx.className()));
        sb.append("{\n");

        // class declarations
        for (SomeParser.DeclarationContext declarationContext : ctx.declaration()) {
            sb.append("\t");
            sb.append(visit(declarationContext));
        }

        // main method
        if(ctx.main() != null){
            sb.append("\n\t");
            sb.append(visit(ctx.main()));
        }

        //class methods
        for (SomeParser.MethodContext methodContext : ctx.method()){
            sb.append("\n\t");
            sb.append(visit(methodContext));
        }

        sb.append("}\n");

        return sb.toString();
    }

    // class header -----------------------------------------------------------------------------------
    @Override
    public Object visitClassName(SomeParser.ClassNameContext ctx) {
        return ctx.NAME().getText();
    }

    // class declarations -----------------------------------------------------------------------------
    @Override
    public Object visitDeclaration(SomeParser.DeclarationContext ctx) {
        StringBuilder sb = new StringBuilder("public static ");
        sb.append(mappings.get(ctx.TYPE().getText()));
        sb.append(" ");
        sb.append(ctx.NAME());
        sb.append(ctx.SEMI());
        sb.append("\n");

        return sb.toString();
    }

    // class main --------------------------------------------------------------------------------------
    @Override
    public Object visitMain(SomeParser.MainContext ctx) {
        StringBuilder sb = new StringBuilder("public static void main(String[] args){\n");
        for (SomeParser.LineContext lineContext : ctx.line()){
            sb.append("\t");
            sb.append(visit(lineContext));
        }
        sb.append("\t}\n");

        return sb.toString();
    }

    // class methods -----------------------------------------------------------------------------------
    @Override
    public Object visitMethod(SomeParser.MethodContext ctx) {
        StringBuilder sb = new StringBuilder("public static ");
        if(ctx.TYPE() != null)
            sb.append(mappings.get(ctx.TYPE().getText()));
        else
            sb.append("void");
        sb.append(" ");
        sb.append(visit(ctx.methodName()));
        sb.append("(");

        // get method arguments
        if(ctx.arguments() != null){
            sb.append(visit(ctx.arguments()));
        }
        sb.append("){\n");

        //method content
        for (SomeParser.LineContext lineContext : ctx.line()){
            sb.append("\t");
            sb.append(visit(lineContext));
        }

        if(ctx.value() != null){
            sb.append("\t\treturn ");
            sb.append(visit(ctx.value()));
            sb.append(";\n");
        }
        sb.append("\t}\n");

        return sb.toString();
    }

    @Override
    public Object visitMethodName(SomeParser.MethodNameContext ctx) {
        return ctx.NAME().getText();
    }

    @Override
    public Object visitArguments(SomeParser.ArgumentsContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.COMMA().size(); ++i){
            sb.append(mappings.get(ctx.TYPE(i).getText()));
            sb.append(" ");
            sb.append(ctx.NAME(i));
            sb.append(", ");
        }

        int indexOfLastElem = ctx.TYPE().size()-1;
        sb.append(mappings.get(ctx.TYPE(indexOfLastElem).getText()));
        sb.append(" ");
        sb.append(ctx.NAME(indexOfLastElem));

        return sb.toString();
    }

    @Override
    public Object visitMethodCall(SomeParser.MethodCallContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append(ctx.NAME());
        sb.append("(");
        if(ctx.callArguments() != null)
            sb.append(visit(ctx.callArguments()));
        sb.append(")");

        return sb.toString();
    }

    @Override
    public Object visitCallArguments(SomeParser.CallArgumentsContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ctx.COMMA().size(); ++i){
            sb.append(visit(ctx.value(i)));
            sb.append(", ");
        }

        int indexOfLastElem = ctx.value().size()-1;
        sb.append(visit(ctx.value(indexOfLastElem)));

        return sb.toString();
    }

    // Line ----------------------------------------------------------------------------------------------
    @Override
    public Object visitLine(SomeParser.LineContext ctx) {
        StringBuilder sb = new StringBuilder();
        sb.append("\t");
        if(ctx.ifDefinition() != null){
            sb.append(visit(ctx.ifDefinition()));
        }else if(ctx.subLine() != null){
            sb.append(visit(ctx.subLine()));
        }
        sb.append("\n");

        return sb.toString();
    }

    @Override
    public Object visitSubLine(SomeParser.SubLineContext ctx) {
        StringBuilder sb = new StringBuilder();
        if(ctx.printf() != null){
            sb.append(visit(ctx.printf()));

        }else if(ctx.assigment() != null){
            sb.append(visit(ctx.assigment()));

        }else if(ctx.methodCall() != null){
            sb.append(visit(ctx.methodCall()));
        }
        sb.append(";");

        return sb.toString();
    }

    @Override
    public Object visitPrintf(SomeParser.PrintfContext ctx) {
        return "System.out.println(" + visit(ctx.value()) + ")";
    }

    @Override
    public Object visitAssigment(SomeParser.AssigmentContext ctx) {
        return ctx.NAME() + " = " + visit(ctx.value());
    }

    // If definition ---------------------------------------------------------------------------------------
    @Override
    public Object visitIfDefinition(SomeParser.IfDefinitionContext ctx) {
        StringBuilder sb = new StringBuilder("if(");

        // if conditions
        sb.append(visit(ctx.conditions(0)));
        sb.append("){\n");

        // if content
        sb.append(visit(ctx.ifBody(0)));

        // elsif
        for (int i = 1; i < ctx.conditions().size(); ++i){
            sb.append("\t\t}else if(");
            sb.append(visit(ctx.conditions(i)));
            sb.append("){\n");
            sb.append(visit(ctx.ifBody(i)));
        }

        // else
        if(ctx.ELSE() != null){
            sb.append("\t\t}else{\n");
            sb.append(visit(ctx.ifBody(ctx.ifBody().size() - 1)));
        }

        sb.append("\t\t}\n");

        return sb.toString();
    }

    @Override
    public Object visitIfBody(SomeParser.IfBodyContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (SomeParser.LineContext lineContext : ctx.line()){
            sb.append("\t\t");
            sb.append(visit(lineContext));
        }

        return sb.toString();
    }

    @Override
    public Object visitConditions(SomeParser.ConditionsContext ctx) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < ctx.logicOperator().size(); ++i){
            sb.append(visit(ctx.condition(i)));
            sb.append(" ");
            sb.append(visit(ctx.logicOperator(i)));
            sb.append(" ");
        }

        int indexOfLastCondition = ctx.condition().size() - 1;
        sb.append(visit(ctx.condition(indexOfLastCondition)));

        return sb.toString();
    }

    @Override
    public Object visitCondition(SomeParser.ConditionContext ctx) {
        return visit(ctx.subMathValue(0)).toString() + visit(ctx.relationOperator()) + visit(ctx.subMathValue(1));
    }

    @Override
    public Object visitLogicOperator(SomeParser.LogicOperatorContext ctx) {
        if(ctx.AND() != null)
            return "&&";
        else
            return "||";
    }

    @Override
    public Object visitRelationOperator(SomeParser.RelationOperatorContext ctx) {
        if(ctx.EQUAL() != null)
            return "==";
        else if(ctx.GREATER_EQUAL() != null)
            return ">=";
        else if(ctx.GREATER() != null)
            return ">";
        else if(ctx.LESSER() != null)
            return "<";
        else
            return "<=";
    }

    // Value -----------------------------------------------------------------------------------------------
    @Override
    public Object visitValue(SomeParser.ValueContext ctx) {
        StringBuilder sb = new StringBuilder();
        if(ctx.subValue() != null){
            sb.append(visit(ctx.subValue()));

        }else if(ctx.mathOperation() != null){
            sb.append(visit(ctx.mathOperation()));

        }else if(ctx.methodCall() != null){
            sb.append(visit(ctx.methodCall()));
        }

        return sb.toString();
    }

    @Override
    public Object visitSubValue(SomeParser.SubValueContext ctx) {
        if(ctx.STRING_VALUE() != null)
            return ctx.STRING_VALUE().getText();
        else if(ctx.subMathValue() != null)
            return visit(ctx.subMathValue());

        return "";
    }

    // Math operation ----------------------------------------------------------------------------------------
    @Override
    public Object visitMathOperation(SomeParser.MathOperationContext ctx) {
        StringBuilder sb = new StringBuilder();
        if(ctx.operator() != null){
            sb.append(visit(ctx.mathOperation(0)));
            sb.append(" ");
            sb.append(visit(ctx.operator()));
            sb.append(" ");
            sb.append(visit(ctx.mathOperation(1)));

        }else if(ctx.mathOperation(0) != null){
            sb.append("(");
            sb.append(visit(ctx.mathOperation(0)));
            sb.append(")");

        }else if(ctx.subMathValue() != null){
            if(ctx.MINUS() != null)
                sb.append("-");
            sb.append(visit(ctx.subMathValue()));
        }

        return sb.toString();
    }

    @Override
    public Object visitOperator(SomeParser.OperatorContext ctx) {
        if(ctx.PLUS() != null)
            return "+";
        else if(ctx.MINUS() != null)
            return "-";
        else if(ctx.MUL() != null)
            return "*";
        else
            return "/";
    }

    @Override
    public Object visitSubMathValue(SomeParser.SubMathValueContext ctx) {
        if(ctx.NAME() != null)
            return ctx.NAME().getText();
        else if(ctx.INTEGER_VALUE() != null)
            return ctx.INTEGER_VALUE().getText();

        return "";
    }
}
