import java.util.Scanner;

public class Count_Vowel_And_Consonant_In_String {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter an string:");
  String str=sc.next();
  int size=str.length();


  // count frequency of vowel and consonants

  // int vcount=0;
  // int ccount=0;
  // for(int i=0;i<size;i++){
  //  if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || 
  //  str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
  //    vcount++;
  //   else
  //    ccount++;
  // }
  // System.out.println("number of vowels :"+vcount);
  // System.out.println("number of consonants :"+ccount);


  char[] arr=new char[size];
  int vcount=0;
  int x=0;
  for(int i=0;i<size;i++){
    if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || 
    str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U'){
      arr[x]=str.charAt(i);
      vcount++;
      x++;
    }
   }
   System.out.println("total vowel character :"+vcount);
   for(int i=0;i<x;i++){
    System.out.print(arr[i]+" ");
   }

 }
}
