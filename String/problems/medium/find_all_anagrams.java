// Problem: Find All Anagrams in a String
// Approach: Sliding Window with Frequency Count
// Time Complexity: O(n)
// Space Complexity: O(1)

import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<Integer> findAnagrams(String str, String pattern) {

        List<Integer> result = new ArrayList<>();

        if (pattern.length() > str.length()) {
            return result;
        }

        int[] patternFreq = new int[26];
        int[] windowFreq = new int[26];

        for (int i = 0; i < pattern.length(); i++) {
            patternFreq[pattern.charAt(i) - 'a']++;
        }

        for (int i = 0; i < str.length(); i++) {

            windowFreq[str.charAt(i) - 'a']++;

            if (i >= pattern.length()) {
                windowFreq[str.charAt(i - pattern.length()) - 'a']--;
            }

            if (i >= pattern.length() - 1 &&
                java.util.Arrays.equals(patternFreq, windowFreq)) {

                result.add(i - pattern.length() + 1);
            }
        }

        return result;
    }
}