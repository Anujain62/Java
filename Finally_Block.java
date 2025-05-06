// finally block contains the code which is always executed whether the exception is handled or not.
// it is used to execute code containing instruction to release the system resources,close a connection etc.


public class Finally_Block {

 public static int greet(){
  try{
   int a=50;
   int b=0;
   int c=a/b;
   return c;
  }
  catch(Exception e){
   System.out.println(e);
  }
  finally{
   System.out.println("This is the end of this function");
  }
  return 0;

 }
 public static void main(String[] args) {
  // System.out.println(greet());
  greet();

  // int a=7;
  // int b=9;
  // while (true) {
  //  try{
  //   System.out.println(a/b);
  //  }
  //  catch(Exception e){
  //   System.out.println(e);
  //   break;
  //  }
  //  finally{
  //   System.out.println("I am finally for value of b = "+b);
  //  }
  //  b--;
  // }

 }
}
