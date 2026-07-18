// Problem: Multiply Strings
// Approach: Simulation
// Time Complexity: O(m * n)
// Space Complexity: O(m + n)

class Solution {

    public String multiply(String num1, String num2) {

        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }

        int[] product = new int[num1.length() + num2.length()];

        for (int i = num1.length() - 1; i >= 0; i--) {

            for (int j = num2.length() - 1; j >= 0; j--) {

                int multiplication =
                        (num1.charAt(i) - '0') *
                        (num2.charAt(j) - '0');

                int sum = multiplication + product[i + j + 1];

                product[i + j + 1] = sum % 10;
                product[i + j] += sum / 10;
            }
        }

        StringBuilder result = new StringBuilder();

        for (int digit : product) {

            if (!(result.length() == 0 && digit == 0)) {
                result.append(digit);
            }
        }

        return result.toString();
    }
}