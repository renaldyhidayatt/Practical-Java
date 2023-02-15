package com.sanedge.java.BinarySearch.findradius;

public class Find {
    public int findRadius1(int[] houses, int[] heaters){
        int res = 0;
        for(int i = 0; i < houses.length; i++){
            int dis = Integer.MAX_VALUE;
            for(int j = 0; j < heaters.length; j++){
                dis = Math.min(dis, Math.abs(houses[i] - heaters[j]));
            }

            res = Math.max(res, dis);
        }

        return res;
    }
}
