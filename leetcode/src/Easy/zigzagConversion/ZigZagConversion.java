package Easy.zigzagConversion;

import java.util.Arrays;

public class ZigZagConversion {
    public static String convert(String s, int nRows) {
        String[] r = new String[nRows];
        Arrays.fill(r, "");
        int row = 0;
        int step = 1;
        for (int i = 0; i < s.length(); i++) {
            if (row == nRows - 1) {
                step = -1;
            }
            if (row == 0) {
                step = 1;
            }
            r[row] += s.charAt(i);
            row += step;
        }
        String result = "";
        for (int i = 0; i < nRows; i++) {
            result += r[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING", 3));
    }
}
