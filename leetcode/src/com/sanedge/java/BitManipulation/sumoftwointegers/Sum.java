package com.sanedge.java.BitManipulation.sumoftwointegers;

public class Sum {
    public static int getSum(int a, int b){
        if(a == 0){
            return b;
        }

        if(b == 0){
            return a;
        }

        return getSum((a & b)<< 1, a ^ b);
    }
}
