package com.sanedge.rotation_cipher;

public class RotationalCipher {

  public int shiftKey;

  RotationalCipher(int shiftKey) {
    this.shiftKey = shiftKey;
  }

  String rotate(String data) {
    String d = "";

    for (int i = 0; i < data.length(); i++) {
      char lo = data.charAt(i);

      if (lo > 96 && 123 > lo) {
        if (lo + (char) shiftKey > 122) {
          lo += (char) (shiftKey - 26);
        } else {
          lo += (char) shiftKey;

        }
        d += lo;
      } else if (lo > 64 && 91 > lo) {
        if (lo + (char) shiftKey > 90) {
          lo += (char) (shiftKey - 26);
        } else {
          lo += (char) shiftKey;
        }
        d += lo;
      } else {
        d += lo;
      }
    }

    return d;
  }
}
