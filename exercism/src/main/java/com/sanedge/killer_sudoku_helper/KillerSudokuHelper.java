package com.sanedge.killer_sudoku_helper;

import java.util.ArrayList;

import java.util.Arrays;

import java.util.HashSet;

import java.util.stream.IntStream;

import java.util.List;

import java.util.Set;

public class KillerSudokuHelper {
  private List<List<Integer>> kSum(int[] nums, long target, int start, int k, List<Integer> exclude) {

    List<List<Integer>> res = new ArrayList<>();

    Set<Integer> excludeSet = new HashSet<Integer>(exclude);

    if (start == nums.length) {

      return res;

    }

    long average_value = target / k;

    if (nums[start] > average_value || average_value > nums[nums.length - 1]) {

      return res;

    }

    if (k == 2) {

      return twoSum(nums, target, start, excludeSet);

    }

    for (int i = start; i < nums.length; ++i) {

      if (excludeSet.contains(nums[i])) {

        continue;

      }

      if (i == start || nums[i - 1] != nums[i]) {

        for (List<Integer> subset : kSum(nums, target - nums[i], i + 1, k - 1, exclude)) {

          res.add(new ArrayList<>(Arrays.asList(nums[i])));

          res.get(res.size() - 1).addAll(subset);

        }

      }

    }

    return res;

  }

  private List<List<Integer>> twoSum(int[] nums, long target, int start, Set<Integer> excludeSet) {

    List<List<Integer>> res = new ArrayList<>();

    Set<Long> s = new HashSet<>();

    for (int i = start; i < nums.length; ++i) {

      if (excludeSet.contains(nums[i])) {

        continue;

      }

      if (res.isEmpty() || res.get(res.size() - 1).get(1) != nums[i]) {

        if (s.contains(target - nums[i])) {

          res.add(Arrays.asList((int) target - nums[i], nums[i]));

        }

      }

      s.add((long) nums[i]);

    }

    return res;

  }

  List<List<Integer>> combinationsInCage(Integer cageSum, Integer cageSize, List<Integer> exclude) {

    if (cageSize == 1) {

      return List.of(List.of(cageSum));

    }

    int[] digits = IntStream.range(1, 10).toArray();

    List<List<Integer>> result = kSum(digits, cageSum, 0, cageSize, exclude);

    result.sort((lh, rh) -> {

      for (int i = 0; i < lh.size(); i++) {

        if (lh.get(i) == rh.get(i)) {

          continue;

        } else if (lh.get(i) < rh.get(i)) {

          return -1;

        } else {

          return 1;

        }

      }

      return 0;

    });

    return result;

  }

  List<List<Integer>> combinationsInCage(Integer cageSum, Integer cageSize) {

    return combinationsInCage(cageSum, cageSize, new ArrayList<Integer>());

  }
}
