package com.sanedge.java.BitManipulation.numbertohex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberHex {
    public static String toHex(int num){
        if(num == 0){
            return "0";
        }

        if(num < 0){
            num += 1L << 32;
        }

        Map<Integer, String> mp = new HashMap<>();
        mp.put(0, "0");
        mp.put(1, "1");
        mp.put(2, "2");
        mp.put(3, "3");
        mp.put(4, "4");
        mp.put(5, "5");
        mp.put(6, "6");
        mp.put(7, "7");
        mp.put(8, "8");
        mp.put(9, "9");
        mp.put(10, "a");
        mp.put(11, "b");
        mp.put(12, "c");
        mp.put(13, "d");
        mp.put(14, "e");
        mp.put(15, "f");
        List<String> bitArr = new ArrayList<>();

        while(num > 0){
            bitArr.add(mp.get(num % 16));
            num /= 16;
        }

        StringBuilder sb = new StringBuilder();

        for(int i = bitArr.size() - 1; i >= 0;i--){
            sb.append(bitArr.get(i));
        }

        return sb.toString();
    }
}
