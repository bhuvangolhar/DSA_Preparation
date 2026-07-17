// Problem: Check Word Pattern
// Approach: HashMap Mapping
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.HashMap;

class Solution {

    public boolean wordPattern(String pattern, String str) {

        String[] words = str.split(" ");

        if (pattern.length() != words.length) {
            return false;
        }

        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);
            String word = words[i];

            if (!charToWord.containsKey(ch) && !wordToChar.containsKey(word)) {

                charToWord.put(ch, word);
                wordToChar.put(word, ch);

            } else {

                if (!word.equals(charToWord.get(ch)) ||
                    wordToChar.get(word) != ch) {
                    return false;
                }
            }
        }

        return true;
    }
}