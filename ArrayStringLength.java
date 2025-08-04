import java.util.Scanner;

public class ArrayStringLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array length: ");
        int size = sc.nextInt();
        sc.nextLine();

        String[] sentence = new String[size];
        StringBuilder sb = new StringBuilder();

        System.out.println("Enter sentences:");
        for (int i = 0; i < size; i++) {
            sentence[i] = sc.nextLine();
            sb.append(sentence[i]);
        }

        System.out.println("Combined String: " + sb.toString());
        System.out.println("Total length of all strings: " + sb.length());
    }
}
