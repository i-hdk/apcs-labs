//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class StringFirstLetterCheck
{
    public static String checkFirstLetter( String wordOne, String wordTwo )
    {
        String s;
        if(wordOne.substring(0,1).equals(wordTwo.substring(0,1))){
            s = wordOne + " has the same first letter as " + wordTwo;
        }
        else s = wordOne + " does not have the same first letter as " + wordTwo;
        return s;
    }
}