package dp;

public class Fibonacci {
    public static Long getFibonacci(int n ,Long[] arr){
        if (arr[n] != null)
            return arr[n];
        if (n <=2)
        {
            arr[n] = 1L;
            return arr[n];
        }
        arr[n] = getFibonacci(n-1,arr) + getFibonacci(n-2,arr);
        return arr[n];
    }
}
