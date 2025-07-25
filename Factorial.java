
import java.util.Scanner;

public class Factorial {
    public static int printFact(int n){
        if(n<0){
            System.out.print("Invalid Input");
             return -1;
        }
        if(n==0 || n==1){
            return 1;
        }else{
            return n*printFact(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n=sc.nextInt();
        System.out.println("Factorial of "+n+ " = "+printFact(n));
    }
}
