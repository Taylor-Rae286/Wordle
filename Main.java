import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    
	    Scanner input = new Scanner(System.in);
	    
		wordGuessed answer = new wordGuessed();
		hangman George = new hangman();
		
		Boolean isRunning = true;
		int livesLeft = answer.lives;
		answer.hideWord();
		
		while(isRunning){
		    George.getHangman(livesLeft);
		    System.out.println(answer.showGuess());
		    System.out.println("Guess a letter!");
		    String myGuess = input.next().toUpperCase();
		    answer.GuessLetter(myGuess.charAt(0));
		    livesLeft = answer.lives;
		    if(livesLeft == 0){
		        isRunning = false;
		    }
		    else if(answer.isSolved()){
		        isRunning = false;
		    }
		}
		if(livesLeft == 0){
		    George.getHangman(livesLeft);
		    System.out.println("You lost, better luck next time!");
		    System.out.print("The word was really ");
		    answer.showWordToGuess();
		}
		else if(answer.isSolved()){
		    System.out.println("You guessed it! You should feel proud!");
		}
	}
}
