//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
        List<Integer> c = new ArrayList<Integer>();
        for(int[] a: m){
            int s = 0;
            for(int b : a) s+=b;
            c.add(s);
        }
        return c;
    }
}
