import java.util.Scanner;

public class Sum_of_three_number {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of a in interger numbers:");
        a = sc.nextInt();
        System.out.println("Enter value of b in interger numbers:");
        b = sc.nextInt();
        System.out.println("Enter value of c in interger numbers:");
        c = sc.nextInt();
        int sum=a+b+c;
        System.out.println("Sum of all three numbers is : " +sum);
    }
}
