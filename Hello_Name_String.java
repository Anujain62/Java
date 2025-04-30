// Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
// helloName("Bob") → "Hello Bob!"
// helloName("Alice") → "Hello Alice!"
// helloName("X") → "Hello X!"

import java.util.Scanner;

public class Hello_Name_String {
 public static String helloName(String name) {
  String ans="Hello "+name+"!";
  return ans;
}
public static void main(String[] args) {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter your name:");
 String str=sc.next();
 System.out.println(helloName(str));
}
 
}
