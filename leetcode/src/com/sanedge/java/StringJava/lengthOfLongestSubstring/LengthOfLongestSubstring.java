package com.sanedge.java.StringJava.lengthOfLongestSubstring;

public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }
        boolean[] bitSet = new boolean[256];
        int result = 0, left = 0, right = 0;
        while (left < s.length()) {
            if (bitSet[s.charAt(right)]) {
                bitSet[s.charAt(left)] = false;
                left++;
            } else {
                bitSet[s.charAt(right)] = true;
                right++;
            }
            result = Math.max(result, right - left);
            if (left + result >= s.length() || right >= s.length()) {
                break;
            }
        }
        return result;
    }
}
