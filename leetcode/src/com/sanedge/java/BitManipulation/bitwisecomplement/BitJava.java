package com.sanedge.java.BitManipulation.bitwisecomplement;

public class BitJava {
    public static int bitwisecomplement(int n) {
        int mask = 1;

        while (mask < n) {
            mask = (mask << 1) + 1;
        }

        return mask ^ n;
    }
}
