package com.sanedge.java.BinarySearch.maxconsecutive;

public class Max {
    public static int longestOnes(int[] A, int K){
        int res= 0;
        int left = 0;
        int right = 0;

        while(left < A.length){
            if(right < A.length && ((A[right] == 0 && K > 0) || A[right] == 1)){
                if (A[right] == 0) {
                    K--;
                }
                right++;
            }else{
                if (K == 0 || (right == A.length && K > 0)) {
                    res = Math.max(res, right - left);
                }
        
                if (A[left] == 0) {
                    K++;
                }
        
                left++;
            }
        }

        return res;
    }
}
