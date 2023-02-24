package com.sanedge.java.BinarySearch.findthekthsmallestsum;

import java.util.*;

public class Find {
    private static class PdData implements Comparable<PdData> {
        int n1;
        int n2;
        int n2Idx;

        public PdData(int n1, int n2, int n2Idx) {
            this.n1 = n1;
            this.n2 = n2;
            this.n2Idx = n2Idx;
        }

        public int compareTo(PdData other) {
            return Integer.compare(this.n1 + this.n2, other.n1 + other.n2);
        }
    }

    private static class PriorityQueueComparator implements Comparator<PdData> {
        public int compare(PdData a, PdData b) {
            return Integer.compare(a.n1 + a.n2, b.n1 + b.n2);
        }
    }

    public int kthSmallest(int[][] mat, int k) {
        if (mat == null || mat.length == 0 || mat[0].length == 0 || k == 0) {
            return 0;
        }
        int[] prev = mat[0];
        for (int i = 1; i < mat.length; i++) {
            prev = kSmallestPairs(prev, mat[i], k);
        }
        if (k < prev.length) {
            return -1;
        }
        return prev[k-1];
    }

    private int[] kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<Integer> res = new ArrayList<>();
        if (nums2 == null || nums2.length == 0) {
            return res.stream().mapToInt(i -> i).toArray();
        }
        PriorityQueue<PdData> pq = new PriorityQueue<>(new PriorityQueueComparator());
        for (int i = 0; i < nums1.length && i < k; i++) {
            pq.offer(new PdData(nums1[i], nums2[0], 0));
        }
        while (pq.size() > 0) {
            PdData data = pq.poll();
            res.add(data.n1 + data.n2);
            k--;
            if (k <= 0) {
                break;
            }
            int idx = data.n2Idx;
            idx++;
            if (idx >= nums2.length) {
                continue;
            }
            pq.offer(new PdData(data.n1, nums2[idx], idx));
        }
        return res.stream().mapToInt(i -> i).toArray();
    }

}
