package com.sanedge.kindergarten_garden;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

enum Plant {
  VIOLETS,
  RADISHES,
  CLOVER,
  GRASS;

  static Plant getPlant(char plantCode) {
    switch (plantCode) {
      case 'G':
        return GRASS;
      case 'C':
        return CLOVER;
      case 'R':
        return RADISHES;
      case 'V':
        return VIOLETS;
    }

    return null;
  }
}

public class KindergartenGarden {
  char[][] garden;
  char[] INITIALS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

  KindergartenGarden(String garden) {
    String[] linesArray = garden.split("\n");
    this.garden = new char[linesArray.length][];
    for (int i = 0; i < linesArray.length; i++) {
      this.garden[i] = linesArray[i].toCharArray();
    }
  }

  List<Plant> getPlantsOfStudent(String student) {
    char initial = student.toUpperCase().charAt(0);
    int index = Arrays.binarySearch(INITIALS, initial);

    List<Plant> plants = new ArrayList<>();

    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < 2; j++) {
        switch (this.garden[i][index * 2 + j]) {
          case 'V': {
            plants.add(Plant.VIOLETS);
            break;
          }

          case 'R': {
            plants.add(Plant.RADISHES);
            break;
          }

          case 'C': {
            plants.add(Plant.CLOVER);
            break;
          }

          case 'G': {
            plants.add(Plant.GRASS);
            break;
          }
        }
      }
    }

    return plants;
  }
}
