import java.util.Scanner;

public class Return_String_Adding_Start_Two_Char {

 static String fun(String str){
  int n=str.length();
  if(n<1)
    return str;
  String s;
  if(n==1)
     s=str.substring(0,1);
  else
     s=str.substring(0,2);
  String x=s+str+s;
  return x;
 }
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a string:");
  String str=sc.next();
  System.out.println("String :"+fun(str));
 }
}
