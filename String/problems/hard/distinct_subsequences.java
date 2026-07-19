// Problem: Distinct Subsequences
// Approach: Dynamic Programming
// Time Complexity: O(m * n)
// Space Complexity: O(m * n)

class Solution {

    public int numDistinct(String str, String target) {

        int m = str.length();
        int n = target.length();

        int[][] dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i <= m; i++) {

            for (int j = 1; j <= n; j++) {

                if (str.charAt(i - 1) == target.charAt(j - 1)) {

                    dp[i][j] =
                            dp[i - 1][j - 1] +
                            dp[i - 1][j];

                } else {

                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[m][n];
    }
}