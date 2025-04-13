// create a class named student with instance variables name , roll-number , and marks.
// inside the main method print the grade based on the marks.

import java.util.Scanner;

public class Class_Student_Inside_Main_Fun {
    public static void main(String[] args) {

        class Student{
            private String name;
            private int roll_number;
            private int marks;
            public void setName(String name){
                this.name=name;
            }
            public void setRollNumber(int roll_number){
                this.roll_number=roll_number;
            }
            public void setMarks(int marks){
                this.marks=marks;
            }
            public String getName(){
                return name;
            }
            public int getRollNumber(){
                return roll_number;
            }
            public int getMarks(){
                return marks;
            }
            public char getGrade(){
                if(marks>90)
                   return 'A';
                else if(marks<=90 && marks>75)
                    return 'B';
                else if(marks<=75 && marks>55)
                    return 'c';
                else 
                    return 'f';
            }
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name:");
        String name=sc.nextLine();
        System.out.println("Enter roll number : ");
        int roll_number=sc.nextInt();
        System.out.println("Enter marks :");
        int marks=sc.nextInt();
        Student s=new Student();
        s.setName(name);
        s.setMarks(marks);
        s.setRollNumber(roll_number);
        System.out.println("\nStudent details : \n");
        System.out.println("Name :"+s.getName());
        System.out.println("Roll number :"+s.getRollNumber());
        System.out.println("Marks :"+s.getMarks());
        System.out.println("Grade :"+s.getGrade());
    }
}
