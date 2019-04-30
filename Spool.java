/**
 * Class Spool: a class dedicated to simulate the box of threads for the game Find The Red Thread in the Game of Games.
 *
 *@author Ali Hasan with Group 5 of CPSC340 under the supervision of professor Spezialetti of Trinity College 
 *@version 1.0 April 29th, 2019
 **/

public class Spool{
	final private String[] colors = {"red", "yellow","orange","blue", "green", "brown", "black", "white", "pink", "purple", "teal"};
	final private int max = 10; final private int COLORS=11; private final int RED = 0;
	final private Spool[] box = new Spool[COLORS];
	private String color;

	/**
	 * Spool(): Default instructor method for the class Spool.
	 **/
	public Spool(){}

	/**
	 * Spool(int): Instructor method for the class Spool. It assigns each new Spool object with a color based
	 *             on the integer value being passed to it.
	 * @param colorSet: Integer; sets the color of each new spool object based on a list of 11 different colors.
	 * @return void
	 **/
	public Spool(int colorSet){
		this.color = colors[colorSet];
	}

	/**
	 * spoolBox(): Simulates a box of threads by utilizing an array data structure. This is an auxiliary
	 *             method which automates the creation of unique threads in an organized fashion.
	 * @return void
	 **/
	public void spoolBox(){
		for (int i=0; i<COLORS; i++)
			box[i] = new Spool(RED);
	}

	/**
	 * picked(): A method that simulates picking a thread out of an array of threads. It returns a Spool object.
	 *
	 * @param pick: Integer; determines which spool object to pick out of the array of spools.
	 * @return Spool.
	 **/
	public Spool picked(int pick){return box[pick];}

	/**
	 * boxPick(int): A method that generates a random number between 0 and the integer value being passed to it.
	 *
	 * @param max: Integer; determines the maximum value the algorithm can randomally generate.
	 * @return int: The value being returned is within the range [0,max].
	 **/
	public int boxPick(int max){
		return (int)(Math.random()*max); //returns a random integer between 0 and max
	}

	/**
	 * getColor(): Accessor method for the field color of a Spool instance.
	 *
	 * @return String: returns a string which contains the color associated with a spool object.
	 **/
	public String getColor(){return color;}
}