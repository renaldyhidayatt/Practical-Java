package com.sanedge.java.BinaryIndexedTree.rangesumquery;

public class RangeSumQuery {
    private int sz;
    private int[] nums;
    private int[] sums;

    public RangeSumQuery(int[] nums) {
        sz = nums.length;
        this.nums = new int[sz+1];
        sums = new int[sz+1];
        for(int i=0; i< sz; i++) {
            update(i, nums[i]);
        }
    }

    public void update(int i, int val) {
        int oldv = nums[i+1];
        for(int idx = i+1; idx <= sz; idx += (idx & (-idx))) {
            sums[idx] = sums[idx] - oldv + val;
        }
        nums[i+1] = val;
    }

    public int sumRange(int i, int j) {
        return sumRange(j+1) - sumRange(i);
    }

    public int sumRange(int i) {
        int ret = 0;
        for(int idx=i; idx>0; idx -= (idx & (-idx))) {
            ret += sums[idx];
        }
        return ret;
    }
}
