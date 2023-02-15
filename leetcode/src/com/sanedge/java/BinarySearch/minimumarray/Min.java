package com.sanedge.java.BinarySearch.minimumarray;

public class Min {
    public int minSubArrayLen(int target, int[] nums){
        int left = 0, sum = 0, res = nums.length - 1;

        for(int right = 0; right < nums.length; right++){
            sum += nums[right];
            while(sum >= target){
                res = Math.min(res, right - left + 1);
                sum -= nums[left];
                left++;
            }
        }

        if(res == nums.length + 1){
            return 0;
        }

        return res;
    }
}
