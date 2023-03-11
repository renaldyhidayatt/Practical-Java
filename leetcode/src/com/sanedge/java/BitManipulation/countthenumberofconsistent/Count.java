package com.sanedge.java.BitManipulation.countthenumberofconsistent;

import java.util.HashMap;
import java.util.Map;

public class Count {
    public static int countConsistentStrings(String allowed, String[] words) {
        Map<Character, Integer> allowedMap = new HashMap<>();

        for (char c : allowed.toCharArray()) {
            allowedMap.put(c, allowedMap.getOrDefault(c, 0) + 1);
        }

        int res = 0;
        boolean flag;

        for (String word : words) {
            flag = true;

            for (int i = 0; i < word.length(); i++) {
                if (!allowedMap.containsKey(word.charAt(i))) {
                    flag = false;
                    break;
                }

                if (flag) {
                    res++;
                }
            }
        }

        return res;
    }

}
