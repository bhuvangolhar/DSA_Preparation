// Problem: Wildcard Matching
// Approach: Dynamic Programming
// Time Complexity: O(m * n)
// Space Complexity: O(m * n)

class Solution {

    public boolean isMatch(String str, String pattern) {

        int m = str.length();
        int n = pattern.length();

        boolean[][] dp = new boolean[m + 1][n + 1];

        dp[0][0] = true;

        for (int j = 1; j <= n; j++) {

            if (pattern.charAt(j - 1) == '*') {

                dp[0][j] = dp[0][j - 1];
            }
        }

        for (int i = 1; i <= m; i++) {

            for (int j = 1; j <= n; j++) {

                char currentPattern = pattern.charAt(j - 1);

                if (currentPattern == '*') {

                    dp[i][j] =
                            dp[i][j - 1] ||
                            dp[i - 1][j];

                } else if (currentPattern == '?' ||
                           currentPattern == str.charAt(i - 1)) {

                    dp[i][j] = dp[i - 1][j - 1];
                }
            }
        }

        return dp[m][n];
    }
}