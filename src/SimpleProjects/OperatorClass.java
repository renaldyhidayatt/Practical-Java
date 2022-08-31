package SimpleProjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperatorClass {
    public static void kentang() throws NumberFormatException, IOException {
        int x, y, z, xyz=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Pleas enter first number: ");
        x = Integer.parseInt(br.readLine());
        System.out.println("Please enter second number: ");
        y = Integer.parseInt(br.readLine());


        while(xyz!=6) {
            System.out.println("1: Addition");
            System.out.println("2: Subtraction");
            System.out.println("3: Division");
            System.out.println("4: Multiplication");
            xyz = Integer.parseInt(br.readLine());
            switch(xyz) {
                case 1:
                    z = x+y;
                    System.out.println("Result of Addition is: " + z);
                    break;
                case 2:
                    z = x-y;
                    System.out.println("Result of Subtraction is: " + z);
                    break;
                case 3:
                    z = x/y;
                    System.out.println("Result of Division is: " + z);
                    break;
                case 4:
                    z = x * y;
                    System.out.println("Result of Multiplication is : " + z);
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }
}
