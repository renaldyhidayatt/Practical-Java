package com.sanedge.java.BreathFirstSearch.couseschedule;

import java.util.ArrayList;
import java.util.List;

public class Courses {
    public static boolean canFinish(int n, int[][] pre) {
        int[] in = new int[n];

        List<Integer>[] frees = new ArrayList[n];
        List<Integer> next = new ArrayList<>();

        for (int[] v : pre) {
            in[v[0]]++;
            if (frees[v[1]] == null) {
                frees[v[1]] = new ArrayList<>();
            }
            frees[v[1]].add(v[0]);
        }

        for (int i = 0; i < n; i++) {
            if (in[i] == 0) {
                next.add(i);
            }
        }

        for (int i = 0; i < next.size(); i++) {
            int c = next.get(i);
            List<Integer> v = frees[c];

            if (v == null) {
                continue;
            }

            for (int vv : v) {
                in[vv]--;
                if (in[vv] == 0) {
                    next.add(vv);
                }
            }
        }

        return next.size() == n;
    }
}
