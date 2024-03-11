package com.sanedge.diamond;

import java.util.List;

class DiamondPrinter {

  List<String> printToList(char c) {
    final int LENGTH = c - 'A';
    final StringBuilder sb = new StringBuilder(" ".repeat(2 * LENGTH + 1));

    final List<String> ls = new java.util.ArrayList<>();
    for (int i = 0; i <= LENGTH; ++i) {
      sb.setCharAt(LENGTH - i, (char) ('A' + i));
      sb.setCharAt(LENGTH + i, (char) ('A' + i));
      ls.add(sb.toString());
      sb.setCharAt(LENGTH - i, ' ');
      sb.setCharAt(LENGTH + i, ' ');
    }
    for (int i = LENGTH - 1; i >= 0; --i) {
      ls.add(ls.get(i));
    }
    return ls;
  }
}
