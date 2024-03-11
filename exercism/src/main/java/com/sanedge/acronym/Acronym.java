package com.sanedge.acronym;

import java.util.StringTokenizer;

public class Acronym {
  private String value = "";

  Acronym(String pharse) {
    StringTokenizer tokenizer = new StringTokenizer(pharse, " _-");
    while (tokenizer.hasMoreTokens()) {
      String token = tokenizer.nextToken();

      if (!token.isEmpty()) {
        value += Character.toUpperCase(token.charAt(0));
      }
    }
  }

  String get() {
    return value;
  }
}
