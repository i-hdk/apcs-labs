import java.util.*;
import java.io.*; 

public class MatrixSumming1
{
    private static int[][] m = {{ 1, 2, 3, 4, 5},
                                            { 6, 7, 8, 9, 0},
                                            { 6, 7, 1, 2, 5},
                                            { 6, 7, 8, 9, 0},
                                            { 5, 4, 3, 2, 1}};

    public static int sum(int a, int b)
    {
        //add code here
        int s = 0;
        for(int i = a-1; i < a+2; i++)
        for(int j = b-1; j < b+2; j++){
            if(i>=0&&i<m.length&&j>=0&&j<m[0].length){
                s+=m[i][j];

            }
        }
        return s;
    }
}
