import java.util.Scanner;

public class Take_Two_Inputs_String_And_Int {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name :");
        String name=sc.next();
        System.out.println("Enter your age :");
        int age=sc.nextInt();
        System.out.println("My name is "+name+" and I am "+age+" years old.");
    }
}
