import java.util.Scanner;

public class Give_Grades_Based_On_Marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks :");
        int marks=sc.nextInt();
        if(marks>=90)
            System.out.println("A grade");
        else if(marks>=75)
            System.out.println("B grade");
        else if(marks>=60)
            System.out.println("C grade");
        else
            System.out.println("Fail");
    }
}
