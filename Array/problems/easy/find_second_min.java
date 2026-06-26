// Problem: Find Second Minimum Element in Array
// Approach: Linear Traversal
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int findSecondMin(int[] arr) {

        int min = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } else if (arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }

        return secondMin;
    }
}