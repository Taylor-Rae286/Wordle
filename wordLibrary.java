import java.util.Random;
class wordLibrary{
    
    Random random = new Random();
    
    char[][] words = {
        {'K','E','L','L','E','R'},
        {'F','L','O','O','R'},
        {'J','A','D','E','N'},
        {'C','O','M','P','U','T','E','R'},
        {'S','C','I','E','N','C','E'},
        {'F','A','N','F','I','C','T','I','O','N'},
        {'E','Y','E','B','A','L','L','S'},
        {'P','R','E','T','Z','E','L'},
        {'T','A','Y','L','O','R'},
        {'Q','U','I','N','N'},
        {'N','A','T','A','L','I','E'},
        {'L','E','M','O','N','A','D','E'},
        {'D','A','N','C','E'},
        {'A','V','I','S'},
        {'M','A','R','D','U','K'},
        {'C','U','L','T','S'},
        {'P','R','E','C','I','O','U','S'}
    };
    wordLibrary(){
    }
    
    char[] getWord(){
        return words[random.nextInt(10)];
    }
}
