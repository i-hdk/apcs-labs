//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class SpiralMatrix
{
    //define a matrix
    private int[][] a;
    private int s;
    public SpiralMatrix()
    {
    }

    public SpiralMatrix(int size)
    {
        a = new int[size][size];
        s = size;
        createSpiral();
    }
    
    public void setSize(int size)
    {
        a = new int[size][size];
        s = size;
        createSpiral();
    }

    public void createSpiral()
    {
        int i = 0, j = 0,iu = 0, ib = s-1, jl = 0, jr = s-1;
        int d = 0;
        int b = 1;
        while(i<s&&j<s&&i>=0&&j>=0&&b<=s*s){
            a[i][j] = b;
            b++;
            if(d%4==0){
                if(i<ib)i++;
                else{
                    j++;
                    d++;
                    jl++;
                }
            }
            else if(d%4==1){
                if(j<jr)j++;
                else{
                    i--;
                    d++;
                    ib--;
                    }
            }
            else if(d%4==2){
                if(i>iu) i--;
                else{
                    j--;
                    d++;
                    jr--;
                }
            }
            else{
                if(j>jl) j--;
                else{
                    i++;
                    d++;
                    iu++;
                }
            }
        }
    }

    public String toString( )
    {
        String output="";
        for(int[] b: a){
            for(int c : b){
                output += c + " ";
            }
            output += "\n";
        }

        return output;
    }
}