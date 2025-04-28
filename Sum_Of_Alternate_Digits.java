import java.util.Scanner;

public class Sum_Of_Alternate_Digits {

 public static int sum(int num){
  int x=0;
  int sum=0;
  while (num>0) {
   int rem=num%10;
   if(x%2==0){
    sum+=rem;
    x++;
   }
   else
     x++;
   num/=10;
  }
  return sum;
 }

 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number:");
  int num=sc.nextInt();
  int sum=sum(num);
  System.out.println("sum of alternate digits of number "+num+" is "+sum);
 }
}
