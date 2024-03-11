package com.sanedge.resistor_color_duo;

import java.util.Arrays;
import java.util.List;

public class ResistorColorDuo {
  private static final List<String> colorLabels = Arrays.asList("black", "brown", "red", "orange", "yellow", "green",
      "blue", "violet", "grey", "white");

  public int value(String[] colors) {
    if (colors.length < 2) {
      throw new IllegalArgumentException("Colors array must have at least 2 elements.");
    }

    int value = 10 * colorLabels.indexOf(colors[0]) + colorLabels.indexOf(colors[1]);

    if (value < 0) {
      throw new IllegalArgumentException("Invalid color(s) provided");
    }

    return value;
  }
}
