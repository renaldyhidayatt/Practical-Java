package SimpleProjects;

import java.util.Scanner;

public class NumberClss {
    public static void kentang(){
        int x, y, z;
        System.out.println("Please Insert 3 Different integer Number : ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        if(x>y && x>z) {
            System.out.println("Number one is the largest");
        }else if(y>x && y>z) {
            System.out.println("Number two is the largest");
        }else if(z>x && z>y) {
            System.out.println("Number three is the largest");
        }else{
            System.out.println("These numbers are the same");
        }
    }
}
