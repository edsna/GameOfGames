/**
 ** Class PlayGame: Driver class for the Game of Games it uses the super class Game
 **     and all its subclasses, each representing a game in the Game of Games.
 **     it also utilizes the class scoreboard to display the scoreboard. In addition to
 **     the getInput() class to communicate user decisions.
 ** @author Ali Hasan with Group 5 of CPSC340 under the supervision of Prof.
 **         Spezialetti of Trinity College
 ** @v1.0 April 26th 2019
 **/

import java.io.*;
import java.util.*;

public class PlayGames{

/**
 * printMenu(): Static method used to display the main menu options.
 **/
	public static void printMenu(){
		System.out.println("Pick a game to play:\nTo pick a game to play, enter game's listed number\nTo quit the Game of Games, enter the corresponding number as well.");
		System.out.println("1. Look for the Thimble.");
		System.out.println("2. Guess the Number.");
		System.out.println("3. Even and Odd.");
		System.out.println("4. Find the Red Thread.");
		System.out.println("5. Coin Toss.");
		System.out.println("6. Quit the Program");
		System.out.println();
	}


/**
 * main(): Driver method for the game of games.
 **/
	public static void main(String args[]){
		getInput pickGame = new getInput();
		scoreboard score = new scoreboard();
		while (pickGame.getVal() < 7){
		  score.printScore(score);
		  printMenu();
		  pickGame.gamePick();
          if (pickGame.getVal() == 1) {
			  Thimble thimble = new Thimble();
			  thimble.displayInstructions();
			  pickGame.startOrReturn();
			  while (pickGame.getVal()==1){
			  	thimble.hmRounds();
			  	thimble.play();
			  	score.setThimble(thimble.getPlayed());
			  	score.setThimbleWins(thimble.getWon());
			  	score.setThimbleLoss(thimble.getLost());
			  	pickGame.playAgain();
			  }
          	  continue;
	      }
		  else if (pickGame.getVal() == 2) {
			  GuesstheNumber guessNum = new GuesstheNumber();
			  guessNum.displayInstructions();
			  pickGame.startOrReturn();
			  while (pickGame.getVal()==1){
			  	guessNum.GuessCompare();
			  	score.setGuess(guessNum.getPlayed());
			  	score.setGuessWins(guessNum.getWon());
			  	score.setGuessLoss(guessNum.getLost());
			  	score.printScore(score);
			  	pickGame.playAgain();
			  }
		  	  continue;
		  }
		  else if (pickGame.getVal() == 3) {
			  EvenOdd evenOdd = new EvenOdd();
			  evenOdd.displayInstructions();
			  pickGame.startOrReturn();
			  while (pickGame.getVal()==1){
			  	evenOdd.setEvenOdd();
			  	evenOdd.hmRounds();
			  	evenOdd.play();
		  	    pickGame.playAgain();
		  	  }
		  	  score.setEO(evenOdd.getPlayed());
		  	  score.setEOLoss(evenOdd.getLost());
		  	  score.setEOWins(evenOdd.getWon()); 
		  	  continue;
	      }
		  else if (pickGame.getVal() == 4) {
		  	  Thread redThread = new Thread();
		  	  redThread.displayInstructions();
		  	  pickGame.startOrReturn();
		  	  while (pickGame.getVal()==1){
		  	    redThread.spoolsNum();
		  	    redThread.play();
		  	    score.setThread(redThread.getPlayed());
		  	    score.setThreadWins(redThread.getWon());
		  	    score.setThreadLoss(redThread.getLost());
		  	    score.printScore(score);
		  	    pickGame.playAgain();
		  	  }
		  	  continue;
		  }
		  else if (pickGame.getVal() == 5) {
			  coinToss coin = new coinToss();
			  coinToss.displayInstructions();
			  pickGame.startOrReturn();
			  while (pickGame.getVal()==1){
			  	coin.headsOrTails();
			  	coin.hmRounds();
			  	coin.play();
			  	score.setToss(coin.getPlayed());
		  	    score.setTossWins(coin.getWon());
		  	    score.setTossLoss(coin.getLost());
		  	    score.printScore(score);
		  	    pickGame.playAgain();
			  }
		  	  continue;
		  }
	    }
	    score.printScore(score);
	    if (score.getTotalWins() > score.getTotalLoss()){ //final winner conditionals 
	    	System.out.println("You have won more than you have lost!");
	    }
	    else if (score.getTotalWins() == score.getTotalLoss()){// handles ties 
	    	System.out.println("You have an equal number of wins and loses");
	    } else {
	    	System.out.println("You have lost more than you have won!");
	    }
	}
}