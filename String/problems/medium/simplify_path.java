// Problem: Simplify Path
// Approach: Stack
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {

    public String simplifyPath(String path) {

        Deque<String> stack = new ArrayDeque<>();

        String[] directories = path.split("/");

        for (String directory : directories) {

            if (directory.equals("") ||
                directory.equals(".")) {

                continue;

            } else if (directory.equals("..")) {

                if (!stack.isEmpty()) {
                    stack.removeLast();
                }

            } else {

                stack.addLast(directory);
            }
        }

        if (stack.isEmpty()) {
            return "/";
        }

        StringBuilder result = new StringBuilder();

        for (String directory : stack) {

            result.append("/");
            result.append(directory);
        }

        return result.toString();
    }
}