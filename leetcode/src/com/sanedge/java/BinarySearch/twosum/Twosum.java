package com.sanedge.java.BinarySearch.twosum;

import java.util.ArrayList;
import java.util.List;

public class Twosum {
    public List<Integer> twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                List<Integer> result = new ArrayList<>();
                result.add(i + 1);
                result.add(j + 1);
                return result;
            }
            if (numbers[i] + numbers[j] < target) {
                i++;
            } else {
                j--;
            }
        }

        return null;
    }
}
