/**
 * Class Thread: A class for the game Find the Red Thread in the Game of Games. It extends the superclass Game.
 * 
 * @author Ali Hasan with Group 5 of CPSC340 under the supervision of professor Spezialetti of Trinity College
 * @version 1.0 April 28th, 2019
 **/

public class Thread extends Game{
	private int spools;
	private boolean userTurn, winnerFound;
	final private String RED = "red";
	final private int max = 11;

	/**
	 * Thread(): Default instructor method for the class Thread. It creates an instance of the game 
	 * 			 Find the Red Thread in the Game of Games. This instructor sets the values of all the fields
	 * 			 of the Thread class to default. The default being 0 for all the games played, won and lost counters,
	 *			 true for userTurn, to allow the user to play first, and winnerFound to false.
	 **/
	public Thread(){
		this.userTurn = true;
		this.winnerFound = false;
		this.played =0;
		this.won =0;
		this.lost =0;
		this.spools =0;
	}

	/**
	 * displayInstructions(): Helper method for the Thread class. It displays
	 *      	 instructions as to how to play the game, Find the Red Thread. 
	 *@return void
	 **/
	public void displayInstructions(){
		System.out.println("Find The Red Thread:");
		System.out.println("To play this game, you're going to specify a number of spools to be pulled out of a box at each turn. ");
		System.out.print("You will alternate turns with the computer, pulling spools out of the box until you, or the computer finds the red thread.");
		System.out.println("The winner is decided by who pulls the red thread first.");
	}

	/**
	 * spoolsNum(): Helper method that utilizes a getInput object, prompting the user to enter how many
	 * 				threads are to be picked before each turn ends.
	 *@return void
	 **/
	public void spoolsNum(){
		getInput number = new getInput();
		number.spools();
		spools = number.getVal();
	}

	/**
	 * turn(): Helper method that facilitates switching turns between the user and the CPU.
	 *
	 *@return void
	 **/
	public void turn(){
		if (userTurn) userTurn = false;
		else userTurn = true;
	}

	/**
	 * winner(): Helper method that switches a flag to signal that the red thread has been found. It is
	 * 			 used as the terminating condition for the current Find the Red Thread game being played.
	 *@return void
	 **/
	public void winner(){
		winnerFound = true;
	}

	/**
	 * reset(): Helper method that resets the flags of the class Thread to their default values. Default being
	 * 			userTurn set to true, and winnerFound = false. It is used at the end of the method play() to allow
	 * 			the user to restart the game without creating another instance of the class Thread.
	 *@return void
	 **/
	public void reset(){
		winnerFound = false;
		userTurn = true;
	}

	/**
	 * play(): Main method of the Find the Red Thread game. It traps the user in a loop
	 *    where the breaking condition for that loop is that the user or the computer found the red thread.
	 *    It increments the total games played, won, and lost after each game.
	 *    
	 *@return void
	 **/
	public void play(){
		int spoolsLeft;
		Spool thread = new Spool();
		thread.spoolBox();
		while (!winnerFound){
			if (userTurn){ //User's turn
				for (spoolsLeft=spools; spoolsLeft>0; spoolsLeft--){
					if (thread.picked(thread.boxPick(max)).getColor().equals(RED)){
						System.out.println("You've found the red thread!");
						System.out.println("Winner winner chicken dinner, not from mather though.");
						played(); won(); winner(); break; //Game ends
					} else if (spoolsLeft==1){
						System.out.println("You've pulled a "+thread.picked(thread.boxPick(max)).getColor()+" colored thread.");
						System.out.println("You've ran out of picks this turn. The computer is going to play now...");
						turn(); //User turn ends
					} else System.out.println("You've pulled a "+thread.picked(thread.boxPick(max)).getColor()+" colored thread.");
				}
			} else { //Computer's turn
				for (spoolsLeft=spools; spoolsLeft>0; spoolsLeft--){
					if (thread.picked(thread.boxPick(max)).getColor().equals(RED)){
						System.out.println("The computer found the red thread!");
						System.out.println("Loser");
						played(); lost(); winner(); break; //Game ends
					} else if (spoolsLeft==1){
						System.out.println("The computer pulled a "+thread.picked(thread.boxPick(max)).getColor()+" colored thread.");
						System.out.println("The computer ran out of picks this turn. You're going to play now...");
						turn(); //Computer turn ends
					} else {
						System.out.println("The computer pulled a "+thread.picked(thread.boxPick(max)).getColor()+" colored thread.");
					}
				}
			}
		} reset(); //Resets the flags associated with the Thread class to allow the user
		           //to play again if they wish to. 
	}
}