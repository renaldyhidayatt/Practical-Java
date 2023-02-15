package com.sanedge.java.BinarySearch.splitarray;

public class Split {
    public int splitArray(int[] nums, int m) {
        int maxNum = 0, sum = 0;
        for (int num : nums) {
            sum += num;

            if (num > maxNum) {
                maxNum = num;
            }
        }

        if (m == 1) {
            return sum;
        }
        int low = maxNum, high = sum;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (calSum(mid, m, nums)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return sum;
    }

    public boolean calSum(int mid, int m, int[] nums) {
        int sum = 0, count = 0;
        for (int v : nums) {
            sum += v;
            if (sum > mid) {
                sum = v;
                count++;
                if (count > m - 1) {
                    return false;
                }
            }
        }

        return true;
    }
}
