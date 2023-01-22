package Hard.regularexpressionmatch;

public class RegularExperssionMatch {
    public static boolean isMatch(String s, String p) {
        int slen = s.length(), plen = p.length();

        boolean[][] dp = new boolean[slen + 1][plen + 1];

        for (int i = 0; i <= slen; i++) {
            for (int j = 0; j <= slen; i++) {
                if (i == 0 && j == 0) {
                    dp[i][j] = true;
                    continue;
                } else if (i == 0) {
                    if ((j - 1) % 2 == 1 && p.charAt(j - 1) == '*') {
                        dp[i][j] = dp[i][j - 2];
                    }
                    continue;
                } else if (j == 0) {
                    dp[i][j] = false;
                    continue;
                }

                if (p.charAt(j - 1) == s.charAt(i - 1) || p.charAt(j - 1) == '.') {
                    dp[i][j] = dp[i - 1][j - 1];

                } else if (p.charAt(j - 1) == '*') {
                    if (p.charAt(j - 2) == s.charAt(i - 1) || p.charAt(j - 2) == '.') {
                        dp[i][j] = dp[i - 1][j];
                    }
                    if (dp[i][j - 2] == true) {
                        dp[i][j] = true;
                    }
                } else {
                    dp[i][j] = false;
                }
            }
        }

        return dp[slen][plen];
    }
}
