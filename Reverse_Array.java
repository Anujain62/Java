import java.util.Scanner;

public class Reverse_Array {
 public static void main(String[] args) {
  System.out.println("Enter size of array:");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array:");
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        int i=0;
        int j=size-1;
        while (i<=j) {
         int temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
         i++;
         j--;
        }
        System.out.println("Reverse array :");
        for(int k=0;k<size;k++)
            System.out.print(arr[k]+" ");
 }
}
