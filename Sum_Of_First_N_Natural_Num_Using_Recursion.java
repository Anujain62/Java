import java.util.Scanner;

public class Sum_Of_First_N_Natural_Num_Using_Recursion {
    static int sum(int n){
        if(n==1)
            return 1;
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        System.out.println("Sum of first "+n+" nutural number is "+sum(n));
    }
}
