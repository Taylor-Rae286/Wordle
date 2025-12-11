class wordGuessed{
    wordLibrary options = new wordLibrary();
    
    char[] wordToGuess = options.getWord();
    public char[] Guess = wordToGuess;
    
    int lives;
    
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
            
            if (Guess[i] == letter){
                Guess[i] = letter;
                guessedRight = true;
            }
        }
        if(guessedRight){
            System.out.println("You guessed Right!");
        }
        else{
            System.out.println("You guessed wrong.");
            
        }
        return guessedRight;
    }
        
    char[] showGuess(){
        return Guess;
    }
    
    
}
