package app;

public class Examen {
    String Face="Face";
    String Book = "Book";
    String Facebook ="Facebook";

    public String Multiplos(int x) {

        if(x % 15 == 0){
            return Facebook;
        }
        else if(x % 3 == 0){
            return Face;
        }
        
        else if(x % 5 == 0){
            return Book;
        }

        

        else{
            return String.valueOf(x);
        }
    }
    
    public int MultConArray(int [] valores){
        int i;
        
        for(i=0; i < array.length;i++){

        }
        return i;
    }
}

    
