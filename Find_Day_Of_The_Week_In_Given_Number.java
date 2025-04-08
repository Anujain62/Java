import java.util.Scanner;

public class Find_Day_Of_The_Week_In_Given_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter the number of days :");
        n= sc.nextInt();
        n%=7;
        switch (n) {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 3 -> System.out.println("Tuesday");
            case 4 -> System.out.println("Wednesday");
            case 5 -> System.out.println("Thursday");
            case 6 -> System.out.println("Friday");
            case 7 -> System.out.println("Saturday");
        }
    }
}
