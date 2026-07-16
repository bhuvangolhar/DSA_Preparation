// Problem: Find Longest Common Suffix
// Approach: Reverse Traversal
// Time Complexity: O(min(n, m))
// Space Complexity: O(1)

class Solution {

    public String longestCommonSuffix(String str1, String str2) {

        int i = str1.length() - 1;
        int j = str2.length() - 1;

        StringBuilder suffix = new StringBuilder();

        while (i >= 0 && j >= 0) {

            if (str1.charAt(i) != str2.charAt(j)) {
                break;
            }

            suffix.append(str1.charAt(i));

            i--;
            j--;
        }

        return suffix.reverse().toString();
    }
}