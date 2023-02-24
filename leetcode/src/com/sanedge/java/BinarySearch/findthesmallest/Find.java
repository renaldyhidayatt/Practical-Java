package com.sanedge.java.BinarySearch.findthesmallest;

public class Find {
    public int smallestDivisor(int[] nums, int threshold){
        int low = 1, high = 100000;
        while(low < high){
            int mid = low + (high - low) / 2;
            if(calDivisior(nums, mid, threshold)){
                high = mid;
            }else{
                low = mid + 1;
            }
        }

        return low;
    }

    public static boolean calDivisior(int[] nums, int mid, int threshold){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % mid != 0){
                sum += nums[i] / mid + 1;
            }else{
                sum += nums[i] / mid;
            }
        }

        return sum <= threshold;
    }
}
