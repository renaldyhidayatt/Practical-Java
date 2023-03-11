package com.sanedge.java.BitManipulation.numberofvalidwordsforeach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberForEach {
    public static int[] findNumOfValidWords(String[] words, String[] puzzles) {
        Map<Integer, Integer> wordBitStatusMap = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        for (String w : words) {
            int bitMap = toBitMap(w.toCharArray());

            wordBitStatusMap.put(bitMap, wordBitStatusMap.getOrDefault(bitMap, 0) + 1);
        }

        for (String p : puzzles) {
            int bitMap = 1 << (p.charAt(0) - 'a');
            int totalNum = 0;
            findNum(p.toCharArray(), bitMap, totalNum, wordBitStatusMap, res);
        }

        return res.stream().mapToInt(i -> i).toArray();
    }

    private static int toBitMap(char[] word) {
        int res = 0;
        for (char c : word) {
            res |= 1 << (c - 'a');
        }

        return res;
    }

    private static void findNum(char[] puzzles, int bitMap, int totalNum, Map<Integer, Integer> m, List<Integer> res) {
        if (puzzles.length == 0) {
            res.add(totalNum + m.getOrDefault(bitMap, 0));
            return;
        }
        findNum(Arrays.copyOfRange(puzzles, 1, puzzles.length), bitMap, totalNum, m, res);

        bitMap |= 1 << (puzzles[0] - 'a');
        findNum(Arrays.copyOfRange(puzzles, 1, puzzles.length), bitMap, totalNum, m, res);
    }
}
