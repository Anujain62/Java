import java.util.Scanner;

public class Input_Char_And_Print_ASCII_Value {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character :");
        char ch=sc.next().charAt(0);
        int x=(int)ch;
        System.out.println("ASCII value of '"+ch+"' is "+x);
    }
}
