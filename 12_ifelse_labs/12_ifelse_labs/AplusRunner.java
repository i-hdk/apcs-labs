//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class AplusRunner
{
    public static void main( String args[] )
    {
        //test cases - client code
        System.out.println( NumChecker.check( 100 ) );
        //add more cases
        System.out.println( NumChecker.check( 25 ) );
        System.out.println( NumChecker.check( 88 ) );
        System.out.println( AB.check( "chicken", "a", "b" ) );
        //add more cases
        System.out.println( AB.check( "frog", "f", "g" ) );
        System.out.println( AB.check( "chicken", "c", "k" ) );
        System.out.println( AB.check( "apluscompsci", "a", "s" ) );
        System.out.println( AB.check( "apluscompsci", "a", "p" ) );
        System.out.println( AB.check( "apluscompsci", "s", "c" ) );
        System.out.println( AB.check( "apluscompsci", "c", "p" ) );
    }
}