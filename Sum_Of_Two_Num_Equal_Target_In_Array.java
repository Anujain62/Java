import java.util.Scanner;

public class Sum_Of_Two_Num_Equal_Target_In_Array {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
        System.out.println("ENter size of array :");
        int size=sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array:");
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        System.out.println("Enter target element :");
        int target=sc.nextInt();
        int x=0;
        int y=0;
        boolean flag=false;
        for(int i=0;i<size;i++){
         for(int j=i+1;j<size;j++){
          if(target==(arr[i]+arr[j])){
           x=i;
           y=j;
           flag=true;
           break;
          }
         }
         if(flag==true)
             break;
        }
        if(flag==true){
         System.out.println("Target number present in index "+x+" and "+y);
        }
        else
          System.out.println("Target number does not exist");
 }
}
