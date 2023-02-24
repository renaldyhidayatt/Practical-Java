package com.sanedge.java.BinarySearch.minnumbermake;

public class Min {
    public int minDays(int[] bloomDay, int m, int k){
        if(m * k > bloomDay.length){
            return -1;
        }

        int  maxDay = 0;
        for(int day : bloomDay){
            if(day > maxDay){
                maxDay = day;
            }
        }

        int left = 0, right = maxDay;
        while(left < right){
            int mid = left + ( right - left) / 2;
            if(check(bloomDay, m, k, mid)){
                right = mid;
            }else{
                left = mid + 1;
            }
        }

        return left;
    }
    private static boolean check(int[] bloomDay, int m, int k, int day){
        int flowers = 0, bouquests = 0;

        for(int i = 0;i  < bloomDay.length; i++){
            if(bloomDay[i] <= day){
                flowers++;
                if(flowers == k){
                    bouquests++;
                    flowers = 0;
                }
            }else{
                flowers = 0;
            }
        }

        return bouquests >= m;
    }
}
