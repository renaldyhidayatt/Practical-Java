package com.sanedge.booking_up_for_beauty;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.time.format.TextStyle;

public class AppointmentScheduler {

  public LocalDateTime schedule(String appointmentDateDescription) {
    DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss[.SSS]");

    return LocalDateTime.parse(appointmentDateDescription, parser);
  }

  public boolean hasPassed(LocalDateTime appointmentDate) {
    return appointmentDate.isBefore(LocalDateTime.now());
  }

  public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
    return appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18;
  }

  public String getDescription(LocalDateTime appointmentDate) {
    return String.format("You have an appointment on %s, %s %s, %d, at %s.",
        appointmentDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH),
        appointmentDate.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH),
        appointmentDate.getDayOfMonth(),
        appointmentDate.getYear(),
        appointmentDate.format(DateTimeFormatter.ofPattern("h:mm a", Locale.ENGLISH)));
  }

  public LocalDate getAnniversaryDate() {
    return LocalDate.of(2024, 9, 15);
  }
}
