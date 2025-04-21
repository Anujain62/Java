import java.util.Scanner;

public class Check_2D_Matrix_Diagonal_Or_Not {
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

  boolean flag=true;
  if(row!=column)
     System.out.println("It's not square matrix");
     
  else{
   for(int i=0;i<row;i++){
    for(int j=0;j<column;j++){
     if((i==j && arr[i][j]==1) || (i!=j && arr[i][j]==0) ){
      continue;
     }
     else{
      flag = false;
      break;
     }
    }
    if(flag==false)
       break;
   } 
  }

  if(flag==false)
     System.out.println("It's not diagonal matrix");
  else 
    System.out.println("It's diagonal matrix");

 }
}
