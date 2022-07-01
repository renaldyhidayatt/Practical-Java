package SimpleProjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AddMatrix {
    public static void kentang() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] num1 = new int[2][2];
        int[][] num2 = new int[2][2];
        int[][] num3 = new int[2][2];
        int x, y;

        System.out.println("Please insert 1st Integer value for Matric Addition");
        for (x = 0; x < 3; x++) {
            for (y = 0; y < 2; y++) {
                num1[x][y] = Integer.parseInt(br.readLine());

            }
        }
        for (x = 0; x < num1.length; x++) {
            for (y = 0; y < 2; y++) {
                System.out.println(" " + num1[x][y]);
            }
        }

        System.out.println("Please insert 2nd integer values for matric additon: ");
        for (x = 0; x < 2; x++) {
            for (y = 0; y < 2; y++) {
                num2[x][y] = Integer.parseInt(br.readLine());
            }
        }
        for (x = 0; x < num2.length; x++) {
            for (y = 0; y < 2; y++) {
                System.out.println(" " + num2[x][y]);
            }
        }

        for(x = 0; x < 2; x++){
            for(y = 0; y < 2; y++){
                num3[x][y] = num1[x][y] + num2[x][y];
            }
        }
        System.out.println("The sum of the matrix is: ");

        for(x = 0; x < 2; x++){
            for(y=0; y < 2; y++){
                System.out.println(" " + num3[x][y]);
            }
        }
    }
}
