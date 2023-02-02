//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Decoder
{
    public static String deCode( String s )
    {
        String result="";
        char a = s.charAt(0);
        result+=a;
        if(a>=97&&a<=97+25) a = Character.toUpperCase(a);
        else if(a>=65&&a<=65+25) a = Character.toLowerCase(a);
        else if(a>=48&&a<=48+9) a+=17;
        else a = '#';
        result += " decodes to " + a;
        return result;
    }
}