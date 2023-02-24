package com.sanedge.java.BinarySearch.capacityship;

public class CapacityShip {
    public static int shipWithInDays(int[] weight, int D){
        int maxNum = 0, sum = 0;
        for(int num : weight){
            sum += num;
            if (num > maxNum) {
                maxNum = num;
            }
        }
        if (D == 1) {
            return sum;
        }
    
        int low = maxNum, high = sum;
    
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (calSum(mid, D, weight)) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    
    }

    private static boolean calSum(int mid, int m, int[] nums){
        int sum = 0, count = 0;
        for(int v : nums){
            sum += v;
            if (sum > mid){
                sum = v;
                count++;
                if(count > m - 1){
                    return false;
                }
            }
        }

        return true;
    }
}
