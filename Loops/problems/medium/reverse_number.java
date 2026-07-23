// Problem: Reverse a Number
// Approach: Digit Reconstruction
// Time Complexity: O(log n)
// Space Complexity: O(1)

class Solution {

    public int reverseNumber(int n) {

        int reverse = 0;

        while (n > 0) {

            int digit = n % 10;

            reverse = reverse * 10 + digit;

            n = n / 10;
        }

        return reverse;
    }
}