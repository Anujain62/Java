import java.util.Scanner;

public class Check_Given_Char_In_Uppercase_Or_Lowercase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character :");
        char ch=sc.next().charAt(0);
        if(ch>='a' && ch<='z')
             System.out.println("You entered Lowercase latter");
        else if(ch>='A' && ch<='Z')
             System.out.println("You entered Uppercase latter");
        else
             System.out.println("You not entered a latter");
    }
}
