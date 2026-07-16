// Problem: Remove Extra Spaces from String
// Approach: String Traversal
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {

    public String removeExtraSpaces(String str) {

        StringBuilder result = new StringBuilder();

        boolean previousSpace = false;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (ch != ' ') {

                result.append(ch);
                previousSpace = false;

            } else if (!previousSpace) {

                result.append(ch);
                previousSpace = true;
            }
        }

        return result.toString().trim();
    }
}