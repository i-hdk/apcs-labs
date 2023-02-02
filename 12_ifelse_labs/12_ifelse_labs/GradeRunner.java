//(c) A+ Computer Science
// www.apluscompsci.com
//Name -

public class GradeRunner
{
    public static void main( String args[] )
    {
        System.out.println( Grade.getLetterGrade( 99 ) );
        //add test cases
        System.out.println( Grade.getLetterGrade( 0 ) );
        System.out.println( Grade.getLetterGrade( 50 ) );
        System.out.println( Grade.getLetterGrade( 79 ) );
        System.out.println( Grade.getLetterGrade( 88 ) );
    }
}