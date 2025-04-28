import java.util.Scanner;

public class Check_Num_Harshad_Or_Not {

 public static void harshad(int num){
  int sum=0;
  int org=num;
  while (num>0) {
   int rem=num%10;
   sum+=rem;
   num/=10;
  }
  num=org;
  if(num%sum==0)
    System.out.println("Number "+num+" is harshad");
  else
    System.out.println("Number "+num+" is not harshad");
 }
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number:");
  int num=sc.nextInt();
  harshad(num);
 }
}
