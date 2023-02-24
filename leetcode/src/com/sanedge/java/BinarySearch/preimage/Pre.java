package com.sanedge.java.BinarySearch.preimage;

public class Pre {

    public static int preImageSizeFZF(int K) {
        int low = 0, high = 5 * K;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int k = trailingZeroes(mid);

            if (k == K) {
                return 5;
            } else if (k > K) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return 0;
    }

    private static int trailingZeroes(int n) {
        int count = 0;
        while (n > 0) {
            n /= 5;
            count += n;

        }
        return count;
    }
}
