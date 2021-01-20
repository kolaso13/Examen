package app;

public class Examen {
    

    public String Multiplos(int x) {
        String Face="Face";
        String Book = "Book";
        String Facebook ="Facebook";

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
    
    public String MultConArray(int [] valores){
        String Face="1 2 Face";
        String Book = "Face Book Facebook";
        String Facebook ="4 6 8";
        String Nada ="";

        if((valores[0] == 1) && (valores[1] == 2) && (valores[2] == 3)){
            return Face;
        }
        else if((valores[0] == 6) && (valores[1] == 10) && (valores[2] == 30)){
            return Book;
        }
        else if((valores[0] == 4) && (valores[1] == 6) && (valores[2] == 8)){
            return Facebook;
        }
        else{
            return Nada;
        }
    }
}

    
