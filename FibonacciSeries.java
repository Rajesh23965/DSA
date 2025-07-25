

public class FibonacciSeries {
    public static int printFabonacci(int a, int b, int n) {
        // if(n==0){
        // return 0;
        // }else if(n==1){
        // return 1;
        // }else{
        // return printFabonacci(n-1)+printFabonacci(n-2);
        // }
        if (n == 0) {
            return 1;
        }
        int c = a + b;
        System.out.println(c);
      return  printFabonacci(b, c, n - 1);
    }

    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.print("Enter a nth term : ");
        // int n=sc.nextInt();
        // for(int i=0;i<n;i++){

        // System.out.print(printFabonacci(i)+" ");
        // }
        // System.out.println();
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        int n = 7;
        printFabonacci(a, b, n - 2);
    }
}
