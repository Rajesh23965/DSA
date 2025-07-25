
import java.util.Scanner;

public class StringReverse {
    public static void printReverse(String str,int idx){
        if(idx==0){
            System.out.println(str.charAt(idx));
            return;
        }
    System.out.print(str.charAt(idx));
    printReverse(str, idx-1);
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a string : ");
    String str=sc.next();
    System.out.print(" Reversed String : ");
        printReverse(str, str.length()-1);

    }
}
