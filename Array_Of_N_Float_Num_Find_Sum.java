import java.util.Scanner;

public class Array_Of_N_Float_Num_Find_Sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter size of the array :");
        size  =sc.nextInt();
        float []arr = new float[size];
        System.out.println("Enter elements of array :");
        for(int i=0;i<size;i++)
            arr[i]=sc.nextFloat();
        float sum=0.0f;
        for(int i=0;i<size;i++)
            sum+=arr[i];
        System.out.println("Sum of all element of array is "+sum);
    }
}
