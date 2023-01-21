package Easy.roman;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
    public static int romanToInt(String s) {
        Map<Character, Integer> roman = new HashMap<Character, Integer>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int prev = 0, total = 0;

        for (int i = 0; i < s.length(); i++) {
            int curr = roman.get(s.charAt(i));
            total += curr;
            if (curr > prev) {
                total -= 2 * prev;
            }

            prev = curr;
        }

        return total;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }
}
