package com.sanedge.error_handling;

public class CustomUncheckedException extends RuntimeException {
  CustomUncheckedException() {
    super();
  }

  CustomUncheckedException(String message) {
    super(message);
  }

}
