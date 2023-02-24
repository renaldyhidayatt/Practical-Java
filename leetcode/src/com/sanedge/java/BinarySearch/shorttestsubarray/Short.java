package com.sanedge.java.BinarySearch.shorttestsubarray;

import java.util.Deque;
import java.util.LinkedList;

public class Short {
    public static int shortestSubarray(int[] A, int K) {
        int res = A.length + 1;

        int[] prefixSum = new int[A.length + 1];

        for(int i = 0; i < A.length; i++){
            prefixSum[i+1] = prefixSum[i] + A[i];

        }

        Deque<Integer> deque = new LinkedList<>();
        for (int i = 0; i < prefixSum.length; i++) {
            while (!deque.isEmpty() && prefixSum[i] - prefixSum[deque.peekFirst()] >= K) {
                int length = i - deque.peekFirst();
                if (res > length) {
                    res = length;
                }
                deque.removeFirst();
            }

            while (!deque.isEmpty() && prefixSum[i] <= prefixSum[deque.peekLast()]) {
                deque.removeLast();
            }
            deque.addLast(i);
        }

        if (res <= A.length) {
            return res;
        }
        return -1;
    }
}
