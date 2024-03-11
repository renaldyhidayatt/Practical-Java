package com.sanedge.dungeon_of_league;

public class Wizard extends Character {
  public Wizard(String name, int level) {
    super(name, level);
  }

  @Override
  public void attack() {
    System.out.println("Wizard " + name + " cast a spell!");
  }
}
