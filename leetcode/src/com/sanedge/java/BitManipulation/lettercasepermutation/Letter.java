package com.sanedge.java.BitManipulation.lettercasepermutation;

import java.util.ArrayList;
import java.util.List;

public class Letter {
    public List<String> letterCasePermutation(String S) {
        if (S.length() == 0) {
            return new ArrayList<>();
        }

        List<String> res = new ArrayList<>();
        List<Integer> pos = new ArrayList<>();
        List<Integer> c = new ArrayList<>();
        String SS = S.toLowerCase();

        for (int i = 0; i < SS.length(); i++) {
            if (isLowerLetter(SS.charAt(i))) {
                pos.add(i);
            }
        }

        for (int i = 0; i <= pos.size(); i++) {
            findLetterCasePermutation(SS, pos, i, 0, c, res);
        }
        return res;

    }

    public void findLetterCasePermutation(String s, List<Integer> pos, int target, int index, List<Integer> c,
            List<String> res) {
        if (c.size() == target) {
            char[] b = s.toCharArray();
            for (int v : c) {
                b[pos.get(v)] -= 'a' - 'A';
            }
            res.add(new String(b));
            return;
        }
        for (int i = index; i < pos.size() - (target - c.size()) + 1; i++) {
            c.add(i);
            findLetterCasePermutation(s, pos, target, i + 1, c, res);
            c.remove(c.size() - 1);
        }
    }

    public boolean isLowerLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }
}
