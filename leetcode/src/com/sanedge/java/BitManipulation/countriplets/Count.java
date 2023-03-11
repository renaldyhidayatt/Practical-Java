package com.sanedge.java.BitManipulation.countriplets;

public class Count {
    public static int countTriples(int[] arr) {
        int[] prefix = new int[arr.length];
        int num = 0, count = 0, total = 0;

        for (int i = 0; i < arr.length; i++) {
            num ^= arr[i];
            prefix[i] = num;
        }

        for (int i = 0; i < prefix.length - 1; i++) {
            for (int k = i + 1; k < prefix.length; k++) {
                total = prefix[k];

                if (i > 0) {
                    total ^= prefix[i - 1];
                }

                if (total == 0) {
                    count += k - i;
                }
            }
        }

        return count;
    }
}
