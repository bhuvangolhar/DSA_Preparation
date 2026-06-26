// Problem: Compare Two Arrays
// Approach: Element-wise Comparison
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public boolean compareArrays(int[] arr1, int[] arr2) {

        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}