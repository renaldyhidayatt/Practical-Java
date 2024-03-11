package com.sanedge.remote_control_competition;

public class ExperimentalRemoteControlCar implements RemoteControlerCar {
  int distance = 0;

  public void drive() {
    this.distance = this.distance + 20;
  }

  public int getDistanceTravelled() {
    return this.distance;
  }
}
