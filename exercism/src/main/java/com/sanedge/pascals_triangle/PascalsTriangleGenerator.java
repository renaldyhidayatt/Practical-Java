package com.sanedge.pascals_triangle;

public class PascalsTriangleGenerator {
  int[][] generateTriangel(int rows) {
    int[][] matrix = new int[rows][];

    for (int row = 0; row < rows; row++) {
      matrix[row] = new int[row + 1];
      matrix[row][0] = 1;
      matrix[row][row] = 1;

      for (int col = 1; col < row; col++) {
        matrix[row][col] = matrix[row - 1][col - 1] + matrix[row - 1][col];
      }
    }

    return matrix;
  }
}
