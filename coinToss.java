import java.io.*;
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;
import java.io.FileNotFoundException;
import java.util.Queue; 
import java.util.Arrays;
import java.lang.Integer;
import java.io.File;
import java.lang.Math;
import java.util.concurrent.ThreadLocalRandom;
/*
 @Author: Edson ZAndamela
 @Date: April 24th 2019
 @Version: 1.0
*/
public class coinToss {
	//Variables
	static int updatedRounds = 0;	//stores updates of total round after every round
	static int userWins = 0;		//Stores number of user wins/victories
	static int compWins = 0;		//Stores number of computer wins/victories
	static int totalRounds = 0;		//Stores total number of rounds
	static int inputVal = 0;
	/*
	 *Generates random number between 1 and 2
	 *@ret: Returns 1 or two for heards or tails
	 *@param: takes minimum and maximum numbers to be generated
	*/
	public static int randomGen(int min, int max){
		int range = max - min + 1;
		int rand = 0; 
		// generate random numbers within 1 to 2 
		for (int i = 0; i < 1; i++) { 
			rand = (int)(Math.random() * range) + min;
		}  
		return rand;
	}
	/*
	 *Determines who is the winner for every single round
	 *@ret: Returns 0 if computer wins and 1 if user wins
	 *@param: computer's throw and user's guess
	*/
	public static int roundWinner(int compThrow, int userGuess){
		if(compThrow == userGuess){
			return 1;
		}else{
			return 0;
		}
	}
	/*
	 *Determines who is the winner for all the rounds
	 *@ret: Returns 0 if computer wins and 1 if user wins
	 *@param: compW and userW
	*/
	public static int gameWinner(int compW, int userW){
		if(compW > userW){
			return 0;
		}else if(compW < userW){
			return 1;
		}
		else{
			return 5;
		}
	}
	/*
	 *Determines if input is valid 
	 *@ret: Returns 
	 *@param: 
	*/
	public static void headsOrTailsPick() throws InputMismatchException{
		inputVal = 0;	//Stores input
		Scanner scan = new Scanner(System.in);
		while (inputVal != 1 || inputVal != 2){
			try { 
				System.out.println("Choose '1' for heads or '2' for tails: ");
			    inputVal = scan.nextInt();}
			catch (InputMismatchException e){
				System.out.println("Error!! Invalid input type.Please try again.");
			}
			if (inputVal>2 || inputVal<1){
				System.out.println("The number you entered isn't a valid option.");
			  }
		}
	}
	/*
	 *Determines if input selection is valid 
	 *@ret: Returns 
	 *@param: 
	*/
	/*
	public static void selectionInputPick() throws InputMismatchException{
		selectVal = 0;	//Stores input
		Scanner scan = new Scanner(System.in);
		while (selectVal != 1 || selectVal != 2){
			try { 
			System.out.println("\n \t1. Enter 1 to start game");
			System.out.println("\n \t2. Enter 2 to return to main Menu");
			System.out.println("Select an option from the Menu");
			    selectVal = scan.nextInt();}
			catch (InputMismatchException e){
				System.out.println("Error!! Invalid input type.Please try again.");
			}
			if (selectVal>2 || selectVal<1){
				System.out.println("The number you entered isn't a valid option.");
			  }
		}
	}
	*/
	/*
	 *Determines if input is even or odd & validates it
	 *@ret: Returns true if input is odd and false otherwise
	 *@param: input
	*/
	public static boolean validateInput(int updatedRounds){
		if((updatedRounds % 2 == 0) || (updatedRounds <= 0)){
			return false;
		}else{
			return true;
		}
	}
	/*
 	*Executes the computation and all relevand methods for the game
	*/
	public static void main(String[]args){
		Scanner keyBoard = new Scanner(System.in);		//Call keyboard for input
		int select = 0;									//takes care of menu selection
		int headsOrTails;								//Stores Menu selection input

		while(select!= 2){
			System.out.println("\n**********Welcome to Coin Toss Game***********");
			System.out.println("\n**********Instructions***********");
			System.out.println("\n \t1. Enter 1 to start game");
			System.out.println("\n \t2. Enter 2 to return to main Menu");
			
			if(keyBoard.hasNextInt()){
	        	select = keyBoard.nextInt();
		    }else{
		        System.out.println("Error!! Invalid input");
		    }

			if(select == 1){
				System.out.println("Enter an odd number to serve as the maximum number of rounds");	//prompt for number
				totalRounds = keyBoard.nextInt();		//Store total rounds
				updatedRounds = totalRounds;			//Copy total number of rounds to updatedRounds

				if(validateInput(updatedRounds)){
					while(!(compWins > totalRounds/2) && !(userWins > totalRounds/2)){	//while there is no winner
					System.out.println("\n \t1. Choose '1' for heads or '2' for tails");	//prompt for input
					headsOrTails = keyBoard.nextInt();		//scan for input
			
					if(headsOrTails == 1){
						System.out.println("\n \tYou selected heads");
					}else if(headsOrTails == 2){
						System.out.println("\n \tYou selected Tails");
					}else{
						System.out.println("Error!!! Enter a Valid Option");
					}
					//Make computer throw an integer (1 or 2)
					int pcThrow = randomGen(1,2); 
			        System.out.println("\n \tComputer has: " + pcThrow);
			        int result = roundWinner(pcThrow, headsOrTails);	//check round winner
			        if(result == 0){
			        	System.out.println("\n \tYou lost this round!");
			        	compWins++;
			        	updatedRounds = updatedRounds -1;	//Updates number of rounds left
			        }else{
			        	System.out.println("\n \tYou won this round!!!");
			        	userWins++;
			        	updatedRounds = updatedRounds -1;	//Updates number of rounds left
			        }
			        System.out.println("\n \t**********Scoreboard State***********");
					System.out.println("\n \tComputer: " + compWins);
					System.out.println("\n \tUser: " + userWins);
					System.out.println("\n \tNumber of rounds left: " + updatedRounds);
					}
					//call function to compare winners
					int gameW = gameWinner(compWins, userWins);
					//declare winners
					if(gameW == 0){
						System.out.println("\n \t You Lost this game!!!");
						compWins = 0;
						userWins = 0;
					}else if(gameW == 1){
						System.out.println("\n \t You Win this game!!!!");
						compWins = 0;
						userWins = 0;
					}
					else{
						//System.out.println("\n \t Testing Tie");
					}
					
				}else{	
					System.out.println("Error!!! Please enter an odd number");
				}
				System.out.println();		//Get some space
				System.out.println();		//Get some space
			}else if(select == 2){
				System.out.println("Return to Main Menu ...."); 
			}else if(select == 4){
			}else{
				System.out.println("Error!!! Enter a Valid Option");
			}
			//NEED TO MAKE SURE IT DECLARES WINNER RIGHT AFTER updatedRounds < updatedRounds/2
			System.out.println();		//Get some space
		}//End of while
		System.out.println("Should exit to Main Menu here!");
	}//End of Main
}
