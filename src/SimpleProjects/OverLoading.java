package SimpleProjects;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OverLoading {
    int sum(int num1, int num2){
        return (num1 * num2);
    }

    class MethodCall{
        public void kentang() throws NumberFormatException, IOException{
            int x, y;

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Please, enter two Integers: ");
            x = Integer.parseInt(br.readLine());
            y = Integer.parseInt(br.readLine());

            OverLoading ol = new OverLoading();
            System.out.println("Result of your numbers are : " + ol.sum(x, y));

        }
    }
}
