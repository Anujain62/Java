import java.util.Scanner;

public class Sum_Of_First_N_Natural_Num_Using_While_Loop {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter a number");
         int n=sc.nextInt();
         int sum=0;
         int m=n;
         while(n>0){
            sum+=n;
            n--;
         }
         System.out.println("Sum of first "+m+" number is "+sum);
    }
}