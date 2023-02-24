package com.sanedge.java.BinarySearch.findthevaluebetweentwoarray;

public class Find {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int res = 0;
        for(int i = 0; i < arr1.length; i++){
            boolean found = false;
            for(int j = 0; j < arr2.length; j++){
                if (Math.abs(arr1[i] - arr2[j]) <= d) {
                    found = true;
                    break;
                }
            }

            if(!found){
                res++;
            }
        }

        return res;
    }
}
