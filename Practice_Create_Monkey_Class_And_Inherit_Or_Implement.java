// create a class monkey with jump() and bite() methods. create a class human
// which inherits this monkey class and implements basicAnimal interface with 
// eat() and sleep() methods

class Monkey{
 public void jump(){
  System.out.println("Jump the monkey");
 }
 public void bite(){
  System.out.println("Bite the monkey");
 }
}

interface BasicAnimal{
 void eat();
 void sleep();
}

class Human extends Monkey implements BasicAnimal{

 void speak(){
  System.out.println("Hello!");
 }
 @Override
 public void eat() {
  System.out.println("Eatting the animals");
 }
 @Override
 public void sleep(){
  System.out.println("Sleep the animals");
 }
}


public class Practice_Create_Monkey_Class_And_Inherit_Or_Implement {

 public static void main(String[] args) {
  Human h=new Human();
  h.jump();
  h.bite();
  h.sleep();
  h.eat();


  // polymorphism 
  Monkey m=new Human();
  m.bite();
  m.jump();
  // m.speak();  // cannot use speak method because the reference is monkey which does not speak method


  BasicAnimal b=new Human();
  b.sleep();
  b.eat();
 // b.speak();   // it also gives error

 }
}