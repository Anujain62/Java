import java.util.Scanner;

public class Rotation_Of_2D_Array {
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

  
  for(int i=0;i<row;i++){
   for(int k=0;k<column;k++){
       int temp=arr[i][k];
       arr[i][k]=arr[k][i];
       arr[k][i]=temp;
      }
  }
  for(int i=0;i<row;i++){
   int left=0;
   int right=column-1;
   while(left<right){
    int temp=arr[i][left];
    arr[i][left]=arr[i][right];
    arr[i][right]=temp;
    left++;
    right--;
   }
  }
  System.out.println("270 degree rotated array :");
  for(int i=0;i<row;i++){
   for(int j=0;j<column;j++){
    System.out.print(arr[i][j]+" ");
   }
   System.out.println("");
  }

  

 }
}
