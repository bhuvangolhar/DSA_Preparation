// Problem: Check if Two Strings are Isomorphic
// Approach: Character Mapping
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {

    public boolean isIsomorphic(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] map1 = new char[256];
        char[] map2 = new char[256];

        for (int i = 0; i < str1.length(); i++) {

            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);

            if (map1[ch1] == 0 && map2[ch2] == 0) {

                map1[ch1] = ch2;
                map2[ch2] = ch1;

            } else if (map1[ch1] != ch2 || map2[ch2] != ch1) {

                return false;
            }
        }

        return true;
    }
}