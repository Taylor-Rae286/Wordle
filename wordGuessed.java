import java.util.Arrays;
class wordGuessed{
    wordLibrary options = new wordLibrary();
    
    char[] wordToGuess = options.getWord();
    int wordToGuessLength = wordToGuess.length;
    public char[] Guess = new char[wordToGuessLength];
    
    int lives = 6;
    
    void hideWord(){
        for(int i = 0; i < Guess.length; i++){
        Guess[i] = '_';
        }
    }
    
    wordGuessed(){
    }
    
    
    
    boolean GuessLetter(char letter){
        
        boolean guessedRight = false;
         
        for(int i = 0; i < Guess.length; i++){
            
            if (wordToGuess[i] == letter){
                Guess[i] = letter;
                guessedRight = true;
            }
                
            
        }
        if(guessedRight){
            System.out.println("You guessed Right!");
            return guessedRight;
        }
        else{
            System.out.println("You guessed wrong.");
            lives--;
            return guessedRight;
            
        }
        
    }
        
    char[] showGuess(){
        return Guess;
    }
    void showWordToGuess(){
        for(int i = 0; i < wordToGuess.length; i++){
            System.out.print(wordToGuess[i]);
        }
    }
    
    boolean isSolved(){
        if(Arrays.equals(Guess, wordToGuess)){
            return true;
        }
        else{
            return false;
        }
    }
    
    
}
