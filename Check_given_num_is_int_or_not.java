import java.util.Scanner;

public class Check_given_num_is_int_or_not {
    public static void main(String[] args) {
        int x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        x=sc.nextInt();
        System.out.println("given number is "+sc.hasNextInt());
    }
}
