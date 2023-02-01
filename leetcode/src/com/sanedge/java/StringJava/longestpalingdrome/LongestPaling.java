package com.sanedge.java.StringJava.longestpalingdrome;

public class LongestPaling {
    public String longestPalingdrome(String s) {
        if (s.length() == 0) {
            return "";
        }

        int left = 0, right = -1;
        int pl = 0, pr = 0;

        while (left < s.length()) {
            while (right + 1 < s.length() && s.charAt(left) == s.charAt(right + 1)) {
                right++;
            }

            while (left - 1 >= 0 && right + 1 < s.length() && s.charAt(left - 1) == s.charAt(right + 1)) {
                left--;
                right++;
            }

            if (right - left > pr - pl) {
                pl = left;
                pr = right;
            }

            left = (left + right) / 2 + 1;
            right = left;
        }

        return s.substring(pl, pr + 1);
    }

}
