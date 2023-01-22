package Medium.lettercombination;

import java.util.ArrayList;
import java.util.List;

public class LetterCombination {
    public static List<String> letterCombinations(String digits) {
        char[][] phone = {
                { ' ', '\0', '\0', '\0' }, // 0
                { '\0', '\0', '\0', '\0' }, // 1
                { 'a', 'b', 'c', '\0' }, // 2
                { 'd', 'e', 'f', '\0' }, // 3
                { 'g', 'h', 'i', '\0' }, // 4
                { 'j', 'k', 'l', '\0' }, // 5
                { 'm', 'n', 'o', '\0' }, // 6
                { 'p', 'q', 'r', 's' }, // 7
                { 't', 'u', 'v', '\0' }, // 8
                { 'w', 'x', 'y', 'z' }, // 9
        };

        List<String> result = new ArrayList<>();

        if (digits.length() <= 0) {
            result.add("");

            return result;
        }

        for (int i = 0; i < digits.length(); i++) {
            if (digits.charAt(i) < '0' || digits.charAt(i) > '9') {
                return new ArrayList<>();
            }

            int d = digits.charAt(i) - '0';
            if (result.size() <= 0) {
                for (int j = 0; j < 4 && phone[d][j] != '\0'; j++) {
                    String s = String.valueOf(phone[d][j]);
                    result.add(s);
                }
                continue;
            }

            List<String> r = new ArrayList<>();
            for (int j = 0; j < result.size(); j++) {
                for (int k = 0; k < 4 && phone[d][k] != '\0'; k++) {
                    String s = result.get(j) + String.valueOf(phone[d][k]);

                    r.add(s);
                }
            }

            result = r;
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "23";
        System.out.println(letterCombinations(s));
    }
}
