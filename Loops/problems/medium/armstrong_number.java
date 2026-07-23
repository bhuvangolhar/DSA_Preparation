// Problem: Check Armstrong Number
// Approach: Digit Power Summation
// Time Complexity: O(log n)
// Space Complexity: O(1)

class Solution {

    public boolean isArmstrong(int n) {

        int original = n;
        int digitCount = 0;
        int sum = 0;
        int temp = n;

        while (temp > 0) {

            digitCount++;
            temp /= 10;
        }

        temp = n;

        while (temp > 0) {

            int digit = temp % 10;

            sum += (int) Math.pow(digit, digitCount);

            temp /= 10;
        }

        return sum == original;
    }
}