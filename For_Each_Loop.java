import java.util.Scanner;

public class For_Each_Loop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("Enter size of array :");
        n=sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter element of array :");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //for each loop
        System.out.println("Elements of array :");
        for (int element:arr)
            System.out.println(element);
    }
}
