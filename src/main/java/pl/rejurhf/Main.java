package pl.rejurhf;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import pl.rejurhf.generated.SomeLexer;
import pl.rejurhf.generated.SomeParser;

public class Main {
    public static void main(String[] args){
        String code = "class SomeClass is\n" +
                "String str;\n" +
                "Integer num;\n" +
                "function funkcja1() return String is begin\n" +
                "if(4 > 5) begin\n" +
                "printf(\"iftest\");\n" +
                "else\n" +
                "printf(4);\n" +
                "end\n" +
                "return \"zwroc\";" +
                "end\n" +
                "function funkcja2(String : str, Integer : num) is begin\n" +
                "printf(\"Test\");\n" +
                "printf(\"Test2\");\n" +
                "end\n" +
                "function funkcja3(Integer : num) return Integer is begin\n" +
                "num := 4 + 5;\n" +
                "num := num / 2;\n" +
                "return num;" +
                "end\n" +
                "begin\n" +
                "printf(\"Test\");\n" +
                "printf(\"Test2\");\n" +
                "str := \"cos\";\n" +
                "funkcja1();\n" +
                "funkcja2(\"string\", 4);\n" +
                "funkcja3(8);\n" +
                "end";
        CharStream charStream = new ANTLRInputStream(code);
        SomeLexer lexer = new SomeLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        SomeParser parser = new SomeParser(tokens);
        ParseTree tree = parser.classDeclaration();

        MyVisitor visitor = new MyVisitor();
        String result = visitor.visit(tree).toString();

        System.out.println(result);
    }
}
