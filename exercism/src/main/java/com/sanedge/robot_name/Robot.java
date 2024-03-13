package com.sanedge.robot_name;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Robot {
  private static final Set<String> usedNames = new HashSet<>();

  private String name;

  Robot() {
    this.reset();
  }

  String getName() {
    return this.name;
  }

  void reset() {
    usedNames.remove(this.name);
    String name;

    while (usedNames.contains(name = this.randomName())) {
      continue;
    }

    usedNames.add(name);
    this.name = name;
  }

  private String randomName() {
    Random random = new Random();
    char c1 = (char) (random.nextInt(26) + 'A');
    char c2 = (char) (random.nextInt(26) + 'A');

    int num = random.nextInt(1000);

    return String.format("%c%c%03d", c1, c2, num);
  }
}
