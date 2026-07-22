// Problem: Maximum Gap
// Approach: Bucket Sort (Pigeonhole Principle)
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {

    public int maximumGap(int[] nums) {

        if (nums == null || nums.length < 2) {
            return 0;
        }

        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        if (min == max) {
            return 0;
        }

        int n = nums.length;

        int bucketSize = Math.max(1, (max - min) / (n - 1));
        int bucketCount = (max - min) / bucketSize + 1;

        int[] bucketMin = new int[bucketCount];
        int[] bucketMax = new int[bucketCount];
        boolean[] used = new boolean[bucketCount];

        for (int i = 0; i < bucketCount; i++) {
            bucketMin[i] = Integer.MAX_VALUE;
            bucketMax[i] = Integer.MIN_VALUE;
        }

        for (int num : nums) {

            int index = (num - min) / bucketSize;

            bucketMin[index] = Math.min(bucketMin[index], num);
            bucketMax[index] = Math.max(bucketMax[index], num);

            used[index] = true;
        }

        int previousMax = min;
        int maximumGap = 0;

        for (int i = 0; i < bucketCount; i++) {

            if (!used[i]) {
                continue;
            }

            maximumGap = Math.max(
                    maximumGap,
                    bucketMin[i] - previousMax
            );

            previousMax = bucketMax[i];
        }

        return maximumGap;
    }
}