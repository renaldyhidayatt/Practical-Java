package SimpleProjects;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Calculate {
    public static void kentang() throws Exception{
        int num1, num2, output;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number: ");
        num1 = Integer.parseInt(br.readLine());
        System.out.println("Enter another number: ");
        num2 = Integer.parseInt(br.readLine());

        output = num1 * num2;
        System.out.println("Result is : " + output);

    }
}
