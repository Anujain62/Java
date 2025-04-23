import java.util.Scanner;

public class Remove_Duplicate_Char_In_String {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter string:");
  String str=sc.next();
  int size=str.length();
  sc.close();

     
      // METHOD - 1

//   boolean flag;
//   char[] arr=new char[size];
//   int x=0;
//   for(int i=0;i<size;i++){
//    flag=false;
//    char ch=str.charAt(i);
//    for(int j=0;j<=x;j++){
//     if(ch==arr[j])
//        flag=true;
//    }
//    if(flag==false){
//     arr[x]=ch;
//     x++;
//    }
//   }
//   System.out.println("After removing duplicate char ");
//   for(int i=0;i<x;i++)
//     System.out.print(arr[i]);


       // METHOD - 2
   String newStr="";
   for(int i=0;i<size;i++){
      char ch=str.charAt(i);
      if(newStr.indexOf(ch)==-1){
         newStr+=ch;
      }
   }
   System.out.println("After removing duplicates new str :"+newStr);

 }
}
