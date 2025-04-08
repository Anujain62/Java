import java.util.Scanner;

public class Nth_Term_Of_Fibonacci_Num_Using_Recursion {
    static int fibonacci(int n){
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        System.out.println(n+"th fibonacci number is "+fibonacci(n));
    }
}
