import java.util.Scanner;

public class Find_Even_Num_In_Given_Range {

 public static void even(int start,int end){

  int i;
  while (start<=end) {

   int x=start;
   for(i=2;i<x;i++){
    if(x%i==0)
      break;
   } 

   if(x==i || x==1 || x==2)
     System.out.println(x+" ");
   start++;  

  }

 }

 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter starting point:");
  int start=sc.nextInt();
  System.out.println("Enter ending point:");
  int end=sc.nextInt();
  even(start, end);
 }

}
