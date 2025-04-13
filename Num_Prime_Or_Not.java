import java.util.Scanner;

public class Num_Prime_Or_Not {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number :");
        int num=sc.nextInt();
        int i;
        for(i=2;i<num/2;i++){
            if(num%i==0)
              break;
        }
        if(i==num/2)
           System.out.println("Number "+num+" is prime");
        else 
           System.out.println("Number "+num+" is not prime"); 
    }
}
