//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class LeaveOut
{
    //pre : a.length() > 1
    //post : string returned minus character at i
   public static String out( String a, int i)
    {
        String b;
        if(i!=a.length()-1) b = a.substring(0,i) + a.substring(i+1);
        else b = a.substring(0,i);
        return b;
    }
}