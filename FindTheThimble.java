import java.util.Random;
import java.util.Scanner;

public class FindTheThimble extends Game{
  private int numGames = 0;//The number fo game total to play
  private int numUserWins = 0;//The number of game that the user wins
  private int numGamesPlayed = 0;//The number of games played

  //Constructor
  //public FindTheThimble(int nGames){
  //  numGames = nGames;
  //}

  //The method that determines whether the game is over or not
  public boolean isGameOver(){
    return numGames == numGamesPlayed;
  }

  //The method to tell whether the user wins or not
  public boolean userWins(){
    if(numUserWins > (numGames/2)){
      System.out.println("User wins");
      return true;
    }
    else{
      System.out.println("User loses");
      return false;
    }
  }

  //The method that takes the input and increse the variable according to the rule
  public boolean guess(String s){
    int guess = convertGuessToInt(s);
    int hand = hideTheThimble();
    if(hand == guess){
      numUserWins++;
      numGamesPlayed++;
      System.out.println("Your guess is correct");
      return true;
    }
    else{
      numGamesPlayed++;
      System.out.println("Your guess is wrong");
      return false;
    }
  }

  //The method that choose random number to hide the thimble
  public int hideTheThimble(){
    Random rand = new Random();
    int n = rand.nextInt(100);
    if(n > 50){
      return 1;
    }
    else{
      return 0;
    }
  }

  /*
  //The method to validate the input
  public boolean validateInput(String s){
    return s.equals("Right") || s.equals("Left");
  }

  //The static method to validate the number of games
  public boolean validateNumGames(int i){
    return i > 0;
  }
  */

  //The method to convert string to the integer
  public int convertGuessToInt(String s){
    if(s == "Right"){return 1;}
    else{return 0;}
  }


  public void play(){
    getInput g = new getInput();
    System.out.println("Input the number of games you want to play:");
    int i = g.scanInt();
    while(!g.thimblevalidateNumGames(i)){
      System.out.println("Invalid Input. Input the number of games you want to play:");
      i = g.scanInt();
    }
    numGames = i;
    while(!isGameOver()){
      System.out.println("Enter Left or Right:");
      String s = g.scanString();
      //System.out.println(s);
      while(!g.thimblevalidateInput(s)){
        //System.out.println(f.validateInput(s));
        System.out.println("Invalid input. Enter Left or Right:");
        s = g.scanString();
      }
      guess(s);
    }
    if(userWins()){won++;played++;}
    else{lost++;played++;}
  }

  public static void main(String[] args) {
    FindTheThimble f = new FindTheThimble();
    f.play();
  }
  //Main method
  /*
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Input the number of games you want to play:");
    int i = sc.nextInt();
    while(!validateNumGames(i)){
      System.out.println("Invalid Input. Input the number of games you want to play:");
      i = sc.nextInt();
    }
    FindTheThimble f = new FindTheThimble(i);
    while(!f.isGameOver()){
      System.out.println("Enter Left or Right:");
      String s = sc.next();
      //System.out.println(s);
      while(!f.validateInput(s)){
        //System.out.println(f.validateInput(s));
        System.out.println("Invalid input. Enter Left or Right:");
        s = sc.next();
      }
      f.guess(s);
    }
    f.userWins();
  }
  */
}
