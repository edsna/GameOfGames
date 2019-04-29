import java.util.*;
import java.io.*;

public class Game{
	public int played, lost, won;

	public Game(){
		this.played = 0;
		this.lost = 0;
		this.won = 0;
	}

	public int getWon(){return won;}
	public int getLost(){return lost;}
	public int getPlayed(){return played;}

	public void won(){won++;}
	public void lost(){lost++;}
	public void played(){played++;}
}