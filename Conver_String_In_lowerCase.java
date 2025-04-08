import java.util.Scanner;

public class Conver_String_In_lowerCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter a string");
        str = sc.nextLine();
        str = str.toLowerCase();
        System.out.println("Your lower case string is "+str);
    }
}
