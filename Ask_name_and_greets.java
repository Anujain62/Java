import java.util.Scanner;

public class Ask_name_and_greets {
    public static void main(String[] args) {
        String name;
        System.out.println("Enter your name:");
        Scanner sc = new Scanner(System.in);
        name = sc.next();
        System.out.println("Hello "+name+" ,have a good day");
    }
}
