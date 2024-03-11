package com.sanedge.sum_of_multiples;

import java.util.HashSet;

public class SumOfMultiples {
  private int[] bases;
  private int max;

  HashSet<Integer> multiples = new HashSet<>();

  SumOfMultiples(int number, int[] set) {
    max = number;
    bases = set;
  }

  int getSum() {
    int sum = 0;

    for (int b : bases) {
      if (b == 0) {
        continue;
      }

      for (int i = 0; i < max; i += b) {
        multiples.add(i);
      }
    }

    for (int h : multiples) {
      sum += h;
    }

    return sum;
  }
}
