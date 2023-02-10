package exception.exception1;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers[6]);
        
        int number = 10;
        System.out.println(number / 0);

        int x = Integer.MAX_VALUE;
        int y = 1;
        int sum = Math.addExact(x, y);

        String myString = null;
        System.out.println(myString.length());

        String formattedString = String.format("My age is %d", "John");

        int myAge = Integer.parseInt("John");

    }
}
