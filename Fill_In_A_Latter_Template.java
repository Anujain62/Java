
// letter = "Dear <|name|> , Thanks a lot"

import java.util.Scanner;

public class Fill_In_A_Latter_Template {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name;
        String latter = "Dear <|name|>, Thanks a lot";
        System.out.println("Enter your name :");
        name = sc.next();
        latter = latter.replace("<|name|>",name);
        System.out.println(latter);
    }
}
