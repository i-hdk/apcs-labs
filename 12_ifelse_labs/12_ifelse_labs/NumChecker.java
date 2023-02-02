//(c) A+ Computer Science
//www.apluscompsci.com
//Name - 

public class NumChecker
{
    public static int check( int x )
    {
        if(x%5==0) return 1;
        else if(x%4==0) return 2;
        else if(x%3==0) return 3;
        return 4;
    }
}