
// public class Exceptions {
//  public static void main(String[] args) {
  
//   int i=20;
//   int j=0;
//   try{
//    j = 18/i;
//    if(j==0)
//     //it throws the exceptions
//     throw new ArithmeticException("I don't want to print 0");
//   }
//   catch(ArithmeticException e){
//    j = 18/1;
//    System.out.println("thats the default output ");
//   }
//   catch(Exception e){
//    System.out.println("Something went wrong.."+e);
//   }
//   System.out.println("j = "+j);

//  }
// }






// creation of our exceptions and throw this exception
// class NavinException extends Exception{
//  public NavinException(String string){
//   super(string);
//  }
// }
// public class Exceptions {
//  public static void main(String[] args) {
  
//   int i=20;
//   int j=0;
//   try{
//    j = 18/i;
//    if(j==0)
//     throw new NavinException("I don't want to print 0");
//   }
//   catch(NavinException e){
//    j = 18/1;
//    System.out.println("thats the default output "+e);
//   }
//   catch(Exception e){
//    System.out.println("Something went wrong.."+e);
//   }
//   System.out.println("j = "+j);

//  }
// }







// class A{

 // public void show(){
 //  try{
 //   // Class.forName("Exceptions");
 //   Class.forName("Hello");
 //  }
 //  catch(ClassNotFoundException e){
 //   System.out.println("Not able to find the class");
 //  }
 // }




 // if we don't handled exceptions, so we use throws
//  public void show() throws ClassNotFoundException{
//   // Class.forName("Exceptions");
//   Class.forName("Hello");
//  }

// }
// public class Exceptions {

//  static{
//   System.out.println("Class Loaded");
//  }
//  public static void main(String[] args) throws Exception{
  
//  // A obj = new A();
//  // obj.show();
//  A obj = new A();
//  try{
//   obj.show();
//  }
//  catch(ClassNotFoundException e){
//   e.printStackTrace();
//  }

//  }
// }
