import java.util.Scanner;

public class Count_Frequency_Of_Char_In_String {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter first string:");
  String str1=sc.next();
  System.out.println("Enter second string:");
  String str2=sc.next();

  int size1=str1.length();
  int size2=str2.length();

  char[] arr=new char[size1+size2];
  int arrsize=arr.length;
  int arrcount=0;

  int i=0;

  while(i<size1){

   char ch=str1.charAt(i);
   int count=1;

   for(int j=i+1;j<size1;j++){
    if(ch==str1.charAt(j))
      count++;
   }

   for(int j=0;j<size2;j++){
    if(ch==str2.charAt(j))
       count++;
   }

  int a=1;
  for(int x=0;x<=i;x++){
   if(arr[x]==ch)
    a++;
  }
  if(a<2){
   arr[arrcount]=ch;
   arrcount++;
   System.out.println(ch+" "+count);
  }
   i++;
  }


  int p=0;

  while(p<size2){

   char ch=str2.charAt(p);
   int count=1;

   for(int j=p+1;j<size2;j++){
    if(ch==str2.charAt(j))
      count++;
   }

   for(int j=0;j<size1;j++){
    if(ch==str1.charAt(j))
       count++;
   }

  int a=1;
  for(int x=0;x<=i;x++){
   if(arr[x]==ch)
    a++;
  }
  if(a<2){
   arr[arrcount]=ch;
   arrcount++;
   System.out.println(ch+" "+count);
  }
   i++;
   p++;
  }

  
 }
}
