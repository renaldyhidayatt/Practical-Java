package com.sanedge.remote_control_competition;

import java.util.Collections;
import java.util.List;

public class TestTrack {
  public static void race(RemoteControlerCar car) {
    car.drive();
  }

  public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
    Collections.sort(cars);

    return cars;
  }
}
