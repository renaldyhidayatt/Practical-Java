package com.sanedge.java.BinarySearch.randompickwithblacklist;

import java.util.HashMap;
import java.util.Map;

public class Random {
    private int M;
    private Map<Integer, Integer> blackMap;

    public Random(int N, int[] blacklist) {
        blackMap = new HashMap<>();
        
        for (int i = 0; i < blacklist.length; i++) {
            blackMap.put(blacklist[i], 1);
        }
        
        M = N - blacklist.length;
        
        for (int value : blacklist) {
            if (value < M) {
                while (true) {
                    if (blackMap.containsKey(N - 1)) {
                        N--;
                    } else {
                        break;
                    }
                }
                blackMap.put(value, N - 1);
                
                N--;
            }
        }
    }
    
    public int pick() {
        int idx = (int)(Math.random() * M);
        
        if (blackMap.containsKey(idx)) {
            return blackMap.get(idx);
        }
        
        return idx;
    }
}   
