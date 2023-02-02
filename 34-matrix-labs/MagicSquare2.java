//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class MagicSquare2
{
    private int[][] mat;

    //size the matrix and make the magic square pattern
    //write all nested loop code here in the constructor
    public MagicSquare2(int size)
    {
        mat = new int[size][size];
        int a = 1,i=0,j=size/2;
        while(a<=size*size){
            mat[i][j] = a;
            a++;
            int x = (i-1+size)%size;
            int y = (j+1)%size;
            if(mat[x][y]!=0){
                x=(i+1)%size;
                y = j;
            }
            i = x;
            j = y;
        }
    }


    public String toString()
    {
        String output="";
        for(int[] a : mat){
            for(int b : a){
                output+=b + " ";
            }    
            output += "\n";
        }
        return output;
    }
}