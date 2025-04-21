// Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. 
// If either array is length 0, ignore that array.
// front11([1, 2, 3], [7, 9, 8]) → [1, 7]
// front11([1], [2]) → [1, 2]
// front11([1, 7], []) → [1]

import java.util.Scanner;

public class Return_New_Array_Adding_Elements_Of_Old_Array {

 public static int[] front11(int[] a, int[] b) {
  int x=a.length;
  int y=b.length;
  if(x==0 && y==0){
    int[] arr=new int[0];
    return arr;
  }
  else if(x==0){
    int[] arr=new int[1];
     arr[0]=b[0];
     return arr;
  }
  else if(y==0){
    int[] arr=new int[1];
    arr[0]=a[0];
    return arr;
  }
  else{
    int[] arr=new int[2];
    arr[0]=a[0];
    arr[1]=b[0];
    return arr;
  }
}
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size of first array:");
  int n=sc.nextInt();
  int[] a=new int[n];
  System.out.println("Enter elements of first array:");
  for(int i=0;i<n;i++)
    a[i]=sc.nextInt();
   
    System.out.println("Enter size of second array:");
    int m=sc.nextInt();
    int[] b=new int[m];
    System.out.println("Enter elements of first array:");
    for(int i=0;i<m;i++)
      b[i]=sc.nextInt();
   
  int[] arr=front11(a, b);
  for(int ele:arr)
     System.out.print(ele+" ");
 }
}
