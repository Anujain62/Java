import java.util.Scanner;

public class Sort_The_2D_Array_Rowwise {
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

  System.out.println("Original array");
  for(int i=0;i<row;i++){
   for(int j=0;j<column;j++){
    System.out.print(arr[i][j]+" ");
   }
   System.out.println();
  }

  for(int i=0;i<row;i++){
   for(int j=0;j<column;j++){
    for(int k=j+1;k<column;k++){
     if(arr[i][j]>arr[i][k]){
      int temp=arr[i][j];
      arr[i][j]=arr[i][k];
      arr[i][k]=temp;
     }
    }
   }
  }

  System.out.println("After sorting array");
  for(int i=0;i<row;i++){
   for(int j=0;j<column;j++){
    System.out.print(arr[i][j]+" ");
   }
   System.out.println();
  }

 }
}
