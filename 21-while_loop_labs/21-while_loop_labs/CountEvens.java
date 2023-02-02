//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class CountEvens
{
   public static int go( int number )
    {
        int count = 0;
        do{
            if((number%10)%2==0) count++;
            number/=10;
        } while(number>0);
        return count;
    }
}