package Javacomp;

/**
 * Created by Marquinhos on 17/02/2017.
 */
import java.util.*;

public class EvalVisitor extends LFA_Questao3BaseVisitor<Integer> {
    /** "memory" for our MiniJavaulator; variable/value pairs go here */


    String FinalMessage = "";

    int VisitCount = 0;
    /** Goal */
    @Override
    public Integer visitGoal(LFA_Questao3Parser.GoalContext ctx) {
        VisitCount += 1;
        //System.out.println("This is the "+this.VisitCount+" visit to the AST.");
        return visitChildren(ctx);
    }



    /** Type */
    @Override
    public Integer visitType(LFA_Questao3Parser.TypeContext ctx) {
        return visitChildren(ctx);
    }

    /** Statement */
    @Override
    public Integer visitStatement(LFA_Questao3Parser.StatementContext ctx) {
        return visitChildren(ctx);
    }

}




