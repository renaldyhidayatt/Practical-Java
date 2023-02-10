package genericjava.generic6;

import java.math.BigDecimal;

public class Main {

    public static <K extends Number> void printSquareRoot(K k){
        
        System.out.println(Math.sqrt(k.doubleValue()));
    }

    public static void main(String[] args) {

        Byte byteVal= 100;
        printSquareRoot(byteVal);

        Long longVal= 147L;
        printSquareRoot(longVal);

        BigDecimal bigDecimal= new BigDecimal(123456L);
        printSquareRoot(bigDecimal);

        // printSquareRoot("100");

    }
}
