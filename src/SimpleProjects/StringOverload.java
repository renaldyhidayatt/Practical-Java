package SimpleProjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class OverLoad{
    String add(String a, String b){
        return (a + b);
    }
}

public class StringOverload {
    public static void kentang() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String x, y;
        System.out.println("Please Enter two values: ");
        x = br.readLine();
        y = br.readLine();

        OverLoad ol = new OverLoad();
        System.out.print("Result of your two values are: " + ol.add(x, y));

    }
}
