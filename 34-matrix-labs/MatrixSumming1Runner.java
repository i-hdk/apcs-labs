//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date - 
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class MatrixSumming1Runner
{
    public static void main( String args[] ) throws Exception
    {
        //add code here
        MatrixSumming1 a = new MatrixSumming1();
        System.out.println("The sum of 2,2 is " + a.sum(2,2) + ".");
        System.out.println("The sum of 0,0 is " + a.sum(0,0) + ".");
        System.out.println("The sum of 4,3 is " + a.sum(4,3) + ".");
        System.out.println("The sum of 4,4 is " + a.sum(4,4) + ".");
        System.out.println("The sum of 2,4 is " + a.sum(2,4) + ".");
        System.out.println("The sum of 1,3 is " + a.sum(1,3) + ".");
    }
}



