package com.sanedge.java.BitManipulation.repeateddnasequence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Repeated {
    public static List<String> findRepatedDnaSequence(String s) {

        List<String> ans = new ArrayList<>();

        if (s.length() < 10) {
            return ans;
        }

        Map<String, Integer> cache = new HashMap<>();

        for (int i = 0; i <= s.length() - 10; i++) {
            String curr = s.substring(i, i + 10);
            if (cache.containsKey(curr) && cache.get(curr) == 1) {
                ans.add(curr);
            }
            cache.put(curr, cache.getOrDefault(curr, 0) + 1);
        }

        return ans;
    }
}
