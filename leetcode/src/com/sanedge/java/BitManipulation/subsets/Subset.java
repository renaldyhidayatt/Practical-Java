package com.sanedge.java.BitManipulation.subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset {
    public static List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> res = new ArrayList<>();

        res.add(new ArrayList<Integer>());
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            int n = res.size();
            for(int j = 0; j < n; j++){
                List<Integer> clone = new ArrayList<>(res.get(j));
                clone.add(nums[i]);
                res.add(clone);
            }
        }

        return res;
    }
}
