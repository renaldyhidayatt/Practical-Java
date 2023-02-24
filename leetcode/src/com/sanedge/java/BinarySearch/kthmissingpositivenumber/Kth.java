package com.sanedge.java.BinarySearch.kthmissingpositivenumber;

public class Kth {
    public static int findKthPositive(int[]arr, int k){
        int positive = 1;
        int index = 0;

        while(index < arr.length){
            if(arr[index] != positive){
                k--;
            }else{
                index++;
            }

            if(k == 0){
                break;
            }
            positive++;
        }
        if(k!= 0){
            positive += k - 1;

        }

        return positive;
    }
}
