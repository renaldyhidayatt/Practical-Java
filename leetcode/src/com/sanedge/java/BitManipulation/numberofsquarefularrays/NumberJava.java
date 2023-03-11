package com.sanedge.java.BitManipulation.numberofsquarefularrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberJava {
    public static int numSquarefulPerms(int[] A) {
        if (A.length == 0) {
            return 0;
        }

        boolean[] used = new boolean[A.length];
        List<Integer> p = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(A);
        generatePermutation(A, 0, p, res, used);
        return res.size();
    }

    public static void generatePermutation(int[] nums, int index, List<Integer> p, List<List<Integer>> res,
            boolean[] used) {
        if (index == nums.length) {
            boolean checkSquareful = true;
            for (int i = 0; i < p.size() - 1; i++) {
                if (!checkSquare(p.get(i) + p.get(i + 1))) {
                    checkSquareful = false;
                    break;
                }
            }
            if (checkSquareful) {
                res.add(new ArrayList<>(p));
            }
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!used[i]) {
                if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                    continue;
                }
                if (!p.isEmpty() && !checkSquare(nums[i] + p.get(p.size() - 1))) {
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

    public static boolean checkSquare(int num) {
        int tmp = (int) Math.sqrt(num);

        return tmp * tmp == num;
    }
}
