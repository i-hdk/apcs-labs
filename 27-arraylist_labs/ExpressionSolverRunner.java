//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class ExpressionSolverRunner
{
    public static void main( String args[] )
    {
        Scanner a = new Scanner(System.in);
        while(true){
        String b = a.nextLine();
        //String b = "3 + 5";
        ExpressionSolver c = new ExpressionSolver(b);
        System.out.println(c);}
    }
}