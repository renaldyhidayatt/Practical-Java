package com.sanedge.java.BinarySearch.nthmagicalnumber;

public class Nth {
    public static int nthMagicalNumber(int N, int A, int B){
        final int MOD = 1000000007;
        long low = A;
        long high = A * B;
        while(low < high){
            long mid = low + ((high-low) >> 1);

            if(calNthMagicalCount(mid, A, B) > N){
                low = mid + 1;
            }else{
                high = mid;
            }
        }
        return (int) (low % MOD);
    }

    private static long calNthMagicalCount(long num, int A, int B) {
        long ab = A * B / gcd(A, B);
        return num / A + num / B - num / ab;

    }

    private static long gcd(long a, long b) {
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
}
