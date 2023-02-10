package looping;

public class BreakContinue {
    public static void main(String[] args) {
        int number = 1;
        int sum = 0;

        while(true){
            sum += number;
            System.out.println("Number is " + number);
            System.out.println("Sum is " +sum);

            if(sum >= 10){
                System.out.println("End of loop");
                break;
            }

            number++;
        }

        sum = 0;
        for(number = 1; number <= 10; number++){
            if(number % 2 == 0){
                continue;
            }
            sum += number;
            System.out.println("Number is " + number);
            System.out.println("Sum is " + sum);
        }

        sum = 0;
        for(number = 1; ; number++){
            if (number % 2 == 0)
                continue;
            sum += number;
            System.out.println("Number is " + number);
            System.out.println("Sum is " + sum);
            if (sum >= 10)
                break;
        }
    }
}
