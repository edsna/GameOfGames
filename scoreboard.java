/**
 * Class scoreboard: A class dedicated to keep the score for the Game of Games.
 *                   This class has a methods to display and change the scores kept.
 *
 *@author Ali Hasan with Group 5 for CPSC340 Project
 *        under the supervision of Professor Spezialetti of Trinity College
 *@v 1.0 April 26th, 2019
 **/
public class scoreboard{
	private int totalGames, totalWins, totalLoss;
	private int gamesEO, winsEO, lossEO;
	private int gamesThimble, winsThimble, lossThimble;
	private int gamesGuess, winsGuess, lossGuess;
	private int gamesThread, winsThread, lossThread;
	private int gamesToss, winsToss, lossToss;

    /**
     * Instructor method scoreboard(): Instantiates a new scoreboard object with
     *            0 values for all its fields.
     */
	public scoreboard(){
		/** total scoreboard */
		this.totalLoss =0;
		this.totalWins=0;
		this.totalGames=0;
		/**Even&Odd scoreboard*/
		this.gamesEO=0;
		this.winsEO=0;
		this.lossEO=0;
		/** Coin Toss scoreboard */
		this.gamesToss=0;
		this.winsToss=0;
		this.lossToss=0;
		/** Find the Thread scoreboard */
		this.gamesThread=0;
		this.winsThread=0;
		this.lossThread=0;
		/* Guess the number scoreboard */
		this.gamesGuess=0;
		this.winsGuess=0;
		this.lossGuess=0;
		/* Find the thimble scoreboard */
		this.gamesThimble=0;
		this.winsThimble=0;
		this.lossThimble=0;
	}

    /**
     * printScore(): Displays the total score. In other words, the total games played, 
     *               won, and lost for the Game of Games and all the games individually as well.
     *  @param scoreboard s: takes in a scoreboard object to display the scores stored in it.
     *
     */
	public void printScore(scoreboard s){
		System.out.println("Scoreboard:");
		System.out.println("Total games played: "+s.getTotal()+".");
		System.out.println("Total games won: "+s.getTotalWins()+".");
		System.out.println("Total games lost: "+s.getTotalLoss()+".");
		System.out.println();
		System.out.println("Total Even & Odd games played: "+s.getEO()+".");
		System.out.println("Total Even & Odd games won: "+s.getEOWins()+".");
		System.out.println("Total Even & Odd games lost: "+s.getEOLoss()+".");
		System.out.println();
		System.out.println("Total Find The Thimble games played: "+s.getThimble()+".");
		System.out.println("Total Find The Thimble games won: "+s.getThimbleWins()+".");
		System.out.println("Total Find The Thimble games lost: "+s.getThimbleLoss()+".");
		System.out.println();
		System.out.println("Total Coin Toss games played: "+s.getToss()+".");
		System.out.println("Total Coin Toss games won: "+s.getTossWins()+".");
		System.out.println("Total Coin Toss games lost: "+s.getTossLoss()+".");
		System.out.println();
		System.out.println("Total Guess The Number games played: "+s.getGuess()+".");
		System.out.println("Total Guess The Number games won: "+s.getGuessWins()+".");
		System.out.println("Total Guess The Number games lost: "+s.getGuessLoss()+".");
		System.out.println();
		System.out.println("Total Find The Red Thread games played: "+s.getThread()+".");
		System.out.println("Total Find The Red Thread games won: "+s.getThreadWins()+".");
		System.out.println("Total Find The Red Thread games lost: "+s.getThreadLoss()+".");
		System.out.println();
		System.out.println("Total Coin Toss games played: "+s.getToss()+".");
		System.out.println("Total Coin Toss  games won: "+s.getTossWins()+".");
		System.out.println("Total Coin Toss games lost: "+s.getTossLoss()+".");
		System.out.println();
	} 

    /** =========Auxiliary Methods to manipulate the values of scoreboards======================================================*/ 
	
    /**
     * getTotal(): returns the total games played count
     * @return int
     */
	public int getTotal(){return totalGames;}

	/**
     * getTotalWins(): returns the total games won count
     * @return int
     */
	public int getTotalWins(){return totalWins;}

	/**
     * getTotalLoss(): returns the total games lost count
     * @return int
     */
	public int getTotalLoss(){return totalLoss;}

	/*========== Find The Red Thread Bookkeeping ===========*/
	/**
     * setThread(): Takes in an integer and increments the total game count, as well
     * as the Find The Red Thread game count by that integer.
     * @param int i: Takes in a number of games played count from a game.            
     */
	public void setThread(int i){gamesThread += i; totalGames += i;}

	/**
     * setThreadWins(): Takes in an integer and increments the total game wins count, as well
     * as the Find The Red Thread game wins count by that integer.
     * @param int i: Takes in a number of games played count from a game.            
     */
	public void setThreadWins(int i){winsThread += i; totalWins += i;}

	/**
     * setThreadLoss(): Takes in an integer and increments the total game lost count, as well
     * as the Find The Red Thread game lost count by that integer.
     * @param int i: Takes in a number of games played count from a game.            
     */
	public void setThreadLoss(int i){lossThread += i; totalLoss += i;}

	/**
     * getThread(): returns the total games played count of Find The Red Thread
     * @return int
     */
	public int getThread(){return gamesThread;}

	/**
     * getThread(): returns the total games won count of Find The Red Thread
     * @return int
     */
	public int getThreadWins(){return winsThread;}

	/**
     * getThreadLoss(): returns the total games lost count of Find The Red Thread
     * @return int
     */
	public int getThreadLoss(){return lossThread;}

	/* Find The Thimble Bookkeeping */
	/**
     * setThimble(): Takes in an integer and increments the total game count, as well
     * as the Find The Thimble game count by that integer.
     * @param int i: Takes in a number of games played count from a game.            
     */
	public void setThimble(int i){gamesThimble += i; totalGames += i;}

	/**
     * setThimbleWins(): Takes in an integer and increments the total game wins count, as well
     * as the Find The Thimble game wins count by that integer.
     * @param int i: Takes in a number of games played count from a game.            
     */
	public void setThimbleWins(int i){winsThimble += i; totalWins += i;}

	/**
     * setThimbleWins(): Takes in an integer and increments the total game lost count, as well
     * as the Find The Thimble game lost count by that integer.
     * @param int i: Takes in a number of games played count from a game.            
     */
	public void setThimbleLoss(int i){lossThimble += i; totalLoss += i;}

	/**
     * getThimble(): returns the total games won count of Find The Thimble
     * @return int
     */
	public int getThimble(){return gamesThimble;}

	/**
     * getThimbleWins(): returns the total games won count of Find The Thimble
     * @return int
     */
	public int getThimbleWins(){return winsThimble;}

	/**
     * getThimbleLoss(): returns the total games lost count of Find The Thimble
     * @return int
     */
	public int getThimbleLoss(){return lossThimble;}

	/* Guess The Number Bookkeeping */
	/**
     * setGuess(): Takes in an integer and increments the total game count, as well
     * as the Guess The Number game count by that integer.
     * @param int i: Takes in a number of games played count from a game.            
     */
	public void setGuess(int i){gamesGuess += i; totalGames += i;}

	/**
     * setGuessWins(): Takes in an integer and increments the total game wins count, as well
     * as the Guess The Number game wins count by that integer.
     * @param int i: Takes in a number of games played count from a game.            
     */
	public void setGuessWins(int i){winsGuess += i; totalWins += i;}

	/**
     * setGuessLoss(): Takes in an integer and increments the total game loss count, as well
     * as the Guess The Number game loss count by that integer.
     * @param int i: Takes in a number of games played count from a game.            
     */
	public void setGuessLoss(int i){lossGuess += i; totalLoss += i;}

	/**
     * getGuess(): returns the total games played count of Guess The Number
     * @return int
     */
	public int getGuess(){return gamesGuess;}

	/**
     * getGuessWins(): returns the total games won count of Guess The Number
     * @return int
     */
	public int getGuessWins(){return winsGuess;}

	/**
     * getGuessLoss(): returns the total games lost count of Guess The Number
     * @return int
     */
	public int getGuessLoss(){return lossGuess;}

	/* Coin Toss Bookkeeping */
	/**
     * setToss(): Takes in an integer and increments the total game count, as well
     * as the Coin Toss game count by that integer.
     * @param int i: Takes in a number of games played count from a game.            
     */
	public void setToss(int i){gamesToss += i; totalGames += i;}

	/**
     * setTossWins(): Takes in an integer and increments the total game wins count, as well
     * as the Coin Toss game wins count by that integer.
     * @param int i: Takes in a number of games played count from a game.            
     */
	public void setTossWins(int i){winsToss += i; totalWins += i;}

	/**
     * setTossLoss(): Takes in an integer and increments the total game loss count, as well
     * as the Coin Toss game loss count by that integer.
     * @param int i: Takes in a number of games played count from a game.            
     */
	public void setTossLoss(int i){lossToss += i; totalLoss += i;}

	/**
     * getToss(): returns the total games played count of Coin Toss
     * @return int
     */
	public int getToss(){return gamesToss;}

	/**
     * getTossWins(): returns the total games won count of Coin Toss
     * @return int
     */
	public int getTossWins(){return winsToss;}

	/**
     * getTossLoss(): returns the total games lost count of Coin Toss
     * @return int
     */
	public int getTossLoss(){return lossToss;}

	/* Odd Even Bookkeeping */
	/**
     * setEO(): Takes in an integer and increments the total games played count, as well
     * as the Even and Odd games played count by that integer.
     * @param int i: Takes in a number of games played count from a game.            
     */
	public void setEO(int i){gamesEO += i; totalGames += i;}

	/**
     * setEOWins(): Takes in an integer and increments the total game wins count, as well
     * as the Even & Odd game wins count by that integer.
     * @param int i: Takes in a number of games played count from a game.            
     */
	public void setEOWins(int i){winsEO += i; totalWins += i;}

	/**
     * setEOLoss(): Takes in an integer and increments the total game loss count, as well
     * as the Even & Odd game loss count by that integer.
     * @param int i: Takes in a number of games played count from a game.            
     */
	public void setEOLoss(int i){lossEO += i; totalLoss += i;}

	/**
     * getEO(): returns the total games played count of Even and Odd
     * @return int
     */
	public int getEO(){return gamesEO;}

	/**
     * getEOWins(): returns the total games won count of Even and Odd
     * @return int
     */
	public int getEOWins(){return winsEO;}

	/**
     * getEOLoss(): returns the total games lost count of Even and Odd
     * @return int
     */
	public int getEOLoss(){return lossEO;}
}