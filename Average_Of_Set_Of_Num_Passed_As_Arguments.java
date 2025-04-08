import java.util.Scanner;

public class Average_Of_Set_Of_Num_Passed_As_Arguments {
    static int average(int []arr){
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++)
            sum+=arr[i];
        return  sum/n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of set :");
        int n=sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter set of elements :");
        for (int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println("Average of all elements is "+average(arr));
    }
}
