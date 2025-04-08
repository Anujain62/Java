import java.util.Scanner;

public class Maximum_Element_In_An_Array {
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
        int max=0;
        for(int i=0;i<size;i++){
            if(max<arr[i])
                max=arr[i];
        }
        System.out.println("Maximum of array is "+max);
    }
}
