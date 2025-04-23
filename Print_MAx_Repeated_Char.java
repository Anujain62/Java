import java.util.Scanner;

public class Print_MAx_Repeated_Char {
 public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
    String str=sc.next();
    int tcount=0;
    char[] arr=new char[str.length()];
    char ch=' ';
    for(int i=0;i<str.length();i++)
      arr[i]=str.charAt(i);
    for(int i=0;i<str.length();i++){
     int count=1;
     for(int j=i+1;j<str.length();j++){
      if(arr[i]==arr[j]){
       count++;
      }
     }
     if(arr[i]!=ch && count>tcount){
      ch=arr[i];
      tcount=count;
     }
    }
    System.out.println("Repeated char "+ch+" present "+tcount+" times");
 }
}
