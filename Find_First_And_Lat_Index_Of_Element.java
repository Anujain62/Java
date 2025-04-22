// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
// If target is not found in the array, return [-1, -1]

import java.util.Scanner;

public class Find_First_And_Lat_Index_Of_Element {
 
 public static int[] searchRange(int[] nums, int target) {
  int[] ans={-1,-1};
  int size=nums.length;
  for(int i=0;i<size;i++){
      if(nums[i]==target && ans[0]<0)
        ans[0]=i;
      else if(nums[i]==target)
         ans[1]=i;
  }
  return ans;
}
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size of array:");
  int size=sc.nextInt();
  int[] arr=new int[size];
  System.out.println("Enter elements of array:");
  for(int i=0;i<size;i++)
     arr[i]=sc.nextInt();
  System.out.println("Enter targeted element:");
  int target=sc.nextInt();
  int[] ans=searchRange(arr, target);
  System.out.println("First and last index of targeted element:");
  for(int ele:ans)
    System.out.print(ele+" ");
 }
}
