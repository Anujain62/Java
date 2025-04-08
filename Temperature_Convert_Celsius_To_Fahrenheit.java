import java.util.Scanner;

public class Temperature_Convert_Celsius_To_Fahrenheit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the temperature in celsius :");
        int n=sc.nextInt();
        double temp=(n*(9.0/5.0))+32.0;
        System.out.println(n+" degree celsius temperature is equal to "+temp+" degree fahrenheit");
    }
}
