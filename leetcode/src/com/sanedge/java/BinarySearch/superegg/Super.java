package com.sanedge.java.BinarySearch.superegg;

public class Super {
    public static int superEggDrop(int K, int N){
        int low = 1, high = N;
        while(low < high){
            int mid = low + (high -  low) / 2;

            if (counterF(K, N, mid) >= N) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
    public static int counterF(int k, int n, int mid) {
        int res = 1, sum = 0;
        for (int i = 1; i <= k && sum < n; i++) {
            res *= mid - i + 1;
            res /= i;
            sum += res;
        }
        return sum;
    }
}
