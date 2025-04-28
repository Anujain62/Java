import java.util.Scanner;

public class Find_LCM {

 public static void lcm(int num1,int num2){
  int x=num1>num2?num1:num2;
  while (x%num1!=0 || x%num2!=0) {
   x++;
  }
  System.out.println("LCM of "+num1+" and "+num2+" is "+x);
 }
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter first number:");
  int num1=sc.nextInt();
  System.out.println("Enter second number:");
  int num2=sc.nextInt();
  lcm(num1,num2);
 }
}
