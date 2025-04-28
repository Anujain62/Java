import java.util.Scanner;

public class Extract_And_Print_All_Digits {

 public static void display(int n){
  while (n>0) {
   int temp=n%10;
   System.out.println(temp);
   n/=10;
  }
 }
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number:");
  int n=sc.nextInt();
  display(n);
 }
}
