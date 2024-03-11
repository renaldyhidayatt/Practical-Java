package com.sanedge.dungeon_of_league;

public class Main {
  public static void main(String[] args) {
    // Membuat objek karakter dengan level 1
    Character warrior = new Warrior("Conan", 1);
    Character wizard = new Wizard("Gandalf", 1);
    Character barbarian = new Barbarian("Thor", 1);

    // Membuat objek dungeon dengan tingkat kesulitan dan exp
    Dungeon easyDungeon = new Dungeon("Easy", 20); // 20% dari exp dibagi untuk level up
    Dungeon mediumDungeon = new Dungeon("Medium", 50); // 50% dari exp dibagi untuk level up
    Dungeon hardDungeon = new Dungeon("Hard", 70); // 70% dari exp dibagi untuk level up

    // Looping farming dungeon hingga karakter mencapai level 5
    while (warrior.getLevel() < 5) {
      easyDungeon.farmDungeon(warrior);
      warrior.setLevel(warrior.getLevel() + (easyDungeon.getExp() / 20)); // 20% exp untuk level up

      mediumDungeon.farmDungeon(wizard);
      wizard.setLevel(wizard.getLevel() + (mediumDungeon.getExp() / 20)); // 20% exp untuk level up

      hardDungeon.farmDungeon(barbarian);
      barbarian.setLevel(barbarian.getLevel() + (hardDungeon.getExp() / 20)); // 20% exp untuk level up

      System.out.println("Warrior " + warrior.name + " sekarang berada di level " + warrior.getLevel());
      System.out.println("Wizard " + wizard.name + " sekarang berada di level " + wizard.getLevel());
      System.out.println("Barbarian " + barbarian.name + " sekarang berada di level " + barbarian.getLevel());
      System.out.println();
    }
  }
}
