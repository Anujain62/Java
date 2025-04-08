import java.util.Scanner;

public class Switch_Case_Statement {
    public static void main(String[] args) {
         int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age ");
        age = sc.nextInt();

        //in-hence  switch
        switch (age) {
            case 18 -> System.out.println("Your going to become an adult!");
            case 23 -> System.out.println("Your going to join a job!");
            case 60 -> System.out.println("Your going to retired!");
            default -> System.out.println("Enjoy your life!");
        }

        //traditional switch or old switch
        switch (age) {
            case 18:
                System.out.println("Your going to become an adult!");
                break;
            case 23:
                System.out.println("Your going to join a job!");
                break;
            case 60:
                System.out.println("Your going to retired!");
                break;
            default:
                System.out.println("Enjoy your life!");
                break;
        }
    }
}
