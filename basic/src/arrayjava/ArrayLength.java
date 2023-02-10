package arrayjava;

public class ArrayLength {
    public static void main(String[] args) {
        int[] numbers = new int[5];

        System.out.println("Length is "+ numbers.length);
        for(int index = 0; index < numbers.length; index++){
            numbers[index] = index + 100;
        }

        for (int index = 0; index < numbers.length; index++) {
            System.out.println("Element " + index + " : " + numbers[index]);
        }

        for (int number : numbers) {
            System.out.println(number);

        }

        System.out.println(numbers[5]);
    }
}
