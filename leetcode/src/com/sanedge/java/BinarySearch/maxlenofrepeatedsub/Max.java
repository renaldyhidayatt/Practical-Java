package com.sanedge.java.BinarySearch.maxlenofrepeatedsub;

import java.util.HashMap;
import java.util.Map;

public class Max {
    private static final int primeRK = 16777619;

    public static int findLength(int[] A, int[] B){
        int low = 0, high = Math.min(A.length, B.length);
        while(low < high){
            int mid = (low + high + 1) >> 1;
            if(hashRepeated(A, B, mid)){
                low = mid;
            }else{
                high = mid - 1;
            }
        }

        return low;
    }

    public static int[] hashSlice(int []arr, int length){
        int[] hash = new int[arr.length - length + 1];
        int pl = 1, h = 0;
        for(int i = 0; i < length - 1;i++){
            pl *= primeRK;
        }
        for(int i = 0; i < arr.length; i++){
            h = h * primeRK + arr[i];
            if (i >= length - 1) {
                hash[i - length + 1] = h;
                h -= pl * arr[i - length + 1];
            }
        }

        return hash;
    }

    private static boolean hasSamePrefix(int[] A, int[] B, int length){
        for(int i = 0; i < length; i++){
            if(A[i] != B[i]){
                return false;
            }
        }

        return true;
    }

    private static boolean hashRepeated(int[] A, int[] B, int length){
        int[] hs = hashSlice(A, length);
        Map<Integer, int[]> hashToOffset = new HashMap<>();
        for(int i = 0; i < hs.length; i++){
            int h = hs[i];
            if (!hashToOffset.containsKey(h)) {
                hashToOffset.put(h, new int[]{i});
            } else {
                int[] offsets = hashToOffset.get(h);
                int[] newOffsets = new int[offsets.length + 1];
                System.arraycopy(offsets, 0, newOffsets, 0, offsets.length);
                newOffsets[offsets.length] = i;
                hashToOffset.put(h, newOffsets);
            }
        }
        int[] bs = hashSlice(B, length);
        for(int i = 0; i < bs.length; i++){
            int h = bs[i];
            if(hashToOffset.containsKey(h)){
                int[] offsets = hashToOffset.get(h);
                for (int offset : offsets) {
                    if (hasSamePrefix(A, B, length)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
