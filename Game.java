/**
 * Class Game: Acts as a superclass for the Games associated with the Game of Games.
 *             
 *
 *@author Ali Hasan with Group 5 for CPSC340 Project
 *        under the supervision of Professor Spezialetti of Trinity College
 *@v 1.0 April 26th, 2019
 **/
import java.util.*;
import java.io.*;

public class Game{
	public int played, lost, won;

    /** 
     * Instructor method Game(): Instantiates a Game() instance with counts set to 0.
     */
	public Game(){
		this.played = 0;
		this.lost = 0;
		this.won = 0;
	}

	/**
	 * getWon(): Accessor method to the games won count.
	 *@return int: returns an integer variable
	 */
	public int getWon(){return won;}

	/**
	 * getLost(): Accessor method to the games lost count.
	 *@return int: returns an integer variable
	 */
	public int getLost(){return lost;}

	/**
	 * getPlayed(): Accessor method to the games played count.
	 *@return int: returns an integer variable
	 */
	public int getPlayed(){return played;}

	/**
	 * won(): Increments games won count.
	 *@return void
	 */
	public void won(){won++;}

	/**
	 * lost(): Increments games lost count.
	 *@return void
	 */
	public void lost(){lost++;}

	/**
	 * played(): Increments games played count.
	 *@return void
	 */
	public void played(){played++;}
}