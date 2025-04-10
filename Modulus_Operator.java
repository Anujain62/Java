import java.util.Scanner;

public class Modulus_Operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int a=sc.nextInt();
        System.out.println("Enter a number for division :");
        int b=sc.nextInt();
        if(b>0)
        System.out.println("Modulus of number = "+a+" and divider = "+b+" is "+(a%b));
        else
        System.out.println("Modulus does not exist because b = "+b);
    }
}
