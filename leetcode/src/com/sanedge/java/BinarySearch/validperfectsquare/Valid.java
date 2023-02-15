package com.sanedge.java.BinarySearch.validperfectsquare;

public class Valid {
    public boolean isPerfectSquare(int num){
        int low = 1, high = num;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(mid * mid == num){
                return true;
            }else if(mid * mid < num){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }

        return false;
    }
}
