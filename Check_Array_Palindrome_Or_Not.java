import java.util.Scanner;

public class Check_Array_Palindrome_Or_Not {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
        System.out.println("ENter size of array :");
        int size=sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array:");
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        int i=0;
        int j=size-1;
        while (i<j) {
         if(arr[i]!=arr[j])
            break;
         i++;
         j--;
        }
        if(i==j)
            System.out.println("Array is palindrome");
        else
            System.out.println("Array is not palindrome");
 }
}
