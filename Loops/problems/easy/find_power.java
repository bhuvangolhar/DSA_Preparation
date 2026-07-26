// Problem: Find Power of a Number
// Approach: Repeated Multiplication
// Time Complexity: O(exponent)
// Space Complexity: O(1)

class Solution {

    public int findPower(int base, int exponent) {

        int power = 1;

        for (int i = 1; i <= exponent; i++) {

            power *= base;
        }

        return power;
    }
}