// Problem: Rotate Array to the Right by One Position
// Approach: In-Place Rotation
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {

    public void rotateArray(int[] arr) {

        int last = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}