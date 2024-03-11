package com.sanedge.isbn_verifier;

public class IsbnVerifier {
  boolean isValid(String stringToVerify) {
    int isbn = 0;
    int number = 0;
    String replacement = "";

    for (int i = 0; i < stringToVerify.length(); i++) {
      Character rep = stringToVerify.charAt(i);

      if (Character.isDigit(rep)) {
        replacement += rep;
      }
      if (rep == 'X' && i == stringToVerify.length() - 1) {
        replacement += rep;
      }

    }

    int count = replacement.length();
    int length = replacement.length();

    if (length < 10) {
      return false;
    }

    for (int i = 0; i < length - 1; i++) {
      if (count > 1) {
        isbn += Integer.parseInt(replacement.substring(i, i + 1)) * count;

        count--;
      }
      if (Character.isDigit(replacement.charAt(length - 1))) {
        number = Integer.parseInt(replacement.substring(length - 1, length));
      }
      if (replacement.substring(length - 1).equalsIgnoreCase("x")) {
        number = 10;
      }
    }

    return isbn != 0 && (isbn + number) % (length + 1) == 0;
  }
}
