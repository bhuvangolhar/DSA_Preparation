// Problem: Shortest Palindrome
// Approach: KMP (Prefix Function)
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {

    public String shortestPalindrome(String str) {

        String reversed = new StringBuilder(str).reverse().toString();

        String combined = str + "#" + reversed;

        int[] lps = buildLPS(combined);

        int longestPrefix = lps[combined.length() - 1];

        String suffix = str.substring(longestPrefix);

        return new StringBuilder(suffix)
                .reverse()
                .append(str)
                .toString();
    }

    private int[] buildLPS(String pattern) {

        int[] lps = new int[pattern.length()];

        int length = 0;

        for (int i = 1; i < pattern.length();) {

            if (pattern.charAt(i) == pattern.charAt(length)) {

                lps[i++] = ++length;

            } else if (length > 0) {

                length = lps[length - 1];

            } else {

                lps[i++] = 0;
            }
        }

        return lps;
    }
}