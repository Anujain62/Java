import java.util.Scanner;

public class Print_User_Input_Number_In_Letters_Using_Switch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a numbver (0-9)");
        int n=sc.nextInt();
        switch (n) {
          case 0: 
               System.out.println("Zero");
               break;
          case 1:
               System.out.println("One");
               break;
          case 2:
               System.out.println("Two");
               break;
          case 3:
               System.out.println("Three");
               break;
          case 4:
               System.out.println("four");
               break;
          case 5:
               System.out.println("Five");
               break;
          case 6:
               System.out.println("Six");
               break;
          case 7:
               System.out.println("Seven");
               break;
          case 8:
               System.out.println("Eight");
               break;
          case 9:
               System.out.println("Nine");
               break;
        }
    }
}
