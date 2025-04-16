import java.util.Scanner;

public class Find_Num_Of_Even_And_Odd_In_Array {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array:");
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        int even=0;
        int odd=0;
        for(int i=0;i<size;i++){
         if(arr[i]%2==0)
             even++;
         else
             odd++;
        }
        System.out.println("Number of even numbers :"+even);
        System.out.println("Number of odd numbers :"+odd);
 }
}
