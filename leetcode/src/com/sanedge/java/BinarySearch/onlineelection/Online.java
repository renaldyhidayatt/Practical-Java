package com.sanedge.java.BinarySearch.onlineelection;

import java.util.Arrays;

public class Online {
    private int[] persons;
    private int[] times;

    public Online(int[] persons, int[] times){
        int[] leaders = new int[persons.length];
        int[] votes = new int[persons.length];

        int leader = persons[0];

        for(int i = 0; i < persons.length; i++){
            int p = persons[i];

            votes[p]++;
            if(votes[p] >= votes[leader]){
                leader = p;
            }
            leaders[i] = leader;
        }

        this.persons = leaders;
        this.times = times;

    }

    public int q(int t){
        int i = Arrays.binarySearch(this.times, t);
        if(i < 0){
            i = -i -2;

        }
        return this.persons[i];
    }
}
