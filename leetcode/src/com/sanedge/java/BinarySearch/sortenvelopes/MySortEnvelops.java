package com.sanedge.java.BinarySearch.sortenvelopes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MySortEnvelops {
    class SortEnvelopes implements Comparator<int[]> {
        public int compare(int[] a, int[] b) {
            if (a[0] == b[0]) {
                return b[1] - a[1];
            }
            return a[0] - b[0];
        }
    }

    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, new SortEnvelopes());
        List<Integer> dp = new ArrayList<>();
        for (int[] e : envelopes) {
            int low = 0, high = dp.size();
            while (low < high) {
                int mid = low + (high - low) / 2;
                if (dp.get(mid) >= e[1]) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }
            if (low == dp.size()) {
                dp.add(e[1]);
            } else {
                dp.set(low, e[1]);
            }
        }
        return dp.size();
    }
}