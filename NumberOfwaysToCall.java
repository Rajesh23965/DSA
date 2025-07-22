public class NumberOfwaysToCall {
    public static int callGuest(int n){
        if(n<=1){
            return 1; // Only one way to call one guest
        }
        //Single Call
        int ways1=callGuest(n-1);
//In Pairs
        int ways2=(n-1)*callGuest(n-2);

        return ways1 + ways2;
    }

    public static void main(String[] args) {
int n=4;
System.out.println("Number of ways to call " + n + " guests: " + callGuest(n));
    }
}
