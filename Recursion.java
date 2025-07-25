//Print 5 to 1
// public class Recursion {
//     public static void printNumber(int n){
//       if(n==0){
//         return;
//       }else{
//         System.out.print(n+" ");
        
//         printNumber(n-1);
//         return;
//       }
     
//     }
//     public static void main(String args[]) {
//         int n=5;
//         printNumber(n);
//     }
// }
//Print 5 to 1
public class Recursion {
    public static void printNumber(int n){
      if(n>5){
        return;
      }else{
        System.out.println(n+" ");
        
        printNumber(n+1);
        return;
      }
     
    }
    public static void main(String args[]) {
        int n=1;
        printNumber(n);
    }
}