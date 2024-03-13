package com.sanedge.run_length_encoding;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RunLengthEncoding {

  private static final Pattern repeatedChar = Pattern.compile("(.)\\1*");

  private static final Pattern numberWithChar = Pattern.compile("(\\d*)(\\w|\\s)");

  public String encode(String input) {
    Matcher matcher = repeatedChar.matcher(input);
    StringBuilder result = new StringBuilder();

    while (matcher.find()) {
      String match = matcher.group();
      String encoded = match.length() == 1 ? match : "" + match.length() + match.charAt(0);

      result.append(encoded);

    }

    return result.toString();
  }

  public String decode(String encoded) {
    Matcher matcher = numberWithChar.matcher(encoded);

    StringBuilder result = new StringBuilder();

    while (matcher.find()) {
      String g1 = matcher.group(1);
      String g2 = matcher.group(2);

      int length = g1.isEmpty() ? 1 : Integer.parseInt(g1);

      result.append(g2.repeat(length));
    }

    return result.toString();
  }
}
