import java.util.Scanner;

public class Inverse_Of_2D_Array {
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

  int[][] brr=new int[column][row];
  if(row!=column)
    System.out.println("row does not equal to column");
  else{
   for(int i=0;i<row;i++){
    for(int j=0;j<column;j++){
     if(i!=j)
      brr[i][j]=arr[j][i];
     }
   }
  }

  System.out.println("Original array:");
  for(int i=0;i<row;i++){
   for(int j=0;j<column;j++){
    System.out.print(arr[i][j]+" ");
   }
   System.out.println();
  }

  System.out.println("Inverse array:");
  for(int i=0;i<row;i++){
   for(int j=0;j<column;j++){
    System.out.print(brr[i][j]+" ");
   }
   System.out.println();
  }

 }
}
