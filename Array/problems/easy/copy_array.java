// Problem: Copy Array Elements
// Approach: Linear Traversal
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int[] copyArray(int[] arr) {

        int[] copy = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }

        return copy;
    }
}