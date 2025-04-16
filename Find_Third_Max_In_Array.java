import java.util.Scanner;

public class Find_Third_Max_In_Array {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array:");
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        int max=1;
        int smax=0;
        int tmax=-1;
        for(int i=0;i<size;i++){
         if(max<arr[i] && smax<max && tmax<smax){
          tmax=smax;
          smax=max;
          max=arr[i];
         }
         else if(max>arr[i] && smax<arr[i] && tmax<smax){
          tmax=smax;
          smax=arr[i];
         }
         else if(tmax<arr[i]){
          tmax=arr[i];
         }
        }
        System.out.println("Third maximum number in array :"+tmax);
 }
}
