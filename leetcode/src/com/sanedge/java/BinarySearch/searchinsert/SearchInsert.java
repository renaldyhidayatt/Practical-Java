package com.sanedge.java.BinarySearch.searchinsert;

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] >= target) {
                high = mid - 1;
            } else {
                if (mid == nums.length - 1 || nums[mid + 1] >= target) {
                    return mid + 1;
                }
                low = mid + 1;
            }
        }
        return 0;
    }
}
