// create a class named calculator inside the main method that declare two local variables 
// a and b. Print the sum of these variable.

import java.util.Scanner;

public class Class_Calculator_Inside_Main_fun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a :");
        int a=sc.nextInt();
        System.out.println("Enter value of b :");
        int b=sc.nextInt();

        class Calculator{
            private int a;
            private int b;
            public void setA(int a){
                this.a=a;
            }
            public void setB(int b){
                this.b=b;
            }
            public int getSum(){
                return a+b;
            }
            public int getProduct(){
                return a*b;
            }
        }

        Calculator c=new Calculator();
        c.setA(a);
        c.setB(b);
        System.out.println("sum of "+a+" and "+b+" is "+c.getSum());
        System.out.println("product of "+a+" and "+b+" is "+c.getProduct());
    }
}
