import java.util.*;
import java.io.*;

public class EvenOdd extends Game{
	protected int rounds,roundsPlayed, roundsWon, roundsLost;
	protected boolean even;

	public void setEven(){even = true;}
	public boolean getStatus(){return even;}

	public EvenOdd(){
		this.even = false;
		this.rounds = 0;
		this.roundsPlayed = 0;
		this.roundsLost = 0;
		this.roundsWon = 0;
		this.played = 0;
		this.lost = 0;
		this.won = 0; 
	}

	public void displayInstructions(){
		System.out.println("Even and Odd:");
		System.out.println("Thete computer is going to randomally pick a value between 1 and 5, inclusive. You also g to input a random number between 1 and 5. These two picks will be summed up, and the total of both is going to either be even or odd. You're going to be prompted whether you want to be even or odd shortly.");
	}

	public void setEvenOdd(){
		getInput pick = new getInput();
		pick.evenOddPick();
		if (pick.returnVal() == 1) 
			setEven();
	}

	public void hmRounds(){
		getInput pick = new getInput();
		pick.bestOf();
		rounds = pick.returnVal();
	}

	public void play(){
		int computer, cap, total;
		cap = rounds/2 + 1;
		while(roundsWon<cap || roundsLost<cap){
			computer = compTurn(1,5);
			getInput choice = new getInput();
			choice.evenOddTurn();
			total = choice.returnVal() + computer;
			System.out.println("The computer picked "+comptuer+",");
			System.out.println("You picked "+choice.returnVal()+",");
			System.out.println("Totalling for "+total+".");
			roundsPlayed++;
			if (total%2 == 0){
				if (even) {
					System.out.println("You've won this round!");
					roundsWon++;
				} else {
					System.out.println("You've lost this round!");
					roundsLost++;
				}
			} else {
				if (even){
					System.out.println("You've lost this round!");
					roundsLost++;
				} else {
					System.out.println("You've won this round!");
					roundsWon++;
				}
			} 
		} if (roundsWon<cap) {this.win++; this.played++;}
		  else {this.lost++;this.played++;}

	}

	public int compTurn(int min, int max){
		int boundary = (max-min)+1;
		return (int)(Math.random()*boundary)+min;
	}
}