
// @FunctionalInterface
// interface A{
//  void show();
// }
// class B implements A{
//  public void show(){
//   System.out.println("in show");
//  }
// }
// public class Functional_Interface {
//  public static void main(String[] args) {
//    //using class
//   // B b = new B();
//   // b.show();


//   // without creating any other class
//   // A obj = new A() {
//   //  public void show(){
//   //   System.out.println("in show");
//   //  }
//   // };
//   // obj.show();


//   // using lambda function
//   // A obj = () -> System.out.println("in show");
//   // obj.show();

//  }
// }



// @FunctionalInterface
// interface A{
//  //void show(int i);   
// }
// public class Functional_Interface {
//  public static void main(String[] args) {
//   // A obj = i -> System.out.println("i = "+i);
//   // obj.show(5);
//  }
// }

@FunctionalInterface
interface A{
 int add(int i,int j);
}
public class Functional_Interface {
 public static void main(String[] args) {

  // A obj = new A() {
  //  public int add(int i,int j){
  //   return i+j;
  //  }
  // };
  // int sum = obj.add(5, 10);
  // System.out.println("sum = "+sum);


  // lambda expression
  A obj = (int i,int j) -> i+j;
  int sum = obj.add(5, 10);
  System.out.println("Sum = "+sum);
 }
}
