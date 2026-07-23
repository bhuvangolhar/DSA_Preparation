// Problem: Find First Multiple of a Number from 1 to N
// Approach: Linear Search with Early Exit
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {

    public int findFirstMultiple(int n, int divisor) {

        for (int i = 1; i <= n; i++) {

            if (i % divisor == 0) {
                return i;
            }
        }

        return -1;
    }
}