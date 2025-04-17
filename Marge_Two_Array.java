import java.util.Scanner;

public class Marge_Two_Array {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);

  System.out.println("Enter size of first array:");
  int size1=sc.nextInt();

  System.out.println("Enter size of second array:");
  int size2=sc.nextInt();

  int [] arr1=new int[size1];
  System.out.println("Enter elemnets of first array:");
  for(int i=0;i<size1;i++){
   arr1[i]=sc.nextInt();
  }

  int [] arr2=new int[size2];
  System.out.println("Enter elements of second array:");
  for(int i=0;i<size2;i++){
   arr2[i]=sc.nextInt();
  }

  int size3=size1+size2;
  int [] arr3=new int[size3];
  int k=0;
  for(int i=0;i<size1;i++){
   arr3[k]=arr1[i];
   k++;
  }
  for(int i=0;i<size2;i++){
      arr3[k]=arr2[i];
      k++;  
  }   
  System.out.println("After merging both arrays:");
  for(int i=0;i<size3;i++)
     System.out.print(arr3[i]+" ");
 }
}
