import java.util.Scanner;

public class Find_Max_In_2D_Array {
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

  int max=0;
  for(int i=0;i<row;i++){
   for(int j=0;j<column;j++){
    if(arr[i][j]>max)
       max=arr[i][j];
   }
  }
  System.out.println("Maximum :"+max);

 }
}
