//(c) A+ Computer Science
// www.apluscompsci.com
//Name -

public class AB
{
    public static boolean check( String s, String a, String b)
    {
        String c = a+b;
        if(s.indexOf(c)>0&&s.indexOf(c)<(s.length()-2)) return true;
        c = b+a;
        if(s.indexOf(c)>0&&s.indexOf(c)<(s.length()-2)) return true;
        return false;
    }
}