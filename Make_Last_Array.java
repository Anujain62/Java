// Given an int array, return a new array with double the length where its last element is the same as the original array, 
// and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
// makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
// makeLast([1, 2]) → [0, 0, 0, 2]
// makeLast([3]) → [0, 3]

import java.util.Scanner;

public class Make_Last_Array {
 public static int[] makeLast(int[] nums) {
  int n=nums.length;
  int x=n*2;
  int[] arr=new int[x];
  for(int i=0;i<x-1;i++)
     arr[i]=0;
  arr[x-1]=nums[n-1];
  return arr;
}
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size of array:");
  int size=sc.nextInt();
  int[] arr=new int[size];
  System.out.println("Enter elements of array:");
  for(int i=0;i<size;i++){
   arr[i]=sc.nextInt();
  }
  System.out.println("Original array:");
  for(int i=0;i<size;i++)
    System.out.print(arr[i]+" ");
  int[] a = makeLast(arr);
  System.out.println("\nAfter creation new array:");
  for(int ele:a)
    System.out.print(ele+" ");
 }
}
