package com.sanedge.java.BitManipulation.minnumberofkconsecutive;

public class NumberJava {
    public static int minKBitFlips(int[] A, int K) {
        int flippedTime = 0, count = 0;
        for (int i = 0; i < A.length; i++) {
            if (i >= K && A[i - K] == 2) {
                flippedTime--;
            }

            if (flippedTime % 2 == A[i]) {
                if (i + K > A.length) {
                    return -1;
                }
                A[i] = 2;
                flippedTime++;
                count++;
            }
        }

        return count;
    }
}
