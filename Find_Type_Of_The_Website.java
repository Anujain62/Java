import java.util.Scanner;

public class Find_Type_Of_The_Website {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your website :");
        String str=sc.nextLine();
        if(str.endsWith(".com"))
            System.out.println("It is the Commercial website");
        else if(str.endsWith(".org"))
            System.out.println("It is the Organizational website");
        else if(str.endsWith(".in"))
            System.out.println("It is the Indian website");
        else
            System.out.println("Invalid website");
    }
}
