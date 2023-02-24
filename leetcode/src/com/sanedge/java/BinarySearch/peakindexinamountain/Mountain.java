package com.sanedge.java.BinarySearch.peakindexinamountain;

public class Mountain {
    public int peakIndexInMountainArray(int[] A){
        int low = 0, high = A.length - 1;
        while(low <= high){
            int mid = low + ( high -low) / 2;
            if(A[mid] > A[mid+ 1] && A[mid] > A[mid-1]){
                return mid;
            } else if(A[mid] > A[mid+1] && A[mid] < A[mid-1]){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return -1;
    }
}
