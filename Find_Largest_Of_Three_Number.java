import java.util.Scanner;

public class Find_Largest_Of_Three_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a :");
        int a=sc.nextInt();
        System.out.println("Enter value of b :");
        int b=sc.nextInt();
        System.out.println("Enter value of c :");
        int c=sc.nextInt();
        if(a>b && a>c)
            System.out.println(a+" is greater value as compared to "+b+" and "+c);
        else if(b>a && b>c)
            System.out.println(b+" is greater value as compared to "+a+" and "+c);
        else
            System.out.println(c+" is greater value as compared to "+a+" and "+b);
    }
}
