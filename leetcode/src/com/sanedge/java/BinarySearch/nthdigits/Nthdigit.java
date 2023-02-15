package com.sanedge.java.BinarySearch.nthdigits;

public class Nthdigit {
    public int findNthDigit(int n) {
        if (n <= 9) {
            return n;
        }

        int bits = 1;
        while (n > 9 * Math.pow(10, bits - 1) * bits) {
            n -= 9 * Math.pow(10, bits - 1) * bits;
            bits++;
        }
        int idx = n - 1;
        int start = (int) Math.pow(10, bits - 1);
        int num = start + idx / bits;
        int digitIdx = idx % bits;
        return num / (int) Math.pow(10, bits - digitIdx - 1) % 10;

    }
}
