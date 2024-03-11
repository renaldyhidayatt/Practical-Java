package com.sanedge.wizards_and_warriors_2;

public class GameMaster {

  public String describe(Character character) {
    return String.format("You're a level %d %s with %d hit points.", character.getLevel(),
        character.getCharacterClass(), character.getHitPoints());
  }

  public String describe(Destination dest) {
    return String.format("You've arrived at %s, which has %d inhabitants.", dest.getName(), dest.getInhabitants());
  }

  public String describe(TravelMethod tm) {
    String travel = tm == TravelMethod.WALKING ? "by walking." : "on horseback.";
    return String.format("You're traveling to your destination %s", travel);
  }

  public String describe(Character character, Destination dest, TravelMethod tm) {
    return String.format("%s %s You've arrived at %s, which has %d inhabitants.",
        describe(character),
        describe(tm),
        dest.getName(), dest.getInhabitants());
  }

  public String describe(Character character, Destination dest) {
    return String.format(
        "%s You're traveling to your destination by walking. You've arrived at %s, which has %d inhabitants.",
        describe(character),
        dest.getName(), dest.getInhabitants());
  }
}
