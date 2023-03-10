package com.sanedge.java.BitManipulation.subset2;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Subset2 {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        
        for (int k = 0; k <= nums.length; k++) {
            generateSubsetsWithDup(nums, k, 0, new ArrayList<>(), res);
        }
        
        return res;
    }
    
    private void generateSubsetsWithDup(int[] nums, int k, int start, List<Integer> c, List<List<Integer>> res) {
        if (c.size() == k) {
            res.add(new ArrayList<>(c));
            return;
        }
        
        for (int i = start; i < nums.length - (k - c.size()) + 1; i++) {
            if (i > start && nums[i] == nums[i-1]) {
                continue;
            }
            c.add(nums[i]);
            generateSubsetsWithDup(nums, k, i+1, c, res);
            c.remove(c.size()-1);
        }
    }
}
