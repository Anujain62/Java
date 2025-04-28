import java.util.Scanner;

public class Print_All_Perfect_Num_In_Range {

 public static void perfect(int start,int end){
  System.out.println("Perfect numbers:");

  while (start<=end) {
   int x=start;
   int sum=0;
   for(int i=2;i<start;i++)
     if(x%i==0)
       sum+=i;
   if(sum==x)
     System.out.print(x+" ");
   start++;
  }
 }
 public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
  System.out.println("Enter starting point:");
  int start=sc.nextInt();
  System.out.println("Enter ending point:");
  int end=sc.nextInt();
  perfect(start,end);
 }
}
