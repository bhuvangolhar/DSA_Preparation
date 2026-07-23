// Problem: Find LCM of Two Numbers
// Approach: Incremental Search
// Time Complexity: O(a × b)
// Space Complexity: O(1)

class Solution {

    public int findLCM(int a, int b) {

        int max = Math.max(a, b);

        while (true) {

            if (max % a == 0 &&
                max % b == 0) {

                return max;
            }

            max++;
        }
    }
}