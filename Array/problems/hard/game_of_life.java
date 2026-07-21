// Problem: Game of Life
// Approach: In-Place State Encoding
// Time Complexity: O(m * n)
// Space Complexity: O(1)

class Solution {

    public void gameOfLife(int[][] board) {

        int rows = board.length;
        int cols = board[0].length;

        int[] rowDirection =
                {-1, -1, -1, 0, 0, 1, 1, 1};

        int[] colDirection =
                {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int row = 0; row < rows; row++) {

            for (int col = 0; col < cols; col++) {

                int liveNeighbours = 0;

                for (int k = 0; k < 8; k++) {

                    int newRow = row + rowDirection[k];
                    int newCol = col + colDirection[k];

                    if (newRow >= 0 &&
                        newRow < rows &&
                        newCol >= 0 &&
                        newCol < cols &&
                        Math.abs(board[newRow][newCol]) == 1) {

                        liveNeighbours++;
                    }
                }

                if (board[row][col] == 1 &&
                    (liveNeighbours < 2 ||
                     liveNeighbours > 3)) {

                    board[row][col] = -1;
                }

                if (board[row][col] == 0 &&
                    liveNeighbours == 3) {

                    board[row][col] = 2;
                }
            }
        }

        for (int row = 0; row < rows; row++) {

            for (int col = 0; col < cols; col++) {

                if (board[row][col] > 0) {
                    board[row][col] = 1;
                } else {
                    board[row][col] = 0;
                }
            }
        }
    }
}