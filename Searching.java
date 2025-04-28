import java.util.Scanner;

public class Searching {

 public static int linearSearch(int[] arr,int target){
  for(int i=0;i<arr.length;i++){
   if(target==arr[i])
     return i;
  }
  return -1;
 }

 public static int binarySearch(int[] arr,int target){
  int left=0;
  int right=arr.length-1;
  while (left<=right) {
   int mid=(left+right)/2;
   if(target==arr[mid])
     return mid;
   else if(target<arr[mid])
      right=mid-1;
   else
      left=mid+1;
  }
  return -1;
 }

 public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
  System.out.println("Enter size of array :");
  int size=sc.nextInt();
  int[] arr = new int[size];
  System.out.println("Enter elements of array:");
  for(int i=0;i<size;i++){
   arr[i]=sc.nextInt();
  }
  System.out.println("Enter your target:");
  int target=sc.nextInt();
  
 // int index=linearSearch(arr,target);

 int index = binarySearch(arr, target);

  System.out.println("Targeted element "+target+" find at index "+index);

 }
}
