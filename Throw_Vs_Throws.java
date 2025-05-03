
// the throw keyword is used to throw an exception explicitly by the programmer
// the throws keyword is used to declare an exception. this given an information to the 
// programmer that there might be an exception so, its better to be parepared with a try catch block



import java.util.Scanner;

class NegativeRadiusException extends Exception{
 public String toString(){
  return "Radius can not be negative!";
 }
 public String getMessage(){
  return "Radius can not be negative!";
 }
}

public class Throw_Vs_Throws {

 public static double area(int r) throws NegativeRadiusException{
  if(r<0){
   throw new NegativeRadiusException();
  }
  double result=Math.PI*r*r;
  return result;
 }

 public static int divide(int a,int b) throws ArithmeticException{
  int result = a/b;
  return result;
 }

 public static void main(String[] args) {

  Scanner sc=new Scanner(System.in);
  System.out.println("Enter value of a:");
  int a=sc.nextInt();
  System.out.println("Enter value of b:");
  int b=sc.nextInt();
  System.out.println("Enter radius :");
  int radius= sc.nextInt();

  try{
   int c=divide(a, b);
   System.out.println(c);
  }
  catch(Exception e){
   System.out.println(e);
  }

  try{
   double ar=area(radius);
   System.out.println(ar);
  }
  catch(Exception e){
   System.out.println(e);
  }
  
 }
}
