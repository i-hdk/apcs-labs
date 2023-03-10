//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
    private int upperBound;
    private int ans;
    private int tries;

    public GuessingGame(int stop)
    {
        upperBound = stop;
        ans = (int)(Math.random()*stop) + 1;
    }

    public void playGame()
    {
        Scanner keyboard = new Scanner(System.in);
        while(true){
            System.out.print("Enter a number between 1 and " + upperBound + ": ");
            int b = keyboard.nextInt();
            tries++;
            if(b>upperBound||b<1){
                System.out.println("Number out of range! Try again. ");
                tries--;
            }
            else if(b==ans){
                System.out.println("It took " + tries + " guesses to guess " + ans + '.');
                System.out.println("You guessed wrong " + (double)((tries-1))/tries*100 + " percent of the time.");
                break;
            }
        }
    }

    public String toString()
    {
        String output="";
        output+= ans;
        return output;
    }
}