// Problem: Word Break
// Approach: Dynamic Programming
// Time Complexity: O(n²)
// Space Complexity: O(n)

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {

    public boolean wordBreak(String str, List<String> wordDict) {

        Set<String> dictionary = new HashSet<>(wordDict);

        boolean[] dp = new boolean[str.length() + 1];

        dp[0] = true;

        for (int i = 1; i <= str.length(); i++) {

            for (int j = 0; j < i; j++) {

                if (dp[j] &&
                    dictionary.contains(str.substring(j, i))) {

                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[str.length()];
    }
}