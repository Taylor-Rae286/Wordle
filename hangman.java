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
                break;
                
            case(1):
                System.out.println("      ______");
                System.out.println("      |    |");
                System.out.println("      ()   |");
                System.out.println("     /|L   |");
                System.out.println("      |    |");
                System.out.println("     /     |");
                System.out.println("     ______|");
                break;
                
            case(2):
                System.out.println("      ______");
                System.out.println("      |    |");
                System.out.println("      ()   |");
                System.out.println("     /|L   |");
                System.out.println("      |    |");
                System.out.println("           |");
                System.out.println("     ______|");
                break;
                
            case(3):
                System.out.println("      ______");
                System.out.println("      |    |");
                System.out.println("      ()   |");
                System.out.println("     /|    |");
                System.out.println("      |    |");
                System.out.println("           |");
                System.out.println("     ______|");
                break;
                
            case(4):
                System.out.println("      ______");
                System.out.println("      |    |");
                System.out.println("      ()   |");
                System.out.println("      |    |");
                System.out.println("      |    |");
                System.out.println("           |");
                System.out.println("     ______|");
                break;
                
            case(5):
                System.out.println("      ______");
                System.out.println("      |    |");
                System.out.println("      ()   |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("     ______|");
                break;
                
            case(6):
                System.out.println("      ______");
                System.out.println("      |    |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("           |");
                System.out.println("     ______|");
                break;
                
        }
    }
}
