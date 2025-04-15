import java.util.Scanner;


public class Pyramid {
 public static void main(String[] args) {
             //     *
            //     *** 
            //    *****


            Scanner sc=new Scanner(System.in);
            System.out.println("Enter number of lines :");
            int n=sc.nextInt();
            for(int i=1;i<=n;i++){
                for(int j=n;j>i;j--)
                    System.out.print(" ");
                for(int k=0;k<2*i-1;k++)
                    System.out.print("*");
                System.out.println();
            }


 }
 
}
