package com.sanedge.java.BinarySearch.specialarray;

import java.util.Arrays;

public class Spesicial {
    public static int specialArray(int[] nums){
        Arrays.sort(nums);

        int x = nums.length;

        for(int num : nums){
            if(num >= x){
                return x;
            }

            x--;

            if(num >= x){
                return -1;
            }
        }

        return -1;
    }
}
