package Medium.inttoroman;

import java.util.HashMap;
import java.util.Map;

public class IntToRoman {
    public static String intToRoman(int num) {
        Map<Integer, String> mapping = new HashMap<>();

        mapping.put(1, "I");
        mapping.put(5, "V");
        mapping.put(10, "X");
        mapping.put(50, "L");
        mapping.put(100, "C");
        mapping.put(500, "D");
        mapping.put(1000, "M");
        mapping.put(4, "IV");
        mapping.put(9, "IX");
        mapping.put(40, "XL");
        mapping.put(90, "XC");
        mapping.put(400, "CD");
        mapping.put(900, "CM");

        int[] sequance = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

        StringBuilder sb = new StringBuilder();
        for (int base : sequance) {
            while (num >= base) {
                sb.append(mapping.get(base));
                num -= base;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(2030));
    }
}
