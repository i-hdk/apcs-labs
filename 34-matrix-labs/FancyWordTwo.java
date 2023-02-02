//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import static java.lang.System.*;

public class FancyWordTwo
{
    private String[][] mat;

   public FancyWordTwo(String s)
    {
        //size the matrix
        mat = new String[s.length()][s.length()];
        //use Arrays.fill() to fill in the matrix with spaces
        for(int i = 0; i < mat.length; i++){
            Arrays.fill(mat[i]," ");
        }
        //use a for loop to load in the letters into the matrix
        for(int i = 0; i < s.length(); i++){
            mat[0][i] = s.substring(i,i+1);
            mat[i][0] = s.substring(i,i+1);
            mat[s.length()-1][i] = s.substring(s.length()-i-1,s.length()-i);
            mat[s.length()-i-1][s.length()-1] = s.substring(i,i+1);
        }
    }

    public String toString()
    {
        String output="";
        for(String a[] : mat){
            for(String b : a){
                output+=b;
            }
            output+="\n";
        }
        return output+"\n\n";
    }
}