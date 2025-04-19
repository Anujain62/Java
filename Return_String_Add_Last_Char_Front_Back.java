// Given a string, take the last char and return a new string with the last char added at the front and back, so "cat" yields "tcatt". 
// The original string will be length 1 or more.

import java.util.Scanner;

public class Return_String_Add_Last_Char_Front_Back {

 static String fun(String str){
  int n=str.length();
  String s=str.substring(n-1);
  String x=s+str+s;
  return x;
 }
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a string:");
  String str=sc.next();
  System.out.println("String :"+fun(str));
 }
}
