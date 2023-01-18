package lame.UserInput;

import java.util.Scanner;

public class UserInput {
    public static void kentang() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String fname = sc.next();
        System.out.println("Enter your Last Name");
        String lname = sc.next();
        System.out.println("Enter your Phone Number");
        long phone = sc.nextLong();
        System.out.println("Welcome: " + fname + " " + lname);
        System.out.println("Your phone Number is: " + phone);
        sc.close();
    }
}
