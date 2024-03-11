package com.sanedge.resistor_color_trio;

import java.util.HashMap;
import java.util.Map;

public class ResistorColorTrio {
  private static final Map<String, Integer> resistors = new HashMap<>();

  static {
    resistors.put("black", 0);
    resistors.put("brown", 1);
    resistors.put("red", 2);
    resistors.put("orange", 3);
    resistors.put("yellow", 4);
    resistors.put("green", 5);
    resistors.put("blue", 6);
    resistors.put("violet", 7);
    resistors.put("grey", 8);
    resistors.put("white", 9);
  }

  public String label(String[] colors) {

    long value = (resistors.get(colors[0]) * 10 + resistors.get(colors[1]))
        * (long) Math.pow(10, resistors.get(colors[2]));

    if (value >= 1_000_000_000) {
      return value / 1_000_000_000 + " gigaohms";
    } else if (value >= 1_000_000) {
      return value / 1_000_000 + " megaohms";
    } else if (value >= 1_000) {
      return value / 1_000 + " kiloohms";
    } else {
      return value + " ohms";
    }
  }
}
