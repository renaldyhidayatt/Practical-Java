package com.sanedge.java.BitManipulation.primenumber;

public class Prime {
    public static int countPrimeSetBits(int L, int R) {
        int counter = 0;
        for (int i = L; i <= R; i++) {
            if (isPrime(Integer.bitCount(i))) {
                counter++;
            }
        }
        return counter;
    }

    public static boolean isPrime(int x) {
        return x == 2 || x == 3 || x == 5 || x == 7 || x == 11 || x == 13 || x == 17 || x == 19;
    }
}
