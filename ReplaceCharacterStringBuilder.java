
/*Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
Example : 
original = “eabcdef’ ; result = “iabcdif”
Origin
*/
import java.util.Scanner;

public class ReplaceCharacterStringBuilder {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == 'e') {
                result.append('i');
            } else {
                result.append(currentChar);
            }
        }
        System.out.println("Modified string :" + result.toString());
    }
}
