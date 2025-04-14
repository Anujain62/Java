import java.util.Scanner;

public class Methods_Practice {
     
 // Write a program(WAP) to create a method that prints "Java is fun"
 public static void sayJava(){
  System.out.println("Java is fun");
  }

  // create a method and print your favorite programming language
  public static void sayFavLang(){
  System.out.println("Python");
  }

 // write a method that print your names three times using only method calls
 public static void sayName(int n){
  if(n>0){
   System.out.println("Anu");
   sayName(n-1);
  }
 }

 //design a method that prints your first and last name in two separate lines 
 public static void sayFullName(){
  System.out.println("Anu \n jain");
 }

 // create a method that takes a string as input and prints that string
 public static void sayAnyString(){
  System.out.println("Enter any string:");
  Scanner sc=new Scanner(System.in);
  String str=sc.nextLine();
  System.out.println("Your string :"+str);
 }

 // WAP to create a method that takes two numbers and prints their difference
 public static void sayDifference(){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter value of a :");
  int a=sc.nextInt();
  System.out.println("Enter value of b :");
  int b=sc.nextInt();
  System.out.println("difference of "+a+" and "+b+" is "+(a-b));
 }

 // define a method that accepts a decimal value and prints it
 public static void sayDecimalValue(){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter value of a :");
  float a=sc.nextFloat();
  System.out.println("a :"+a);
 }

 // write a method that receives a string and returns the same string with "Welcome" added before it
 public static String sayWelcome(String name){
  String str="Welcome ";
  str=str + name;
  return str;
 }

 // create a non static method that prints "This is non-static method"
 public void sayNonStatic(){
  System.out.println("this is non static method!");
 }

 // define a non static method that takes two decimal values and prints their sum
 public void sayAddition(){
  Scanner sc=new Scanner(System.in);
  float a=sc.nextFloat();
  float b=sc.nextFloat();
  System.out.println("sum of "+a+" and "+b+" is "+(a+b));
 }

 // create a class names "operations" with a method that takes two integers and retures their aerage as a decimal value
 public double sayAverage(int a,int b){
  return (a+b)/2.0;
 }

 public static void main(String[] args) {
  // sayJava();
 
  // sayFavLang();
  
  // sayName(3);

  // sayFullName();

  // sayAnyString();

  // sayDifference();

  // sayDecimalValue();

  // Scanner sc=new Scanner(System.in);
  // System.out.println("Enter name :");
  // String name=sc.nextLine();
  // System.out.println(sayWelcome(name));

  // Methods_Practice m=new Methods_Practice();
  // m.sayNonStatic();

  // Methods_Practice m=new Methods_Practice();
  // m.sayAddition();

  Scanner sc=new Scanner(System.in);
  System.out.println("Enter value of a :");
  int a=sc.nextInt();
  System.out.println("Enter value of b :");
  int b=sc.nextInt();
  Methods_Practice m=new Methods_Practice();
  System.out.println(m.sayAverage(a, b));
  }
}
