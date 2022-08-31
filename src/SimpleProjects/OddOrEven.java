package SimpleProjects;

import java.util.Scanner;

public class OddOrEven {
    public static void kentang(){
        int x;
        System.out.println("Please insert any number: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        if (x % 2 == 0){
            System.out.println("This is an even number");
        }else{
            System.out.println("This is an odd number");
        }
    }
}