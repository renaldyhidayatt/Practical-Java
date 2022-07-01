package SimpleProjects;

import java.util.Scanner;

public class Grades {
    public static void kentang() {
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your score");

        x = sc.nextInt();
        if (x >= 0 && x <= 40) {
            System.out.println("Your failed");
        } else if (x > 40 && x < 70) {
            System.out.println("Your passed");
        } else if (x >= 70) {
            System.out.println("Excellent");
        } else if (x < 0) {
            System.out.println("Only positve numbers are allowed");
        } else {
            System.out.println("Please insert valid numbers");
        }
    }
}
