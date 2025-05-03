// WAP that prints "haha" during arithmetic exception and "hehe" during an illegal argument exception

// import java.util.Scanner;

// public class Practice_Errors_Exceptions {
//  public static void main(String[] args) {
//   Scanner sc=new Scanner(System.in);
//   System.out.println("Enter value of a:");
//   int a=sc.nextInt();
//   System.out.println("Enter value of b:");
//   int b=sc.nextInt();

//   int c;
//   try{
//    c=a/b;
//    System.out.println("division :"+c);
//   }
//   catch(ArithmeticException e){
//    System.out.println(e);
//    System.out.println("Haha");
//   }
//   catch(IllegalArgumentException e){
//    System.out.println(e);
//    System.out.println("Hehe");
//   }
//  }
// }





// WAP that allows you to keep accessing an array until a valid index is given. if max retries exceed 5 print "error"

// import java.util.Scanner;

// public class Practice_Errors_Exceptions {

//  public static void main(String[] args) {
//   Scanner sc=new Scanner(System.in);
//   System.out.println("Enter size of array:");
//   int size=sc.nextInt();
//   int[] arr=new int[size];
//   System.out.println("Enter elements of array:");
//   for(int i=0;i<size;i++){
//    arr[i]=sc.nextInt();
//   }

//   int i=0;
//   boolean flag=true;
//   while (flag && i<5) {

//    System.out.println("Enter index for element accessing:");
//    int idx=sc.nextInt();
//    try{
//     int x=arr[idx];
//     System.out.println("element at index "+idx+" is "+x);
//     flag=false;
//    }
//    catch(Exception e){
//     i++;
//     System.out.println("Error ->");
//     System.out.println(e);
//    }

//   }
//   if(i>=5)
//     System.out.println("Error");
  
//  }
// }





