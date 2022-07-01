package SimpleProjects;

import java.util.Scanner;

public class Area {
    public static void kentang(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter Width and Height of the Triangle: ");
        double w = sc.nextDouble();
        double h = sc.nextDouble();

        double result = (w*h)/2;
        System.out.println("Result of area of triangle is: " + result);
    }
}
