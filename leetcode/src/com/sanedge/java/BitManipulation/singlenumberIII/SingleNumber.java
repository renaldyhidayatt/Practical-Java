package com.sanedge.java.BitManipulation.singlenumberIII;

public class SingleNumber {
    public static int[] singleNumberIII(int[] nums){
        int diff = 0;

        for(int num : nums){
            diff ^= num;
        }

        diff &= -diff;
        int[] res = new int[]{0,0};
        for(int num : nums){
            if((num & diff) == 0){
                res[0] ^= num;
            }else{
                res[1] ^= num;
            }
        }

        return res;
    }
}
