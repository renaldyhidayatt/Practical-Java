package com.sanedge.java.BinarySearch.mostprofitassignwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Most {
    static class Task {
        int difficulty;
        int profit;

        Task(int d, int p) {
            difficulty = d;
            profit = p;
        }
    }

    static class SortByDiff implements Comparator<Task> {
        public int compare(Task t1, Task t2) {
            return t1.difficulty - t2.difficulty;
        }
    }

    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        if (difficulty.length == 0 || profit.length == 0 || worker.length == 0) {
            return 0;
        }
        List<Task> tasks = new ArrayList<>();
        for (int i = 0; i < difficulty.length; i++) {
            tasks.add(new Task(difficulty[i], profit[i]));
        }

        Collections.sort(tasks, new SortByDiff());
        Arrays.sort(worker);
        int res = 0, index = 0;

        for (int i = 1; i < tasks.size(); i++) {
            tasks.get(i).profit = Math.max(tasks.get(i).profit, tasks.get(i - 1).profit);
        }

        for (int w : worker) {
            while (index < difficulty.length && w >= tasks.get(index).difficulty) {
                index++;
            }

            if (index > 0) {
                res += tasks.get(index - 1).profit;
            }
        }

        return res;
    }
}
