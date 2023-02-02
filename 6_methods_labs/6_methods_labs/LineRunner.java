//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class LineRunner
{
   public static void main( String[] args )
   {
        System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 1,9,14,2 ) );
        //add more test cases      
        System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 1,9,14,32 ) );
        System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 18,9,14,2 ) );
        System.out.printf( "Slope is :: %.2f\n" , Line.getSlope( 1,922,14,2 ) );


    }
}