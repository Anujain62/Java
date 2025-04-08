import java.util.Scanner;

public class Recursion {
    static int fact(int n){
        if(n==0 || n==1)
            return 1;
        return n*fact(n-1);
    }
    static int fact_iterative(int n){
        if(n==0 || n==1)
            return 1;
        int result=1;
        for (int i=1;i<=n;i++)
            result*=i;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number for finding factorial :");
        int n=sc.nextInt();
        System.out.println("Fact of "+n+" is using recursion "+fact(n));
        System.out.println("Fact of "+n+" is iterative "+fact_iterative(n));
    }
}
