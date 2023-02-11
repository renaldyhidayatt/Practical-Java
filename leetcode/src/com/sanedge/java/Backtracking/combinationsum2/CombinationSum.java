package com.sanedge.java.Backtracking.combinationsum2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (candidates == null || candidates.length == 0) {
            return res;
        }
        Arrays.sort(candidates);
        findCombinationSum2(candidates, target, 0, new ArrayList<>(), res);
        return res;
    }

    private void findCombinationSum2(int[] nums, int target, int index, List<Integer> c, List<List<Integer>> res) {
        if (target == 0) {
            res.add(new ArrayList<>(c));

            return;
        }

        for (int i = index; i < nums.length; i++) {
            if (i > index && nums[i] == nums[i - 1]) {
                continue;
            }

            if (target >= nums[i]) {
                c.add(nums[i]);
                findCombinationSum2(nums, target - nums[i], i + 1, c, res);
                c.remove(c.size() - 1);
            }
        }
    }
}
