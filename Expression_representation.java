//(v^2 - u^2)/2*a*s

import java.util.Scanner;

public class Expression_representation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float v;
        float u;
        float a;
        float s;
        float ans;
        System.out.println("Enter value of u : ");
        u = sc.nextFloat();
        System.out.println("Enter value of v :");
        v = sc.nextFloat();
        System.out.println("Enter value of a : ");
        a = sc.nextFloat();
        System.out.println("Enter value of s :");
        s = sc.nextFloat();
        ans = (v*v - u*u)/(2*a*s);
        System.out.println("Final answer is : "+ans);
    }
}