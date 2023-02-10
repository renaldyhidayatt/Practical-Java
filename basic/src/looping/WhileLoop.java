package looping;

public class WhileLoop {
    public static void main(String[] args) {
        int counter = 0;
        while(counter < 5){
            System.out.println(counter);
            counter++;
        }
        int sum = 0;
        int number = 1;
        while(sum < 20){
            sum+=number;
            System.out.println("Number is "+number);
            System.out.println("Sum is "+sum);
            System.out.println("----------------------------------");
            number++;
        }
    }
}
