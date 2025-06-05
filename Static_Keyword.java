// static class Hello {          // it gives error because outter class does not depends on any other so it cannot be declare as static
// }

class Name{
 static String name;
 Name(String name){
  Name.name = name;
 }
}

public class Static_Keyword {

 static class Test1{       // inner class can be declare as static because it is depends on the outter class(upper class)
  String name;
  Test1(String name){
   this.name = name;
  }
 }

 class Test2{
  String name;
  Test2(String name){
   this.name = name;
  }
 }
 public static void main(String[] args) {
  Test1 t1 = new Test1("anu");
  System.out.println(t1.name);

  Test1 t2 = new Test1("anki");    // both t1,t2 are gives different output because it is not depends on the
  System.out.println(t2.name);          // object of the super class (Static_Keyword)


  // Test2 t2 = new Test2("anki");      // it gives error because it is non-static ,so it is depends on the object(instance)

  Name n1 = new Name("Anu");
  Name n2 = new Name("Anki");   
  System.out.println(n1.name);           // here both are prints same output (last change value), because it is depends on the object
  System.out.println(n2.name);
 }
}
