package controlstatement;

public class Ifjava {
    public static void main(String[] args){
        int number = -5;
        if(number < 0){
            System.out.println("The number is negative");
            number = number * -1;
            System.out.println("Number we changed to positive");
        }
        System.out.println("Number = " + number);
        System.out.println("Statement after if block");

        number = -10;
        if(number < 0)
            System.out.println("the number is negative");
        System.out.println("Number = "+number);
        System.out.println("Statement after if block");
    }
}
