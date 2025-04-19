
// Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
// rotateLeft3([1, 2, 3]) → [2, 3, 1]
// rotateLeft3([5, 11, 9]) → [11, 9, 5]
// rotateLeft3([7, 0, 0]) → [0, 0, 7]

import java.util.Scanner;

public class Array_Rotate_Left {
 public static int[] rotateLeft3(int[] nums) {
  int n=nums.length;
  int x=nums[0];
  for(int i=0;i<n-1;i++)
     nums[i]=nums[i+1];
  nums[n-1]=x;
  return nums;
}
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size of array:");
  int size=sc.nextInt();
  int [] arr=new int[size];
  System.out.println("Enter elements of array :");
  for(int i=0;i<size;i++)
    arr[i]=sc.nextInt();
  System.out.println("Real array:");
  for(int ele:arr)
   System.out.print(ele+" ");

  int [] a=rotateLeft3(arr);
  System.out.println("\nAfter rotation array:");
  for(int ele:a)
    System.out.print(ele+" ");
 }
}
