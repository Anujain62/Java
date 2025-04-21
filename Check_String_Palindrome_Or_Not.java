import java.util.Scanner;

public class Check_String_Palindrome_Or_Not {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a string:");
  String str=sc.next();


  // METHOD - 1

  int i=0;
  int j=str.length()-1;
  while (i<j) {
    if(str.charAt(i)==str.charAt(j)){
        i++;
        j--;
    }
    else
      break;
  }
  if(i==j)
    System.out.println("it's palindrome");
  else
    System.out.println("it's not palindrome");


    // METHOD - 2

//   String str1="";
//   int n=str.length();
//   n--;
//   while (n>=0) {
//    str1+=str.charAt(n);
//    n--;
//   }
//   boolean flag=str.equals(str1);
//   if(flag)
//      System.out.println("it's palindrome");
//   else
//      System.out.println("It's not palindrome");


 }
}
