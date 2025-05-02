// there are three types of errors -> 1) syntax 2) Logical 3) runtime -> also called exceptions

// public class Error_And_Exception {
//  public static void main(String[] args) {

//   // syntax error -> when compiler finds something wrong with our program , it rhrow a syntax error


//   // logical error -> A logical error or a bug occurs when a program compiles and runs but does the wrong thing
//   // message delivered wrongly , wrong time of chats being displayed , incorrect redirects


//   // runtime error -> java may sometimes encounter an error while the program is running. these are also called exceptions

//  }
// }



import java.util.Scanner;

public class Error_And_Exception {

 public static void main(String[] args) {
  
  // syntax error

  // int a = 5    
 // System.out.println(a+b);



 // logical error
 // WAP to print all prime numbers b/w 1 to 10
 
 // System.out.println(2);
 // for(int i=1;i<5;i++){
 //  System.out.println(2*i+1);
 // }



 // runtime error
 // here arithmetic exception are present
 int k;
 Scanner sc=new Scanner(System.in);
 k=sc.nextInt();
 System.out.println("Integer part of 1000 divided by k is "+1000/k);





 }
}