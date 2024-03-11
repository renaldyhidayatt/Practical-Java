package com.sanedge.dnd_character;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DndCharacter {
  private int strength;
  private int dexterity;
  private int constitution;
  private int intelligence;
  private int wisdom;
  private int charisma;
  private int hitpoints;

  public DndCharacter() {
    strength = ability(rollDice());
    dexterity = ability(rollDice());
    constitution = ability(rollDice());
    intelligence = ability(rollDice());
    wisdom = ability(rollDice());
    charisma = ability(rollDice());
    hitpoints = 10 + modifier(constitution);
  }

  int ability(List<Integer> scores) {
    int sum = 0;

    for (int i : scores) {
      sum += i;
    }

    return sum - Collections.min(scores);
  }

  List<Integer> rollDice() {
    List<Integer> res = new ArrayList<>();

    for (int i = 0; i < 4; i++) {
      res.add((int) (Math.random() * 6 + 1));
    }

    return res;
  }

  int modifier(int input) {
    return (int) Math.floor((input - 10) / 2.0);
  }

  int getStrength() {
    return strength;
  }

  int getDexterity() {
    return dexterity;
  }

  int getConstitution() {
    return constitution;
  }

  int getIntelligence() {
    return intelligence;
  }

  int getWisdom() {
    return wisdom;
  }

  int getCharisma() {
    return charisma;
  }

  int getHitpoints() {
    return hitpoints;
  }
}
