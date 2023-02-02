//(c) A+ Computer Science
//www.apluscompsci.com

public class AsciiBox
{
    public static void main(String[] args)
    {
        System.out.println("name \t  date \n\n" );
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.print('#');
            }
            System.out.println();
        }

    }
}