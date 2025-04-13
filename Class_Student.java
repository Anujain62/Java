//Create a class named student with a static variable school name and an instance variable name. create 2 objects 
// and print the school name and student names

import java.util.Scanner;

class Student{
   public static String schoolName;
   private String studentName;
   public void setStudentName(String studentName){
    this.studentName=studentName;
   }
   public String getStudentName(){
    return studentName;
   }
}

public class Class_Student {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter school name :");
        String schoolName=sc.nextLine();
        Student.schoolName=schoolName;

        Student s1=new Student();
        System.out.println("Enter student name :");
        String name=sc.nextLine();
        s1.setStudentName(name);

        Student s2=new Student();
        System.out.println("Enter student name :");
        name=sc.nextLine();
        s2.setStudentName(name);

        System.out.println("School name :"+Student.schoolName);
        System.out.println("Students list :"+s1.getStudentName()+" , "+s2.getStudentName());
    }
}
