// whose number is devisiable by 7 or ends with 7 is called buzz number


import java.util.Scanner;

public class Check_Num_Is_Buzz_Num_Or_Not {

 public static boolean isBuzz(int num){
  if(num%7==0 || num%10==7)
    return true;
  return false;
 }

 public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number:");
  int num=sc.nextInt();
  
  boolean x=isBuzz(num);
  if(x==true)
     System.out.println("Number "+num+" is buzz number");
  else 
     System.out.println("Number "+num+" is not buzz number");
 }
}
