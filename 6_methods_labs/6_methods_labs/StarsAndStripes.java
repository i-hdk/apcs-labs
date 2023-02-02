//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class StarsAndStripes
{
   public StarsAndStripes()
   {
      out.println("StarsAndStripes");
      printTwoBlankLines();
   }

   public void printTwentyStars()
   {
       for(int i = 0; i < 20; i++){
           out.print('*');
       }
   }

   public void printTwentyDashes()
   {
       for(int i = 0; i < 20; i++){
           out.print('-');
       }
   }

   public void printTwoBlankLines()
   {
       out.print("\n\n");
   }
   
   public void printASmallBox()
   {    
       for(int i = 0; i < 7; i++){
           out.print('*');
       }
       out.println();
       for(int i = 0; i < 5; i++){
           out.println("*     *");
       }
       for(int i = 0; i < 7; i++){
           out.print('*');
       }
   }
 
   public void printABigBox()
   {     
       for(int i = 0; i < 20; i++){
           out.print('*');
       }
       out.println();
       for(int i = 0; i < 18; i++){
           out.print("*");
           for(int j = 0; j < 18; j++){
               out.print(" ");
           }
           out.println("*");
       }
       for(int i = 0; i < 20; i++){
           out.print('*');
       }
   }   
}