import java.util.Scanner;

public class Check_Num_Is_Magic_Num_Or_Not {
 public static boolean isMagic(int num){
  while (num>9) {
   int x=0;
    while (num>0) {
     x+=num%10;
     num/=10;
    }
   num=x;
  }
  if(num==1)
     return true;
  else
     return false;
 }

 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number:");
  int num=sc.nextInt();
  
  boolean x=isMagic(num);
  if(x==true)
     System.out.println("Number "+num+" is magic number");
  else 
     System.out.println("Number "+num+" is not magic number");
 }
}
