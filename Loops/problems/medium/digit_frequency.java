// Problem: Count Frequency of a Digit in a Number
// Approach: Digit Frequency Counting
// Time Complexity: O(log n)
// Space Complexity: O(1)

class Solution {

    public int digitFrequency(int n, int targetDigit) {

        int frequency = 0;

        while (n > 0) {

            int digit = n % 10;

            if (digit == targetDigit) {
                frequency++;
            }

            n = n / 10;
        }

        return frequency;
    }
}