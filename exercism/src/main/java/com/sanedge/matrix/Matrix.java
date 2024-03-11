package com.sanedge.matrix;

import java.util.Arrays;

public class Matrix {

  int[][] matrix;

  Matrix(String matrixAsString) {
    matrix = Arrays.stream(matrixAsString.split("\n"))

        .map(x -> Arrays.stream(x.split(" "))

            .mapToInt(y -> Integer.parseInt(y))

            .toArray())

        .toArray(int[][]::new);
  }

  int[] getRow(int rowNumber) {
    return matrix[rowNumber - 1];
  }

  int[] getColumn(int columnNumber) {
    return Arrays.stream(matrix).mapToInt(x -> x[columnNumber - 1]).toArray();
  }
}
