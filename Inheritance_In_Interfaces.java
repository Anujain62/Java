// we can inherit ont one interface to another interface , not in class

interface sampleInterface{
 void meth1();
 void meth2();
}

interface childSampleInterface extends sampleInterface{
 void meth3();
 void meth4();
}

// we can not extends any interface through the class only we can implements interfaces through the class

// class childSampleInterface extends sampleInterface{
//  void meth3();
//  void meth4();
// }

class MySampleClass implements childSampleInterface{
 public void meth3(){
  System.out.println("Meth3");
 }
 public void meth4(){
  System.out.println("Meth4");
 }

 // it is compulsory for implementation ( definition ) because childSampleInterface extends sampleInterface
 // so it takes characters of sampleInterface , if we do not define so it gives error
 public void meth1(){
  System.out.println("Meth1");
 }
 public void meth2(){
  System.out.println("Meth2");
 }
}

public class Inheritance_In_Interfaces {
 public static void main(String[] args) {
  
  MySampleClass ms=new MySampleClass();
  ms.meth3();
  ms.meth1();
  ms.meth4();
  ms.meth2();

 }
}
