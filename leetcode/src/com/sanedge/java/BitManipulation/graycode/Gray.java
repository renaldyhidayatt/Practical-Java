package com.sanedge.java.BitManipulation.graycode;

import java.util.ArrayList;
import java.util.List;

public class Gray {
    public static List<Integer> grayCode(int n){
        int l = 1 << n;
        List<Integer> out = new ArrayList<>();

        for(int i = 0; i < l; i++){
            out.add((i >> 1) ^ i);
        }

        return out;
    }
}
