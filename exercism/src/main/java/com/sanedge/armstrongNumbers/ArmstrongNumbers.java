package com.sanedge.armstrongNumbers;

public class ArmstrongNumbers {
  boolean isArmstrongNumber(int numberToCheck) {
    int sum = numberToCheck;
    int len = (int) Math.floor(Math.log10(numberToCheck) + 1);

    while (numberToCheck != 0) {
      sum -= Math.pow(numberToCheck % 10, len);

      numberToCheck /= 10;

    }

    return sum == 0;
  }

}
