package com.sanedge.two_fer;

public class TwoFer {
  public String twofer(String name) {
    if (name == null) {
      return "One for you, one for me";
    }

    return "One for " + name + ", one for me";
  }
}
