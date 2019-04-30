/**
 * Class EvenOdd: A class for the Even and Odd game. It extends the super class  
 *                Game.
 *@author Ali Hasan with Group 5 of CPSC340 under the supervision of
 *        professor Spezialetti of Trinity College
 *@v1.0 April 26th, 2019
 **/
import java.util.*;
import java.io.*;

public class EvenOdd extends Game{
	protected int rounds,roundsPlayed, roundsWon, roundsLost;
	protected int troundsPlayed, troundsWon, troundsLost;
	protected boolean even;
	final int max =5; final int min =1;

	/**
     * Instructor method EvenOdd(): Instantiates a new Even&Odd game object with
     *            default values for all its fields.
     */
	public EvenOdd(){
		this.even = false;
		this.rounds = 0;
		this.roundsPlayed = 0;
		this.roundsLost = 0;
		this.roundsWon = 0;
		this.played = 0;
		this.lost = 0;
		this.won = 0;
		this.troundsPlayed = 0;
		this.troundsLost = 0;
		this.troundsWon=0;
	}

	/**
	 * displayInstructions(): Helper method for the EvenOdd class. It displays
	 *      instructions as to how to play the game. 
	 *@return void
	 **/
	public void displayInstructions(){
		System.out.println("Even and Odd:");
		System.out.println("The computer is going to randomally pick a value between 1 and 5, inclusive. You also need to input a random number between 1 and 5. These two picks will be summed up, and the total of both is going to either be even or odd. You're going to be prompted whether you want to be even or odd shortly.");
	}

	/**
     * setEvenOdd(): Helper method that utilizes a getInput object to communicate with the user. This method
     *               lets the user pick their status as even or odd for the Game even & odd.
     *@return void
	 **/
	public void setEvenOdd(){
		getInput pick = new getInput();
		pick.evenOddPick();
		if (pick.getVal() == 1) 
			even = true;
		else even = false;
	}

	/**
     * hmRounds(): Helper method that utilizes a getInput object to communicate with the user. This method
     *             lets the user choose how many rounds to play out of for this
     *             instance of the even or odd game.
     *          -- The number of rounds the user is allowed to pick has to be an odd integer.
     *@return void
	 **/
	public void hmRounds(){
		getInput pick = new getInput();
		pick.bestOf();
		rounds = pick.getVal();
	}

	/**
	 * play(): Main method of the Even and Odd game. It traps the user in a loop
	 *    where the breaking condition for that loop is that the number of rounds won or lost
	 *    has the majority portion of the number of rounds specified by the user. 
	 *    
	 *@return void
	 **/
	public void play(){
		int computer, total;
		getInput choice = new getInput();
		while (roundsWon<rounds || roundsLost<rounds){ //Game loop
			computer = compTurn(min,max);
			choice.evenOddTurn();
			total = choice.getVal() + computer;
			System.out.println("The computer picked "+computer+",");
			System.out.println("You picked "+choice.getVal()+",");
			System.out.println("Totalling for "+total+".");
			roundsPlayed++;
			if (total%2 == 0){ // determines winner of current round
				if (even) {
					System.out.println("You've won this round!");
					roundsWon++;
					if (roundsWon > rounds/2) break;
				} else {
					System.out.println("You've lost this round!");
					roundsLost++;
					if (roundsLost > rounds/2) break;
				}
			} else {
				if (even){
					System.out.println("You've lost this round!");
					roundsLost++;
					if (roundsLost > rounds/2) break;
				} else {
					System.out.println("You've won this round!");
					roundsWon++;
					if (roundsWon > rounds/2) break;
				}
			} 
		} if (roundsWon>roundsLost){ //Determines game winner
			System.out.println("You've won the game!");
			played();
			won();
		} else if (roundsLost>roundsWon){
			System.out.println("You've lost the game!");
			played();
			lost();
		} 
		updateScore();//Save total gamescore, reset current gamescore
	}

	/**
     * updateScore(): Helper method that updates the total rounds played, won, and lost and resets
     *               the rounds played, won, and lost variables for a Game run. It is used at the end of play(). 
     *@return void
	 **/
	public void updateScore(){
		troundsPlayed += roundsPlayed;
		troundsLost += roundsLost;
		troundsWon += roundsWon;
		roundsWon = 0;
		roundsLost = 0;
		roundsPlayed = 0;
	}

	/** Auxiliary Methods **/

	/**
	 * getTotalRounds(): returns the number of total rounds played in an instance of Even and Odd.
	 *@return int
	 **/
	public int getTotalRounds(){return troundsPlayed;}

	/**
	 * getTotalWon(): returns the number of total rounds won in an instance of Even and Odd.
	 *@return int
	 **/
	public int getTotalWon(){return troundsWon;}

	/**
	 * getTotalLost(): returns the number of total rounds lost in an instance of Even and Odd.
	 *@return int
	 **/
	public int getTotalLost(){return troundsLost;}

	/**
	 * compTurn(int min, int max): Takes in two integer value and returns a random value between min and max, inclusive.
	 * @return int
	 **/
	public int compTurn(int min, int max){
		int boundary = (max-min)+1;
		return (int)(Math.random()*boundary)+min;
	}
}