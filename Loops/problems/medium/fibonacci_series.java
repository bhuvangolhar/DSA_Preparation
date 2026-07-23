// Problem: Print Fibonacci Series
// Approach: Iterative Sequence Generation
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {

    public void printFibonacci(int n) {

        int first = 0;
        int second = 1;

        for (int i = 1; i <= n; i++) {

            System.out.print(first + " ");

            int next = first + second;

            first = second;
            second = next;
        }
    }
}