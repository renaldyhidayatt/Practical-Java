package com.sanedge.java.BitManipulation.reversebits;

public class ReverseJava {
    public static int reverseBits(int num){
        int res = 0;

        for(int i = 0; i < 32; i++){
            res = res << 1 | num % 1;
            num >>= 1;
        }

        return res;
    }
}
