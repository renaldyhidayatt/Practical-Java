package com.sanedge.saddle_points;

import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class Matrix {
  private List<List<Integer>> trees;

  Matrix(List<List<Integer>> values) {
    this.trees = values;
  }

  Set<MatrixCoordinate> getSaddlePoints() {
    Set<MatrixCoordinate> coordinates = new HashSet<>();

    for (int i = 0; i < trees.size(); i++) {
      int maxRow = trees.get(i).stream().mapToInt(j -> j).max().orElseThrow(NoSuchElementException::new);

      for (int j = 0; j < trees.get(i).size(); j++) {
        if (trees.get(i).get(j).equals(maxRow)) {
          int x = j;
          int minColumn = trees.stream().mapToInt(k -> k.get(x)).min().orElseThrow(NoSuchElementException::new);

          if (minColumn == maxRow) {
            coordinates.add(new MatrixCoordinate(i + 1, j + 1));

            System.out.println();
          }
        }
      }
    }

    return coordinates;
  }
}
