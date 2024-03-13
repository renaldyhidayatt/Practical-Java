package com.sanedge.allergies;

import java.util.List;
import java.util.stream.Collectors;
import java.util.EnumSet;

public class Allergies {
  int score;

  public Allergies(int score) {
    this.score = score;
  }

  public boolean isAllergicTo(Allergen allergen) {
    return (allergen.getScore() & score) == allergen.getScore();
  }

  public List<Allergen> getList() {
    return EnumSet.allOf(Allergen.class).stream().filter(this::isAllergicTo).collect(Collectors.toList());
  }
}
