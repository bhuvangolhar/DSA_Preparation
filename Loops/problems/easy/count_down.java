// Problem: Countdown from N to 0
// Approach: Decrementing Loop
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {

    public void countDown(int n) {

        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
}