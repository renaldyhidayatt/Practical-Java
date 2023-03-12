package com.sanedge.java.BreathFirstSearch.removeinvalidparentheses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RemoveInvalid {
    private List<String> res = new ArrayList<>();
    private Map<String, Integer> mp = new HashMap<>();
    private int n, length, maxScore;
    private String str;

    public List<String> removeInvalidParentheses(String s) {
        int lmoves = 0, rmoves = 0, lcnt = 0, rcnt = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                lmoves++;
                lcnt++;
            } else if (c == ')') {
                if (lmoves != 0) {
                    lmoves--;
                } else {
                    rmoves++;
                }
                rcnt++;
            }
        }

        n = s.length();
        length = n - lmoves - rmoves;

        maxScore = Math.min(lcnt, rcnt);

        str = s;
        backtrace(0, "", lmoves, rmoves, 0);

        return res;
    }

    private void backtrace(int i, String cur, int lmoves, int rmoves, int score) {
        if (lmoves < 0 || rmoves < 0 || score < 0 || score > maxScore) {
            return;
        }

        if (lmoves == 0 && rmoves == 0) {
            if (cur.length() == length) {
                if (!mp.containsKey(cur)) {
                    res.add(cur);
                    mp.put(cur, 1);
                }
                return;
            }
        }

        if (i == n) {
            return;
        }

        if (str.charAt(i) == '(') {
            backtrace(i + 1, cur + '(', lmoves, rmoves, score + 1);
            backtrace(i + 1, cur, lmoves - 1, rmoves, score);
        } else if (str.charAt(i) == ')') {
            backtrace(i + 1, cur + ')', lmoves, rmoves, score - 1);
            backtrace(i + 1, cur, lmoves, rmoves - 1, score);
        } else {
            backtrace(i + 1, cur + str.charAt(i), lmoves, rmoves, score);
        }
    }
}
