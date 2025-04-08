import java.util.Scanner;

public class Find_Average_Of_Array_Using_For_Each_Loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter the number of students :");
        size = sc.nextInt();
        float []marks = new float[size];
        System.out.println("Enter marks of all students :");
        for(int i=0;i<size;i++)
            marks[i] = sc.nextFloat();
        float sum=0;
        for (float element:marks)
            sum+=element;
        float average=sum/size;
        System.out.println("Average of all the marks is :"+average);
    }
}
