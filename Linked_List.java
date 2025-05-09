import java.util.ArrayList;

public class Linked_List {
 public static void main(String[] args) {
  ArrayList<Integer> l1=new ArrayList<>();
  ArrayList<Integer> l2=new ArrayList<>();

  l2.add(10);
  l2.add(20);
  l2.add(30);

  l1.add(6);
  l1.add(7);
  l1.add(8);
  l1.add(6);
  l1.addFirst(3);
  l1.addLast(9);
  l1.add(0,8);
  l1.add(0, 1);

  l1.addAll(0,l2);   // it copies all elements of l2 to l1

  //l1.clear();  // it clear whole list

  for(int i=0;i<l1.size();i++){
   System.out.print(l1.get(i)+", ");
  }


  // System.out.println(l1.lastIndexOf(6)); // it gives last index of entered element, ignoring initial duplicate elements
  // System.out.println(l1.indexOf(10));  // it gives index of entered elements
  // System.out.println(l1.contains(50));  // it checks entered element is present in the array list or not
 
 }
}
