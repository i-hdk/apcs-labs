//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class TwoToTen
{
    public static long getBaseTen( String bin )
    {
        long ten=0;
        long a = 0;
        for(int i = bin.length()-1; i>=0; i--){
            char b = bin.charAt(i);
            int c = b-'0';
            ten+= c*(long)Math.pow(2,a);
            a++;
        }
        return ten;
    }
}