package com.sanedge.java.BinarySearch.missingnumber;

public class Missing {
    public int missingnumber(int[] numbers){
        int xor =0, i;

        for(i = 0; i < numbers.length; i++){
            xor ^= i ^ numbers[i];
        }
        return xor ^ i;
    }   
}
