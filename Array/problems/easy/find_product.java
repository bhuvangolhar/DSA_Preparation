// Problem: Find Product of Elements in Array
// Approach: Linear Traversal
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int findProduct(int[] arr) {

        int product = 1;

        for (int i = 0; i < arr.length; i++) {
            product *= arr[i];
        }

        return product;
    }
}