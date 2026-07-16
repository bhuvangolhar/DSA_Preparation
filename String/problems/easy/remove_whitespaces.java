// Problem: Remove Whitespaces from String
// Approach: String Traversal
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {

    public String removeWhitespaces(String str) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch != ' ') {
                result.append(ch);
            }
        }

        return result.toString();
    }
}