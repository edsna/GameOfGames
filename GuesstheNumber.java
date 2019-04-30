/**
 * Class GuesstheNumber: An Actualization of the Guess The Number game of the program Game of Games.
 * 
 * @author Cecilia Wang } Both with Group 5 of CPSC340 under the supervision of Professor Spezialetti
 * @author Ali Hasan    } of Trinity College
 * @version 1.1 April 29th 2019
 **/


import java.util.*;
import java.io.*;

public class GuesstheNumber extends Game{


    private int ChanceTaken;


    /*Constructor*/
    public GuesstheNumber(){};


    /*
     *Computer generates random number
     *@ret: Returns integer
     *@param: takes minimum and maximum range to bound generated number
     */
    public int ComputerGenerate(int MinRange, int MaxRange){         //Computer's Turn
        int boundary = MaxRange - MinRange + 1;
        return (int)(Math.random()*boundary)+MinRange;
    }

    /*
     *Instruction Display
     *@ret: N/A
     *@param: N/A
     */
    public void displayInstructions(){
        System.out.println("Guess The Number:");
        System.out.println("To play this, you're going to specify a minimum value and a maximum value, creating a range.");
        System.out.print(" Following that, you're going to specify a number of guesses that the user can attempt before losing the game. ");
        System.out.print("However, this number cannot exceed half the amount of integers that exist within the user specified range.");
        System.out.println("In order to win, the user has to correctly guess a randomally generated integer value within the specified range.");
    }


    /*
     *User pick number from input
     *@ret: returns integer
     *@param: Minimum and Maximum to bound the number user can pick
     */
    public int UserGuess(int min, int max){                //User's turn
        getInput pick = new getInput();
        return pick.Usernumber(min, max);
    }


    /*
     * Game process
     *@ret: void
     *@param: N/A
     */
    public void GuessCompare (){    // Game
        getInput pick = new getInput();
        int min = pick.enterRangeMin();
        int max = pick.enterRangeMax(min);
        int numberGuess = pick.numGuess(min, max);
        ChanceTaken = numberGuess;
        int usernumber = 0;
        int computer = 0;
        while (ChanceTaken != 0){
            computer = ComputerGenerate(min, max);
            System.out.println("The computer picked value is: "+computer); // Shows the computer picked value
            usernumber = UserGuess(min, max);
            if (usernumber == computer){
                System.out.println("User Win!");
                played();
                won();
                break;
            }
            else{
                System.out.println("User guess is wrong!");
                ChanceTaken--;
            }
        }
        if (ChanceTaken == 0){
            System.out.println("User lose!");
            played();
            lost();
        } usernumber =0; computer =0; //reset in case of game restart
    }
}

