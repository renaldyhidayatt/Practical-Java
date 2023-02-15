package com.sanedge.java.BinarySearch.findrightinterval;

import java.util.Arrays;

public class Find {
    public int[] findRightInterval(int[][] intervals){
        int n = intervals.length;
        Interval[] intervalList = new Interval[n];
        
        for (int i = 0; i < n; i++) {
            intervalList[i] = new Interval(intervals[i], i);
        }

        Arrays.sort(intervalList);
        
        int[] out = new int[n];

        for (int i = 0; i < n; i++) {
            int index = binarySearch(intervalList, intervalList[i].interval[1]);
            if (index == n) {
                out[intervalList[i].index] = -1;
            } else {
                out[intervalList[i].index] = intervalList[index].index;
            }
        }
        
        return out;

    
    }

    private int binarySearch(Interval[] intervals, int target){
        int low = 0, high = intervals.length - 1;

        while(low <= high){
            int mid = low + ((high - low) >> 1);
            if(intervals[mid].interval[0] >= target){
                if ((mid == 0) || (intervals[mid - 1].interval[0] < target)) {
                    return mid;
                }
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return intervals.length;
    }

    private static class Interval implements Comparable<Interval>{
        int[] interval;
        int index;

        Interval(int[] interval, int index) {
            this.interval = interval;
            this.index = index;
        }
        
        @Override
        public int compareTo(Interval other) {
            return Integer.compare(this.interval[0], other.interval[0]);
        }
    }
}
