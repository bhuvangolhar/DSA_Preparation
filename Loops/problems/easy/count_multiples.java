// Problem: Count Multiples of a Number from 1 to N
// Approach: Conditional Counting
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {

    public int countMultiples(int n, int divisor) {

        int count = 0;

        for (int i = 1; i <= n; i++) {

            if (i % divisor == 0) {
                count++;
            }
        }

        return count;
    }
}