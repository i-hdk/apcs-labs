//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;

public class MonsterRunner
{
    public static void main( String args[] )
    {
        Scanner keyboard = new Scanner(System.in);
        
        //ask for name and size
        System.out.print("Enter 1st monster's name :  ");
        String m1 = keyboard.next();
        System.out.print("Enter 1st monster's size :  ");
        int mo1 = keyboard.nextInt();
        //instantiate monster one        
        Monster one = new Monster(m1,mo1);
        //ask for name and size
        System.out.print("Enter 2nd monster's name :  ");
        String m2 = keyboard.next();
        System.out.print("Enter 2nd monster's size :  ");
        int mo2 = keyboard.nextInt();
        //instantiate monster two
        Monster two = new Monster(m2,mo2);
        String a;
        if(one.isBigger(two)) a = "is bigger than";
        else if (one.isSmaller(two)) a = "is smaller than";
        else a = "has the same name as";
        String s = one + "\n" + two + "\n" + "Monster one is " + a + " Monster two.";
        System.out.println(s);
        if(m1.equals(m2)) System.out.print("Monster one has the same name as Monster two.");
    }
}