package com.sanedge.scrabble_score;

import java.util.HashMap;
import java.util.Map;

public class Scrabble {
  private static final Map<Character, Integer> CHARACTER_POINTS = initializeCharacterPoints();

  private int score = 0;

  private static Map<Character, Integer> initializeCharacterPoints() {
    Map<Character, Integer> characterPoints = new HashMap<>();
    characterPoints.put('A', 1);
    characterPoints.put('B', 3);
    characterPoints.put('C', 3);
    characterPoints.put('D', 2);
    characterPoints.put('E', 1);
    characterPoints.put('F', 4);
    characterPoints.put('G', 2);
    characterPoints.put('H', 4);
    characterPoints.put('I', 1);
    characterPoints.put('J', 8);
    characterPoints.put('K', 5);
    characterPoints.put('L', 1);
    characterPoints.put('M', 3);
    characterPoints.put('N', 1);
    characterPoints.put('O', 1);
    characterPoints.put('P', 3);
    characterPoints.put('Q', 10);
    characterPoints.put('R', 1);
    characterPoints.put('S', 1);
    characterPoints.put('T', 1);
    characterPoints.put('U', 1);
    characterPoints.put('V', 4);
    characterPoints.put('W', 4);
    characterPoints.put('X', 8);
    characterPoints.put('Y', 4);
    characterPoints.put('Z', 10);
    return characterPoints;
  }

  Scrabble(String word) {
    word = word.toUpperCase();

    for (int i = 0; i < word.length(); i++) {
      char letter = word.charAt(i);

      score += CHARACTER_POINTS.getOrDefault(letter, 0);
    }

  }

  int getScore() {
    return score;
  }

}
