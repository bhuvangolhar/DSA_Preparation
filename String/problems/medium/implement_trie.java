// Problem: Implement Trie (Prefix Tree)
// Approach: Trie Data Structure
// Time Complexity:
// insert()  -> O(n)
// search()  -> O(n)
// startsWith() -> O(n)
// Space Complexity: O(total characters inserted)

class Trie {

    private class TrieNode {

        TrieNode[] children = new TrieNode[26];

        boolean isEndOfWord;
    }

    private TrieNode root;

    public Trie() {

        root = new TrieNode();
    }

    public void insert(String word) {

        TrieNode current = root;

        for (char ch : word.toCharArray()) {

            int index = ch - 'a';

            if (current.children[index] == null) {

                current.children[index] = new TrieNode();
            }

            current = current.children[index];
        }

        current.isEndOfWord = true;
    }

    public boolean search(String word) {

        TrieNode node = searchPrefix(word);

        return node != null && node.isEndOfWord;
    }

    public boolean startsWith(String prefix) {

        return searchPrefix(prefix) != null;
    }

    private TrieNode searchPrefix(String str) {

        TrieNode current = root;

        for (char ch : str.toCharArray()) {

            int index = ch - 'a';

            if (current.children[index] == null) {

                return null;
            }

            current = current.children[index];
        }

        return current;
    }
}