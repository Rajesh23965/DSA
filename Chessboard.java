import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chessboard {
    public static boolean isSafe(char[][] board, int row, int col) {
        // horizontalcheck
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }

        // vertical check

        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }
        // upper left check
        int r = row;

        for (int c = col; c >= 0 && r >= 0; c--, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }

        // upper right check
        r = row;
        for (int c = col; r >= 0 && c < board.length; r--, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        // lower left check
        r = row;
        for (int c = col; r < board.length && c >= 0; r++, c--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        // lower right check
        r = row;
        for (int c = col; r < board.length && c < board.length; r++, c++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public static void saveBoards(char[][] board, List<List<String>> allBoards) {
        String row = "";
        List<String> newbBoard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            row = "";
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'Q') {
                    row += 'Q';
                } else
                    row += '.';

            }
            newbBoard.add(row);
        }
        allBoards.add(newbBoard);
    }

    public static void helper(char[][] board, int col, List<List<String>> allBoards) {
        if (col == board.length) {
            saveBoards(board, allBoards);
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 'Q';
                helper(board, col + 1, allBoards);
                board[row][col] = '.';
            }
        }
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        helper(board, 0, allBoards);
        return allBoards;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the chessboard (n): ");
        int n = sc.nextInt();
        List<List<String>> result = solveNQueens(n);
        for (List<String> board : result) {
            System.out.println("Solutions: ");
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }

    }
}
