import java.util.Scanner;

public class Sum_OF_All_Factors_Of_Num {

 public static void sum(int num){
  int ans=0;
  if(num==1){
   System.out.println("Nothing");
   return;
  }
  int x=2;
   while (x<=num) {
    if(num%x==0)
      ans+=x;
    x++;
   }
   System.out.println("Sum of all factors is "+ans);
 }
 public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number:");
  int num=sc.nextInt();
  sum(num);
 }
}
