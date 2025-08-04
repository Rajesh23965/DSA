
//Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
import java.util.*;

public class ArrayStringLength {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array length : ");
        int size = sc.nextInt();
        String sentence[] = new String[size];
        int toLength=0;
        System.out.print("Enter sentences: ");
        for (int i = 0; i < size; i++) {
            sentence[i] = sc.nextLine();
        toLength +=sentence[i].length();
        }
        System.out.println("Sentence length is: "+toLength);
        
    }
}
