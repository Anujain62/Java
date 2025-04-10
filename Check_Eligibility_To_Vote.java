import java.util.Scanner;

public class Check_Eligibility_To_Vote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age :");
        int age=sc.nextInt();
        if(age>18)
            System.out.println("You are eligiable for vote");
        else
            System.out.println("You are not eligiable for vote");
    }
}
