// Problem: Check Palindrome Number
// Approach: Reverse and Compare
// Time Complexity: O(log n)
// Space Complexity: O(1)

class Solution {

    public boolean isPalindrome(int n) {

        if (n < 0) {
            return false;
        }

        int original = n;
        int reverse = 0;

        while (n > 0) {

            int digit = n % 10;

            reverse = reverse * 10 + digit;

            n = n / 10;
        }

        return original == reverse;
    }
}