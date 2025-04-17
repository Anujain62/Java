// if a class includes abstract method , then the class
 // itself must be declares abstract

abstract class Parent{
 public Parent(){
  System.out.println("I am constructor of base class");
 }
 public void sayHello(){
  System.out.println("Hello");
 }
 abstract public void greet();
}

// if we derived a class througth the abstract parent class, so eigther override abstract method
// or declare derived class as abtract class
class Child1 extends Parent{
 @Override
   public void greet(){
    System.out.println("Good Morning");
   }
}

abstract class Child2 extends Parent{
 public void sayHi(){
  System.out.println("Hii");
 }
}

public class Abstract_Class_And_Abstract_Method {
 public static void main(String[] args) {

      // abstract class object does not created in any conditon 
       
      //Parent p=new Parent();      // it gives error

       // after deriving the abstract base class we can create one or many objects
       Child1 c1=new Child1();
       c1.sayHello();
       c1.greet();

       //Child2 c2=new Child2();   // it also gives error because it is an abstract class


 }
}
