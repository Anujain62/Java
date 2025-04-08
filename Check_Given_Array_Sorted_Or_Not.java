import java.util.Scanner;

public class Check_Given_Array_Sorted_Or_Not {
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
        int i;
        for ( i=0;i<size-1;i++){
            if(arr[i+1]<arr[i])
                break;
        }
        if(i==size-1)
            System.out.println("Array is sorted!");
        else
            System.out.println("Array is not sorted!");
    }
}
