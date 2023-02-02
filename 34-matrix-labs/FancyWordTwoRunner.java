//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class FancyWordTwoRunner
{
    public static void main( String args[] ) throws IOException
    {
        System.out.println(new FancyWordTwo("HELLO"));
        System.out.println(new FancyWordTwo("CAT"));
        System.out.println(new FancyWordTwo("A"));
        System.out.println(new FancyWordTwo("DOGHOUSE"));
        System.out.println(new FancyWordTwo("ONE"));
        System.out.println(new FancyWordTwo("IT"));
    }
}