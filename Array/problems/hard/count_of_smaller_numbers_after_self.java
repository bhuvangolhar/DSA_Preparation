// Problem: Count of Smaller Numbers After Self
// Approach: Merge Sort with Index Tracking
// Time Complexity: O(n log n)
// Space Complexity: O(n)

import java.util.*;

class Solution {

    private int[] count;
    private int[] indexes;
    private int[] tempIndexes;

    public List<Integer> countSmaller(int[] nums) {

        int n = nums.length;

        count = new int[n];
        indexes = new int[n];
        tempIndexes = new int[n];

        for (int i = 0; i < n; i++) {
            indexes[i] = i;
        }

        mergeSort(nums, 0, n - 1);

        List<Integer> result = new ArrayList<>();

        for (int value : count) {
            result.add(value);
        }

        return result;
    }

    private void mergeSort(int[] nums, int left, int right) {

        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSort(nums, left, mid);
        mergeSort(nums, mid + 1, right);

        merge(nums, left, mid, right);
    }

    private void merge(int[] nums, int left, int mid, int right) {

        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {

            if (nums[indexes[i]] <= nums[indexes[j]]) {

                count[indexes[i]] += (j - mid - 1);
                tempIndexes[k++] = indexes[i++];

            } else {

                tempIndexes[k++] = indexes[j++];
            }
        }

        while (i <= mid) {

            count[indexes[i]] += (j - mid - 1);
            tempIndexes[k++] = indexes[i++];
        }

        while (j <= right) {

            tempIndexes[k++] = indexes[j++];
        }

        for (i = left; i <= right; i++) {

            indexes[i] = tempIndexes[i];
        }
    }
}