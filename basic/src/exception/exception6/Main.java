package exception.exception6;

import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) {

        
        String myString = null;
        
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yy");
       
        recursive();

    }
    public static void recursive(){
        recursive();
    }
}
