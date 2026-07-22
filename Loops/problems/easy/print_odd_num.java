// Problem: Print Odd Numbers from 1 to N
// Approach: Conditional Iteration
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {

    public void printOddNumbers(int n) {

        for (int i = 1; i <= n; i++) {

            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}