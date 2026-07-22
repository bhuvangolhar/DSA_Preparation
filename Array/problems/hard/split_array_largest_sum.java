// Problem: Split Array Largest Sum
// Approach: Binary Search on Answer
// Time Complexity: O(n log(sum))
// Space Complexity: O(1)

class Solution {

    public int splitArray(int[] nums, int k) {

        int left = 0;
        int right = 0;

        for (int num : nums) {

            left = Math.max(left, num);
            right += num;
        }

        while (left < right) {

            int mid = left + (right - left) / 2;

            if (canSplit(nums, k, mid)) {

                right = mid;

            } else {

                left = mid + 1;
            }
        }

        return left;
    }

    private boolean canSplit(int[] nums,
                             int k,
                             int maxAllowedSum) {

        int subArrays = 1;
        int currentSum = 0;

        for (int num : nums) {

            if (currentSum + num > maxAllowedSum) {

                subArrays++;
                currentSum = num;

            } else {

                currentSum += num;
            }
        }

        return subArrays <= k;
    }
}