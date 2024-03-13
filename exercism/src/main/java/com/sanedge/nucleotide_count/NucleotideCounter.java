package com.sanedge.nucleotide_count;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NucleotideCounter {
  private String value;

  public NucleotideCounter(String value) {
    if (!value.matches("[ACGT]*"))
      throw new IllegalArgumentException();

    this.value = value;
  }

  public Map<Character, Integer> nucleotideCounts() {
    Map<Character, Integer> result = new HashMap<>();

    result.put('A', 0);
    result.put('C', 0);
    result.put('G', 0);
    result.put('T', 0);

    final Map<Character, List<Character>> groups = value.chars().mapToObj(c -> Character.valueOf((char) c))
        .collect(Collectors.groupingBy(Function.identity()));

    groups.forEach((k, v) -> result.put(k, v.size()));

    return result;
  }
}
