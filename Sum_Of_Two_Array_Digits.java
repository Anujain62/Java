import java.util.Scanner;

public class Sum_Of_Two_Array_Digits {

 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size of array:");
  int size=sc.nextInt();
  int [] arr1=new int[size];
  System.out.println("Enter elemnets of first array:");
  for(int i=0;i<size;i++){
   arr1[i]=sc.nextInt();
  }
  int [] arr2=new int[size];
  System.out.println("Enter elemnets of second array:");
  for(int i=0;i<size;i++){
   arr2[i]=sc.nextInt();
  }
  
  int sum=0;
  for(int i=0;i<size;i++)
     sum+=arr1[i];
  for(int i=0;i<size;i++)
     sum+=arr2[i];
  System.out.println("Sum of both array elements:"+sum);
 }
}