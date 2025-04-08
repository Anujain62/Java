import java.util.Scanner;

public class Find_An_Array_In_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        System.out.println("Enter size of the array :");
        size  =sc.nextInt();
        int []arr = new int[size];
        System.out.println("Enter elements of array :");
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        int x;
        System.out.println("Enter element for finding in array :");
        x=sc.nextInt();
        int i;
        for(i=0;i<size;i++){
            if(arr[i]==x){
                System.out.println("Elemnet "+x+" is find at index "+i);
                break;
            }
        }
        if(i==size){
            System.out.println("Given element "+x+" is not found");
        }
    }
}
