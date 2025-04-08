import java.util.Scanner;

 public class Add_Two_Dimensional_Array {
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
       for (int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               arr3[i][j] = arr1[i][j]+arr2[i][j];
           }
       }
       System.out.println("Sum of both arrays is :");
       for (int i=0;i<n;i++){
           for(int j=0;j<m;j++){
               System.out.print(arr3[i][j]);
               System.out.print(" ");
           }
           System.out.println("");
       }

    }
}
