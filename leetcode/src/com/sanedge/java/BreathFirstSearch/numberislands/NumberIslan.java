package com.sanedge.java.BreathFirstSearch.numberislands;

public class NumberIslan {
    public static int numIslands(char[][] grid) {
        int m = grid.length;

        if (m == 0) {
            return 0;
        }

        int n = grid[0].length;

        if (n == 0) {
            return 0;
        }

        int res = 0;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1' && !visited[i][j]) {
                    searchIslands(grid, visited, i, j);
                    res++;
                }
            }
        }
        return res;
    }

    private static void searchIslands(char[][] grid, boolean[][] visited, int x, int y) {
        visited[x][y] = true;

        int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

        for (int i = 0; i < 4; i++) {
            int nx = x + dir[i][0];
            int ny = y + dir[i][1];
            if (isInBoard(grid, nx, ny) && !visited[nx][ny] && grid[nx][ny] == '1') {
                searchIslands(grid, visited, nx, ny);
            }
        }
    }

    private static boolean isInBoard(char[][] grid, int x, int y) {
        int m = grid.length;
        int n = grid[0].length;
        return x >= 0 && x < m && y >= 0 && y < n;
    }
}
