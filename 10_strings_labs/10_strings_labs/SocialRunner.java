//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class SocialRunner
{
    public static void main( String args[] )
    {
        //add test cases
        String ssn = "1-1-1 ";
        Social test = new Social (ssn);
        System.out.print("SS# " + ssn + " has a total of " + test.sum());    
    }
}