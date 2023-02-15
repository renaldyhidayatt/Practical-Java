package com.sanedge.java.BinarySearch.longestincreasingsub;

public class Longest {
    public static int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length + 1];
        int res = 0;
        dp[0] = 0;
        for (int i = 1; i <= nums.length; i++) {
            for (int j = 1; j < i; j++) {
                if (nums[j - 1] < nums[i - 1]) {
                    dp[i] = Math.max(dp[i], dp[j]);
                }
            }
            dp[i] = dp[i] + 1;
            res = Math.max(res, dp[i]);
        }
        return res;
    }
}
