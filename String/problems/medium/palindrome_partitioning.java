// Problem: Palindrome Partitioning
// Approach: Backtracking
// Time Complexity: O(n × 2^n)
// Space Complexity: O(n)

import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<List<String>> partition(String str) {

        List<List<String>> result = new ArrayList<>();

        backtrack(str, 0, new ArrayList<>(), result);

        return result;
    }

    private void backtrack(
            String str,
            int start,
            List<String> current,
            List<List<String>> result) {

        if (start == str.length()) {

            result.add(new ArrayList<>(current));
            return;
        }

        for (int end = start; end < str.length(); end++) {

            if (isPalindrome(str, start, end)) {

                current.add(str.substring(start, end + 1));

                backtrack(str, end + 1, current, result);

                current.remove(current.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String str, int left, int right) {

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}