                import java.util.Scanner;

public class String_Lab
{
    public static void main(String[] args) 
    {
        Scanner kb = new Scanner( System.in );

        System.out.print( "Enter a word :: ");
        String word = kb.next();
        System.out.print(word.substring(0,1) + " ");
        int a = word.length();
        System.out.print(word.substring(a-1,a) + " ");
        System.out.print("\n");

        for(int i = a; i >0; i--){
            System.out.print(word.substring(i-1,i) + " ");
        }
        System.out.print("\n");
        for(int i = 0; i <a; i++){
            String b = word.substring(i,i+1);
            if(b.equals("a")||b.equals("A")){
                System.out.println("this word has A");
            }
            else if(b.equals("e")||b.equals("E")){
                System.out.println("this word has e");
            }
            else if(b.equals("i")||b.equals("I")){
                System.out.println("this word has i");
            }
            else if(b.equals("o")||b.equals("O")){
                System.out.println("this word has o");
            }
            else if(b.equals("u")||b.equals("U")){
                System.out.println("this word has u");
            }
        }

        //1.) print out the first and last letter of the word

        //2.) print out the word backwards
        
        //3.) check to see if the word contains a vowel (a/e/i/o/u) and print out the result

    }
}
