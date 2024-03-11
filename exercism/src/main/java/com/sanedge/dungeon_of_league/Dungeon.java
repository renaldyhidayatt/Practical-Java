package com.sanedge.dungeon_of_league;

public class Dungeon {
  private String difficulty;
  private int exp;

  public Dungeon(String difficulty, int exp) {
    this.difficulty = difficulty;
    this.exp = exp;
  }

  public int getExp() {
    return exp;
  }

  public void farmDungeon(Character character) {
    System.out.println(character.name + " farming " + difficulty + " Dungeon and gains " + exp + " exp");
  }
}
