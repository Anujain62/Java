import java.util.Scanner;

public class Check_Student_Pass_Or_fail {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Byte marks1;
        Byte marks2;
        Byte marks3;
        System.out.println("Enter marks of first subject :");
        marks1 = sc.nextByte();
        System.out.println("Enter marks of second subject :");
        marks2 = sc.nextByte();
        System.out.println("Enter marks of third subject :");
        marks3 = sc.nextByte();
        float totalMarks  = (marks1+marks2+marks3)/3.0f;
        System.out.println("Your overall percentage is "+totalMarks);
        if(totalMarks>=40.0 && marks1>=33 && marks2>=33 && marks3>=33)
            System.out.println("Congratulations,You have been promoted");
        else
            System.out.println("Sorry,You have not been promoted");
    }
}
