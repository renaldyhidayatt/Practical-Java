package com.sanedge.java.BinarySearch.uglynumber;

public class Ugly {
    public static int nthUglyNumber(int n, int a, int b, int c) {
        long low = 0, high = 2 * (long) 1e9;

        while(low < high){
            long mid = low + (high -low) / 2;
            if (calNthCount(mid, (long) a, (long) b, (long) c) < (long) n) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }

        return (int) low;
    }
    public static long calNthCount(long num, long a, long b, long c) {
        long ab = a * b / gcd(a, b);
        long bc = b * c / gcd(b, c);
        long ac = a * c / gcd(a, c);
        long abc = ab * c / gcd(ab, c);

        return num / a + num / b + num / c - num / ab - num / bc - num / ac + num / abc;
    }

    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
