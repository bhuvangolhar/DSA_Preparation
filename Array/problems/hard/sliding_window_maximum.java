// Problem: Sliding Window Maximum
// Approach: Monotonic Deque
// Time Complexity: O(n)
// Space Complexity: O(k)

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {

    public int[] maxSlidingWindow(int[] nums, int k) {

        if (nums.length == 0) {
            return new int[0];
        }

        int[] result = new int[nums.length - k + 1];

        Deque<Integer> deque = new ArrayDeque<>();

        int index = 0;

        for (int i = 0; i < nums.length; i++) {

            while (!deque.isEmpty() &&
                   deque.peekFirst() <= i - k) {

                deque.removeFirst();
            }

            while (!deque.isEmpty() &&
                   nums[deque.peekLast()] <= nums[i]) {

                deque.removeLast();
            }

            deque.addLast(i);

            if (i >= k - 1) {

                result[index++] =
                        nums[deque.peekFirst()];
            }
        }

        return result;
    }
}