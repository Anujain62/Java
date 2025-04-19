import java.util.Scanner;

public class Max_In_Two_2D_Array {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter number of rows:");
  int row=sc.nextInt();
  System.out.println("Enter number of column:");
  int column=sc.nextInt();

  int[][] arr1 = new int[row][column];
  System.out.println("Enter elements of first array:");
  for(int i=0;i<row;i++){
   for(int j=0;j<column;j++){
    arr1[i][j]=sc.nextInt();
   }
  }

  int[][] arr2 = new int[row][column];
  System.out.println("Enter elements of second array:");
  for(int i=0;i<row;i++){
   for(int j=0;j<column;j++){
    arr2[i][j]=sc.nextInt();
   }
  }

  int max=0;
  for(int i=0;i<row;i++){
   for(int j=0;j<column;j++){
    if(max<arr1[i][j])
      max=arr1[i][j];
   }
  }

  for(int i=0;i<row;i++){
   for(int j=0;j<column;j++){
    if(max<arr2[i][j])
      max=arr2[i][j];
   }
  }

  System.out.println("Maximum in two 2D array :"+max);

 }
}
