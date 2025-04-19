// Return true if the given string contains between 1 and 3 'e' chars.
// stringE("Hello") → true
// stringE("Heelle") → true
// stringE("Heelele") → false

import java.util.Scanner;

public class StringE {

 public static boolean stringE(String str) {
  int n=str.length();
  char [] arr=str.toCharArray();   // it converts string to char array
  int x=0;
  for(char elem : arr){
    if(elem=='e')
      x++;
  }
  if(x==1 || x==3)
     return true;
  return false;
}

 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a string:");
  String str=sc.next();
  System.out.println(stringE(str));
 }
}
