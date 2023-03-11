package com.sanedge.java.BitManipulation.beautifulArrangement;

import java.util.ArrayList;
import java.util.List;

public class Beautiful {
    public int countArrangement(int N) {
        if (N == 0) {
            return 0;
        }

        int[] nums = new int[N];
        boolean[] used = new boolean[N];
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> p = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            nums[i] = i + 1;
        }

        generatePermutation(nums, 0, p, res, used);

        return res.size();
    }

    public void generatePermutation(int[] nums, int index, List<Integer> p, List<List<Integer>> res, boolean[] used) {
        if (index == nums.length) {
            List<Integer> temp = new ArrayList<>(p);
            res.add(temp);
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                if (!(checkDivisible(nums[i], p.size() + 1) || checkDivisible(p.size() + 1, nums[i]))) { // 关键的剪枝条件
                    continue;
                }
                used[i] = true;
                p.add(nums[i]);
                generatePermutation(nums, index + 1, p, res, used);
                p.remove(p.size() - 1);
                used[i] = false;
            }
        }
    }

    public boolean checkDivisible(int num, int d) {
        int tmp = num / d;

        if (tmp * d == num) {
            return true;
        }

        return false;
    }
}
