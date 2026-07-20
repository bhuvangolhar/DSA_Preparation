// Problem: Word Search II
// Approach: Trie + DFS + Backtracking
// Time Complexity: O(m * n * 4^L)
// Space Complexity: O(total characters in words)

import java.util.*;

class Solution {

    private class TrieNode {

        TrieNode[] children = new TrieNode[26];

        String word;
    }

    public List<String> findWords(char[][] board, String[] words) {

        TrieNode root = buildTrie(words);

        List<String> result = new ArrayList<>();

        int rows = board.length;
        int cols = board[0].length;

        for (int row = 0; row < rows; row++) {

            for (int col = 0; col < cols; col++) {

                dfs(board, row, col, root, result);
            }
        }

        return result;
    }

    private TrieNode buildTrie(String[] words) {

        TrieNode root = new TrieNode();

        for (String word : words) {

            TrieNode current = root;

            for (char ch : word.toCharArray()) {

                int index = ch - 'a';

                if (current.children[index] == null) {

                    current.children[index] = new TrieNode();
                }

                current = current.children[index];
            }

            current.word = word;
        }

        return root;
    }

    private void dfs(
            char[][] board,
            int row,
            int col,
            TrieNode node,
            List<String> result) {

        if (row < 0 ||
            col < 0 ||
            row >= board.length ||
            col >= board[0].length) {

            return;
        }

        char current = board[row][col];

        if (current == '#' ||
            node.children[current - 'a'] == null) {

            return;
        }

        node = node.children[current - 'a'];

        if (node.word != null) {

            result.add(node.word);

            node.word = null;
        }

        board[row][col] = '#';

        dfs(board, row + 1, col, node, result);
        dfs(board, row - 1, col, node, result);
        dfs(board, row, col + 1, node, result);
        dfs(board, row, col - 1, node, result);

        board[row][col] = current;
    }
}