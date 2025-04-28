import java.util.Scanner;

public class Sum_Of_N_Natural_Num {
 public static void sum(int n){
  int sum=0;
  while (n>0) {
   sum+=n;
   n--;
  }
  System.out.println("Sum :"+sum);
 }
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number:");
  int n=sc.nextInt();
  sum(n);
 }
}
