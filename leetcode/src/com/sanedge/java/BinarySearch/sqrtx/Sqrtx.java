package com.sanedge.java.BinarySearch.sqrtx;

public class Sqrtx {
    public int mySqrt(int x) {
        int l = 0, r = x;
        while (l < r) {
            int mid = (l + r + 1) / 2;
            if (mid * mid > x) {
                r = mid - 1;
            } else {
                l = mid;
            }
        }
        return l;
    }
}
