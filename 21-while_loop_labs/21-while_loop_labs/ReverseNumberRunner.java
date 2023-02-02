//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class ReverseNumberRunner
{
    public static void main( String args[] )
    {
        int[] cases = {234, 10000, 111, 9005, 84645, 8547, 123456789};
        //add test cases 
        for(int val : cases)
        System.out.println(ReverseNumber.getReverse(val));
    }
}