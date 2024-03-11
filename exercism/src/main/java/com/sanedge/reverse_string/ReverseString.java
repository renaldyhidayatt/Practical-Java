package com.sanedge.reverse_string;

public class ReverseString {
  String reverse(String inputString) {
    StringBuilder sb = new StringBuilder(inputString);
    return sb.reverse().toString();
  }
}
