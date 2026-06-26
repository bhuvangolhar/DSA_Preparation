// Problem: Find Index of Element in Array
// Approach: Linear Search
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int findIndex(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }
}