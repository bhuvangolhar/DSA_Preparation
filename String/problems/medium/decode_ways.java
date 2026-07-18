// Problem: Decode Ways
// Approach: Dynamic Programming
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {

    public int numDecodings(String str) {

        if (str == null ||
            str.length() == 0 ||
            str.charAt(0) == '0') {

            return 0;
        }

        int n = str.length();

        int[] dp = new int[n + 1];

        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {

            int oneDigit = str.charAt(i - 1) - '0';

            int twoDigits = Integer.parseInt(
                    str.substring(i - 2, i)
            );

            if (oneDigit >= 1) {
                dp[i] += dp[i - 1];
            }

            if (twoDigits >= 10 &&
                twoDigits <= 26) {

                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }
}