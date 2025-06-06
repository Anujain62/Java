import java.util.List;
import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {

        // method 1 for array declaration
//        int [] arr1=new int[10];


        //method 2 for array declaration
//        Scanner sc = new Scanner(System.in);
//        int n;
//        System.out.println("enter size of array :");
//        n=sc.nextInt();
//        int []arr2 = new int[n];


         //method 3 for array declaration
//        int [] marks1;
//        marks1 = new int[10];  //memory allocation


//        //method 4 for array declaration
        // int [] marks2 = {10,40,60,20};
        // System.out.println(marks2.length);




        // print an array 
        // int [] arr = {1,2,3,4,5,6};
        // for(int i=0;i<arr.length;i++)
        //    System.out.print(arr[i]+" ");



        // take user input in array
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size=sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array:");
        for(int i=0;i<size;i++)
            arr[i]=sc.nextInt();
        System.out.println("Elements of array :");
        for(int i=0;i<size;i++)
            System.out.print(arr[i]+" ");

    }

    public static List<Integer> asList(int i, int j, int k, int l, int m) {
     // TODO Auto-generated method stub
     throw new UnsupportedOperationException("Unimplemented method 'asList'");
    }
}
