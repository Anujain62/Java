// Given a string, return a new string where the last 3 chars are now in upper case. If the string has less than 3 chars, 
// uppercase whatever is there. Note that str.toUpperCase() returns the uppercase version of a string.
// endUp("Hello") → "HeLLO"
// endUp("hi there") → "hi thERE"
// endUp("hi") → "HI"

import java.util.Scanner;

public class EndUp {

 public static String endUp(String str) {
  int n=str.length();
  if(n<4){
    String x= str.toUpperCase();
    return x;
  }
  else{
    String x=str.substring(n-3,n);
    String y=x.toUpperCase();
    String z=str.substring(0,n-3);
    String s=z+y;
    return s;
  }
}
 public static void main(String[] args) {
  
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a string:");
  String str=sc.next();
  System.out.println(endUp(str));

 }
}
