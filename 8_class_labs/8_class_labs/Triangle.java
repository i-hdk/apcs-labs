//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.Scanner;
import java.lang.Math.*; 

public class Triangle
{
    private int sideA, sideB, sideC;
    private double perimeter;

    public Triangle(int a, int b, int c)
    {
        sideA = a;
        sideB = b;
        sideC = c;
    }

    public void calcPerimeter( )
    {
        perimeter = sideA + sideB + sideC;
    }

    public double getArea( )
    {
        return Math.sqrt((perimeter/2)*(perimeter/2-sideA)*(perimeter/2-sideB)*(perimeter/2-sideC));
    }
}