package com.sanedge.java.BitManipulation.maxlengthofconcatenatedstring;

import java.util.ArrayList;
import java.util.List;

public class Max {
    public static int maxLength(List<String> arr) {
        List<Integer> c = new ArrayList<>();

        int res = 0;

        for (String s : arr) {
            int mask = 0;

            for (char ch : s.toCharArray()) {
                mask |= 1 << (ch - 'a');
            }

            if (s.length() != Integer.bitCount(mask)) {
                continue;
            }

            c.add(mask);
        }

        dfs(c, 0, 0, res);

        return res;
    }

    public static void dfs(List<Integer> c, int index, int mask, int res) {
        res = Math.max(res, Integer.bitCount(mask));

        for (int i = index; i < c.size(); i++) {
            if ((mask & c.get(i)) == 0) {
                dfs(c, i + 1, mask | c.get(i), res);
            }
        }
    }

}
