//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class DigitCounter
{
   public static int go( int number )
    {
        int count = 0;
        do{
            count++;
            number/=10;
        }
        while(number>0);
        return count;
    }
}