package com.sanedge.java.BinarySearch.kokoeating;

public class Koko {
    public static int minEatingSpeed(int[] piles, int H) {
        int low = 1;
        int high = maxInArr(piles);
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (!isPossible(piles, mid, H)) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;

    }

    public static boolean isPossible(int[] piles, int h, int H){
        int res = 0;
        for(int p : piles){
            res += Math.ceil((double) p / h);
        }
        return res <= H;
    }

    public static int maxInArr(int[] xs){
        int res = 0;
        for(int x : xs){
            if(res < x){
                res = x;
            }
        }

        return res;
    }
}
