import java.util.Scanner;

public class Factorial_Of_Num_Using_Method {


 public static int fact(int n){
  int ans=1;
  while (n>0) {
   ans*=n;
   n--;
  }
  return ans;
 }

 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number:");
  int n=sc.nextInt();
  int ans=fact(n);
  System.out.println("Factorial of "+n+" is "+ans);
 }
}
