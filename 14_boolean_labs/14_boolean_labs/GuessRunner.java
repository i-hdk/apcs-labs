//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class GuessRunner
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        while(true){
        String response;
        int b;
        System.out.print("Guessing Game - how many numbers? ");
        b = keyboard.nextInt();
        GuessingGame a = new GuessingGame(b);
        a.playGame();
        System.out.print("Do you want to play again? ");
        response = keyboard.next();
        if(response.equals("n")) break;
        }
    }
}