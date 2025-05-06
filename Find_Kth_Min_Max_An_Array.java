import java.util.ArrayList;
import java.util.Scanner;

public class Find_Kth_Min_Max_An_Array {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);

  System.out.println("Enter size of array:");
  int size = sc.nextInt();

  int[] arr=new int[size];
  System.out.println("Enter elements of array:");
  for(int i=0;i<size;i++)
    arr[i]=sc.nextInt();

  System.out.println("Enter number whose max and min finds? ");
  int k=sc.nextInt();
  
  sc.close();

  ArrayList<Integer> maxArr = new ArrayList<>(3);
  ArrayList<Integer> minArr = new ArrayList<>(3);

  int idx=0;
  int max=0;
  int min=arr[idx];

  if(k==1){
   for(int i=0;i<size;i++){
    if(max<arr[i]){
     max=arr[i];
    }
    if(min>arr[i] && arr[i]!=max)
      min=arr[i];
   }
   System.out.println(k+"th max = "+max+"\n"+k+"th min = "+min);
  }

  else{
   while (k>0) {
    min=arr[idx];
    max=0;
    for(int i=0;i<size;i++){
     if(max<arr[i] && !maxArr.contains(arr[i])){
      max=arr[i];
     }
     if(min>arr[i] && arr[i]!=max && !(minArr.contains(arr[i])))
      min=arr[i];
    }
    maxArr.add(max);
    minArr.add(min);
    k--;
    idx++;
   }
   
  //  System.out.println("max array :");
  //  for(int i:maxArr)
  //   System.out.println(i);
  //   System.out.println("min array :");
  //   for(int i:minArr)
  //    System.out.println(i); 

  System.out.println(idx+"th max = "+maxArr.get(idx-1)+"\n"+idx+"th min = "+minArr.get(idx-1));
  }




 }
}
