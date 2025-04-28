import java.util.Scanner;

public class Product_Of_N_Natural_Num {

 public static void product(int n){
  int pro=1;
  while (n>0) {
   pro*=n;
   n--;
  }
  System.out.println("Product :"+pro);
 }
 public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number:");
  int n=sc.nextInt();
  product(n);
 }
}
