package SimpleProjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayUsers {
    public static void kentang() throws NumberFormatException, IOException {
        int[] x = new int[7];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Please Insert Array Numbers: ");
        for(int y = 0; y < 7; y++){
            x[y] = Integer.parseInt(br.readLine());

        }
        for(int y = 0; y < x.length; y++){
            System.out.print(" " + x[y]);
        }
    }
}
