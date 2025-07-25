
import java.util.Scanner;

public class CalculatePower {
    public static int calculatePow(int x,int n) {
        if(n==0){
            return 1;
        }
        if(x==0){
            return 1;
        }
        int xPownm1=calculatePow(x, n-1);
        int xPown=x*xPownm1;
        return xPown;
    }
   public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter base(x) : ");
       int x=sc.nextInt();
       System.out.print("Enter pow(n) : ");
       int n=sc.nextInt();

       System.out.println("Power of "+x+"^"+n+ " = "+calculatePow(x,n));
   } 
}
