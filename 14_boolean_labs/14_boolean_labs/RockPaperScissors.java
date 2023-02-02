//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import java.util.Scanner;
import static java.lang.System.*;

public class RockPaperScissors
{
    private String playChoice;
    private String compChoice;

    public RockPaperScissors(String player)
    {
        playChoice = player;
        String a = "RPS";
        int b = (int)(Math.random()*3);
        compChoice = a.substring(b,b+1);
    }

    public String determineWinner()
    {
        String winner="";
        if(playChoice.equals(compChoice)) winner = "!Draw Game!";
        else if(playChoice.equals("R")){
            if(compChoice.equals("P")) winner = "!Computer wins <<Paper Covers Rock>>!";
            else if(compChoice.equals("S")) winner = "!Player wins <<Rock Breaks Scissors>>!";
        }
        else if(playChoice.equals("P")){
            if(compChoice.equals("S")) winner = "!Computer wins <<Scissors Cut Paper>>!";
            else if(compChoice.equals("R")) winner = "!Player wins <<Paper Covers Rock>>!";
        }
        else if(playChoice.equals("S")){
            if(compChoice.equals("R")) winner = "!Computer wins <<Rock Breaks Scissors>>!";
            else if(compChoice.equals("P")) winner = "!Player wins <<Scissors Cut Paper>>!";
        }
        return winner;
    }

    public String toString()
    {
        String output="";
        output += "player had " + playChoice + "\n" + "computer had " + compChoice;
        return output;
    }
}