
// Print the spiral order matrix as output for a given matrix of numbers. 
import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row length : ");
        int row = sc.nextInt();
        System.out.print("Enter column length : ");
        int cols = sc.nextInt();
        int[][] numbers = new int[row][cols];
        System.out.println("Enter matrix elements:");

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("Spiral Order:");
        int top = 0, bottom = row - 1;
        int left = 0, right = cols - 1;
        while (top <= bottom && left <= right) {
            // Traverse top row
            for (int i = left; i <= right; i++) {
                System.out.print(numbers[top][i] + " ");
            }
            top++;
            // Traverse right column
            for (int j = top; j <= bottom; j++) {
                System.out.print(numbers[j][right] + " ");
            }
            right--;
            // Traverse bottom row (if not already traversed)

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(numbers[bottom][i] + " ");
                }
                bottom--;
            }
            // Traverse left column (if not already traversed)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(numbers[i][left] + " ");
                }
                left++;
            }
        }
    }
}
