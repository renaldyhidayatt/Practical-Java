package com.sanedge.series;

import java.util.ArrayList;
import java.util.List;

public class Series {
  private String digitSeries;

  Series(String string) {
    this.digitSeries = string;
    if (string.equals(""))
      throw new IllegalArgumentException("series cannot be empty");
  }

  List<String> slices(int num) {
    if (num > digitSeries.length())
      throw new IllegalArgumentException("slice length cannot be greater than series length");
    if (num <= 0)
      throw new IllegalArgumentException("slice length cannot be negative or zero");

    List<String> list = new ArrayList<>();

    for (int i = 0; i <= digitSeries.length() - num; i++) {
      list.add(digitSeries.substring(i, i + num));
    }

    return list;
  }
}
