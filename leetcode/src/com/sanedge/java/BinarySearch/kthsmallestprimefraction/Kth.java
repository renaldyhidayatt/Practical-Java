package com.sanedge.java.BinarySearch.kthsmallestprimefraction;

public class Kth {
    public int[] kthSmallestPrimeFraction(int[] A, int K) {
        double low = 0.0, high = 1.0;
        int n = A.length;

        while (true) {
            double mid = (high + low) / 2.0;
            int count = 0, p = 0, q = 1, j = 0;
            for (int i = 0; i < n; i++) {
                while (j < n && (double) A[i] > mid * (double) A[j]) {
                    j++;
                }

                count += n - j;
                if (j < n && q * A[i] > p * A[j]) {
                    p = A[i];
                    q = A[j];
                }

            }
            if(count == K){
                return new int[] {p, q};
            }else if(count < K){
                low = mid;
            }else{
                high = mid;
            }
        }
    }
}
