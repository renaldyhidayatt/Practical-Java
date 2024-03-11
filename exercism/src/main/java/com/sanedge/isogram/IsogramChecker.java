package com.sanedge.isogram;

import java.util.HashSet;

public class IsogramChecker {
  boolean isIsogram(String pharase) {
    return pharase.chars().filter(Character::isLetter).map(Character::toLowerCase).allMatch(new HashSet<>()::add);
  }
}
