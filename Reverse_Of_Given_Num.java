import java.util.Scanner;

public class Reverse_Of_Given_Num {

 public static void reverse(int num){
  int ans=0;
  while (num>0) {
   int rem=num%10;
   ans=ans*10+rem;
   num/=10;
  }
  System.out.println("Reverse number :"+ans);
 }
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number:");
  int num=sc.nextInt();
  reverse(num);
 }
}
