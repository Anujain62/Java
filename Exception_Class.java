import java.util.Scanner;

class MyException extends Exception{
 public String toString(){
  return "I am toString()";
 }

 public String getMessage(){
  return "I am getMessage()";
 }
}


public class Exception_Class {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number:");
  int a=sc.nextInt();
  if(a<9){
    try{
     //throw new MyException();
     throw new ArithmeticException("This is an exception");
    }
    catch(Exception e){
     System.out.println(e.getMessage());
     System.out.println(e.toString());
     System.out.println(e);
     e.printStackTrace();
    }
  }
 }
}
