package com.sanedge.high_scores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighScores {
  List<Integer> highScores;

  public HighScores(List<Integer> highScores) {
    this.highScores = highScores;
  }

  List<Integer> scores() {
    return this.highScores;
  }

  Integer latest() {
    return highScores.get(highScores.size() - 1);
  }

  Integer personalBest() {
    return Collections.max(highScores);
  }

  List<Integer> personalTopThree() {
    List<Integer> sortedScores = new ArrayList<>(highScores);
    Collections.sort(sortedScores, Collections.reverseOrder());

    // Mengambil tiga skor teratas jika ukuran daftar cukup besar
    if (sortedScores.size() >= 3) {
      return sortedScores.subList(0, 3);
    }

    // Jika ukuran daftar kurang dari tiga, kembalikan semua skor yang ada
    return sortedScores;
  }
}
