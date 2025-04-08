import java.util.Scanner;

public class Calculate_CGPA {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        float marks1;
        float marks2;
        float marks3;
        System.out.println("Enter first subject marks out of 100:");
        marks1 = sc.nextFloat();
        System.out.println("Enter second subject marks out of 100:");
        marks2 = sc.nextFloat();
        System.out.println("Enter third subject marks out of 100:");
        marks3 = sc.nextFloat();
        float result = (marks1+marks2+marks3)/30.0f;
        System.out.print("Your CGPA is : ");
        System.out.println(result);

    }
}
