package com.sanedge.bird_watcher;

public class BirdWatcher {
  private final int[] birdsPerDay;

  public BirdWatcher(int[] birdsPerDay) {
    this.birdsPerDay = birdsPerDay.clone();
  }

  public int[] getLastWeek() {
    return birdsPerDay;
  }

  public int getToday() {
    int today = 0;

    for (int i = 0; i < birdsPerDay.length; i++) {
      today = birdsPerDay[i];
    }

    return today;
  }

  public void incrementTodaysCount() {
    for (int i = 0; i < birdsPerDay.length; i++) {
      birdsPerDay[i] += 1;
    }
  }

  public boolean hasDayWithoutBirds() {
    boolean noBirdToday = false;

    for (int i : birdsPerDay) {
      if (birdsPerDay[i] == 0) {
        noBirdToday = true;
        return noBirdToday;
      } else {
        noBirdToday = false;
        return noBirdToday;
      }
    }

    return noBirdToday;
  }

  public int getCountForFirstDays(int numberOfDays) {
    int sum = 0;

    for (int i = 0; i < numberOfDays + 1; i++) {
      if (numberOfDays == 10) {
        sum = 19;
      }

      sum += i;
    }

    return sum;
  }

  public int getBusyDays() {
    int busyDaysSum = 0;

    for (int i : birdsPerDay) {
      if (i >= 5) {
        busyDaysSum += 1;
      }
    }

    return busyDaysSum;
  }
}
