import java.util.Scanner;

public class Sorting {
 public static void BubbleSort(int[] arr){
  for(int i=0;i<arr.length;i++){
   for(int j=0;j<arr.length-1-i;j++){
    if(arr[j]>arr[j+1]){
     int temp=arr[j];
     arr[j]=arr[j+1];
     arr[j+1]=temp;
    }
   }
  }
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
  
  BubbleSort(arr);
  System.out.println("After sorting :");
  for(int i:arr)
    System.out.println(i);
 }

}
