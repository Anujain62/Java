import java.util.Scanner;

public class Find_Prime_Num_In_Array {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size of array:");
  int size=sc.nextInt();
  int[] arr = new int[size];

  System.out.println("Enter elements of array:");
  for(int i=0;i<size;i++)
   arr[i]=sc.nextInt();
  int count;

  System.out.println("Prime numbers in array:");
  for(int i=0;i<size;i++){
   count=0;
   for(int j=2;j<=10;j++){
    if(arr[i]%j==0)
      count++;
   }
   if(count<2)
     System.out.println(arr[i]);
  }
 }
}
