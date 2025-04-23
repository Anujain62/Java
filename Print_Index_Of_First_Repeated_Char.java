import java.util.Scanner;

public class Print_Index_Of_First_Repeated_Char {
 public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str1=sc.next();
    char[] arr=new char[str1.length()];
    for(int i=0;i<str1.length();i++)
        arr[i]=str1.charAt(i);
    boolean flag;
    for(int i=0;i<str1.length();i++){
        flag=false;
        for(int j=i+1;j<str1.length();j++){
            if(arr[i]==arr[j]){
                System.out.println(arr[i]);
                flag=true;
                break;
            }
        }
        if(flag==true)
           break;

    }

 }
}
