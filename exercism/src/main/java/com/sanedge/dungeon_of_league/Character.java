package com.sanedge.dungeon_of_league;

public class Character {
  protected String name;
  protected int level;

  public Character(String name, int level) {
    this.name = name;
  }

  public void setLevel(int level) {
    if (level >= 1 && level <= 5) {
      this.level = level;
    } else {
      System.out.println("Level harus berada dalam rentang 1 hingga 5");
      this.level = 1;
    }
  }

  public int getLevel() {
    return level;
  }

  public void attack() {
    System.out.println(name + " attacks");
  }
}
