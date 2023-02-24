package com.sanedge.java.BinarySearch.findpairdistance;

import java.util.Arrays;

public class Find {
    public static int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int low = 0, high = nums[nums.length - 1] - nums[0];
        while(low < high){
            int mid = low + (high - low) / 2;
            int tmp = findDistanceCount(nums, mid);
        
            if (tmp >= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    public static int findDistanceCount(int[] nums, int num) {
        int count = 0, i = 0;
        for (int j = 1; j < nums.length; j++) {
            while (nums[j] - nums[i] > num && i < j) {
                i++;
            }
            count += (j - i);
        }
        return count;
    }
}
