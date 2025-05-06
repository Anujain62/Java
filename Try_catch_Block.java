// types of exceptions -> 1) checked exception ->compile time exception(handled by compiler)
// 2) unchecked exception -> runtime exception

// commonly occuring exceptions -> null pointer exception, arithmetic exception,arry index out of bound exception
// number format exception


public class Try_catch_Block {
 public static void main(String[] args) {
  int a=600;
  int b=0;
  int c;

  // Without try

  // c=a/b;
  // System.out.println("the result is "+c);



  // With try

  try{
   c=a/b;
  }
  catch(Exception e){
   System.out.println("We failed to divide. Reason: ");
   System.out.println(e);
  }
  System.out.println("End of the program");

  
 }
}
