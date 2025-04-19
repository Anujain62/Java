import java.util.Scanner;

public class Min_In_2D_Array {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number of rows:");
  int row=sc.nextInt();
  System.out.println("Enter number of column:");
  int column=sc.nextInt();

  int[][] arr = new int[row][column];
  System.out.println("Enter elements of array:");
  for(int i=0;i<row;i++){
   for(int j=0;j<column;j++){
    arr[i][j]=sc.nextInt();
   }
  }

  int min=arr[0][0];
  for(int i=0;i<row;i++){
   for(int j=0;j<column;j++){
    if(min>arr[i][j])
       min = arr[i][j];
   }
  }

  System.out.println("minimum :"+min);

 }
}
