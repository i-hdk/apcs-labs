//(c) A+ Computer Science
//www.apluscompsci.com
//Name

public class Prime
{
    public static boolean isPrime( int num )
    {
        for(int i = 2; i<= (int)(Math.sqrt(num)); i++){
            if(num%i==0) return false; 
        }
        return true;
    }
    public static String a(int num){
        if(isPrime(num)) return " is prime.";
        else return " is not prime.";
    }
}