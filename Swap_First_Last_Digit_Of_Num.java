import java.util.Scanner;

public class Swap_First_Last_Digit_Of_Num {

 public static int swap(int num){
   String str=Integer.toString(num);
   int size=str.length();
   int x=1;
   while (size>1) {
       x*=10;
       size--;
   }
   int last=num%10;
   int first=num/x;
   int diff=last-first;
   if(diff<0)
     diff=-diff;
   if(last>first){
       int y = diff*x;
       num+=y;
       num-=diff;
   }
   else{
       int y = diff*x;
       num-=y;
       num+=diff;
   }
   return num;
 }

 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number:");
  int num=sc.nextInt();

  int x=swap(num);
  System.out.println("After swapping first and last digit :"+x);
 }
}









// int org=num;
  // int count=0;
  // while (num>0) {
  //  count++;
  //  num/=10;
  // }
  // num=org;
  // int x=1;
  // int tempCount=count;
  // while (count>1) {
  //  x*=10;
  //  count--;
  // }
  // count=tempCount;
  // int first=num/x;
  // int last=num%10;
  // int temp=num/10;
  // x/=10;
  // temp%=x;
  // int finalAns=last;
  // x/=10;
  // while (x>0) {
  //  finalAns = finalAns*10 + temp/x;
  //  temp%=x;
  //  x/=10;
  // }
  // finalAns*=10+temp;
  // finalAns*=10+first;
  // System.out.println("After swapping :"+finalAns);
  // // return finalAns;