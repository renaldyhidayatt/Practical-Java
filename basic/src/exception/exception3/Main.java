package exception.exception3;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};

        try {
            System.out.println(numbers[10]);

            int number = Integer.parseInt("abc");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You specified a wrong index");
        } catch (NumberFormatException e) {
            System.out.println("Number format exception");
        }
       
        String name = null;

        try {
            System.out.println(name.substring(1));

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occurred");
        }
       
        catch (Exception e) {
            System.out.println("Parent exception");
        }
        
        System.out.println("Last statement in the main() method ");
    }
}
