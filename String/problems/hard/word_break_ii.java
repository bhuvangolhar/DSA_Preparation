// Problem: Word Break II
// Approach: DFS + Memoization
// Time Complexity: Exponential (pruned using memoization)
// Space Complexity: O(n)

import java.util.*;

class Solution {

    public List<String> wordBreak(String str, List<String> wordDict) {

        Set<String> dictionary = new HashSet<>(wordDict);

        HashMap<Integer, List<String>> memo = new HashMap<>();

        return dfs(str, 0, dictionary, memo);
    }

    private List<String> dfs(
            String str,
            int start,
            Set<String> dictionary,
            HashMap<Integer, List<String>> memo) {

        if (memo.containsKey(start)) {
            return memo.get(start);
        }

        List<String> result = new ArrayList<>();

        if (start == str.length()) {

            result.add("");
            return result;
        }

        for (int end = start + 1; end <= str.length(); end++) {

            String word = str.substring(start, end);

            if (dictionary.contains(word)) {

                List<String> suffixes =
                        dfs(str, end, dictionary, memo);

                for (String suffix : suffixes) {

                    if (suffix.isEmpty()) {

                        result.add(word);

                    } else {

                        result.add(word + " " + suffix);
                    }
                }
            }
        }

        memo.put(start, result);

        return result;
    }
}