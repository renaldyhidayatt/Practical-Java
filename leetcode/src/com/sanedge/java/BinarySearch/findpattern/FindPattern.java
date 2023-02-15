package com.sanedge.java.BinarySearch.findpattern;

import java.util.Deque;
import java.util.LinkedList;

public class FindPattern {
    public boolean find132pattern(int [] nums){
        if(nums.length < 3){
            return false;
        }

        int num3 = Integer.MIN_VALUE;

        Deque<Integer> stack = new LinkedList<>();
        for(int i = nums.length - 1; i >= 0; i--){
            if(nums[i] < num3){
                return true;
            }

            while(!stack.isEmpty() && nums[i] > stack.peek()){
                num3 = stack.pop();
            }
            stack.push(nums[i]);
        }

        return false;
    }
}
