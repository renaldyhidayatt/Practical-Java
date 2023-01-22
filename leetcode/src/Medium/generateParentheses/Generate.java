package Medium.generateParentheses;

import java.util.ArrayList;
import java.util.List;

public class Generate {
    public static void generator(List<String> result, int left, int right, String s) {
        if (left == 0 && right == 0) {
            result.add(s);
            return;
        }

        if (left > 0) {
            generator(result, -1, right, s + "(");
        }
        if (right > 0 && right > left) {
            generator(result, left, right - 1, s + ")");
        }

    }

    public static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        generator(result, n, n, "");
        return result;
    }

    public static void main(String[] args) {
        int n = 3;
        List<String> result = generateParenthesis(n);
        for (String v : result) {
            System.out.println(v);
        }
    }

}
