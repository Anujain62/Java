
// detect double and triple spaces in a string

import java.util.Scanner;

public class Detect_Double_Triple_Spaces {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str;
        System.out.println("Enter a string :");
        str = sc.nextLine();
        System.out.println("Index of double space is  "+str.indexOf("  "));
        System.out.println("Index of triple space is  "+str.indexOf("   "));
    }
}
