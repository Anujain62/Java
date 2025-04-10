import java.util.Scanner;

public class Check_Given_Number_Even_Or_Odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int a=sc.nextInt();
        if(a%2==0)
           System.out.println("Number "+a+" is a even number");
        else 
           System.out.println("Number "+a+" is a odd number");
    }
}
