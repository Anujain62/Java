import java.util.Scanner;

public class Check_Given_Num_Palindrome_Or_Not {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number:");
  int n=sc.nextInt();
  int original=n;
  int res=0;
  while(n>0){
   int rem=n%10;
   res = res*10+rem;
   n/=10;
  }
  if(original==res)
    System.out.println("number is palindrome");
  else
    System.out.println("number is not palindrome");
 } 
}
