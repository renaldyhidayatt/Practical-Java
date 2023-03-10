package com.sanedge.java.BitManipulation.divtwointeger;

public class Divide {
    public static int divide(int divided, int divisor) {
        if (divided == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        int result = 0;
        int sign = ((divided < 0) ^ (divisor < 0)) ? -1 : 1;
        long dvd = Math.abs((long) divided);
        long dvs = Math.abs((long) divisor);
        while (dvd >= dvs) {
            long temp = dvs;
            long m = 1;
            while (temp << 1 <= dvd) {
                temp <<= 1;
                m <<= 1;
            }
            dvd -= temp;
            result += m;
        }
        return sign * result;
    }
    
}
