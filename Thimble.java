/**
 * Class Thimble: An actualization of the game Find the Thimble in the Game of Games.
 * 
 *@author Fumihiro Tamada } Both with Group 5 of CPSC340 under the supervision of Professor Spezialetti
 *@author Ali Hasan       } of Trinity College
 * 
 *@version 1.1 April 29th 2019
 **/
public class Thimble extends Game{
	private int rounds, roundsWon, roundsLost;
	private final int LEFT = 2; private final int RIGHT = 1;

   /**
	* Thimble(): Instructor method. Creates a Find The Thimble Game object. 
	*/
	public Thimble(){
		this.rounds =0;
		this.roundsWon =0;
		this.roundsLost =0;
		this.played =0;
		this.won =0;
		this.lost =0;
	}
    
    /**
	 * displayInstructions(): Helper method for the Thimble class. It displays
	 *      instructions as to how to play the game. 
	 *@return void
	 **/
	public void displayInstructions(){
		System.out.println("Find the Thimble:");
		System.out.println("The computer is going to randomally place a thimble in the left or right hand. You will be prompted to enter the number of how many rounds you want the game to be played out of and a guess as to which hand the thimble is in");
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
     *             instance of the find the thimble game.
     *          -- The number of rounds the user is allowed to pick has to be an odd integer.
     *@return void
	 **/
	public void hmRounds(){
		getInput pick = new getInput();
		pick.bestOf();
		rounds = pick.getVal();
	}
    

    /**
	 * play(): Main method of Find The Thimble game. It traps the user in a loop
	 *    where the breaking condition for that loop is that the number of rounds won or lost
	 *    has the majority portion of the number of rounds specified by the user. 
	 *    
	 *@return void
	 **/
	public void play(){
		getInput choice = new getInput();
		int whichHand;
		while (roundsWon<rounds || roundsLost<rounds){
			whichHand = randomGen(RIGHT, LEFT);
			if (whichHand==RIGHT){
			    System.out.println("The computer placed the thimble in the right hand");
		    }
		    else {
		    	System.out.println("The computer placed the thimble in the left hand");
		    }
			choice.whichHand();
			if (choice.getVal() == whichHand){
				System.out.println("You guessed correctly!");
				roundsWon++;
				if (roundsWon>rounds/2) break;
			} else {
				System.out.println("You guessed wrong!");
				roundsLost++;
				if (roundsLost>rounds/2) break;
			}
		} if (roundsWon>roundsLost) {
			System.out.println("You've won the game!");
			played(); won();
		} else {
			System.out.println("You've lost the game!");
			played(); lost();
		} rounds =0; roundsWon =0; roundsLost=0; //reset round score to prepare for game restart 
	}

}