package com.sanedge.java.BinarySearch.findfirststandlast;

public class First {
    public int[] searchRange(int[] nums, int target) {
        int[] result = new int[]{searchFirstEqualElement(nums, target), searchLastEqualElement(nums, target)};
        return result;
    }

    private int searchFirstEqualElement(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                if (mid == 0 || nums[mid - 1] != target) {
                    return mid;
                }
                high = mid - 1;
            }
        }
        return -1;
    }

    private int searchLastEqualElement(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {
            int mid = low + ((high - low) >> 1);
            if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                if (mid == nums.length - 1 || nums[mid + 1] != target) {
                    return mid;
                }
                low = mid + 1;
            }
        }
        return -1;
    }

}
