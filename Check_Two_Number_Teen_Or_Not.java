// We'll say that a number is "teen" if it is in the range 13..19 inclusive. 
// Given 2 int values, return true if one or the other is teen, but not both.
// loneTeen(13, 99) → true
// loneTeen(21, 19) → true
// loneTeen(13, 13) → false

import java.util.Scanner;

public class Check_Two_Number_Teen_Or_Not {
 public static boolean loneTeen(int a, int b) {
  if((a==13 && b==13) || (a==19 && b==19) || (a==13 && b==19) || (a==19 && b==13)|| ((a>13 && a<19) && (b>13 && b<19)))
    return false;
  else if(a==13 || a==19 || b==13 || b==19 || (a>13 && a<19 && (b>19 || b<13) ) || (b>13 && b<19 && (a>19 || a<13) ) )
    return true;
  return false;
}
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter value of x:");
  int x=sc.nextInt();
  System.out.println("Enter value of y:");
  int y=sc.nextInt();
  System.out.println("Numbers are Teen? :"+loneTeen(x, y));
 }
}
