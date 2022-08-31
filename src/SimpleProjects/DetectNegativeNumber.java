package SimpleProjects;

import java.util.Scanner;

public class DetectNegativeNumber {
    public static void kentang(){
        int x;
        System.out.println("Please insert any Number: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        if(x < 0){
            System.out.println("This is a negative Number");
        }else{
            System.out.println("This is a positive Number");
        }
    }
}
