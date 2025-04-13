import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {

        // 8
        // 88
        // 888
//         int a=8;
//        for(int i=0;i<3;i++){
//            for(int j=0;j<=i;j++)
//                System.out.print(a);
//            System.out.println("");
//        }


    //    *
    //    **
    //    ***
    //    ****
    //    Scanner sc=new Scanner(System.in);
    //    System.out.println("Enter number of lines :");
    //    int n=sc.nextInt();
    //    for(int i=0;i<n;i++){
    //        for(int j=0;j<=i;j++)
    //            System.out.print("* ");
    //        System.out.println("");
    //    }



    //    ****
    //    ***
    //    **
    //    *
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of lines :");
        int n=sc.nextInt();
        for (int i=0;i<n;i++){
            for (int j=n;j>i;j--)
                System.out.print("* ");
            System.out.println("");
        }










    }
    
}
