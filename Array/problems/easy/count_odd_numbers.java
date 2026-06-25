// Problem: Count Odd Numbers in Array
// Approach: Linear Traversal
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int countOddNumbers(int[] arr) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }

        return count;
    }
}