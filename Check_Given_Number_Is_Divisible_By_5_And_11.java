import java.util.Scanner;

public class Check_Given_Number_Is_Divisible_By_5_And_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=sc.nextInt();
        if(num%5==0 && num%11==0)
               System.out.println("Number "+num+" is divisible by 5 and 11");
        else
              System.out.println("Number "+num+" is not divisible by 5 and 11");
    }
}
