package com.sanedge.java.BinaryIndexedTree.onlinemajorty;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MajorityChecker {
    static class SegmentItem {
        int candidate, count;
        public SegmentItem(int candidate, int count) {
            this.candidate = candidate;
            this.count = count;
        }
    }

    private SegmentItem[] segmentTree;
    private int[] data;
    private Map<Integer, List<Integer>> count;

    public MajorityChecker(int[] arr) {
        int n = arr.length;
        this.data = new int[n];
        this.segmentTree = new SegmentItem[4*n];
        this.count = new HashMap<>();
        for (int i = 0; i < n; i++) {
            data[i] = arr[i];
        }
        buildSegmentTree(0, 0, n-1);
    }

    private SegmentItem merge(SegmentItem i, SegmentItem j) {
        if (i.candidate == j.candidate) {
            return new SegmentItem(i.candidate, i.count + j.count);
        }
        if (i.count > j.count) {
            return new SegmentItem(i.candidate, i.count - j.count);
        }
        return new SegmentItem(j.candidate, j.count - i.count);
    }

    private void buildSegmentTree(int treeIndex, int left, int right) {
        if (left == right) {
            segmentTree[treeIndex] = new SegmentItem(data[left], 1);
            return;
        }
        int leftTreeIndex = leftChild(treeIndex), rightTreeIndex = rightChild(treeIndex);
        int midTreeIndex = left + (right - left) / 2;
        buildSegmentTree(leftTreeIndex, left, midTreeIndex);
        buildSegmentTree(rightTreeIndex, midTreeIndex + 1, right);
        segmentTree[treeIndex] = merge(segmentTree[leftTreeIndex], segmentTree[rightTreeIndex]);
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }

    private SegmentItem query(int left, int right) {
        return queryInTree(0, 0, data.length - 1, left, right);
    }

    private SegmentItem queryInTree(int treeIndex, int left, int right, int queryLeft, int queryRight) {
        int midTreeIndex = left + (right - left) / 2;
        int leftTreeIndex = leftChild(treeIndex), rightTreeIndex = rightChild(treeIndex);
        if (queryLeft <= left && queryRight >= right) { // segment completely inside range
            return segmentTree[treeIndex];
        }
        if (queryLeft > midTreeIndex) {
            return queryInTree(rightTreeIndex, midTreeIndex + 1, right, queryLeft, queryRight);
        } else if (queryRight <= midTreeIndex) {
            return queryInTree(leftTreeIndex, left, midTreeIndex, queryLeft, queryRight);
        }
        return merge(queryInTree(leftTreeIndex, left, midTreeIndex, queryLeft, midTreeIndex),
                     queryInTree(rightTreeIndex, midTreeIndex + 1, right, midTreeIndex + 1, queryRight));
    }

    public int query(int left, int right, int threshold) {
        SegmentItem res = query(left, right);
        if (!count.containsKey(res.candidate)) {
            return -1;
        }
        List<Integer> candidatePositions = count.get(res.candidate);
        int start = Collections.binarySearch(candidatePositions, left);
        if (start < 0) {
            start = -start - 1;
        }
        int end = Collections.binarySearch(candidatePositions, right);
        if (end < 0) {
            end = -end - 2;
        }
        if ((end - start + 1) >= threshold) {
            return res.candidate;
        }
        return -1;
    }

}
