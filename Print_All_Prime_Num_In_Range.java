import java.util.Scanner;

public class Print_All_Prime_Num_In_Range {

 public static void prime(int start,int end){
  int i;
  System.out.println("Prime numbers:");
  while (start<=end) {
   int x=start;
   for(i=2;i<=x/2;i++)
     if(x%i==0)
       break;
   if(i==(x/2+1))   
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
  prime(start,end);
 }
}
