// use intellij idea -> it generates HTML AND CSS code automatically
// STEPS -> 
// 1) open tools 
// 2) click generate javaDocs
// 3) Enter path of the documentation
// 4) now documentation is generated



// HOW TO WIRTE JAVA DOCS
//package com.company;
///**
// *  This class is to demonstrate what javadoc is and hot it is used in the java industry
// *  This is <i>italic</i> word<p>this is a new paragraph</p>
//* @author Harry (CodeWithHarry)
//* @version 0.1
//* @since 2002
//*  //@see <a href="https:docs.oracle.com/en/java/javase/14/docs/api/index.html">java Docs</a>
// *
// *  // if we want user enter in new page
// *  @see <a href="https:docs.oracle.com/en/java/javase/14/docs/api/index.html" target="_blank">java Docs</a>
//*/
//
//public class JavaDocs_For_Our_Package {
// public  void  add(int a,int b){
//  System.out.println("The sum is :"+(a+b));
// }
// public static void main(String[] args) {
//  System.out.println("This is my main method");
// }
//}


/**
 * this is used for java documentation
 */


/*
   this is used for comments
 */


// METHOD TAGS FOR GENERATING JAVA DOCUMENTATION

//package com.company;

/**
 * This is a good class
 */
public  class JavaDocs_For_Our_Package{

 /**
 * @param args these are arguments supplied to the command line
 */

 public static void main(String[] args) {
  System.out.println("I am main method");
 }

 /**
  * Hello this is a method and this is the most beautiful method of this class
  * @param  i This is the first number of add
  * @param  j This is the second number of add
  *  @return    sum of two numbers as an integer
  * @throws Exception if i is 0
  * @deprecated This method is deprecated please use + operator
 */
 public  int add(int i,int j) throws Exception{
  if(i==0)
    throw new Exception();
  int c;
  c=i+j;
  return c;
 }
}