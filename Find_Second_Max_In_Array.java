import java.util.Scanner;

public class Find_Second_Max_In_Array {
 public static void main(String[] args) {

  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size of array :");
  int size=sc.nextInt();

  int[] arr = new int[size];
  System.out.println("Enter elements of array:");
  for(int i=0;i<size;i++)
   arr[i]=sc.nextInt();

  int max=0;
  int smax=-1;
  
  for(int i=0;i<size;i++){
   if(max<arr[i] && smax<max){
    smax=max;
    max=arr[i];
   }
   else{
    smax = arr[i];
   }
  }
  System.out.println("second maximum :"+smax);
 }
}
