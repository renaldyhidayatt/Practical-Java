package com.sanedge.java.BitManipulation.numberofbits;

public class NumberJava {
    public static int hammingWeight(int num){
        int count = 0;

        while(num != 0){
            num = num & (num - 1);
            count++;
        }

        return count;
    }
}
