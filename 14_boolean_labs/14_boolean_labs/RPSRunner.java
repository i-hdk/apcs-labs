//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RPSRunner
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        char response;
        //add in a do while loop after you get the basics up and running
        while(true){
            String choice;
        
            out.print("type in your prompt [R,P,S] :: ");
            
            //read in the player value
            choice = keyboard.next();
            RockPaperScissors game = new RockPaperScissors(choice);  
            System.out.println(game);
            System.out.println(game.determineWinner() + "\n");
            System.out.print("Do you want to play again? ");
            choice = keyboard.next();
            if(choice.equals("n")) break;
        }
    }
}



