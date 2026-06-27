// Problem: Find Frequency of an Element in Array
// Approach: Linear Traversal
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int findFrequency(int[] arr, int target) {

        int frequency = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                frequency++;
            }
        }

        return frequency;
    }
}