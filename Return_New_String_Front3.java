// Given a string, we'll say that the front is the first 3 chars of the string. 
// If the string length is less than 3, the front is whatever is there. Return a new string which is 3 copies of the front.

import java.util.Scanner;

public class Return_New_String_Front3 {

 static String front3(String str){
  int n=str.length();
  String x;
  if(n<1) 
    return str;
  if(n==1)
     x = str.substring(0,1);
  else if(n==2)
     x = str.substring(0,2) ;
  else
     x = str.substring(0,3);
  String y= x+x;
  y=y+x;
  return y;
 }
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a string:");
  String str=sc.next();
  System.out.println("String :"+front3(str));
 }
}
