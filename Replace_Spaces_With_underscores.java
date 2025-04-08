import java.util.Scanner;

public class Replace_Spaces_With_underscores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter a string");
        str = sc.nextLine();
        str  = str.replace(' ','_');
        System.out.println("After converting spaces with underscore : "+str);
    }
}
