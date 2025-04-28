import java.util.Scanner;

public class Find_HCF {


 public static void hcf(int num1,int num2){
  int x=num1>num2?num2:num1;
  while (num1%x!=0 || num2%x!=0) {
   x--;
  }
  System.out.println("HCF of "+num1+" and "+num2+" is "+x);
 }
 public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
  System.out.println("Enter first number:");
  int num1=sc.nextInt();
  System.out.println("Enter second number:");
  int num2=sc.nextInt();
  hcf(num1,num2);
 }
}
