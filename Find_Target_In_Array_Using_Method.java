import java.util.Scanner;

public class Find_Target_In_Array_Using_Method {

 static int find(int[] arr,int target){
  int size=arr.length;
  for(int i=0;i<size;i++)
    if(arr[i]==target)
       return i;
  return -1;
 }
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size of array:");
  int size=sc.nextInt();
  int[] arr=new int[size];
  System.out.println("Enter elements of array:");
  for(int i=0;i<size;i++)
     arr[i]=sc.nextInt();
  System.out.println("Enter target element:");
  int target=sc.nextInt();
  int find=find(arr, target);
  if(find>=0)
     System.out.println("tergeted element finds at index "+find);
  else 
     System.out.println("targeted element does not find");
 }
}
