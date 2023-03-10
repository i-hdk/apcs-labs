    // Class: Blackjack
// Purpose: Main class used to play the card game Blackjack
// @author TAS
// @version November 2021

import java.util.Scanner;

public class Blackjack
{
    // deck of cards used for this game
    Deck d;
    // arrays to hold the dealer's and player's hands
    private Card[] dh,ph;
    // indexes to keep track of cards in players hands
    private int pi,di;
    // keep track of win points for player
    private int wp;
    // number of rounds that have been played
    private int r;
    // scanner used for keyboard input
    private Scanner kb;
    // constructor
    public Blackjack()
    {
        //defining the stuff
        wp = 0;
        r = 0;
        kb = new Scanner(System.in);
    }

    // "main" method in the class, used to play one complete round of Blackjack
    public void playRound()
    {
        resetHands();
        r++; //add to round count
        
        //deal starting cards
        dh[0] = d.dealCard();
        dh[1] = d.dealCard(); 
        ph[0] = d.dealCard();
        ph[1] = d.dealCard(); 
        
        //change index
        pi=2;
        di = 2;
        
        //show stuff to player
        System.out.println("Dealer: " + dh[0]);
        System.out.println("Player: " + printHand(ph,pi) + " : " + getHandValue(ph,true));
        
        //check for blackjacks
        if(getHandValue(dh,false)==21&&getHandValue(ph,true)==21){
        System.out.println("\n!!! Player and Dealer gets a blackjack, tie! !!!"); 
        System.out.println("\nScore is: P = " + wp);
        return;}
        else if(getHandValue(dh,false)==21){ System.out.println("\n!!! Dealer gets a blackjack, nice! !!!");
            wp--;
            System.out.println("\nScore is: P = " + wp);
            return;}
        else if(getHandValue(ph,true)==21){
            System.out.println("\n!!! Player gets a blackjack and 2 points, nice! !!! ");
            wp+=2;
            System.out.println("\nScore is: P = " + wp);
            return;
        }
            
        //player chooses to hit or stand
        System.out.print("Player! What would you like to do? (H)it or (S)tand? ");
        String choice = kb.nextLine();
        while(true){
        if(choice.equals("h")||choice.equals("H")){
            ph[pi] = d.dealCard(); pi++;
            System.out.println("\n*** " + ph[pi-1] + " ***\n");
            System.out.println("Player: " + printHand(ph,pi) + " : " + getHandValue(ph,true));
            if(getHandValue(ph,true)>21){
                System.out.println("\n### Player busted! Dealer wins! ### ");
                wp--;
                System.out.println("\nScore is: P = " + wp);
                return;
            }
            System.out.print("Player! What would you like to do? (H)it or (S)tand? ");
            choice = kb.nextLine();
            //System.out.println();
        }
        else if(choice.equals("s")||choice.equals("S")) break;
        else{
            //System.out.println(choice); 
            System.out.println("plz enter smth valid(without spaces)");
            System.out.print("Player! What would you like to do? (H)it or (S)tand? ");
            choice = kb.nextLine();
        }
    }
    
    //dealer get card
        while(getHandValue(dh,false)<17){
            dh[di] = d.dealCard(); di++;
            System.out.println("*** " + dh[di-1] + " ***");
            
        }
        System.out.println("Dealer: " + printHand(dh,di) + " : (" + getHandValue(dh,false) + ")");
        checkWinner();
    }

    // after a round, clear out the player/dealer hands
    public void resetHands()
    {
        //reset the cards
        dh = new Card[20];
        ph = new Card[20];
        d = new Deck(2);
        
        //shuffle if needed
        if(r%4==0&&r!=0){ 
            d.shuffle();
            System.out.println("@@@@@@ Wait a sec, shuffling deck @@@@@@ \n");
        }
    }
    
    // return a nicely formatted string of the cards in a hand
    public String printHand(Card[] cards,int index)
    {
        String out = "[";
        for(int i = 0; i < index-1; i++) out+=cards[i] + ", ";
        out+= cards[index-1] + "]";
        return out;
    }

    // look at the current hands and determine a winner, and print it out
    public void checkWinner()
    {
        //some if statements to check conditions
        if(getHandValue(dh,false)>21){
            System.out.println("\n### Dealer busted! Player wins! ### ");
            wp++;
        }
        else if(getHandValue(dh,false)<getHandValue(ph,true)){
            System.out.println("\n$$$ Player wins! $$$"); 
            wp++;
        }
        else if(getHandValue(dh,false)>getHandValue(ph,true)){
            System.out.println("\n$$$ Dealer wins! $$$"); wp--;
        }
        else{
            System.out.println("\n### Tie! ###");
        }
        System.out.println("\nScore is: P = " + wp);
    }

    // calculate the value of a hand (handle aces correctly!)
    public int getHandValue(Card[] cards,boolean player) 
    { 
        //idk why the parameters are like that im pretty sure i dont need the cards parameter
        //bool player is for player or dealer
        int sum = 0;
        
        //sum the stuff and subtract extras if >21 and has 11s
        if(player){
            for(int i = 0; i <pi; i++){
            sum+= ph[i].getValue();
        }
            for(int i = 0; i < pi; i++) if(sum>21&&ph[i].getValue()==11) sum-=10;
        }
        else{
            for(int i = 0; i <di; i++){
            sum+= dh[i].getValue();
        }
        for(int i = 0; i < di; i++) if(sum>21 && dh[i].getValue()==11) sum-=10;
        }
        
        return sum;
    }
    
}