package com.sanedge.cars_assemble;

public class CarsAssemble {
  public double productionRatePerHour(int speed) {
    int producedCars = 221;

    if (speed >= 5 && speed <= 8) {
      return speed * producedCars * 0.9;
    }

    if (speed == 9) {
      return speed * producedCars * 0.8;
    }

    if (speed == 10) {
      return speed * producedCars * 0.77;
    }

    return speed * producedCars;
  }

  public int workingItemsPerMinutes(int speed) {
    return (int) productionRatePerHour(speed) / 60;
  }
}
