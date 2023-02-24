package com.sanedge.java.BinarySearch.randompoint;

import java.util.Random;

public class RandomPickRect {
    private int[][] rects;
    private int[] arr;
    private Random rand;

    public RandomPickRect(int[][] rects) {
        this.rects = rects;
        this.arr = new int[rects.length];
        int area;
        for (int i = 0; i < rects.length; i++) {
            area = (rects[i][2] - rects[i][0] + 1) * (rects[i][3] - rects[i][1] + 1);
            if (area < 0) area = -area;

            if (i == 0) {
                this.arr[i] = area;
            } else {
                this.arr[i] = this.arr[i-1] + area;
            }
        }
        this.rand = new Random();
    }

    public int[] pick() {
        int r = rand.nextInt(this.arr[this.arr.length-1]);

        int low = 0, high = this.arr.length-1, index = -1;
        while (low <= high) {
            int mid = low + (high-low)/2;

            if (this.arr[mid] > r) {
                if (mid == 0 || this.arr[mid-1] <= r) {
                    index = mid;
                    break;
                }
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (index == -1) {
            index = low;
        }

        if (index > 0) {
            r = r - this.arr[index-1];
        }
        int length = this.rects[index][2] - this.rects[index][0];
        return new int[]{this.rects[index][0] + r%(length+1), this.rects[index][1] + r/(length+1)};
    }
}


