package SimpleProjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrintOutArray {
    public static void kentang() throws IOException{
        String[] st = new String[7];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please, Insert string elements: ");
        for(int x =0; x < 7; x++){
            st[x] = br.readLine();
        }
        System.out.println("The result of the string values are");
        {
            for(int x = 0; x < 7; x++){
                System.out.print(" "  + st[x]);
            }
        }
    }
}
