//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class CountOdds
{
   public static int go( int number )
    {
        int count = 0;
        do{
            if((number%10)%2==1) count++;
            number/=10;
        } while(number>0);
        return count;
    }
}