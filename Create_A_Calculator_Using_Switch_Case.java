import java.util.Scanner;

public class Create_A_Calculator_Using_Switch_Case {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a:");
        int a=sc.nextInt();
        System.out.println("Enter value of b:");
        int b=sc.nextInt();
        System.out.println("Enter your choice for operation:");
        char op=sc.next().charAt(0);
        float c=b;
        switch (op) {
            case '+':
                System.out.println("Sum of "+a+" and "+b+" is equal to "+(a+b));
                break;
            case '-':
                System.out.println("Subtraction of "+a+" and "+b+" is equal to "+(a-b));
                break;
            case '*':
                System.out.println("Multiplication of "+a+" and "+b+" is equal to "+(a*b));
                break;
            case '/':
                {
                    if(b==0)
                       System.out.println("Division does not exist!");
                    else
                        System.out.println("Division of "+a+" and "+b+" is equal to "+(a/c));
                }
                break;
            default :
                System.out.println("Invalid operation");
        }
    }
}
