//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Integer.*;
import static java.lang.System.*;

public class ExpressionSolver
{
    //add in instance variables
    private String o;
    private ArrayList<String> e;
    public ExpressionSolver(String s)
    {
        o = s;
        solveExpression();
    }

    public void setExpression(String s)
    {
        o = s;
        solveExpression();
    }

    public void solveExpression()
    {
     e = new ArrayList<String>();
     String t = "";
     o+=" ";
     for(int i = 0; i < o.length(); i++){
        if(!o.substring(i,i+1).equals(" ")){
            t+=o.substring(i,i+1);
        }
        else{
            if(!t.equals("")) e.add(t);
            t = "";
        }
     }
     for(int i = 1; i < e.size(); i++){
         if(e.get(i).equals("*")){
             e.set(i,sad((this.toNum(e.get(i-1)))*(this.toNum(e.get(i+1)))));
             e.remove(i+1);
             e.remove(i-1);
             i--;
         }
         if(e.get(i).equals("/")){
             e.set(i,sad(((this.toNum(e.get(i-1)))/(this.toNum(e.get(i+1)))))); //cast?
             e.remove(i+1);
             e.remove(i-1);
             i--;
         }
     }
     for(int i = 1; i < e.size(); i++){
         if(e.get(i).equals("+")){
             //System.out.println(e.get(i-1));
             
             //System.out.println(this.toNum(e.get(i-1)));
            // System.out.println(this.toNum(e.get(i+1)));
             e.set(i,sad(this.toNum(e.get(i-1))+(this.toNum(e.get(i+1)))));
             e.remove(i+1);
             e.remove(i-1);
             i--;
         }
         if(e.get(i).equals("-")){
             e.set(i,sad((this.toNum(e.get(i-1)))-(this.toNum(e.get(i+1))))); //cast?
             e.remove(i+1);
             e.remove(i-1);
             i--;
         }
     }
    }
    
    private int toNum(String a){
        int b = 0;
        boolean neg = false;
        if(a.substring(0,1).equals("-")){
            neg = true;
            a = a.substring(1);
        }
        for(int i = 0; i < a.length(); i++){
            char c = a.charAt(i);
            //System.out.println(c);
            b+=(Math.pow(10,a.length()-i-1))*(c-'0');
        }
        if(neg) b*=-1;
        return b;
    }
    
    private String sad(int a){
        boolean neg = false;
        if(a<0) {neg = true; a*=-1;}
        char b;
        String c = "";
        do{
            b = '0';
            b += (char)(a%10);
            c = b + c;
            a/=10;
        }
        while(a>0);
        if(neg) c = "-" + c;
        return c;
    }

    public String toString( )
    {
        return o + "= " + e.get(0);
    }
}