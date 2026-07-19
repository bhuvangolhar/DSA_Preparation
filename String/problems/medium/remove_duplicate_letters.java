// Problem: Remove Duplicate Letters
// Approach: Greedy + Stack
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {

    public String removeDuplicateLetters(String str) {

        int[] lastIndex = new int[26];

        for (int i = 0; i < str.length(); i++) {
            lastIndex[str.charAt(i) - 'a'] = i;
        }

        boolean[] visited = new boolean[26];

        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < str.length(); i++) {

            char current = str.charAt(i);

            if (visited[current - 'a']) {
                continue;
            }

            while (!stack.isEmpty() &&
                   stack.peekLast() > current &&
                   lastIndex[stack.peekLast() - 'a'] > i) {

                visited[stack.removeLast() - 'a'] = false;
            }

            stack.addLast(current);

            visited[current - 'a'] = true;
        }

        StringBuilder result = new StringBuilder();

        while (!stack.isEmpty()) {
            result.append(stack.removeFirst());
        }

        return result.toString();
    }
}