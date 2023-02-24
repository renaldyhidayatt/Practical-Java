package com.sanedge.java.BinarySearch.faircandy;

import java.util.HashMap;
import java.util.Map;

public class Fair {
    public static int[] fairCandySwapp(int[] A, int[] B){
        int hDiff = diff(A, B) / 2;
        Map<Integer, Integer> aMap = new HashMap<>();

        for(int a : A){
            aMap.put(a, a);
        }
        for(int b : B){
            if(aMap.containsKey(hDiff + b)){
                return new int[]{aMap.get(hDiff + b), b};
            }
        }

        return new int[]{};
    }

    public static int diff(int[] A, int[] B){
        int diff = 0;
        int maxLen = Math.max(A.length, B.length);

        for(int i = 0; i < maxLen; i++){
            if(i <A.length){
                diff += A[i];
            }
            if (i < B.length) {
                diff -= B[i];
            }
        }

        return diff;
    }
}
