//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;

public class DecoderRunner
{
    public static void main( String args[] )
    {
        //add test cases
        Scanner keyboard = new Scanner(System.in);
        String a = keyboard.next();
        System.out.print(Decoder.deCode(a));
    }
}