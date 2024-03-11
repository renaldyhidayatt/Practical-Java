package com.sanedge.error_handling;

public class CustomCheckedException extends Exception {
  CustomCheckedException() {
    super();
  }

  CustomCheckedException(String message) {
    super(message);
  }
}
