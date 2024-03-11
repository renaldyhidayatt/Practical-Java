package com.sanedge.difference_of_squares;

public class DifferenceOfSquareCalculator {
  int computeSquareOfSumTo(int input) {
    int sum = (input * (input + 1)) >> 1;

    return sum * sum;
  }

  int computeSumOfSquaresTo(int input) {
    return input * (input + 1) * ((input << 1) + 1) / 6;
  }

  int computeDifferenceOfSquares(int input) {
    return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
  }
}
