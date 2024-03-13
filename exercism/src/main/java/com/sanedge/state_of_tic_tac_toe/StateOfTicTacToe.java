package com.sanedge.state_of_tic_tac_toe;

import java.util.ArrayList;
import java.util.List;

public class StateOfTicTacToe {
  public GameState determineState(String[] rows) {
    int numberOfXes = 0;
    int numberOfOs = 0;

    for (String row : rows) {
      numberOfXes += (int) row.chars().filter(ch -> ch == 'X').count();
      numberOfOs += (int) row.chars().filter(ch -> ch == 'O').count();

    }

    if (numberOfXes - numberOfOs > 1) {
      throw new IllegalArgumentException("Wrong turn order: X went twice");
    }

    if (numberOfXes < numberOfOs) {
      throw new IllegalArgumentException("Wrong turn order: O started");
    }

    List<String> directions = new ArrayList<>(List.of(rows));

    StringBuilder firstColumn = new StringBuilder();

    StringBuilder secondColumn = new StringBuilder();

    StringBuilder thirdColumn = new StringBuilder();

    StringBuilder leftDiagonal = new StringBuilder();

    StringBuilder rightDiagonal = new StringBuilder();

    for (int i = 0; i < rows.length; i++) {
      firstColumn.append(rows[i].charAt(0));
      secondColumn.append(rows[i].charAt(1));
      thirdColumn.append(rows[i].charAt(2));
      leftDiagonal.append(rows[i].charAt(i));
      rightDiagonal.append(rows[i].charAt(rows.length - 1 - i));

    }

    directions.add(String.valueOf(firstColumn));

    directions.add(String.valueOf(secondColumn));

    directions.add(String.valueOf(thirdColumn));

    directions.add(String.valueOf(leftDiagonal));

    directions.add(String.valueOf(rightDiagonal));

    if (directions.contains("XXX") && directions.contains("OOO")) {
      throw new IllegalArgumentException("Impossible board: game should have ended after the game was won");
    } else if (directions.contains("XXX") || directions.contains("OOO")) {
      return GameState.WIN;
    } else if (directions.stream().noneMatch((direction) -> direction.contains(" "))) {
      return GameState.DRAW;
    } else {
      return GameState.ONGOING;

    }

  }
}
