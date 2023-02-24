package com.sanedge.java.BinarySearch.comparestring;

import java.util.Arrays;

public class Compare {
    public static int[] numSmallerByFrequency(String[] queries, String []words){
        int[] ws = new int[words.length];
        int[] res = new int[queries.length];
        for (int i = 0; i < words.length; i++) {
            ws[i] = countFunc(words[i]);
        }

        Arrays.sort(ws);
        for(int i = 0; i < queries.length; i++){
            int fq = countFunc(queries[i]);
            res[i] = words.length - Arrays.binarySearch(ws, fq);
        }

        return res;
    }
    public static int countFunc(String s) {
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;
        }

        int i = 0;
        while (count[i] == 0) {
            i++;
        }
    
        return count[i];

    }
}
