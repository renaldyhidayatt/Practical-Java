package com.sanedge.java.BinarySearch.validtrinagle;

import java.util.Arrays;

public class Valid {
    public int triangleNumber(int[] nums) {
        int res = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            int k = i + 2;
            for (int j = i + 1; j < nums.length - 1 && nums[i] != 0; j++) {
                while (k < nums.length && nums[i] + nums[j] > nums[k]) {
                    k++;
                }
                res += k - j - 1;
            }
        }

        return res;
    }
}
