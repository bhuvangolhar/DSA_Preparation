// Problem: Longest Repeating Character Replacement
// Approach: Sliding Window with Frequency Count
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {

    public int characterReplacement(String str, int k) {

        int[] frequency = new int[26];

        int left = 0;
        int maxFrequency = 0;
        int maxLength = 0;

        for (int right = 0; right < str.length(); right++) {

            int index = str.charAt(right) - 'A';

            frequency[index]++;

            maxFrequency = Math.max(
                maxFrequency,
                frequency[index]
            );

            while ((right - left + 1) - maxFrequency > k) {

                frequency[str.charAt(left) - 'A']--;

                left++;
            }

            maxLength = Math.max(
                maxLength,
                right - left + 1
            );
        }

        return maxLength;
    }
}