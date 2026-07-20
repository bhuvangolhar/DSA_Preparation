// Problem: Palindrome Pairs
// Approach: HashMap + String Manipulation
// Time Complexity: O(n * k²)
// Space Complexity: O(n * k)

import java.util.*;

class Solution {

    public List<List<Integer>> palindromePairs(String[] words) {

        List<List<Integer>> result = new ArrayList<>();

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            map.put(words[i], i);
        }

        for (int i = 0; i < words.length; i++) {

            String word = words[i];

            for (int j = 0; j <= word.length(); j++) {

                String prefix = word.substring(0, j);
                String suffix = word.substring(j);

                if (isPalindrome(prefix)) {

                    String reversed =
                            new StringBuilder(suffix)
                                    .reverse()
                                    .toString();

                    Integer index = map.get(reversed);

                    if (index != null && index != i) {

                        result.add(
                                Arrays.asList(index, i)
                        );
                    }
                }

                if (j != word.length() &&
                    isPalindrome(suffix)) {

                    String reversed =
                            new StringBuilder(prefix)
                                    .reverse()
                                    .toString();

                    Integer index = map.get(reversed);

                    if (index != null && index != i) {

                        result.add(
                                Arrays.asList(i, index)
                        );
                    }
                }
            }
        }

        return result;
    }

    private boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}