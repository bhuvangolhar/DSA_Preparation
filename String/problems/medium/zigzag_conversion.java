// Problem: Convert String in Zigzag Pattern
// Approach: Row-Wise Simulation
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {

    public String convert(String str, int numRows) {

        if (numRows == 1 || numRows >= str.length()) {
            return str;
        }

        StringBuilder[] rows = new StringBuilder[numRows];

        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        for (int i = 0; i < str.length(); i++) {

            rows[currentRow].append(str.charAt(i));

            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            currentRow += goingDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();

        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}