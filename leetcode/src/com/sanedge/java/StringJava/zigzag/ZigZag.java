package com.sanedge.java.StringJava.zigzag;

public class ZigZag {
    public static String convert(String s, int numRows) {
        int len = s.length();
        if (numRows == 1 || len <= numRows) {
            return s;
        }

        char[] arr = s.toCharArray();
        char[][] matrix = new char[numRows][len];
        int down = 0;
        int up = numRows - 2;

        for (int i = 0; i < len; i++) {
            if (down != numRows) {
                matrix[down][i] = arr[i];
                down++;
            } else if (up > 0) {
                matrix[up][i] = arr[i];
                up--;
            } else {
                up = numRows - 2;
                down = 0;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (char[] row : matrix) {
            for (char c : row) {
                if (c != '\u0000') {
                    sb.append(c);
                }
            }
        }

        return sb.toString();

    }
}
