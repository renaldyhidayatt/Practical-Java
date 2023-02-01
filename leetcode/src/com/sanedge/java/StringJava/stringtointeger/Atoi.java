package com.sanedge.java.StringJava.stringtointeger;

import java.util.ArrayList;

public class Atoi {
    public int myAtoi(String s) {
        long maxInt = 2L << 30;
        boolean signAllowed = true;
        boolean whitespaceAllowed = true;
        int sign = 1;
        ArrayList<Integer> digits = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ' && whitespaceAllowed) {
                continue;
            }
            if (signAllowed) {
                if (c == '+') {
                    signAllowed = false;
                    whitespaceAllowed = false;
                    continue;
                } else if (c == '-') {
                    sign = -1;
                    signAllowed = false;
                    whitespaceAllowed = false;
                    continue;
                }
            }
            if (c < '0' || c > '9') {
                break;
            }
    
            whitespaceAllowed = false;
            signAllowed = false;
            digits.add(Character.getNumericValue(c));
        }
    
        long num = 0;
        long place = 1;
        int lastLeading0Index = -1;
    
        for (int i = 0; i < digits.size(); i++) {
            int d = digits.get(i);
            if (d == 0) {
                lastLeading0Index = i;
            } else {
                break;
            }
        }
    
        if (lastLeading0Index > -1) {
            digits = new ArrayList<>(digits.subList(lastLeading0Index + 1, digits.size()));
        }
    
        long rtnMax;
        if (sign > 0) {
            rtnMax = maxInt - 1;
        } else {
            rtnMax = maxInt;
        }
        int digitsCount = digits.size();
        for (int i = digitsCount - 1; i >= 0; i--) {
            num += digits.get(i) * place;
            place *= 10;
            if (digitsCount - i > 10 || num > rtnMax) {
                return (int) (sign * rtnMax);
            }
        }
        num *= sign;
        return (int) num;
    }
}
