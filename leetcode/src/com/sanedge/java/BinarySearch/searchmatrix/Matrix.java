package com.sanedge.java.BinarySearch.searchmatrix;

public class Matrix {
    public boolean searchMatrix(int[][] matrix, int target){
        if(matrix.length == 0){
            return false;
        }

        int m = matrix[0].length;
        int low = 0;
        int high = m * matrix.length - 1;
        while(low <= high){
            int mid = low + ((high- low) >> 1);
            if(matrix[mid / m][mid % m] == target){
                return true;
            }else if(matrix[mid /m ][mid%m] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return false;
    }
}
