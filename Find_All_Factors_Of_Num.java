import java.util.Scanner;

public class Find_All_Factors_Of_Num {

 public static void factors(int num){
  System.out.println("Factors of "+num);
  if(num==1){
   System.out.println("Nothing");
   return;
  }
  int x=2;
   while (x<=num) {
    if(num%x==0)
      System.out.println(x+" ");
    x++;
   }
 }
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number:");
  int num=sc.nextInt();
  factors(num);
 }
}
