//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class SpiralMatrixRunner
{
    public static void main( String args[] ) throws IOException
    {
        System.out.println(new SpiralMatrix(5));
        System.out.println(new SpiralMatrix(8));
        System.out.println(new SpiralMatrix(7));
        System.out.println(new SpiralMatrix(3));
        System.out.println(new SpiralMatrix(2));
        System.out.println(new SpiralMatrix(1));
    }
}