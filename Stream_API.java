import java.util.*;
import java.util.stream.*;
import java.util.Arrays;

public class Stream_API {
 public static void main(String[] args) {

  // it is used for adding maximum add at a time
  List<Integer> list = Arrays.asList(2,4,6,5,8,9,1,10,14,13);

  // ArrayList<Integer> list = new ArrayList();
  // list.add(5);
  // list.add(10);
  // list.add(15);
  // list.add(20);
  // list.add(25);
  // list.add(1);
  // list.add(2);
  // list.add(7);
  // list.add(9);
  // list.add(14);


  // filter function -> it is filters elements
  // List<Integer> evenList = list.stream().filter(n->n%2 == 0).collect(Collectors.toList());
  // System.out.println(evenList);

  // map function -> it is perform task
  // List<Integer> evenList = list.stream().map(n->n*2).collect(Collectors.toList());
  // System.out.println(evenList);

  // List<Integer> evenList = list.stream().filter(n->n%2 == 0).map(n->n*5).collect(Collectors.toList());
  // System.out.println(evenList);

  // reduce funtion -> it gives single element after performing any task
  // int sum = list.stream().reduce(0,(a,b)->a+b);   // 0 is default value of a,b is start from 0 index
  // System.out.println(sum);


  // find sum of all even numbers , number is greater than 2 
  // int sum = list.stream().filter(n->n%2==0).filter(n->n>2).reduce(0,(a,b)->a+b);
  // System.out.println(sum);


  // find maximum an list
  // int max = list.stream().reduce(0,(a,b)-> a>b?a:b );
  // System.out.println(max);

  // find second max
  int max = list.stream().reduce(0,(a,b)-> a>b?a:b );
  List<Integer> maxList = list.stream().filter(n->n!=max).collect(Collectors.toList());
  int smax = maxList.stream().reduce(0,(a,b)-> a>b?a:b );
  System.out.println(smax);


  // find minimum an list
  // int min = list.stream().reduce(Integer.MAX_VALUE, (a,b)-> a<b?a:b);
  // System.out.println(min);
 }
}
