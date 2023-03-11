package com.sanedge.java.BitManipulation.increasingsub;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sub {
    public static List<List<Integer>> findSubSequences(int[] nums) {
        List<Integer> c = new ArrayList<>();

        Map<Integer, Boolean> visited = new HashMap<>();
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < nums.length - 1; i++) {
            if (visited.containsKey(nums[i])) {
                continue;
            } else {
                visited.put(nums[i], true);
                generateIncSubSets(nums, i, c, res);
            }
        }

        return res;
    }

    public static void generateIncSubSets(int[] nums, int current, List<Integer> c, List<List<Integer>> res) {

        c.add(nums[current]);

        if (c.size() >= 2) {
            List<Integer> b = new ArrayList<>(c);
            res.add(b);
        }

        Map<Integer, Boolean> visited = new HashMap<>();

        for (int i = current + 1; i < nums.length; i++) {
            if (nums[current] <= nums[i]) {
                if (visited.containsKey(nums[i])) {
                    continue;
                } else {
                    visited.put(nums[i], true);
                    generateIncSubSets(nums, i, c, res);
                }
            }
        }

        c.remove(c.size() - 1);
    }
}
