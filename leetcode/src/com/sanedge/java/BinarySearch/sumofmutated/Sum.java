package com.sanedge.java.BinarySearch.sumofmutated;

public class Sum {
    public static int findBestValue(int[] arr, int target) {
        int low = 0, high = 100000;

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (calculateSum(arr, mid) < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        if (high == 100000) {
            int res = 0;
            for (int num : arr) {
                if (res < num) {
                    res = num;
                }
            }
            return res;
        }

        int sum1 = calculateSum(arr, low - 1);
        int sum2 = calculateSum(arr, low);
        if (target - sum1 <= sum2 - target) {
            return low - 1;
        }
        return low;
    }

    public static int calculateSum(int[] arr, int mid) {
        int sum = 0;
        for (int num : arr) {
            sum += Math.min(num, mid);
        }
        return sum;
    }

}
