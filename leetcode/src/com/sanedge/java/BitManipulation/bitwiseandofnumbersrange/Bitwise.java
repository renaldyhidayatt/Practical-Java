package com.sanedge.java.BitManipulation.bitwiseandofnumbersrange;

public class Bitwise {
    public static int rangeBitwiseAnd(int m, int n){
        if(m == 0){
            return 0;
        }

        int moved = 0;
        while(m != n){
            m >>= 1;
            n >>= 1;
            moved++;
        }
        return m << moved;
    } 
}
