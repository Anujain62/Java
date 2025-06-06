
// public class Lambda_Expression {
//  public static void main(String[] args) {
//   Runnable r1 = new Runnable() {
//    public void run(){
//     System.out.println("Runable using Anonymous class");
//    }
//   };
//   r1.run();

      //lambda expression
//   Runnable r2 = () -> System.out.println("Runable using lambda");
//   r2.run();
//  }
// }

import java.util.ArrayList;
import java.util.Collections;

public class Lambda_Expression {

 public static void main(String[] args) {
  ArrayList<String> list = new ArrayList<>();
  list.add("rahul");
  list.add("rohit");
  list.add("mohit");
  // Collections.sort(list,new Comparator<String>(){
  //  public int compare(String a,String b){
  //   return a.compareTo(b);
  //  }
  // });

  //lambda expression
  Collections.sort(list,(a,b)->a.compareTo(b));
  
  System.out.println(list);
 }
}