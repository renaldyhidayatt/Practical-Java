package com.sanedge.java.BitManipulation.uniquepaths;

import java.util.ArrayList;
import java.util.List;

public class Unique {

    private static final int[][] dir = {
            { -1, 0 },
            { 0, 1 },
            { 1, 0 },
            { 0, -1 },
    };

    public static int uniquePathsIII(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        int res = 0, empty = 0, startx = 0, starty = 0, endx = 0, endy = 0;
        List<Integer> path = new ArrayList<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                switch (grid[i][j]) {
                    case 0:
                        empty++;
                        break;
                    case 1:
                        startx = i;
                        starty = j;
                        break;
                    case 2:
                        endx = i;
                        endy = j;
                        break;
                }
            }
        }

        findUniquePathIII(grid, visited, path, empty + 1, startx, starty, endx, endy, res);
        return res;
    }

    private static boolean isInPath(int[][] board, int x, int y) {
        return x >= 0 && x < board.length && y >= 0 && y < board[0].length;
    }

    private static void findUniquePathIII(int[][] board, boolean[][] visited, List<Integer> path, int empty, int startx,
            int starty, int endx, int endy, int res) {
        if (startx == endx && starty == endy) {
            if (empty == 0) {
                res++;
            }
            return;
        }
        if (board[startx][starty] >= 0) {
            visited[startx][starty] = true;
            empty--;
            path.add(startx);
            path.add(starty);
            for (int i = 0; i < 4; i++) {
                int nx = startx + dir[i][0];
                int ny = starty + dir[i][1];
                if (isInPath(board, nx, ny) && !visited[nx][ny]) {
                    findUniquePathIII(board, visited, path, empty, nx, ny, endx, endy, res);
                }
            }
            visited[startx][starty] = false;
            path.remove(path.size() - 1);
            path.remove(path.size() - 1);
        }
    }

}
