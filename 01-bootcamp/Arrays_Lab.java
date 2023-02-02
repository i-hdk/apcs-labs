import java.util.Scanner;
import java.util. Arrays;

public class Arrays_Lab
{
    public static void main(String[] args) 
    {
        int[] rayOne = {1,4,5,3,12,5,99,0,-1,12,45,67,32};
        int l = rayOne.length;
        for(int i = 0; i < l; i+=3){
            System.out.print(rayOne[i] + " ");
        }
        System.out.print("\n");
        for(int i = l-1; i >=0; i--){
            System.out.print(rayOne[i] + " ");
        }
        double a = 0;
        System.out.print("\n");
        for(int i = 0; i < l; i++){
            a+=rayOne[i];
        }
        System.out.print(a/l);
        //1.) write a loop to print out every third number in the array

        //2.) write a loop to print out all of the numbers backwards
        
        //3.) write a loop to calculate the average of all the values in the array and print the result
    }
}
