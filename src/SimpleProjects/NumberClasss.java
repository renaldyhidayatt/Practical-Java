package SimpleProjects;

import java.util.Scanner;

public class NumberClasss {
    public static void kentang(){
        int num1, num2, num3=1;
        System.out.println("Please Insert a number");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();

        if(num1 < 0){
            System.out.println("Please insert only Positive Number");
        }else{
            for(num2 = 1; num2 <= num1; num2++){
                num3 = num3 * num1;
            }
            System.out.println("Result of Factorial of " + num1 + "is :" + num3);
        }
    }
}
