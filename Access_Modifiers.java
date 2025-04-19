
class C1{
 public int x=5;
 protected int y=45;
 int z=10;
 private int a=78;

 // all types variables accessable inside the same class
 public void fun(){
  System.out.println(x);
  System.out.println(y);
  System.out.println(z);
  System.out.println(a);
 }

}

class C2 extends C1{
  int b=10;
 public void fun2(){
  System.out.println(x);
  System.out.println(y);
  System.out.println(z);

  //System.out.println(a);  variable a does not accessable because,it is private
 }

}



public class Access_Modifiers {
 public static void main(String[] args) {

  C1 c=new C1(); // object creation

  //c.fun();   // function call

  // System.out.println(c.x);
  // System.out.println(c.y);
  // System.out.println(c.z);
  
  // only private variable does not accessable inside the main function,
  // all other variables are accessable inside the main function using same class object
  
  //System.out.println(c.a);

  C2 x=new C2();
  x.fun2();

 }
}
