package com.sanedge.java.BinarySearch.maxprofitjob;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Max {

    class Job {
        int startTime;
        int endTime;
        int profit;

        public Job(int startTime, int endTime, int profit) {
            this.startTime = startTime;
            this.endTime = endTime;
            this.profit = profit;
        }
    }

    class SortJobs implements Comparator<Job> {
        public int compare(Job j1, Job j2) {
            if (j1.endTime == j2.endTime) {
                return j1.profit - j2.profit;
            }
            return j1.endTime - j2.endTime;
        }
    }

    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        List<Job> jobs = new ArrayList<>();
        int[] dp = new int[startTime.length];
        for (int i = 0; i < startTime.length; i++) {
            jobs.add(new Job(startTime[i], endTime[i], profit[i]));
        }
        Collections.sort(jobs, new SortJobs());

        dp[0] = jobs.get(0).profit;

        for (int i = 1; i < jobs.size(); i++) {
            int low = 0;
            int high = i - 1;

            while (low < high) {
                int mid = low + (high - low) / 2;

                if (jobs.get(mid + 1).endTime <= jobs.get(i).startTime) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }

            if (jobs.get(low).endTime <= jobs.get(i).startTime) {
                dp[i] = Math.max(dp[i - 1], dp[low] + jobs.get(i).profit);
            } else {
                dp[i] = Math.max(dp[i - 1], jobs.get(i).profit);
            }
        }

        return dp[startTime.length - 1];

    }

}
