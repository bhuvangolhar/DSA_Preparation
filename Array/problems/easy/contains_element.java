// Problem: Check if Element Exists in Array
// Approach: Linear Search
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public boolean containsElement(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }

        return false;
    }
}