package com.sanedge.java.BitManipulation.singlenumberII;

public class SingleNumber {
    public static int singleNumberII(int[] nums){
        
        int ones = 0, twos=0;
    
        for(int i = 0; i < nums.length;i++){
            ones = (ones ^ nums[i]) & ~twos;
            twos = (twos ^ nums[i]) & ~ones;
        }

        return ones;
    }

}
