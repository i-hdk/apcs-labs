//(c) A+ Computer Science
//www.apluscompsci.com
//Name - 

import static java.lang.System.*;

public class CipherRunner
{
   public static void main( String args[] )
   {
       TopLeftDiagonal a = new TopLeftDiagonal();
           // encode and print out a few strings, then decode and verify
           // they match what you started with
           System.out.println("friendly");
           System.out.println(a.encode("friendly"));
           System.out.println(a.decode(a.encode("friendly")));
           System.out.println();
           System.out.println("abc");
           System.out.println(a.encode("abc"));
           System.out.println(a.decode(a.encode("abc")));
           System.out.println();
           System.out.println("dnadoublehelix");
           System.out.println(a.encode("dnadoublehelix"));
           System.out.println(a.decode(a.encode("dnadoublehelix")));
           System.out.println();
           System.out.println("cipherscodesandstrings");
           System.out.println(a.encode("cipherscodesandstrings"));
           System.out.println(a.decode(a.encode("cipherscodesandstrings")));
           System.out.println();
           System.out.println("elvissoundgardenhinderseetherbeatles");
           System.out.println(a.encode("elvissoundgardenhinderseetherbeatles"));
           System.out.println(a.decode(a.encode("elvissoundgardenhinderseetherbeatles")));
   }
}