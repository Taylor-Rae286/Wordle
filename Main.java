import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    
		wordGuessed answer = new wordGuessed();
		hangman George = new hangman();
		
		Boolean isRunning = true;
		int livesLeft = 6;
		answer.hideWord();
		
		while(isRunning){
		    George.getHangman(livesLeft);
		    System.out.println(answer.showGuess());
		    isRunning = false;
		}
	}
}
