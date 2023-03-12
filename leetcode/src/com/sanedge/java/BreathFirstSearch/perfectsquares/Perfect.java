package com.sanedge.java.BreathFirstSearch.perfectsquares;

public class Perfect {
    public static int numSquares(int n) {
        if (isPerfectSquare(n)) {
            return 1;
        }

        if (checkAnswer(n)) {
            return 4;
        }

        for (int i = 1; i * i <= n; i++) {
            int j = n - i * i;

            if (isPerfectSquare(j)) {
                return 2;
            }
        }

        return 3;
    }

    private static boolean isPerfectSquare(int n) {
        int sq = (int) Math.floor(Math.sqrt(n));

        return sq * sq == n;
    }

    private static boolean checkAnswer(int x) {
        while (x % 4 == 0) {
            x /= 4;
        }

        return x % 8 == 7;
    }
}
