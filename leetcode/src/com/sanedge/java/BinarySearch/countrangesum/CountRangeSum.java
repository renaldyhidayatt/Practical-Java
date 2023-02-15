package com.sanedge.java.BinarySearch.countrangesum;

public class CountRangeSum {
    public int countRangeSum(int[] nums, int lower, int upper){
        int n = nums.length;
        int res = 0;
        for(int i = 0; i < n; i++){
            long tmp = 0;
            for(int j = i; j < n; j++){
                if(i == j){
                    tmp = nums[i];
                }else{
                    tmp += nums[j];
                }
                if (tmp <= upper && tmp >= lower) {
                    res++;
                }
            }
        }

        return res;
    }
}
