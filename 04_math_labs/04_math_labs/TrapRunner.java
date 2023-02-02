//(c) A+ Computer Science
//www.apluscompsci.com

import java.util.*;

public class TrapRunner
{
    public static void main( String[] args )
    {
        Scanner kb = new Scanner( System.in );
        System.out.print( "Enter the base1 :: " );
        double base1 = kb.nextDouble();
        System.out.print( "Enter the base2 :: " );        
        double base2 = kb.nextDouble();
        System.out.print( "Enter the heigth :: " );        
        double height = kb.nextDouble();
        
        //print out the answer here
        double area = ((double)(base1)+base2)/2*height;
        System.out.print(area);
    }
}

/*
 

Sample Data: 
3 3 3
5 6 7
7 10 6
13 9 3
6 11 4
11 8 5


Sample Output : 
9.0
38.5
51.0
33.0
34.0
47.5




*/
