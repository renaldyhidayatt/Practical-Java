package com.sanedge.dungeon_of_league;

public class Warrior extends Character {
  public Warrior(String name, int level) {
    super(name, level);
  }

  @Override
  public void attack() {
    System.out.println("Warrior " + name + " slashes with sword!");
  }
}
