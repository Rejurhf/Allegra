package pl.rejurhf;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;
import pl.rejurhf.generated.SomeLexer;
import pl.rejurhf.generated.SomeParser;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
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
        CharStream charStream = new ANTLRInputStream(new FileInputStream("src\\main\\resources\\test.txt"));
        SomeLexer lexer = new SomeLexer(charStream);
        TokenStream tokens = new CommonTokenStream(lexer);
        SomeParser parser = new SomeParser(tokens);
        ParseTree tree = parser.classDeclaration();

        MyVisitor visitor = new MyVisitor();
        String result = visitor.visit(tree).toString();

        saveToFile("src\\main\\java\\pl\\rejurhf\\output\\" + tokens.get(1).getText() + ".java", result);

        System.out.println(tokens.get(1).getText());
        System.out.println(result);
    }

    private static void saveToFile(String path, String body) {
        try {
            File outFile = new File(path);
            if (!outFile.exists()) {
                if (outFile.createNewFile()) {
                    FileOutputStream fout = new FileOutputStream(outFile);
                    fout.write(body.getBytes());
                    fout.close();
                }
            } else {
                FileOutputStream fout = new FileOutputStream(outFile);
                fout.write(body.getBytes());
                fout.close();
            }
        } catch (IOException e){
            System.err.println("Saving to file :" + e.getMessage());
        }
    }
}
