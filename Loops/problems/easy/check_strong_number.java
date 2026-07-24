// Problem: Check Strong Number
// Approach: Digit Extraction with Nested Factorial Calculation
// Time Complexity: O(d × k)
// Space Complexity: O(1)

class Solution {
    public boolean isStrongNumber(int n) {

        int original = n;
        int sum = 0;

        while (n > 0) {

            int digit = n % 10;
            int factorial = 1;

            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }

            sum += factorial;
            n /= 10;
        }

        return sum == original;
    }
}