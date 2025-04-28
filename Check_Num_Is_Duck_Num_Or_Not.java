// who is contains zero but the number itself does not zero

import java.util.Scanner;

public class Check_Num_Is_Duck_Num_Or_Not {

 public static boolean isDuck(int num){
  int org=num;
  while(num>0){
   int rem=num%10;
   if(rem==0 && org!=0)
      return true;
   num/=10;
  }
  return false;
 }
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number:");
  int num=sc.nextInt();
  boolean x= isDuck(num);

  if(x==true)
    System.out.println("Number "+num+" is duck number");
  else
    System.out.println("Number "+num+" is not duck number");
 }
}
