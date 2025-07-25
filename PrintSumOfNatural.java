
import java.util.Scanner;

public class PrintSumOfNatural {
    public static void printNaturalNumb(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        } else {
            sum += i;
            printNaturalNumb(i + 1, n, sum);
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int sum = 0, i = 1;
        printNaturalNumb(i, n, sum);
    }
}
