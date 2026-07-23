// Problem: Print Numbers from 1 to N Except Multiples of a Number
// Approach: Iteration with Continue
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {

    public void printNonMultiples(int n, int divisor) {

        for (int i = 1; i <= n; i++) {

            if (i % divisor == 0) {
                continue;
            }

            System.out.print(i + " ");
        }
    }
}