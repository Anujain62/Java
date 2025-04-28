import java.util.Scanner;

public class Print_N_Natural_Num_Reverse_Order {

 public static void printReverse(int n){
  while (n>0) {
   System.out.println(n+" ");
   n--;
  }
 }
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number:");
  int n=sc.nextInt();
  printReverse(n);
 }
}
