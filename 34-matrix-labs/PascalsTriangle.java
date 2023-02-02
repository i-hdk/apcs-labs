//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class PascalsTriangle
{
    private int[][] mat;

    public PascalsTriangle()
    {
        mat = new int[0][0];
    }

    public PascalsTriangle(int size)
    {
        mat = new int[size][size];
        createTriangle();
    }

    public void createTriangle()
    {
        for(int i = 0; i < mat.length; i++) mat[i][0] = 1;
        for(int i = 1; i < mat.length; i++){
            for(int j = 0; j < i-1; j++) mat[i][j+1] = mat[i-1][j] + mat[i-1][j+1];
            mat[i][i] = 1;
        }

    }

    public String toString()
    {
        String output="";
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < i+1; j++){
                output+=mat[i][j] + " ";
            }
            output+="\n";
        }






        return output;
    }
}