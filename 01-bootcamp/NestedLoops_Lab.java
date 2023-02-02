import java.util.Scanner;

public class NestedLoops_Lab
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner( System.in );

        System.out.print( "Enter the size of the triangle :: ");
        int a = kb.nextInt();
        for(int i = 0; i < a; i++){
            for(int j = 0; j < i+1; j++){
                System.out.print('*');
            }
            System.out.print("\n");
        }

        // write nested loops that will print out an
        // isosceles right triangle (if you don't know what that is you should drop this class immediately!!!!!)
        // of asterisks based on the size
        // for example, if size is 3, you would print:
        // *
        // **
        // ***
    }
}
