package com.sanedge.micro_blog;

public class MicroBlog {
  public String truncate(String input) {
    int codePoints = 0;
    int index = 0;

    while (codePoints < 5 && index < input.length()) {
      int codePoint = input.codePointAt(index);
      index += Character.charCount(codePoint);
      codePoints++;
    }

    return input.substring(0, index);
  }
}
