package com.sanedge.say;

public class Say {
  private final String[] smallNumbers = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight",
      "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
      "nineteen" };

  private final String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
      "ninety" };

  public String say(long number) {
    if (number < 0 || number >= 1_000_000_000_000L) {
      throw new IllegalArgumentException("Number must be between 0 and 999,999,999,999");
    }

    if (number < 20) {
      return smallNumbers[(int) number];
    }

    if (number < 100) {
      return tens[(int) number / 10] + (number % 10 == 0 ? "" : "-" + smallNumbers[(int) number % 10]);
    }

    if (number < 1000) {
      return smallNumbers[(int) number / 100] + " hundred" + (number % 100 == 0 ? "" : " " + say(number % 100));
    }

    if (number < 1_000_000) {
      return say(number / 1000) + " thousand" + (number % 1000 == 0 ? "" : " " + say(number % 1000));
    }

    if (number < 1_000_000_000) {
      return say(number / 1_000_000) + " million" + (number % 1_000_000 == 0 ? "" : " " + say(number % 1_000_000));
    }

    return say(number / 1_000_000_000) + " billion"
        + (number % 1_000_000_000 == 0 ? "" : " " + say(number % 1_000_000_000));
  }
}
