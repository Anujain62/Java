import java.util.Scanner;

public class Arthemetic_Operators {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a :");
        int a=sc.nextInt();
        System.out.println("Enter value of b :");
        int b=sc.nextInt();

        System.out.println("Sum of "+a+" and "+b+" is equal to "+(a+b));
        System.out.println("Subtraction of "+a+" and "+b+" is equal to "+(a-b));
        System.out.println("Multiplication of "+a+" and "+b+" is equal to "+(a*b));

        float c=(float)b;
        if(b>0)
             System.out.println("Division of "+a+" and "+b+" is equal to "+(a/c));
        else
             System.out.println("Division of "+a+" and "+b+" does not exist because b = "+b);
    }
}
