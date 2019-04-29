
public class scoreboard{
	private int totalGames, totalWins, totalLoss;
	private int gamesEO, winsEO, lossEO;
	private int gamesThimble, winsThimble, lossThimble;
	private int gamesGuess, winsGuess, lossGuess;
	private int gamesThread, winsThread, lossThread;
	private int gamesToss, winsToss, lossToss;

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
	} 

	public int getTotal(){return totalGames;}
	public int getTotalWins(){return totalWins;}
	public int getTotalLoss(){return totalLoss;}

	/* Find The Red Thread Bookkeeping */
	public void setThread(int i){gamesThread += i; totalGames += i;}
	public void setThreadWins(int i){winsThread += i; totalWins += i;}
	public void setThreadLoss(int i){lossThread += i; totalLoss += i;}
	public int getThread(){return gamesThread;}
	public int getThreadWins(){return winsThread;}
	public int getThreadLoss(){return lossThread;}

	/* Find The Thimble Bookkeeping */
	public void setThimble(int i){gamesThimble += i; totalGames += i;}
	public void setThimbleWins(int i){winsThimble += i; totalWins += i;}
	public void setThimbleLoss(int i){lossThimble += i; totalLoss += i;}
	public int getThimble(){return gamesThimble;}
	public int getThimbleWins(){return winsThimble;}
	public int getThimbleLoss(){return lossThimble;}

	/* Guess The Number Bookkeeping */
	public void setGuess(int i){gamesGuess += i; totalGames += i;}
	public void setGuessWins(int i){winsGuess += i; totalWins += i;}
	public void setGuessLoss(int i){lossGuess += i; totalLoss += i;}
	public int getGuess(){return gamesGuess;}
	public int getGuessWins(){return winsGuess;}
	public int getGuessLoss(){return lossGuess;}

	/* Coin Toss Bookkeeping */
	public void setToss(int i){gamesToss += i; totalGames += i;}
	public void setTossWins(int i){winsToss += i; totalWins += i;}
	public void setTossLoss(int i){lossToss += i; totalLoss += i;}
	public int getToss(){return gamesToss;}
	public int getTossWins(){return winsToss;}
	public int getTossLoss(){return lossToss;}

	/* Odd Even Bookkeeping */
	public void setEO(int i){gamesEO += i; totalGames += i;}
	public void setEOWins(int i){winsEO += i; totalWins += i;}
	public void setEOLoss(int i){lossEO += i; totalLoss += i;}
	public int getEO(){return gamesEO;}
	public int getEOWins(){return winsEO;}
	public int getEOLoss(){return lossEO;}
}