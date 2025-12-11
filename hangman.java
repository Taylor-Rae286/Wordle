public class hangman{
    
    
    
    hangman(){
    }
    
    void getHangman(int lives){
        switch(lives){
            case(0):
                System.out.println("      ______");
                System.out.println("      |    |");
                System.out.println("      ()   |");
                System.out.println("     /|L   |");
                System.out.println("      |    |");
                System.out.println("     /L    |");
                System.out.println("     ______|");
                
            case(1):
                System.out.println("      ______");
                System.out.println("      |    |");
                System.out.println("      ()   |");
                System.out.println("     /|L   |");
                System.out.println("      |    |");
                System.out.println("     /     |");
                System.out.println("     ______|");
                
            case(2):
                System.out.println("      ______");
                System.out.println("      |    |");
                System.out.println("      ()   |");
                System.out.println("     /|L   |");
                System.out.println("      |    |");
                System.out.println("           |");
                System.out.println("     ______|");
                
            case(3):
                System.out.println("      ______");
                System.out.println("      |    |");
                System.out.println("      ()   |");
                System.out.println("     /|    |");
                System.out.println("      |    |");
                System.out.println("           |");
                System.out.println("     ______|");
                
            case(4):
                System.out.println("      ______");
                System.out.println("      |    |");
                System.out.println("      ()   |");
                System.out.println("      |    |");
                System.out.println("      |    |");
                System.out.println("           |");
                System.out.println("     ______|");
                
            case(5):
                System.out.println("      ______");
                System.out.println("      |    |");
                System.out.println("      ()   |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("     ______|");
                
            case(6):
                System.out.println("      ______");
                System.out.println("      |    |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("     ______|");
                
        }
    }
}
