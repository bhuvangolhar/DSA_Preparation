// Problem: Basic Calculator
// Approach: Stack
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.Stack;

class Solution {

    public int calculate(String str) {

        Stack<Integer> stack = new Stack<>();

        int result = 0;
        int number = 0;
        int sign = 1;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {

                number = number * 10 + (ch - '0');

            } else if (ch == '+') {

                result += sign * number;
                number = 0;
                sign = 1;

            } else if (ch == '-') {

                result += sign * number;
                number = 0;
                sign = -1;

            } else if (ch == '(') {

                stack.push(result);
                stack.push(sign);

                result = 0;
                sign = 1;

            } else if (ch == ')') {

                result += sign * number;
                number = 0;

                result *= stack.pop();
                result += stack.pop();
            }
        }

        result += sign * number;

        return result;
    }
}