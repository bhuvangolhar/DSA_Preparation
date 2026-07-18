// Problem: Longest Palindromic Subsequence
// Approach: Dynamic Programming
// Time Complexity: O(n^2)
// Space Complexity: O(n^2)

class Solution {

    public int longestPalindromeSubseq(String str) {

        int n = str.length();

        int[][] dp = new int[n][n];

        for (int i = n - 1; i >= 0; i--) {

            dp[i][i] = 1;

            for (int j = i + 1; j < n; j++) {

                if (str.charAt(i) == str.charAt(j)) {

                    dp[i][j] = dp[i + 1][j - 1] + 2;

                } else {

                    dp[i][j] = Math.max(
                            dp[i + 1][j],
                            dp[i][j - 1]
                    );
                }
            }
        }

        return dp[0][n - 1];
    }
}