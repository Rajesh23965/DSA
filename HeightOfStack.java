
import java.util.Scanner;

public class HeightOfStack {
    public static int calculateStackHeight(int x, int n) {
        if (n == 0) {// base case 1
            return 1;
        }
        if (x == 0) {// base case 2
            return 0;
        }

        // if n is even
        if (n % 2 == 0) {
            return calculateStackHeight(x, n / 2) * calculateStackHeight(x, n / 2);
        } else {
            return calculateStackHeight(x, n / 2) * calculateStackHeight(x, n / 2) * x;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base(x) : ");
        int x = sc.nextInt();
        System.out.print("Enter exponent(n) : ");
        int n = sc.nextInt();
        System.out.println(x+ " power "+n+ " = " +calculateStackHeight(x, n));
    }
}
