
import java.util.*;

public class MatrixSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row length: ");
        int row = sc.nextInt();
        System.out.print("Enter column length: ");
        int cols = sc.nextInt();
        int[][] numbers = new int[row][cols];
        // Input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        // Search input
        System.out.print("Enter x number which you want to search : ");
        int x = sc.nextInt();
        // Output
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == x) {
                    System.out.print("x is found at index (" + i + ", " + j + ")");
                }
            }
            System.out.println();
        }

    }
}
