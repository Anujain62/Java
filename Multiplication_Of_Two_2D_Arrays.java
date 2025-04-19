import java.util.Scanner;

public class Multiplication_Of_Two_2D_Arrays {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
       int n,m;
       System.out.println("Enter number of rows : ");
       n=sc.nextInt();
       System.out.println("Enter number of columns :");
       m=sc.nextInt();
       System.out.println("Enter elements of first array :");
       int [][] arr1 = new int[n][m];
       for (int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               arr1[i][j] = sc.nextInt();
           }
       }
       System.out.println("Enter elements of second array :");
       int [][] arr2 = new int[n][m];
       for (int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               arr2[i][j] = sc.nextInt();
           }
       }

       int [][]arr3 = new int[n][m];

       if(n!=m){
        System.out.println("Multiplication does not possible");
        return;
       }
       else{
        for(int i=0;i<n;i++){
         for(int j=0;j<m;j++){
          for(int k=0;k<m;k++){
           arr3[i][j]+=arr1[i][k]*arr2[k][j];
          }
         }
        }
       }

       System.out.println("After multiplication of two 2D array:");
       for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
         System.out.print(arr3[i][j]+" ");
        }
        System.out.println();
       }
 }
}
