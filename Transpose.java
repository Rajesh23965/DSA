
import java.util.Scanner;

//For a given matrix of N x M, print its transpose.
public class Transpose {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row length : ");
        int row = sc.nextInt();
        System.out.print("Enter column length : ");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        // input
        System.out.println("Enter matrix :");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Output
        System.out.println("Transpose Matrix is :");
        for (int j = 0; j < col; j++) {
            for (int i = 0; i < row; i++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
