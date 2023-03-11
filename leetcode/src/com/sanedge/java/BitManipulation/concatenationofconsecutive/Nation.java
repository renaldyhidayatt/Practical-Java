package com.sanedge.java.BitManipulation.concatenationofconsecutive;

public class Nation {
    public static int concatenatedBinary(int n) {
        int res = 0, mod = 1000000007, shift = 0;

        for (int i = 1; i <= n; i++) {
            if ((i & (i - 1)) == 0) {
                shift++;
            }
            res = ((res << shift) + i) % mod;
        }

        return res;
    }
}
