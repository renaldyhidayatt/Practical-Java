package com.sanedge.java.Array.threesum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, Integer> counter = new HashMap<>();

        for (int num : nums) {
            counter.put(num, counter.getOrDefault(num, 0) + 1);
        }

        List<Integer> uniqNums = new ArrayList<>(counter.keySet());
        Collections.sort(uniqNums);

        for (int i = 0; i < uniqNums.size(); i++) {
            int num1 = uniqNums.get(i);
            if (num1 * 3 == 0 && counter.get(num1) >= 3) {
                res.add(Arrays.asList(num1, num1, num1));
            }

            for (int j = i + 1; j < uniqNums.size(); j++) {
                int num2 = uniqNums.get(j);
                if (num1 * 2 + num2 == 0 && counter.get(num1) > 1) {
                    res.add(Arrays.asList(num1, num1, num2));
                }
                if (num2 * 2 + num1 == 0 && counter.get(num2) > 1) {
                    res.add(Arrays.asList(num1, num2, num2));
                }

                int num3 = 0 - num1 - num2;
                if (num3 > num2 && counter.containsKey(num3)) {
                    res.add(Arrays.asList(num1, num2, num3));
                }
            }
        }

        return res;
    }
}
