// Problem: Decode Encoded String
// Approach: Stack
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.Stack;

class Solution {

    public String decodeString(String str) {

        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        StringBuilder current = new StringBuilder();
        int number = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {

                number = number * 10 + (ch - '0');

            } else if (ch == '[') {

                countStack.push(number);
                stringStack.push(current);

                number = 0;
                current = new StringBuilder();

            } else if (ch == ']') {

                int repeat = countStack.pop();
                StringBuilder previous = stringStack.pop();

                while (repeat-- > 0) {
                    previous.append(current);
                }

                current = previous;

            } else {

                current.append(ch);
            }
        }

        return current.toString();
    }
}