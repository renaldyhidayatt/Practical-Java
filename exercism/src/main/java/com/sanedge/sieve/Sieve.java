package com.sanedge.sieve;

import java.util.LinkedList;
import java.util.List;

public class Sieve {
  private int maxPrime;

  Sieve(int maxPrime) {
    this.maxPrime = maxPrime;
  }

  List<Integer> getPrimes() {
    List<Integer> primes = new LinkedList<>();

    for (int n = 2; n <= maxPrime; n++) {
      if (isPrime(n)) {
        primes.add(n);
      }
    }

    return primes;
  }

  private boolean isPrime(int n) {
    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }

    return true;
  }
}
