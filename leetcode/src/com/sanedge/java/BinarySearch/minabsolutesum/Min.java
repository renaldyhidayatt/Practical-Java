package com.sanedge.java.BinarySearch.minabsolutesum;

public class Min {
    public int minAbsoluteSumDiff(int[] nums1, int[] nums2){
        int diff = 0;
        int maxDiff = 0;
        for(int i = 0; i < nums1.length; i++){
            int d = Math.abs(nums1[i] - nums2[i]);
            diff += d;
            if(maxDiff < d){
                int t = 10001;
                for (int n1 : nums1) {
                    maxDiff = Math.max(maxDiff, d - Math.min(t, Math.abs(n1 - nums2[i])));
                }
            }
        }

        return (diff - maxDiff) % 1000000007;
    }
}
