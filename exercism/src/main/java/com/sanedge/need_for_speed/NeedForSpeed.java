package com.sanedge.need_for_speed;

public class NeedForSpeed {
  private final int speed;
  private final int batteryDrain;
  private int battery = 100;
  private int distanceDriven = 0;

  public NeedForSpeed(int speed, int batteryDrain) {
    this.speed = speed;
    this.batteryDrain = batteryDrain;
  }

  public boolean batteryDrained() {
    return battery == 0;
  }

  public int distanceDriven() {
    return distanceDriven;
  }

  public void drive() {
    if (battery >= batteryDrain) {
      battery -= batteryDrain;
      distanceDriven += speed;
    }
  }

  public static NeedForSpeed nitro() {
    return new NeedForSpeed(50, 4);
  }
}

class RaceTrack {
  private final int distance;

  public RaceTrack(int distance) {
    this.distance = distance;
  }

  public boolean tryFinishTrack(NeedForSpeed car) {
    while (!car.batteryDrained()) {
      car.drive();
      ;
    }

    return car.distanceDriven() >= distance;
  }
}
