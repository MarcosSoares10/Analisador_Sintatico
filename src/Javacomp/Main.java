package Javacomp;

/**
 * Created by Marquinhos on 17/02/2017.
 */



import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;


public class Main {

    public static void main(String[] args) {

    try {
        ANTLRInputStream input = new ANTLRInputStream("if(a==0){" +
                "for (int i =0; i<a;i++){System.out.println(1);}} ");
        LFA_Questao3Lexer lexer = new LFA_Questao3Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LFA_Questao3Parser parser = new LFA_Questao3Parser(tokens);
        ParseTree tree = parser.goal();
        EvalVisitor eval = new EvalVisitor();
        eval.visit(tree);
        System.out.println("\n\n"+"Árvore de Derivação:\n======================\n"+tree.toStringTree(parser));
    }catch (Exception e){
        e.printStackTrace();
    }

    }

}
