import java.util.Scanner;

public class Set_Matrix_Zeros {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter row of matrix:");
  int row=sc.nextInt();
  System.out.println("Enter column of matrix:");
  int column=sc.nextInt();
  int[][] mat=new int[row][column];
  System.out.println("Enter elements of matrix:");
  for(int i=0;i<row;i++){
   for(int j=0;j<column;j++){
    mat[i][j]=sc.nextInt();
   }
  }

  System.out.println("Original matrix:");
  for(int i=0;i<row;i++){
   for(int j=0;j<column;j++){
    System.out.print(mat[i][j]+" ");
   }
   System.out.println();
  }


  // for(int i=0;i<row;i++){
  //  boolean flag=false;
  //  for(int j=0;j<column;j++){
  //   if(mat[i][j]==0){
  //    for(int k=0;k<column;k++){
  //     mat[i][k]=0;
  //    }
  //    for(int k=0;k<row;k++){
  //     mat[k][i]=0;
  //    }
  //     flag=true;
  //     break;
  //   }
  //  }
  //  if(flag==true)
  //    break;
  // }

  int[] in=new int[row*column];
  int x=0;
  for(int i=0;i<row;i++){
   for(int j=0;j<column;j++){
    if(mat[i][j]==0){
     in[ x++]=i;
     in[ x++]=j;
    }
   }
  }

  int a=0;
  while (a<x) {
    for(int j=0;j<row;j++)
       mat[j][in[a+1]]=0;
    for(int j=0;j<column;j++)
       mat[in[a]][j]=0;
   a+=2;
  }
  

  System.out.println("New Matrix :");
  for(int i=0;i<row;i++){
   for(int j=0;j<column;j++){
    System.out.print(mat[i][j]+" ");
   }
   System.out.println();
  }

 }
}
