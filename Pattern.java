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
    // Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter number of lines :");
    //     int n=sc.nextInt();
    //     for (int i=0;i<n;i++){
    //         for (int j=n;j>i;j--)
    //             System.out.print("* ");
    //         System.out.println("");
    //     }




        // *****
        //  ****
        //   ***
        //    ** 
        //     *
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter number of lines :");
        // int n=sc.nextInt();
        // for(int i=0;i<n;i++){
        //     for(int j=0;j<=i;j++)
        //        System.out.print(" ");
        //     for(int k=i;k<n;k++)
        //         System.out.print("*");
        //     System.out.println();
        // }




        // *****
        // **** 
        // ***
        // ** 
        // *
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter number of lines :");
        // int n=sc.nextInt();
        // for(int i=0;i<n;i++){
        //     for(int j=n;j>i;j--)
        //       System.out.print("*");
        //     System.out.println();
        // }




            // ***** 
            //  *** 
            //   *
            // Scanner sc=new Scanner(System.in);
            // System.out.println("Enter number of lines :");
            // int n=sc.nextInt();
            // int x=2*n-1;
            // for(int i=1;i<=n;i++){
            //     for(int k=1;k<i;k++)
            //         System.out.print(" ");
            //     for(int j=0;j<x;j++)
            //         System.out.print("*");
            //     x-=2;
            //     System.out.println();
            // }




        //      * 
        //     * * 
        //    * * * 
        //   * * * *
        //   Scanner sc=new Scanner(System.in);
        //     System.out.println("Enter number of lines :");
        //     int n=sc.nextInt();
        //     for(int i=1;i<=n;i++){
        //         for(int j=n;j>i;j--)
        //          System.out.print(" ");
        //         for(int k=1;k<=i;k++)
        //           System.out.print("* ");
        //         System.out.println();
        //     }




    //      * 
    //     * *
    //    * * *
    //   * * * *
    //    * * *
    //     * *
    //      *
    //    Scanner sc=new Scanner(System.in);
    //    System.out.println("Enter number of lines :");
    //    int n=sc.nextInt();
    //    for(int i=0;i<n/2+1;i++){
    //             for(int j=n/2;j>i;j--)
    //              System.out.print(" ");
    //             for(int k=0;k<=i;k++)
    //               System.out.print("* ");
    //             System.out.println();
    //    }
    //    for(int i=0;i<n/2;i++){
    //            for(int j=i;j>=0;j--)
    //              System.out.print(" ");
    //             for(int k=n/2;k>i;k--)
    //               System.out.print("* ");
    //             System.out.println();
    //    }


                                

    // A 
    // A B 
    // A B C 
    // A B C D
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of lines :");
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
        int x=65;
               for(int j=0;j<=i;j++){
                System.out.print((char)x+" ");
                x++;
               }
               System.out.println("");
           }










    }


}

