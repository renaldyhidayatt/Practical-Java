package com.sanedge.java.Array.removeduplicate;

public class RemoveDuplicate {
    public int removeDuplicates(int[] nums){
        if(nums.length == 0){
            return 0;
        }

        int last = 0;
        int finder = 0;
        while(last < nums.length - 1){
            while(finder < nums.length && nums[finder]== nums[last]){
                finder++;
            }

            if(finder == nums.length){
                return last + 1;
            }

            nums[last + 1] = nums[finder];
            last++;
        }

        return last + 1;
    }


}
