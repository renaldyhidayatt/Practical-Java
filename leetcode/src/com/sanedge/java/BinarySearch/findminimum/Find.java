package com.sanedge.java.BinarySearch.findminimum;

public class Find {
    public int findMin(int[] nums){
        int low =0, high = nums.length - 1;

        while(low < high){
            if(nums[low] < nums[high]){
                return nums[low];
            }

            int mid = low + ((high - low) >> 1);
            if(nums[mid] >= nums[low]){
                low = mid + 1;
            }else{
                high = mid;
            }
        }

        return nums[low];
    }
}
