import java.util.Scanner;

public class Sum_Of_All_Digits_Of_Num {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number:");
  int n=sc.nextInt();
  int sum=0;
  while(n>0){
   int rem=n%10;
   sum+=rem;
   n/=10;
  }
  System.out.println("Sum of all digits :"+sum);
 }
}
