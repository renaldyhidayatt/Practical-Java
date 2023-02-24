package com.sanedge.java.BinarySearch.kwakestrow;

public class Find {
    public static int[] kWeakestRows(int[][] mat, int k) {
        int[] res = new int[k];
        int idx = 0;
        boolean[] visited = new boolean[mat.length];

        for(int j = 0; j < mat[0].length; j++){
            for(int i = 0; i < mat.length; i++){
                if (!visited[i] && mat[i][j] == 0 && (j == 0 || mat[i][j-1] != 0)) {
                    visited[i] = true;
                    res[idx++] = i;
                    if (idx == k) {
                        return res;
                    }
                }
            }
        }
        for(int i = 0; i < mat.length && idx < k; i++){
            if (!visited[i]) {
                visited[i] = true;
                res[idx++] = i;
            }
        }

        return res;
    }
}
