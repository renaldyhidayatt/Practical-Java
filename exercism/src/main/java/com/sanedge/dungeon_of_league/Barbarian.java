package com.sanedge.dungeon_of_league;

public class Barbarian extends Character {
  public Barbarian(String name, int level) {
    super(name, level);
  }

  @Override
  public void attack() {
    System.out.println("Barbarian " + name + " smashes with axe");
  }
}
