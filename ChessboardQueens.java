
public class ChessboardQueens {
    /**
     * This program solves the N-Queens problem using backtracking.
     * It places N queens on an N x N chessboard such that no two queens threaten each other.
     * The solution is printed to the console.
     */    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];

        // Initialize the board with '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.';
            }
        }

        solveNQueens(board, 0);
    }

    public static void solveNQueens(char[][] board, int row) {
        int n = board.length;
        if (row == n) {
            printBoard(board);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q'; // Place Queen
                solveNQueens(board, row + 1); // Recurse to next row
                board[row][col] = '.'; // Backtrack
            }
        }
    }

    public static boolean isSafe(char[][] board, int row, int col) {
        // Check column
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        // Check left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        // Check right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }

        return true;
    }

    public static void printBoard(char[][] board) {
        System.out.println("Solution:");
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
