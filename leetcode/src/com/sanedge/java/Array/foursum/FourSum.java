package com.sanedge.java.Array.foursum;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> quadruplets = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n - 3 && nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] <= target; i++) {
            if (i > 0 && nums[i] == nums[i - 1] || nums[i] + nums[n - 3] + nums[n - 2] + nums[n - 1] < target) {
                continue;
            }
            for (int j = i + 1; j < n - 2 && nums[i] + nums[j] + nums[j + 1] + nums[j + 2] <= target; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1] || nums[i] + nums[j] + nums[n - 2] + nums[n - 1] < target) {
                    continue;
                }
                int left = j + 1, right = n - 1;
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        quadruplets.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1])
                            left++;
                        while (left < right && nums[right] == nums[right - 1])
                            right--;
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return quadruplets;
    }

}
