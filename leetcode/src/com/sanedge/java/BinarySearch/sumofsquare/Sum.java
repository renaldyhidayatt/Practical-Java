package com.sanedge.java.BinarySearch.sumofsquare;

public class Sum {
    public static boolean judgeSquareSum(int c){
        int low = 0;
        int high = (int) Math.sqrt(c);

        while(low <= high){
            if(low * low + high * high < c){
                low++;

            }else if(low * low + high * high > c){
                high--;
            }else{
                return true;
            }
        }

        return false;
    }
}
