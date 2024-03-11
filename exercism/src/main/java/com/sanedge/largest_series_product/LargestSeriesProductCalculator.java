package com.sanedge.largest_series_product;

import java.util.regex.Pattern;

public class LargestSeriesProductCalculator {
  String num;

  LargestSeriesProductCalculator(String inputNumber) {
    if (Pattern.matches(".*[^\\d].*", inputNumber))

      throw new IllegalArgumentException("String to search may only contain digits.");

    num = inputNumber;
  }

  long calculateLargestProductForSeriesLength(int numberOfDigits) {
    if (numberOfDigits < 0) {
      throw new IllegalArgumentException("Series length must be non-negative.");
    }

    if (numberOfDigits > num.length()) {
      throw new IllegalArgumentException(
          "Series length must be less than or " + "equal to the length of the string to search.");
    }

    long max = 0;

    for (int i = 0; i < num.length() - numberOfDigits; i++) {
      long prod = num.substring(i, i + numberOfDigits).chars().map(x -> x - '0').mapToLong(x -> x).reduce(1,
          (x, y) -> x * y);

      if (prod > max) {
        max = prod;
      }
    }

    return max;
  }
}
