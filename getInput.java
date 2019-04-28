import java.util.*;
import java.io.*;

public class getInput{
	private int inputVal;

	public getInput(){this.inputVal=0;}

	public int getVal(){
		return inputVal;
	}

/**************************** Main Menu *************************/
	public void gamePick() throws InputMismatchException{
		inputVal = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number between 1 and 6:");
		while (inputVal > 6 || inputVal < 1){
			try { inputVal = scan.nextInt(); }
			catch (InputMismatchException e) {
				System.out.println("The input type isn't valid. Please enter a valid number (Between 1 and 6):");
				inputVal = scan.nextInt();
			}
			if (inputVal>6 || inputVal<1){
				System.out.println("The number you entered is not a valid option. Please enter a number between 1 and 6:");
			}
		}
	}
/**************************** Games start ups *************************/
	public void startOrReturn() throws InputMismatchException{
		inputVal = 0;
		Scanner scan = new Scanner(System.in);
		while (inputVal != 1 || inputVal != 2){
			System.out.println("Enter \n1. Start Game \n2. Return to the Main Menu");
			try { inputVal = scan.nextInt();}
			catch (InputMismatchException e) {
				System.out.println("The input type isn't valid. Please enter a valid number (1 or 2):");
			}
			if (inputVal>2 || inputVal<1){
				System.out.println("The number you entered isn't a valid option.");
			  }
     		}
	}
	
    /**
      */
	public void bestOf() throws InputMismatchException{
		inputVal = 0;
		Scanner scan = new Scanner(System.in);
		while (inputVal%2 == 0){
			System.out.println("How many rounds are we playing best of? The number you enter should be an odd number:");
			try {
				inputVal = scan.nextInt();
			} catch (InputMismatchException e){
				System.out.println("The input type isn't valid. Enter an odd integer:");
			}
			if (inputVal%2==0) {
				System.out.println("Enter an odd number please!")
			}
		}

	}
/**************************** Even or Odd *************************/
	public void evenOddPick() throws InputMismatchException{
		inputVal =0;
		Scanner scan = new Scanner(System.in);
		while (inputVal != 1 || inputVal != 2){
			try { 
				System.out.println("Enter 1 to be Even or 2 to be Odd:");
			    inputVal = scan.nextInt();}
			catch (InputMismatchException e){
				System.out.println("The input type isn't valid.");
			}
			if (inputVal>2 || inputVal<1){
				System.out.println("The number you entered isn't a valid option.");
			  }
		}
	}

	/**
      */
	public void evenOddTurn() throws InputMismatchException{
		inputVal = 0;
		Scanner scan = new Scanner(System.in);
		while (inputVal>5 || inputVal<1){
			try {
				System.out.println("Enter a number between 1 and 5:");
				inputVal = scan.nextInt();
			} catch (InputMismatchException e){
				System.out.println("The input type isn't valid.")
			} if (inputVal>5 || inputVal<1){
				System.out.println("The number you entered is out of bounds.");
			}
		}
	}

}