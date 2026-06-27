// Problem: Find Intersection of Two Arrays
// Approach: Nested Traversal
// Time Complexity: O(n × m)
// Space Complexity: O(1)

class Solution {

    public int[] intersection(int[] arr1, int[] arr2) {

        int[] result = new int[Math.min(arr1.length, arr2.length)];
        int index = 0;

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {

                if (arr1[i] == arr2[j]) {
                    result[index++] = arr1[i];
                    break;
                }
            }
        }

        int[] intersection = new int[index];

        for (int i = 0; i < index; i++) {
            intersection[i] = result[i];
        }

        return intersection;
    }
}