import java.util.List;
import java.util.ArrayList;

public class List_Lab
{
    public static int addList( ArrayList<Integer> list )
    {
        int sum =0;
        int a = list.size();
        for(int i = 0; i < a; i++){
            sum += list.get(i);
        }
        // sum all the elements that are inside list

        return sum;
    }

    public static void main(String[] args) 
    {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        // add in some numbers to the list
        // use a loop and Math.random() (search it up!)
        int a = (int)(Math.random()*10);
        for(int i = 0; i < a; i++){
            int b = (int)(Math.random()*10);
            nums.add(b);
        }
        
        // this will take the list named "nums" and pass it into the function "sumList"
        System.out.println( addList( nums ) );     
    }
}
