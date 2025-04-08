import java.util.Scanner;

public class Calculate_Income_Tax {
    public static void main(String[] args) {
        float tax=0;
        float income;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your income in Lakhs :");
        income = sc.nextFloat();
        if(income<2.5f){
            tax+=0;
        }
        if(income>=2.5f && income<5f)
            tax+=0.05f*(income-2.5f);
        else if (income>=5f && income<10f) {
            tax+=0.05f*(5.0f-2.5f);
            tax+=0.2f*(income-5f);
        } else if (income>=10.0f) {
            tax+=0.05f*(5.0f-2.5f);
            tax+=0.2f*(income-5f);
            tax+=0.3f*(income-10.0f);
        }
        System.out.println("the total tax paid by the employee is "+tax);
    }
}
