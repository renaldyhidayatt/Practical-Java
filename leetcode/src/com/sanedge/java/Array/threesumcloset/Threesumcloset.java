package com.sanedge.java.Array.threesumcloset;

import java.util.Arrays;

public class Threesumcloset {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        int res = 0;
        int diff = Integer.MAX_VALUE;
        if (n > 2) {
            Arrays.sort(nums);
            for (int i = 0; i < n - 2; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                for (int j = i + 1, k = n - 1; j < k;) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (Math.abs(sum - target) < diff) {
                        res = sum;
                        diff = Math.abs(sum - target);
                    }
                    if (sum == target) {
                        return res;
                    } else if (sum > target) {
                        k--;
                    } else {
                        j++;
                    }
                }
            }
        }
        return res;
    }

}
