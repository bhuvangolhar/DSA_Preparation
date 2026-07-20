// Problem: Scramble String
// Approach: Dynamic Programming
// Time Complexity: O(n^4)
// Space Complexity: O(n^3)

class Solution {

    public boolean isScramble(String str1, String str2) {

        int n = str1.length();

        if (n != str2.length()) {
            return false;
        }

        boolean[][][] dp = new boolean[n + 1][n][n];

        for (int length = 1; length <= n; length++) {

            for (int i = 0; i + length <= n; i++) {

                for (int j = 0; j + length <= n; j++) {

                    if (length == 1) {

                        dp[length][i][j] =
                                str1.charAt(i) == str2.charAt(j);

                        continue;
                    }

                    for (int k = 1; k < length; k++) {

                        boolean withoutSwap =
                                dp[k][i][j] &&
                                dp[length - k][i + k][j + k];

                        boolean withSwap =
                                dp[k][i][j + length - k] &&
                                dp[length - k][i + k][j];

                        if (withoutSwap || withSwap) {

                            dp[length][i][j] = true;
                            break;
                        }
                    }
                }
            }
        }

        return dp[n][0][0];
    }
}