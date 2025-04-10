import java.util.Scanner;

public class Check_Given_Char_Vowel_Or_Consonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a charactor");
        char ch=sc.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
               System.out.println("Given charactor is vowel");
        else
               System.out.println("Given charactor is consonant");
    }
}
