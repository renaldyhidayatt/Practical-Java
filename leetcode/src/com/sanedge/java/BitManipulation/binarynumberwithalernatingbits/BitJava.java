package com.sanedge.java.BitManipulation.binarynumberwithalernatingbits;

public class BitJava {
    public boolean hasAlternatingBits(int n) {
        n = n ^ (n >> 1);
        return (n & (n + 1)) == 0;
    }
}
