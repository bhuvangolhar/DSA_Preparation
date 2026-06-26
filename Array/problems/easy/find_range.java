// Problem: Find Range of Array Elements
// Approach: Linear Traversal
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int findRange(int[] arr) {

        int max = arr[0];
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return max - min;
    }
}