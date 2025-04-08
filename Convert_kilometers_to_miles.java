import java.util.Scanner;

public class Convert_kilometers_to_miles {
    public static void main(String[] args) {
        double Miles;
        int Kilometers;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter kilometers : ");
        Kilometers = sc.nextInt();
        Miles = Kilometers * 0.621;
        System.out.println(Kilometers+" Km in miles is equal to "+Miles);
    }
}
