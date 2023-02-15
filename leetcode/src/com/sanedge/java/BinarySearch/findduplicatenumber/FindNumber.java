package com.sanedge.java.BinarySearch.findduplicatenumber;

public class FindNumber {
    public int findDuplicate(int[] nums){
        int slow = nums[0];
        int fast = nums[nums[0]];
        while(fast != slow){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        int walker = 0;
        while(walker != slow){
            walker = nums[walker];
            slow = nums[slow];
        }

        return walker;
    }
}
