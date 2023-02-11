package com.sanedge.java.Array.removeelement;

public class RemoveElement {
    public int removeElement(int[] nums, int val){
        if(nums.length == 0){
            return 0;
        }
        int j = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                if(i != j){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
                j++;
            }
        }

        return j;
    }

}
