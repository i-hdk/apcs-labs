//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;

public class StringRunner
{
    public static void main ( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter a word :: ");
        String word = keyboard.next();
        
        // add test cases for your code here
        StringStuff s = new StringStuff(word);
        System.out.println("has first last letters :: " + s.firstlast());
        System.out.println("has middle letter :: " + s.m());
        System.out.println("has same first and last letter :: " + s.same());
    }
}