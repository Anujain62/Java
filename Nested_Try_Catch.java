import java.util.Scanner;

// public class Nested_Try_Catch {
//  public static void main(String[] args) {

//   int[] marks = new int[3];
//   marks[0]=7;
//   marks[1]=56;
//   marks[2]=6;

//   Scanner sc=new Scanner(System.in);
//   System.out.println("Enter the value of index :");
//   int ind=sc.nextInt();

//   try{
//    System.out.println("Welcome to 1st try block");
//    try{
//     System.out.println(marks[ind]);
//    }
//    catch(ArrayIndexOutOfBoundsException e){
//     System.out.println("Sorry this index does not exist");
//     System.out.println("Exception in level 2 : "+e);
//    }
//   }
//   catch(Exception e){
//    System.out.println("Exception in level 1 : "+e);
//   }
//  }
// }







public class Nested_Try_Catch {
 public static void main(String[] args) {

  int[] marks = new int[3];
  marks[0]=7;
  marks[1]=56;
  marks[2]=6;

  Scanner sc=new Scanner(System.in);
  boolean flag=true;

  while (flag) {
   System.out.println("Enter the value of index :");
   int ind=sc.nextInt();

   try{
    System.out.println("Welcome to 1st try block");
    try{
     System.out.println(marks[ind]);
     flag=false;
    }
    catch(ArrayIndexOutOfBoundsException e){
     System.out.println("Sorry this index does not exist");
     System.out.println("Exception in level 2 : "+e);
    }
   }
   catch(Exception e){
    System.out.println("Exception in level 1 : "+e);
   }
  }
 }
}
