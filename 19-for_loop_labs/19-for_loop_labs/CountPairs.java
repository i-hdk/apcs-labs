//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class CountPairs
{
    public static int pairCounter( String str )
    { 
        int count = 0;
        String before = str.substring(0,1);
        for(int i = 1; i < str.length();i++){
            if(str.substring(i,i+1).equals(before)) count++;
            before = str.substring(i,i+1);
        }
        return count;
    }
}