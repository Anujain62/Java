// Given two strings, a and b, return the result of putting them together in the order abba, e.g. "Hi" and "Bye" returns "HiByeByeHi".
// makeAbba("Hi", "Bye") → "HiByeByeHi"
// makeAbba("Yo", "Alice") → "YoAliceAliceYo"
// makeAbba("What", "Up") → "WhatUpUpWhat"

import java.util.Scanner;

public class Make_Abba_String {

 public static String makeAbba(String a, String b) {
  String ans=a+b+b+a;
  return ans;
}


 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter first string:");
  String str1=sc.next();
  System.out.println("Enter second string:");
  String str2=sc.next();
  System.out.println(makeAbba(str1, str2));
 }
}
