import java.util.Scanner;

public class Check_Give_Array_Square_Matrix_Or_Not {
 public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
  System.out.println("Enter number of rows:");
  int row=sc.nextInt();
  System.out.println("Enter number of columns:");
  int column=sc.nextInt();
  int[][] arr=new int[row][column];
  System.out.println("Enter elements of array:");
  for(int i=0;i<row;i++){
   for(int j=0;j<column;j++){
    arr[i][j]=sc.nextInt();
   }
  }

  int row1=arr.length;
  int column1=0;
  for(int i=0;i<row;i++){
   column1+=arr[i].length;
  }
  if((row1*row1)==column1)
    System.out.println("It's square matrix");
  else 
    System.out.println("It's not square matrix");

 }
}
