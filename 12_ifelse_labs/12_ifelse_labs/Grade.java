//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Grade
{
    public static String getLetterGrade( int numGrade )
    {
        String letGrade="";
        char a;
        if(numGrade>=90) a = 'A';
        else if(numGrade>=80) a = 'B';
        else if(numGrade>=75) a = 'C';
        else if(numGrade>=70) a = 'D';
        else a = 'F';
        letGrade = numGrade + " is a " + a;
        return letGrade;
    }
}