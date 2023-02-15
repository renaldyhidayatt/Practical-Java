package com.sanedge.java.BinarySearch.findpeak;

public class Find {
    public int findPeakElement(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return 0;
        }

        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ((mid == nums.length - 1 && nums[mid - 1] < nums[mid]) ||
                    (mid > 0 && nums[mid - 1] < nums[mid] &&
                            (mid <= nums.length - 2 && nums[mid + 1] < nums[mid]))
                    ||
                    (mid == 0 && nums[1] < nums[0])) {
                return mid;
            }
            if (mid > 0 && nums[mid - 1] < nums[mid]) {
                low = mid + 1;
            }
            if (mid > 0 && nums[mid - 1] > nums[mid]) {
                high = mid - 1;
            }
            if (mid == low) {
                low++;
            }
            if (mid == high) {
                high--;
            }
        }

        return -1;
    }
}
