package SimpleProjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixPrinter {
    public static void kentang() throws NumberFormatException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[][] num1 = new int[3][3];
        int x, y;
        System.out.println("Please, enter 9 Integer Value: ");
        for(x = 0; x < 3; x++){
            for(y=0; y < 3; y++){
                num1[x][y] = Integer.parseInt(br.readLine());
            }
        }
        for(x = 0; x < num1.length; x++){
            for(y=0;y < 3; y++){
                System.out.println(" " + num1[x][y]);
            }
            System.out.println("");
        }
    }
}
