package SimpleProjects;

import java.util.Scanner;

public class Floyds {
    public static void kentang() {
        int x, num1 = 1, y, z;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please Insert Number of Rows");
        x = sc.nextInt();
        System.out.println("Result of Floyds Triangle is: ");
        for (y = 1; y <= x; y++) {
            for (z = 1; z <= y; z++) {
                System.out.print(num1 + " ");
                num1++;
            }
            System.out.println();

        }
    }
}
