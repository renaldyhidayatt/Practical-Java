package com.sanedge.nth_prime;

import java.util.ArrayList;

public class PrimeCalculator {
  int nth(int nth) {
    if (nth == 0) {
      throw new IllegalArgumentException("Can't be zero");
    }

    ArrayList<Integer> primeNums = new ArrayList<>();

    int count = 0;

    while (primeNums.size() < nth) {
      if (isPrime(count)) {
        primeNums.add(count);
      }

      count = count + 1;
    }

    int nthPrime = primeNums.get(primeNums.size() - 1);

    return nthPrime;
  }

  private boolean isPrime(int num) {
    if (num < 2) {
      return false;
    } else if (num == 2) {
      return true;
    }

    for (int i = 2; i <= Math.ceil(Math.sqrt(num)); ++i) {
      if (num % i == 0) {
        return false;
      }
    }

    return true;
  }
}
