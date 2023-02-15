package com.sanedge.java.BinarySearch.hindex;

public class High {
    public int hiIndex(int[] citations){
        int low = 0, high = citations.length - 1;
        while(low <= high){
            int mid = low + (high - low) >> 1;
            if (citations.length - mid > citations[mid]){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        return citations.length - low;
    }
}
