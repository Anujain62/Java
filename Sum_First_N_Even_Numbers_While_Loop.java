import java.util.Scanner;

public class Sum_First_N_Even_Numbers_While_Loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        int sum=0;
        int i=0;
        while(i<=n){
            sum+=2*i;
            i++;
        }
        System.out.println("Sum of "+n+" numbers is "+sum);
    }
}
