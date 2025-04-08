
// given two int values return their sum. unless the two values are the same ,then return double their sum

import java.util.Scanner;

public class Sum_Double {
    static int sum(int a,int b){
        if(a==b)
           return 2*(a+b);
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a :");
        int a=sc.nextInt();
        System.out.println("Enter value of b :");
        int b=sc.nextInt();
        System.out.println("Sum of "+a+" and "+b+" is "+sum(a, b));
    }
}
