import java.io.*;
import java.util.*;

public class PlayGame{
	private int gamesPlayed = 0, gamesWon = 0, gamesLost = 0;

	public void printMenu(){
		System.out.println("Pick a game to play:\nTo pick a game to play, enter game's listed number\nTo quit the Game of Games, enter the corresponding number as well.");
		System.out.println("1. Look for the Thimble.");
		System.out.println("2. Guess the Number.");
		System.out.println("3. Even and Odd.");
		System.out.println("4. Find the Red Thread.");
		System.out.println("5. Coin Toss.");
		System.out.println("6. Quit the Program");
		System.out.prinln();
	}
/*
	public void printScore(){
		System.out.println("Scoreboard:");
		System.out.println(gamesPlayed+ " Games played.");
		System.out.println(gamesWon+ " Games won.");
		System.out.println(gamesLost+ " Games lost.");
		System.out.println();
	} */

	public static void main(String args[]){
		getInput pickGame = new getInput();
		while (pickGame.getInput() < 6){
		printMenu();
		printScore();
		  pickGame.gamePick();
          if (pickGame.getInput() == 1) {
			  //start Look for the Thimble
          	  gamesPlayed++;
          	  /** If game won, increment var gamesWon, else if game lost, increments var gamesLost;*/
          	  pickGame.gamePick();
	      }
		  else if (pickGame.getInput() == 2) {
			  //start Guess the number
		  	  gamesPlayed++;
		  	  pickGame.gamePick();
		  }
		  else if (pickGame.getInput() == 3) {
			  //start odd and even
		  	  gamesPlayed++;
		  	  pickGame.gamePick();
	      }
		  else if (pickGame.getInput() == 4) {
		  	  //start Find the Red Thread
		  	  gamesPlayed++;
		  	  pickGame.gamePick();
		  }
		  else if (pickGame.getInput() == 5) {
			  //start Coin Toss
		  	  gamesPlayed++;
		  	  pickGame.gamePick();
		  }
	    }
	    //displayScore();
	}
}