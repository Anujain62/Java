// write a method that receives a number 

import java.util.Scanner;

public class Create_Method_Prints_Twice_Of_Given_Num {
    static void number(int n){
        System.out.println("given digit twice time :"+n+n);
       }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter a digit :");
        int num=sc.nextInt();
        number(num);
    }
}



