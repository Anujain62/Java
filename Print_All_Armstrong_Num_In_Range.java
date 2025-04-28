import java.util.Scanner;

public class Print_All_Armstrong_Num_In_Range {

 public static void armstrong(int start,int end){

  System.out.println("Armstrong numbers:");

  while (start<=end) {
   int x=start;
   int sum=0;
   while (x>0) {
    int rem = x%10;
    sum+=(rem*rem*rem);
    x/=10;
   }
   if(sum==start)
     System.out.print(sum+" ");
   start++;
  }

 }
 public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
  System.out.println("Enter starting point:");
  int start=sc.nextInt();
  System.out.println("Enter ending point:");
  int end=sc.nextInt();
  armstrong(start,end);
 }
}
