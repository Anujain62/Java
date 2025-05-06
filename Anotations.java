
class BaseClass extends One{       // it extends class of dynamic_method_dispatch file
 @Override
 public void greet(){
  System.out.println("Good Morning,Base class");
 }
}

public class Anotations {
 public static void main(String[] args) {

  BaseClass One = new BaseClass();
  One.greet();
  
 }
}
