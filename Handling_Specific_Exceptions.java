import java.util.Scanner;

public class Handling_Specific_Exceptions {
 public static void main(String[] args) {
  int[] marks = new int[3];
  marks[0]=7;
  marks[1]=56;
  marks[2]=6;
  Scanner sc=new Scanner(System.in);

  System.out.println("Enter the array index :");
  int ind=sc.nextInt();
  System.out.println("Enter the number you want to devide the value with ");
  int num=sc.nextInt();

  try{
   System.out.println("the value at array index entered is "+marks[ind]);
   System.out.println("the value of array-value/number is "+marks[ind]/num);
  }

  // we can use multiple catch blocks 

  catch(ArithmeticException e){
   System.out.println("Arithmetic exception occured!");
   System.out.println(e);
  }
  catch(ArrayIndexOutOfBoundsException e){
   System.out.println("ArrayIndexOutOfBounds exception occured!");
   System.out.println(e);
  }
  catch(Exception e){
   System.out.println("some other exception occured!");
   System.out.println(e);
  }
 }
}
