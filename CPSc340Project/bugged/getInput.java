/**
 * Class getInput: Used in the Game of Games program. The main function of this class
 *                 is to communicate with the user and lets them pick their decisions
 *                 within the confines of the values speicified by Group 6.
 *
 * @author Ali Hasan with Group 5 for CPSC340 under the supervision of
 *         professor Spezialetti of Trinity College
 *@v1.0 April 26th 2019
 **/
import java.util.*;
import java.io.*;

public class getInput{
	private int inputVal;

	/** getInput(): Instructor method, setting the inputVal variable to its default value */
	public getInput(){this.inputVal=0;}

	/** getVal(): Auxiliary method that returns the field value inputVal
	 * @return int
	 **/
	public int getVal(){return inputVal;}

/**************************** Main Menu *************************/

    /**
     * gamePick(): This method prompts the user to input a value between 1 and 6, inclusive. It is used in the driver method
     *             for the Game of Games to let the user decide which game to play. It throws a mismatch exception
     *             when the input value is not an integer.
     *@return void
     **/
	public void gamePick() throws InputMismatchException{
		inputVal = 0; //resets inputVal to default to make sure the control goes through the loop
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 6:");
		while (inputVal > 6 || inputVal < 1){
			try {inputVal = scan.nextInt();}
			catch (InputMismatchException e) {
				System.out.println("The input type isn't valid. Please enter a valid number (Between 1 and 6):");
			    scan.next(); continue;
			}
			if (inputVal>6 || inputVal<1){
				System.out.println("The number you entered is not a valid option. Please enter a number between 1 and 6:");
			}
		}
	}
/**************************** Games start ups *************************/
    /**
     * startOrReturn(): This method prompts the user to input a value between 1 and 2, inclusive. It is used in the driver method
     *             for the Game of Games after a game has been picked by the user. It lets the user decide
     *             to return to the main menu or continue playing the game they picked after the instructions
     *             have been displayed. It throws a mismatch exception when the input value is not an integer.
     *             It should be used in all games.
     *@return void
     **/
	public void startOrReturn() throws InputMismatchException{
		inputVal = 0;
		Scanner scan = new Scanner(System.in);
		while (inputVal != 1 || inputVal != 2){
			try { 
				System.out.println("Enter \n1. Start Game \n2. Return to the Main Menu");
				inputVal = scan.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("The input type isn't valid. Please enter a valid number (1 or 2):");
				scan.next(); continue;
			} if (inputVal>2 || inputVal<1){
				System.out.println("The number you entered isn't a valid option.");
			  }
	        if (inputVal == 1 || inputVal==2) break;
	    } 
	}

	/**
     * playAgain(): This method prompts the user to input a value between 1 and 2, inclusive. It is used in the driver method
     *             for the Game of Games after a game has been ended. It lets the user decide
     *             to return to the main menu or play the same game they played again. 
     *             It throws a mismatch exception when the input value is not an integer.
     *@return void
     **/
	public void playAgain() throws InputMismatchException{
		inputVal = 0;
		Scanner scan = new Scanner(System.in);
		while (inputVal != 1 || inputVal != 2){
			System.out.println("Enter \n1. Play again \n2. Return to the Main Menu");
			try { inputVal = scan.nextInt();
			    if (inputVal>2 || inputVal<1){
				System.out.println("The number you entered isn't a valid option.");
			  }
			}
			catch (InputMismatchException e) {
				System.out.println("The input type isn't valid. Please enter a valid number (1 or 2):");
				scan.next(); continue;
			}
			if (inputVal==2 || inputVal==1){
				break;
			  }
     		}
	}

    /**
     * bestOf(): Lets the user decide how many rounds they want to play out of after they choose to play certain games.
     *           Throws a mismatch exception when the user specified input is not an integer.
     *@return void
     **/
	public void bestOf() throws InputMismatchException{
		inputVal = 0;
		Scanner scan = new Scanner(System.in);
		while (inputVal%2 == 0){
			System.out.println("How many rounds are we playing best of? The number you enter should be an odd number:");
			try {
				inputVal = scan.nextInt();
			} catch (InputMismatchException e){
				System.out.println("The input type isn't valid. Enter an odd integer:");
				scan.next(); continue;
			}
			if (inputVal%2==0) {
				System.out.println("Enter an odd number please!");
			}
		}

	}
/**************************** Even or Odd *************************/

    /**
     * evenOddPick(): Prompts the user to input an integer between 1 and 2, inclusive. It lets the user pick their
     *                choice of even or odd. This method is used in setEvenOdd() in the EvenOdd class.
     *                It throws a mismatch exception when the user specified input is not an integer.
     *@return void
     **/
	public void evenOddPick() throws InputMismatchException{
		inputVal =0;
		Scanner scan = new Scanner(System.in);
		while (inputVal != 1 || inputVal != 2){
			try { 
				System.out.println("Enter 1 to be Even or 2 to be Odd:");
			    inputVal = scan.nextInt();}
			catch (InputMismatchException e){
				System.out.println("The input type isn't valid.");
				scan.next(); continue;
			}
			if (inputVal>2 || inputVal<1){
				System.out.println("The number you entered isn't a valid option.");
			  }
			else { if (inputVal == 1 || inputVal == 2) break;}
		}
	}

	/**
	 * evenOddTurn(): Prompts the user to enter an integer value between 1 and 5, inclusive. The value inputted by the
	 *                user acts as their turn in a round of Even and Odd. It throws a mismatch exception
	 *                when the user specified input is not an integer.
	 * @return void
     **/
	public void evenOddTurn() throws InputMismatchException{
		inputVal = 0;
		Scanner scan = new Scanner(System.in);
		while (inputVal>5 || inputVal<1){
			try {
				System.out.println("Enter a number between 1 and 5:");
				inputVal = scan.nextInt();
			} catch (InputMismatchException e){
				System.out.println("The input type isn't valid.");
				scan.next(); continue;
			} if (inputVal>5 || inputVal<1){
				System.out.println("The number you entered is out of bounds.");
			}
		}
	}
/**************************** Find The Red Thread *************************/
    /**
	 * spools(): Prompts the user to enter an integer value between 1 and 11, inclusive. The value inputted by the
	 *                user acts as the number of how many spools are to be picked each turn in Find the Red Thread. It throws a mismatch exception
	 *                when the user specified input is not an integer.
	 * @return void
     **/
    public void spools() throws InputMismatchException{
		inputVal = 0;
		Scanner scan = new Scanner(System.in);
		while (inputVal>11 || inputVal<1){
			try {
				System.out.println("Enter a number between 1 and 11 to specify the number of spools to be pulled for each turn:");
				inputVal = scan.nextInt();
			} catch (InputMismatchException e){
				System.out.println("The input type isn't valid.");
				scan.next(); continue;
			} 
		}
	}
/***========================= Find the Thimble ==============================**/
    /**
	 * whichHand(): Prompts the user to enter a character value. The value inputted by the
	 *                user has to be r, l, R, or L, and it acts as the user's guess in Find The Thimble. It throws a mismatch exception
	 *                when the user specified input is not a character.
	 * @return void
     **/
    public void whichHand()throws InputMismatchException{
    	char hand = 'a'; //condition to start the loop
    	inputVal = 0;
		Scanner scan = new Scanner(System.in);
		while (hand!='l' && hand!='r' && hand!='R' && hand!='L'){
			try {
				System.out.println("Select which hand you think the thimble is in. Enter 'L' for left hand or 'R' for right hand:");
				hand = scan.next().charAt(0);
			} catch (InputMismatchException e){
				System.out.println("The input type isn't valid.");
				scan.next(); continue;
			} if (hand != 'l' && hand != 'r' && hand != 'R' && hand != 'L'){
				System.out.println("The character you entered is not a valid option.");
			}
		} if (hand=='r' || hand=='R'){inputVal=1;}
		  else inputVal=2;
    }
/**************************** Guess the Number *************************/
   /**
	 * enterRangeMin(): Prompts the user to enter an integer value to use as a range minimum for Guess The Number.
	 It throws a mismatch exception when the inputted value is not an integer value;
	 * @return void
     **/
public int enterRangeMin() throws InputMismatchException {
    inputVal = 0;
    boolean picked = false;
    Scanner scan = new Scanner(System.in);
    while (!picked) {
        try {
            System.out.println("Enter a digit number for minimum range please:");
            inputVal = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("The input type isn't valid.");
            scan.next();
            continue;
        } finally {picked = true;}
    }
    int Minimum = inputVal;
    return Minimum;
}
    
    /**
	 * enterRangeMax(): Prompts the user to enter an integer value to use as a range maximum for Guess The Number.
	 *    It throws a mismatch exception when the inputted value is not an integer value;
	 * @return void
     **/
    public int enterRangeMax(int min) throws InputMismatchException {
        inputVal = 0;
        boolean picked = false;
        Scanner scan = new Scanner(System.in);
        while (!picked || min > inputVal) {
            try {
                System.out.println("Enter a digit number for maximum range please; This value needs to be larger than the minimum value specified earlier:");
                inputVal = scan.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("The input type isn't valid.");
                scan.next();
                continue;
            } finally {picked = true;} 
        }
        int Maximum = inputVal;
        return Maximum;
    }
    
    /**
	 * numGuess(): Prompts the user to enter an integer value to use as the allowed number of guesses for Guess The Number.
	 * It throws a mismatch exception when the inputted value is not an integer value, and the value inputted cannot be more
	 * than half the values in the range.
	 * @return void
     **/
    public int numGuess(int Min, int Max) throws InputMismatchException {
        inputVal = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of guesses, however the number of guesses cannot be more than half the values in the range: ");
        while (inputVal < (Max - Min)/2) {
            try {
                System.out.println("Enter a digit number for times you want to take a guess please:");
                inputVal = scan.nextInt();
                if (inputVal > (Max - Min)/2) {
                    System.out.println(" the number of guesses cannot be more than half the values in the range");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("The input type isn't valid.");
                scan.next();
                continue;
            }
           
        }
        int numofGuess = inputVal;
        return numofGuess;
    }
    

    /**
	 * enterRangeMin(): Prompts the user to enter an integer value as their guess for Guess The Number.
	 * It throws a mismatch exception when the inputted value is not an integer value, and the value inputted 
	 * has to be within the user specified range of values.
	 * @return void
     **/
    public int Usernumber(int Min, int Max) throws InputMismatchException {
        inputVal = 0;
        boolean picked = false;
        Scanner scan = new Scanner(System.in);
        while (!picked) {
            try {
                System.out.println("Enter a digit number for within range please:");
                inputVal = scan.nextInt();
                if (inputVal< Min || inputVal > Max ) {
                   System.out.println("Number out of range");
                   continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("The input type isn't valid.");
                scan.next();
                continue;
            }
            picked = true;
        }
        int userpick = inputVal;
        return userpick;  
    }
 /** ========================= Coin Toss =====================**/
    /**
	 * Prompts the user to pick heads or tails.
	 *@return void
	 */
	public void headsOrTailsPick() throws InputMismatchException{
		inputVal = 0;	//Stores input
		Scanner scan = new Scanner(System.in);
		while (inputVal < 1 || inputVal > 2){
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
}

