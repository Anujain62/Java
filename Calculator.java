import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
       int a;
       int b;
       System.out.println("Enter value of a:");
       a=sc.nextInt();
       System.out.println("Enter value of b:");
       b=sc.nextInt();
       int x;
       System.out.println("enter your choice : 1-add ,2-subtract ,3-multiplication ,4-divide");
       x=sc.nextInt();
       if(x==1){
           System.out.println("Sum of "+a+" and "+b+" is "+(a+b));
       } else if (x==2) {
           System.out.println("Subtraction of "+a+" and "+b+" is "+(a-b));
       } else if (x==3) {
           System.out.println("multiplication of "+a+" and "+b+" is "+(a*b));
       } else if (x==4) {
          float c=(float)b;
           System.out.println("division of "+a+" and "+b+" is "+(a/c));
       }
       else{
           System.out.println("Incorrect choice");
       }
    }
}
