package com.sanedge.java.BitManipulation.xorqueriesofsubarray;

public class Xor {
    public static int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] xors = new int[n];
        xors[0] = arr[0];
        for (int i = 1; i < n; i++) {
            xors[i] = arr[i] ^ xors[i - 1];
        }

        int[] res = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int[] q = queries[i];
            res[i] = xors[q[1]];

            if (q[0] > 0) {
                res[i] ^= xors[q[0] - 1];
            }
        }

        return res;
    }
}
