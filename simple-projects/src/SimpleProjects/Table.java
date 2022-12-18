package SimpleProjects;

import java.util.Scanner;

public class Table {
    public static void kentang(){
        int x, y;
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        System.out.println("Result of Multiplication Table of " + x + " is: ");
        for(y=1;y<=20;y++)
            System.out.println(x + "*" + y + "=" + (x*y));
    }
}
