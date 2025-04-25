import java.util.Scanner;

public class Find_Smaller_Element_In_Array_Using_Method {
 static int min(int[] arr){
  int size=arr.length;
  int min=arr[0];
  for(int i=1;i<size;i++)
    if(min>arr[i])
      min=arr[i];
  return min;
 }
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter size of array:");
  int size=sc.nextInt();
  int[] arr=new int[size];
  System.out.println("Enter elements of array:");
  for(int i=0;i<size;i++)
     arr[i]=sc.nextInt();
  int min=min(arr);
  System.out.println("minimum :"+min);

 }
}
