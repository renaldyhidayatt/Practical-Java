package com.sanedge.java.BitManipulation.binarywatcg;

import java.util.ArrayList;
import java.util.List;
import java.util.function.IntUnaryOperator;
import java.util.function.Function;

public class Binary {
    public List<String> readBinaryWatch(int num){
        int[] memo = new int[60];

        IntUnaryOperator count = n -> {
            if (memo[n] != 0) {
                return memo[n];
            }
            int originN = n, res = 0;
            while (n != 0) {
                n = n & (n - 1);
                res++;
            }
            memo[originN] = res;
            return res;
        };
        Function<Integer, String> fmtMinute = m -> {
            if (m < 10) {
                return "0" + m;
            }
            return String.valueOf(m);
        };
        List<String> res = new ArrayList<>();

        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 60; j++){
                if (count.applyAsInt(i) + count.applyAsInt(j) == num) {
                    res.add(i + ":" + fmtMinute.apply(j));
                }
            }
        }

        return res;
    }
}
