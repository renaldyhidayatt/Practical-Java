package com.sanedge.java.BinarySearch.swimrisingwater;

public class Swim {
    public static int swimInWater(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        int[][] flags = new int[row][col];
        int minWait = 0, maxWait = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                flags[i][j] = -1;
                maxWait = Math.max(maxWait, grid[i][j]);
            }
        }
        while (minWait < maxWait) {
            int midWait = (minWait + maxWait) / 2;
            addFlags(grid, flags, midWait, 0, 0);
            if (flags[row - 1][col - 1] == midWait) {
                maxWait = midWait;
            } else {
                minWait = midWait + 1;
            }
        }
        return minWait;
    }

    public static void addFlags(int[][] grid, int[][] flags, int flag, int row, int col) {
        if (row < 0 || col < 0 || row >= grid.length || col >= grid[0].length) {
            return;
        }
        if (grid[row][col] > flag || flags[row][col] == flag) {
            return;
        }
        flags[row][col] = flag;
        addFlags(grid, flags, flag, row - 1, col);
        addFlags(grid, flags, flag, row + 1, col);
        addFlags(grid, flags, flag, row, col - 1);
        addFlags(grid, flags, flag, row, col + 1);
    }
}
