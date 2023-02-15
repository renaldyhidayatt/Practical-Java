package com.sanedge.java.BinarySearch.summryrange;



import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SummryRange {
    private List<Integer> nums;
    private Map<Integer, Integer> mp;

    public SummryRange(){
        nums = new ArrayList<>();
        mp = new HashMap<>();
    }

    public void addNum(int val){
        if(!mp.containsKey(val) ){
            mp.put(val, 1);
            nums.add(val);
        }

        Collections.sort(nums);
    }

    public int[][] getIntervals(){
        int n = nums.size();

        List<int[]> ans = new ArrayList<>();
        if(n == 0){
            return ans.toArray(new int[0][]);
        }

        if (n == 1) {
            ans.add(new int[]{nums.get(0), nums.get(0)});
            return ans.toArray(new int[0][]);
        }
        int start = nums.get(0), end = nums.get(0);

        ans.add(new int[]{start,end});
        int index =0;

        for(int i = 1; i < n; i++){
            if(nums.get(i) == end + 1){
                end = nums.get(i);
                ans.get(index)[1] = end;
            }else{
                start = nums.get(i);
                end = nums.get(i);
                ans.add(new int[]{start, end});
                index++;
            }
        }
        return ans.toArray(new int[0][]);
    }
}
