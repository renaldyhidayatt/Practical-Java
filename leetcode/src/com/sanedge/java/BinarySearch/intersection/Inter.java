package com.sanedge.java.BinarySearch.intersection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Inter {
    public int[] intersection(int[] nums1, int[] nums2) {

        Map<Integer, Boolean> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        for(int n : nums1){
            map.put(n, true);
        }

        for(int n : nums2){
            if(map.containsKey(n) && map.get(n)){
                map.put(n, false);
                list.add(n);
            }
        }

        int[] res = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }

        return res;
    } 
}
