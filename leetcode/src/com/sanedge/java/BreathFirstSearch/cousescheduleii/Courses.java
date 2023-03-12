package com.sanedge.java.BreathFirstSearch.cousescheduleii;

import java.util.ArrayList;
import java.util.List;

public class Courses {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] in = new int[numCourses];

        List<Integer>[] frees = new ArrayList[numCourses];
        List<Integer> next = new ArrayList<>();

        for (int[] v : prerequisites) {
            in[v[0]]++;
            if (frees[v[1]] == null) {
                frees[v[1]] = new ArrayList<>();
            }
            frees[v[1]].add(v[0]);
        }

        for (int i = 0; i < numCourses; i++) {
            if (in[i] == 0) {
                next.add(i);
            }
        }

        int[] order = new int[numCourses];
        int index = 0;

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

            order[index++] = c;
        }

        if (index == numCourses) {
            return order;
        }
        return new int[0];
    }
}
