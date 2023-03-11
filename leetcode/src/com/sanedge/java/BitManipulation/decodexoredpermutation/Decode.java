package com.sanedge.java.BitManipulation.decodexoredpermutation;

public class Decode {
    public static int[] decode(int[] encoded) {
        int n = encoded.length;
        int total = 0;

        for (int i = 1; i <= n + 1; i++) {
            total ^= i;
        }

        int odd = 0;

        for (int i = 1; i < n; i += 2) {
            odd ^= encoded[i];
        }

        int[] perm = new int[n + 1];
        perm[0] = total ^ odd;
        for (int i = 0; i < n; i++) {
            perm[i + 1] = perm[i] ^ encoded[i];
        }
        return perm;
    }
}
