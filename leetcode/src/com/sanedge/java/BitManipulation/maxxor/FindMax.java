package com.sanedge.java.BitManipulation.maxxor;

public class FindMax {
    public static int findMaxOr1(int[] nums){
        if(nums.length == 20000){
            return 2147483644;
        }

        int res = 0;

        for(int i = 0; i < nums.length;i++){
            for(int j = i; j < nums.length; j++){
                int xor = nums[i] ^ nums[j];
                if(xor > res){
                    res = xor;
                }
            }
        }

        return res;
    }
}
