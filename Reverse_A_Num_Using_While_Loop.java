import java.util.Scanner;

public class Reverse_A_Num_Using_While_Loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=sc.nextInt();
        int n=num;
        int rev_num=0;
        while(num>0){
            int rem=num%10;
            rev_num = rev_num*10 + rem;
            num/=10;
        }
        System.out.println("Reverse of the number "+n+" is "+rev_num);
    }
}
