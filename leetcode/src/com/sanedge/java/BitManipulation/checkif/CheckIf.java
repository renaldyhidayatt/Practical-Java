package com.sanedge.java.BitManipulation.checkif;

public class CheckIf {
    public static boolean hasAllCodes(String s, int k) {
        int need = (int) Math.pow(2, k);
        boolean[] visited = new boolean[need];

        int mask = (1 << k) - 1;
        int curr = 0;

        for (int i = 0; i < s.length(); i++) {
            curr = ((curr << 1) | (s.charAt(i) - '0')) & mask;

            if (i >= k - 1) {
                if (!visited[curr]) {
                    need--;

                    visited[curr] = true;

                    if (need == 0) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
