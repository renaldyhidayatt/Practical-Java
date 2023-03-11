package com.sanedge.java.BitManipulation.minimumincompatibility;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Min {
    public static int minimumIncompatibility(int[] nums, int k) {
        Arrays.sort(nums);
        int eachSize = nums.length / k;
        int[] counts = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            counts[nums[i]]++;
            if (counts[nums[i]] > k) {
                return -1;
            }
        }
        List<Integer> orders = new ArrayList<>();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                orders.add(i);
            }
        }
        int[] res = { Integer.MAX_VALUE };
        generatePermutation(nums, counts, orders.stream().mapToInt(i -> i).toArray(), 0, 0, eachSize, res,
                new ArrayList<>());
        if (res[0] == Integer.MAX_VALUE) {
            return -1;
        }
        return res[0];
    }

    public static void generatePermutation(int[] nums, int[] counts, int[] order, int index, int sum, int eachSize,
            int[] res, List<Integer> current) {
        if (current.size() > 0 && current.size() % eachSize == 0) {
            sum += current.get(current.size() - 1) - current.get(current.size() - eachSize);
            index = 0;
        }

        if (sum >= res[0]) {
            return;
        }

        if (current.size() == nums.length) {
            if (sum < res[0]) {
                res[0] = sum;
            }

            return;
        }

        for (int i = index; i < order.length; i++) {
            if (counts[order[i]] == 0) {
                continue;
            }
            counts[order[i]]--;
            current.add(order[i]);
            generatePermutation(nums, counts, order, i + 1, sum, eachSize, res, current);
            current.remove(current.size() - 1);
            counts[order[i]]++;
            if (index == 0) {
                break;
            }
        }

    }
}
