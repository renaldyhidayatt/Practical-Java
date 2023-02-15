package com.sanedge.java.BinarySearch.kthsmaller;

public class KthSmaller {
    public int kthSmallest(int[][] matrix, int k){
        int m = matrix.length, n = matrix[0].length;

        int low = matrix[0][0], high = matrix[m-1][n-1] + 1;

        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = countKthSmall(m, n, mid, matrix);
            if (count >= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }
    
        return low;
    }

    private int countKthSmall(int m, int n, int mid, int[][] matrix){
        int count = 0, j = n - 1;

        for(int i = 0; i < m; i++){
            while(j >= 0 && mid < matrix[i][j]){
                j--;
            }

            count += j + 1;
        }

        return count;
    }
}
