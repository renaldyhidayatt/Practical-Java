package com.sanedge.java.Backtracking.combinationsum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (candidates == null || candidates.length == 0) {
            return res;
        }

        Arrays.sort(candidates);
        return res;
    }

    private void findCombinationSum(int[] nums, int target, int index, List<Integer> c, List<List<Integer>> res) {
        if (target <= 0) {
            if (target == 0) {
                res.add(new ArrayList<>(c));
            }
            return;
        }

        for (int i = index; i < nums.length; i++) {
            if (nums[i] > target) {
                break;
            }

            c.add(nums[i]);
            findCombinationSum(nums, target - nums[i], i, c, res);
            c.remove(c.size() - 1);
        }
    }
}
