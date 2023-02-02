//(c) A+ Computer Science
//www.apluscompsci.com
//Name - 

import static java.lang.System.*;

public class TopLeftDiagonal
{
    private String[][] codeBox;

    private int getdimensions(int a){
        int b = 1;
        while(b*b<a){
            b++;
        }
        return b;
    }
    
    // encode string
    public String encode(String original)
    {
        int a = original.length();
        int d = getdimensions(a);
        codeBox=new String[d][d];
        int b = 0;
        for(int i = 0; i < d; i++)
        for(int j = 0; j < d; j++){
            if(b<a) codeBox[i][j] = original.substring(b,b+1);
            else codeBox[i][j] = "*";
            b++;
        }
        String c = "";
        for(int i = 0; i < d; i++){
            int ii = i ,j = 0;
            while(ii>=0&&j<d){
                c+=codeBox[ii][j];
                ii--;
                j++;
            }
        }
        for(int i = 1; i < d; i++){
            int j = d-1, ii = i;
            while(ii<d){
                c+=codeBox[j][ii];
                j--;
                ii++;
            }
        }
        return c;
    }

    // decode string
    public String decode(String encoded)
    {
        int a = getdimensions(encoded.length());
        String b = "";
        int c = 0;
        codeBox = new String[a][a];
        for(int i = 0; i < a; i++){
            int ii = i, j = 0;
            while(ii>=0&&j<a){
               codeBox[ii][j] = encoded.substring(c,c+1);
               c++;
               ii--;
               j++;
            }
        }
        for(int i = 1; i < a; i++){
            int j = a-1, ii = i;
            while(ii<a){
                codeBox[j][ii] = encoded.substring(c,c+1);
                c++;
                j--;
                ii++;
            }
        }
        for(int i = 0; i < a; i++)
        for(int j = 0; j < a; j++){
            if(!codeBox[i][j].equals("*")) b+= codeBox[i][j];
        }
        return b;
    }
}