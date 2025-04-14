import java.util.Scanner;

public class User_Input_Practice {

 // write a method that takes an integer from the user and return it
 public static int sayInt(){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number :");
  int num=sc.nextInt();
  return num;
 } 

 // define a method that receives a floating point number from the user and return it.
 public static float sayFloat(){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number :");
  float num=sc.nextFloat();
  return num;
 }

 // write a method that receives two decimal numbers from the user and return their difference
 public static float sayDifference(){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter first number :");
  float num1=sc.nextFloat();
  System.out.println("Enter second number :");
  float num2=sc.nextFloat();
  float diff=num1-num2;
  return diff;
 }

 // create a method that accepts an integer from the user and return its square
 public static int saySquare(){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number :");
  int num=sc.nextInt();
  return num*num;
 } 

 // write a method that receives two numbers from the user and prints their average
 public static float sayAverage(){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter first number :");
  int num1=sc.nextInt();
  System.out.println("Enter second number :");
  int num2=sc.nextInt();
  float avg = (num1+num2)/2.0f;
  return avg;
 }

 // write a method that receives a decimal value from the user and return it multiplied by 10
 public static float sayMultiplied(){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number :");
  float num=sc.nextFloat();
  return num*10;
 }

 // create a method that takes two integers from the user and print their division result
 public static float sayDivision(){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter first number :");
  int num1=sc.nextInt();
  System.out.println("Enter second number :");
  int num2=sc.nextInt();
  return num1/num2;
 }

 // define a method that takes a number from the user and returns its cube
 public static int sayCube(){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number :");
  int num=sc.nextInt();
  return num*num*num;
 } 

 //write a method that accepts two numbers from the user and return their modulus
 public static int sayModulus(){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter first number :");
  int num1=sc.nextInt();
  System.out.println("Enter second number :");
  int num2=sc.nextInt();
  return num1%num2;
 }

 // write a method that receives three decimal numbers from the user and returns their average
 public static float sayFloatAverage(){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter first number :");
  float num1=sc.nextFloat();
  System.out.println("Enter second number :");
  float num2=sc.nextFloat();
  System.out.println("Enter third number :");
  float num3=sc.nextFloat();
  return (num1+num2+num3)/3.0f;
 }

 // create a method that takes two numbers from the user and prints the first number raised to the power of the second
 public static int sayPower(){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter first number :");
  int num1=sc.nextInt();
  System.out.println("Enter second number :");
  int num2=sc.nextInt();
  int power=1;
  while (num2>0) {
   power*=num1;
   num2--;
  }
  return power;
 }

 // write a method that receives a decimal number from the user and prints its half value
 public static float sayHalfValue(){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number :");
  float num=sc.nextFloat();
  return num/2.0f;
 }

 // define a method that receives three numbers from the user and returns the sum of their square
 public static int saySumOfSquare(){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter first number :");
  int num1=sc.nextInt();
  System.out.println("Enter second number :");
  int num2=sc.nextInt();
  System.out.println("Enter third number :");
  int num3=sc.nextInt();
  return (num1*num1)+(num2*num2)+(num3*num3);
 }

 // implement a method that takes two numbers from the user and returns their product divided by their sum
 public static int sayProductDividedBySum(){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter first number :");
  int num1=sc.nextInt();
  System.out.println("Enter second number :");
  int num2=sc.nextInt();
  int product= num1*num2;
  int sum=num1+num2;
  return product/sum;
 }

 // write a method that takes two numbers from the user and returns the first number doubled plus the second number tripled
 public static int saySumOfDoubleAndTripled(){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter first number :");
  int num1=sc.nextInt();
  System.out.println("Enter second number :");
  int num2=sc.nextInt();
  return (num1*2)+(num2*3);
 }

 // implement a method that receives two numbers from the user and prints their harmonic mean
 // formula =>   2*(a*b)/(a+b)
 public static float sayHarmonicMean(){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter first number :");
  int num1=sc.nextInt();
  System.out.println("Enter second number :");
  int num2=sc.nextInt();
  return 2.0f*(num1*num2)/(num1+num2);
 }

 public static void main(String[] args) {
  
  //System.out.println("integer number :"+sayInt());

  //System.out.println("float number :"+sayFloat());

  //System.out.println("Difference of float number:"+sayDifference());

  //System.out.println("Square of a number :"+saySquare());

  //System.out.println("Average :"+sayAverage());

  //System.out.println("multiple of 10 :"+sayMultiplied());

  //System.out.println("Division :"+sayDivision());

  //System.out.println("Cube :"+sayCube());

  //System.out.println("Modulus :"+sayModulus());

  //System.out.println("Average of floating numbers :"+sayFloatAverage());

  //System.out.println("Power :"+sayPower());

  //System.out.println("Half value of given value :"+sayHalfValue());

  //System.out.println("Sum of their squares :"+saySumOfSquare());

  //System.out.println("Product divided by their sum :"+sayProductDividedBySum());

  //System.out.println("Sum of doubled and tripled of user input :"+saySumOfDoubleAndTripled());

  System.out.println("Harmonic mean :"+sayHarmonicMean());

 }
}
