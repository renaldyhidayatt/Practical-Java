package com.sanedge.word_count;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
  private static Map<String, Integer> list = new HashMap<String, Integer>();

  public Map<String, Integer> pharase(String input) {
    list.clear();

    String[] words = input.toLowerCase().replaceAll("[^\\w']+|'\\B|\\B'", " ").trim().split("\\s+");
    int len = words.length;

    for (int i = 0; i < len; i++) {
      int count = 0;

      for (int j = 0; j < len; j++) {
        if (words[i].equals(words[j])) {
          count++;
        }
        list.put(words[i], count);
      }
    }

    return list;

  }

}
