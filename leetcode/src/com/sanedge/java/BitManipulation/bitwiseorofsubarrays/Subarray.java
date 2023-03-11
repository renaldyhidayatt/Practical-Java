package com.sanedge.java.BitManipulation.bitwiseorofsubarrays;

import java.util.HashMap;
import java.util.Map;

public class Subarray {
    public static int subarrayBitWiseORs(int[] A) {
        Map<Integer, Boolean> res = new HashMap<>();
        Map<Integer, Boolean> t = new HashMap<>();

        for (int num : A) {
            Map<Integer, Boolean> r = new HashMap<>();

            r.put(num, true);

            for (int n : t.keySet()) {
                r.put((num | n), true);
            }

            t = r;

            for (int n : t.keySet()) {
                res.put(n, true);
            }

        }

        return res.size();
    }
}
