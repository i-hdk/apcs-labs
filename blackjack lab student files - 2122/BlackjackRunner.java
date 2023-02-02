// Class: BlackjackRunner
// Purpose: Runner class used to initiate and play blackjack
// @author TAS
// @version November 2021

import java.util.Scanner;

public class BlackjackRunner
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Welcome to Blackjack! (this is only for fun, no betting!!)");
        Blackjack game = new Blackjack();
        String res = "y"; //the response
        
        //controls the amount of rounds that are playesd
        while(true){
        if(res.equals("y")||res.equals("Y")){
            System.out.println();
            game.playRound();
        }
        else if(res.equals("n")||res.equals("N")){
            System.out.print("That was fun, come back if you want more practice! ");
            break;
        }
        else{
            System.out.println("plz enter smth valid (without spaces, 'y' or 'n')");
        }
        System.out.print("Wow, that was fun! You want to play again? ");
        res = kb.nextLine();
    }
    }
}