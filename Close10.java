import java.util.Scanner;

public class Close10 {
 public static int close10(int a, int b) {
  
  int x=10-a;
  int y=10-b;
  int i=Math.abs(x);
  int j=Math.abs(y);
  if(i==j)
     return 0;
  else if(i<j)
    return a;
  else 
    return b;
 }
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter value of a:");
  int a=sc.nextInt();
  System.out.println("Enter value of b:");
  int b=sc.nextInt();
  System.out.println(close10(a, b));
 }
}
