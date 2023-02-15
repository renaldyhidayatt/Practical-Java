package com.sanedge.java.BinarySearch.countsmaller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Count {
    class BinaryIndexedTree {
        private int[] bit;
    
        public BinaryIndexedTree(int n) {
            bit = new int[n+1];
        }
    
        public void add(int i, int val) {
            while (i < bit.length) {
                bit[i] += val;
                i += i & -i;
            }
        }
    
        public int query(int i) {
            int sum = 0;
            while (i > 0) {
                sum += bit[i];
                i -= i & -i;
            }
            return sum;
        }
    }

    public List<Integer> countSmaller(int[] nums) {
        List<Integer> res = new ArrayList<>();
        int[] allNums = nums.clone();
        Arrays.sort(allNums);
        int k = 1;
        Map<Integer, Integer> kth = new HashMap<>();
        kth.put(allNums[0], k);
        for (int i = 1; i < allNums.length; i++) {
            if (allNums[i] != allNums[i-1]) {
                k++;
                kth.put(allNums[i], k);
            }
        }
        BinaryIndexedTree bit = new BinaryIndexedTree(k);
        for (int i = nums.length - 1; i >= 0; i--) {
            res.add(0, bit.query(kth.get(nums[i])-1));
            bit.add(kth.get(nums[i]), 1);
        }
        return res;
    }
}
