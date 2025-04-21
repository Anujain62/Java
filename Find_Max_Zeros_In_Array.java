// find maximum zeros in a particular row

import java.util.Scanner;

public class Find_Max_Zeros_In_Array {
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

  int count=0;
  int row1=0;
  for(int i=0;i<row;i++){
    int x=0;
   for(int j=0;j<column;j++){
    if(arr[i][j]==0)
      x++;
   }
   if(count<x){
    count=x;
    row1=i;
   }
  }

  System.out.println("Maximum zero : "+count+" at "+row1+"th row");

 }
}
