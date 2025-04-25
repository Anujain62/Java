public class Types_Of_Variables {

  int b=10;    // instance variable

  static int c=15;    // static variable 

 public static void main(String[] args) {

  int a=5;   // its called local variable
  System.out.println(a);

  Types_Of_Variables obj=new Types_Of_Variables();
  System.out.println(obj.b);

  // we can access static variable in two types -> 1) direct access , 2) using class name 
  System.out.println(c);
  System.out.println(Types_Of_Variables.c);

 }
}
