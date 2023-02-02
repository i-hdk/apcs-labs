//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
 
public class Triples
{
   private int number;

    public Triples(int num)
    {
        number= num;
    }
    
    private int greatestCommonFactor(int a, int b, int c)
    {
        int x = 1;
        for(int i = 1; i < c; i++) if(a%i==0&&b%i==0&&c%i==0) x = i;
        return x;
    }

    public String toString()
    {
        String output="";
        for(int c = 5; c <= number; c++)
        for(int b = 1; b < c; b++)
        for(int a = 1; a < b; a++)
        if(greatestCommonFactor(a,b,c)==1&&a*a+b*b==c*c&&(a%2!=b%2)){
            output += a + " " + b + ' ' + c + "\n";
        }
        return output+"\n";
    }
}