import java.util.Scanner;

public class Conver_2D_To_1D_Array {
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

  int[] newArr=new int[row*column];
  int i=0;
  for(int x=0;x<row;x++){
   for(int j=0;j<column;j++){
    newArr[i]=arr[x][j];
    i++;
   }
  }

  System.out.println("new array:");
  for(int x=0;x<i;x++)
     System.out.println(newArr[x]+" ");






     // length of 2D array  

     // int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
     // int n=arr.length;
     // int sum=0;
     // for(int i=0;i<n;i++){
     //  sum+=arr[i].length;
     // }
     // System.out.println(sum);


 }
}
