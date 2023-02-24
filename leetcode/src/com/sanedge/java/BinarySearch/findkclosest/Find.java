package com.sanedge.java.BinarySearch.findkclosest;

public class Find {
    public static int[] findClosesElement(int[] arr, int k, int x){
        int low = 0, high = arr.length - k;

        while(low < high){
            int mid = low + (high-low) >> 1;

            if(x - arr[mid] > arr[mid + k] - x){
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr[low + i];
        }
        return result;
    }
}
