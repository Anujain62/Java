import java.util.Scanner;

public class Reverse_An_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter size of the array : ");
        size = sc.nextInt();
        int []arr = new int[size];
        System.out.println("Enter elements of the array  : ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Original array is :");
       for(int i=0;i<size;i++){
           System.out.print(arr[i]);
           System.out.print(" ");
       }
        System.out.println("");

       // Method 1
//       int x;
//       int i=0,j=size-1;
//       while (i<=j){
//           x=arr[i];
//           arr[i]=arr[j];
//           arr[j]=x;
//           i++;
//           j--;
//       }



        //Method 2
       int l=size;
       int n=l/2;
       int temp;
       for (int i=0;i<n;i++){
           temp = arr[i];
           arr[i] =  arr[l-i-1];
           arr[l-i-1]=temp;
       }

        System.out.println("Reverse array is : ");
        for(int k=0;k<size;k++){
            System.out.print(arr[k]);
            System.out.print(" ");
        }
    }
}
