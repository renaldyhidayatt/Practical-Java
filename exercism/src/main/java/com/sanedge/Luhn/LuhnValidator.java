package com.sanedge.Luhn;

import java.util.stream.IntStream;

final class LuhnValidator {
  boolean isValid(final String candidate) {
    final var cleaned = candidate.replaceAll(" ", "");
    if (cleaned.chars().anyMatch(c -> !Character.isDigit(c))) {
      return false;
    }
    if (cleaned.length() <= 1) {
      return false;
    }
    return IntStream.range(0, cleaned.length())
        .map(i -> digitValue(cleaned.charAt(cleaned.length() - i - 1), i))
        .sum() % 10 == 0;
  }

  private int digitValue(char c, int index) {
    var digit = c - '0';
    if ((index & 1) == 1) {
      digit *= 2;
    }
    if (digit > 9) {
      digit -= 9;
    }

    return digit;
  }
}
