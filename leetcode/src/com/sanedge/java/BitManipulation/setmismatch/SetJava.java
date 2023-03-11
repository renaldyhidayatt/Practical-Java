package com.sanedge.java.BitManipulation.setmismatch;

public class SetJava {
    public int[] findErrorNums(int[] nums) {
        int[] m = new int[nums.length];
        int[] res = new int[2];
        for (int n : nums) {
            if (m[n - 1] == 0) {
                m[n - 1] = 1;
            } else {
                res[0] = n;
            }
        }
        for (int i = 0; i < m.length; i++) {
            if (m[i] == 0) {
                res[1] = i + 1;
                break;
            }
        }
        return res;
    }

}
