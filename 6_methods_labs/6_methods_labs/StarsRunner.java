//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class StarsRunner
{
   public static void main(String args[])
   {
      //instantiate a StarsAndStripes object
      StarsAndStripes ref = new StarsAndStripes();
      //call the methods needed to make the patterns on the word document
      for(int i = 0; i < 5; i++){
          ref.printTwentyStars();
          System.out.println();
          ref.printTwentyDashes();
          System.out.println();
          ref.printTwoBlankLines();
          ref.printASmallBox();
          System.out.println();
          ref.printABigBox();
      }
   }
}