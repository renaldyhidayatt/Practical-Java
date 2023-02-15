package com.sanedge.java.BinarySearch.searchrotate;

public class Rotate {
    public boolean search(int[] nums, int target){
        if(nums.length == 0){
            return false;
        }

        int low = 0, high = nums.length - 1;
        while(low <= high){
            int mid = low + ((high - low) >> 1);
            if(nums[mid] == target){
                return true;
            }else if(nums[mid] > nums[low]){
                if (nums[low] <= target && target < nums[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }else if (nums[mid] < nums[high]){
                if(nums[mid] < target && target <= nums[high]){
                    low = mid + 1;
                }else{
                    high = mid - 1;
                }
            }else{
                if(nums[low] == nums[mid]){
                    low++;
                }

                if(nums[high] == nums[mid]){
                    high--;
                }
            }
        }

        return false;
    }
}
