/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
public class StringExplorer
{

    public static void main(String[] args)
    {
        String sample = "The quick brown fox jumped over the lazy dog.";
        
        //  Demonstrate the indexOf method.
        int position = sample.indexOf("quick");
        System.out.println ("sample.indexOf(\"quick\") = " + position);
        
        //  Demonstrate the toLowerCase method.
        String lowerCase = sample.toLowerCase();
        System.out.println ("sample.toLowerCase() = " + lowerCase);
        System.out.println ("After toLowerCase(), sample = " + sample);
        
        //  Try other methods here:
        int pos = sample.indexOf("slow");
        if(pos != -1)
           System.out.println("slow is found at position " + pos);
        else
           System.out.println("slow is not found");
        String s = "Computer Science is the best, the greatest, and the most wonderful subject to study!";
        int lastindex=-1;
        do{
            lastindex = s.indexOf("the",lastindex+1);
            if(lastindex!=-1) System.out.println(lastindex);
        }
        while(lastindex!=-1&&lastindex<s.length());
    }

}
