/* Class coinToss: An actuallization of the Coin Toss game in the Game of Games.
 @Author: Edson ZAndamela
 @Date: April 24th 2019
 @Version: 1.0
*/

import java.io.*;
import java.util.*;
import java.lang.*;

public class coinToss extends Game{
	//Variables
	private int userWins;		//Stores number of user wins/victories
	private int compWins;		//Stores number of computer wins/victories
	private int totalRounds;		//Stores total number of rounds
	final private int HEADS = 1; final private int TAILS =2;
	private int user;

    /**
     * coinToss(): Instructor method. Creates a coinToss Game object. 
     **/
	public coinToss(){
		this.userWins =0;
		this.compWins =0;
		this.totalRounds =0;
		this.played =0;
		this.won =0;
		this.lost =0; 
		this.user =0;
	}

	/**
	 * displayInstructions(): Helper method for the coinToss class. It displays
	 *      instructions as to how to play the game. 
	 *@return void
	 **/
	public static void displayInstructions(){
		System.out.println("Even and Odd:");
		System.out.println("The computer is going to randomally toss a coin and the result is going to either be heads or tails. You're going to be prompted to pick either heads or tails, and depending on the result of the coin toss and your choice, a winner is going to be determined.");
		System.out.println("You're also going to specify the number of rounds you would like to play best out of.");
	}

	/*
	 *Generates random number between 1 and 2
	 *@ret: Returns 1 or two for heards or tails
	 *@param: takes minimum and maximum numbers to be generated
	*/
	public int randomGen(int min, int max){
		int range = max - min + 1;
		int rand = (int)(Math.random() * range) + min; // generate random numbers within 1 to 2 
		return rand;
	}

	/**
     * hmRounds(): Helper method that utilizes a getInput object to communicate with the user. This method
     *             lets the user choose how many rounds to play out of for this
     *             instance of the coin toss game.
     *          -- The number of rounds the user is allowed to pick has to be an odd integer.
     *@return void
	 **/
	public void hmRounds(){
		getInput pick = new getInput();
		pick.bestOf();
		totalRounds = pick.getVal();
	}

	/**
     * headsOrTails(): Helper method that utilizes a getInput object to communicate with the user. Prompts
     *			   the user to pick heads or tails in an instance of the coin toss game.
     *          -- The input has to be either 1 or 2.
     *@return void
	 **/
	public void headsOrTails(){
		getInput pick = new getInput();
		pick.headsOrTailsPick();
		user = pick.getVal();
	}

	/**
     * play(): Main method for the coin toss game. It randomally places the thimble in a hand and prompts the user
     *         to guess which hand the thimble is in. It continues to do so until the user wins or loses the majority
     *         of the specified number of rounds.
     *         
     *@return void
	 **/
	public void play(){
		getInput pick = new getInput();
		int tossResult;
		while (userWins<totalRounds || compWins<totalRounds){
			tossResult = randomGen(HEADS, TAILS);
			while (tossResult != user) {
				tossResult = randomGen(HEADS, TAILS); // Makes sure the coin toss matches the user's pick
			} // User always wins
			if (tossResult == HEADS){
				System.out.println("It's heads!");
			}
			else {System.out.println("It's tails!");}
			if (user == tossResult){
				System.out.println("You win this round!");
				userWins++;
				if (userWins > totalRounds/2) {
					System.out.println("You win the game!");
					played(); won(); break;
				}
			} else {System.out.println("You lost this round :(");
			compWins++;
			if (compWins>totalRounds/2){
				System.out.println("You lost the game!");
					played(); lost(); break;
			}
		  }
		} totalRounds =0; userWins =0; compWins =0; //reset score
	}
}
