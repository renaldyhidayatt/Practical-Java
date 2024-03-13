package com.sanedge.bob;

public class Bob {

  public String hey(String message) {
    if (isSilence(message)) {
      return "Fine. Be that way!";
    } else if (isYellingQuestion(message)) {
      return "Calm down, I know what i'm doing!";
    } else if (isYelling(message)) {
      return "Whoa, chill out!";
    } else if (isQuestion(message)) {
      return "Sure.";
    } else {
      return "Whatever.";
    }
  }

  private boolean isSilence(String message) {
    return message.trim().isEmpty();
  }

  private boolean isYellingQuestion(String message) {
    return isYelling(message) && isQuestion(message);
  }

  private boolean isYelling(String message) {
    return message.equals(message.toUpperCase()) && !message.equals(message.toLowerCase());
  }

  private boolean isQuestion(String message) {
    return message.trim().endsWith("?");
  }
}
