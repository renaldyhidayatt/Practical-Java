package com.sanedge.raindrops;

public class RaindropConverter {
  String convert(int number) {
    String res = "";

    if (number % 3 == 0)
      res += "Pling";
    if (number % 5 == 0)
      res += "Plang";
    if (number % 7 == 0)
      res += "Plong";

    return res.isEmpty() ? Integer.toString(number) : res;
  }
}
