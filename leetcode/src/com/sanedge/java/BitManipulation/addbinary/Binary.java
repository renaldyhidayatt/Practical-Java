package com.sanedge.java.BitManipulation.addbinary;

public class Binary {
    public static String addBinary(String a, String b) {
        if (b.length() > a.length()) {
            String temp = a;
            a = b;
            b = temp;
        }
    
        String[] res = new String[a.length() + 1];
        int i = a.length() - 1, j = b.length() - 1, k = a.length(), c = 0;
    
        while (i >= 0 && j >= 0) {
            int ai = Character.getNumericValue(a.charAt(i));
            int bj = Character.getNumericValue(b.charAt(j));
            res[k] = String.valueOf((ai + bj + c) % 2);
            c = (ai + bj + c) / 2;
            i--;
            j--;
            k--;
        }
        while (i >= 0) {
            int ai = Character.getNumericValue(a.charAt(i));
            res[k] = String.valueOf((ai + c) % 2);
            c = (ai + c) / 2;
            i--;
            k--;
        }
    
        if (c > 0) {
            res[k] = String.valueOf(c);
        }
    
        return String.join("", res);
    }
    
}
