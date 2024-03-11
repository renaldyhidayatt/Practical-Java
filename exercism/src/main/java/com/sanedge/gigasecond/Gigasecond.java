package com.sanedge.gigasecond;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Gigasecond {
  private LocalDateTime dateTime;

  public Gigasecond(LocalDate moment) {
    this.dateTime = moment.atStartOfDay();
  }

  public Gigasecond(LocalDateTime moment) {
    this.dateTime = moment;
  }

  public LocalDateTime getDateTime() {
    return this.dateTime.plus(1_000_000_000, ChronoUnit.SECONDS);
  }
}
