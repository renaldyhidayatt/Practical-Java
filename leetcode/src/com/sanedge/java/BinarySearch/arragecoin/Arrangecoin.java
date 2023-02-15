package com.sanedge.java.BinarySearch.arragecoin;

public class Arrangecoin {
    public int arragecoin(int n){
        if(n <= 0){
            return 0;
        }

        double x = Math.sqrt(2 * (double) n + 0.25) - 0.5;

        return (int) x;

    }
}
