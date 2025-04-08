import java.util.Scanner;

public class For_Loop {
    public static void main(String[] args) {
//        for(int i=0;i<=10;i++)
//            System.out.println(i);

        //Print n odd numbers
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter value of n : ");
//        int n=sc.nextInt();
//        for(int i=0;i<n;i++){
//            System.out.println(2*i+1);
//        }

        //Print first n natural number in reverse order
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of n : ");
        int n=sc.nextInt();
        for(int i=n;i>0;i--){
            System.out.println(i);
        }

    }
}
